package com.melmel.dslist.repositories;

import com.melmel.dslist.entities.Game;
import com.melmel.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}


