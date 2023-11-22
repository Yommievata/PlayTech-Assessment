package controller;

import controller.dto.PlayerDTO;
import controller.dto.PlayerListDTO;
import javassist.NotFoundException;
import model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.PlayerService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class PlayersController {

    @Autowired
    private final PlayerService playerService;

    public PlayersController(PlayerService playerService) {
        this.playerService = playerService;
    }

    /**
     * Retrieve a list of all players.
     *
     * @return ResponseEntity containing a list of all players in the response body.
     */
    @GetMapping("/players")
    public ResponseEntity<List<PlayerDTO>> getPlayers() throws NotFoundException {
        List<Player> players = playerService.getAllPlayers();
        List<PlayerDTO> playerDTOs = players.stream()
                .map(playerService::mapPlayerToDto)
                .collect(Collectors.toList());

        if (players.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok(playerDTOs);
    }

    /**
     * Retrieve player information based on the provided player ID and optional details flag.
     *
     * @param id      The unique identifier of the player to retrieve.
     * @param details A boolean flag to indicate whether to fetch detailed player statistics.
     * @return ResponseEntity containing player information or statistics in the response body.
     * @throws NotFoundException if the requested player with the given ID is not found.
     */
    @GetMapping("/player/{id}")
    public ResponseEntity<?> getPlayerInfo(@PathVariable Long id, @RequestParam(required = false) boolean details) throws NotFoundException {
        Player player = playerService.getPlayerById(id);
        if (player == null) {
            return ResponseEntity.notFound().build();
        }

        if (details) {
            // Fetch Detailed Statistics
            PlayerDTO playerDetailDTO = playerService.mapPlayerToDto(player);
            if (playerDetailDTO == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(playerDetailDTO);
        } else {
            // Fetch List of basic player information
            PlayerListDTO playerListDTO = playerService.mapPlayerListToDto(player);
            if (playerListDTO == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(playerListDTO);
        }
    }
}
