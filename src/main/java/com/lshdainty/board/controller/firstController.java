package com.lshdainty.board.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;

@RestController
public class firstController {
    @GetMapping("/")
    public String test() {
        return "test commit";
    }


    @GetMapping("/first")
    public Map<String, Object> firstController() {
        return null;
    }

}
