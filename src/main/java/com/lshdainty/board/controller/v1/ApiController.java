package com.lshdainty.board.controller.v1;

import java.util.*;

import org.springframework.web.bind.annotation.*;
// import org.springframework.stereotype.*;
// import org.springframework.beans.factory.annotation.*;

@RestController("apiController")
@RequestMapping(value={"${apiPrefixV1}"})
public class ApiController {
    @GetMapping("/")
    public String test() {
        return "test commit";
    }

    @GetMapping("/first")
    public Map<String, Object> firstController() {
        return null;
    }
}
