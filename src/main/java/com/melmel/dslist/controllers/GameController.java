package com.melmel.dslist.controllers;

import com.melmel.dslist.dto.GameMinDTO;
import com.melmel.dslist.entities.Game;
import com.melmel.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> dto = gameService.findAll();
        return dto;
    }
}

