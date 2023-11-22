package service;

import controller.dto.PlayerDTO;
import controller.dto.PlayerListDTO;
import javassist.NotFoundException;
import model.Player;

import java.util.List;

public interface PlayerService {
    List<Player> getAllPlayers() throws NotFoundException;

    Player getPlayerById(Long id) throws NotFoundException;

    PlayerDTO mapPlayerToDto(Player player);

    PlayerListDTO mapPlayerListToDto(Player player);
}
