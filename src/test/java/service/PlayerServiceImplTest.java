package service;

import javassist.NotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.mockito.junit.jupiter.MockitoExtension;
import repository.PlayerRepository;
import model.Player;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class PlayerServiceImplTest {

    @Mock
    private PlayerRepository playerRepository;
    private PlayerService playerService;

    @BeforeEach
    void setUp() {
        playerService = new PlayerServiceImpl(playerRepository);
    }

    @Test
    void getAllPlayers() {
        List<Player> mockPlayers = Arrays.asList(new Player(), new Player());
        when(playerRepository.findAll()).thenReturn(mockPlayers);

        List<Player> players = playerService.getAllPlayers();

        assertNotNull(players);
        assertEquals(2, players.size());
    }

    @Test
    void getPlayerById() throws NotFoundException {
        Long playerId = 1L;
        Player mockPlayer = new Player();
        when(playerRepository.findById(playerId)).thenReturn(Optional.of(mockPlayer));

        Player player = playerService.getPlayerById(playerId);

        assertNotNull(player);
        assertEquals(mockPlayer, player);
    }
}