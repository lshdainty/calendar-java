package com.lshdainty.board.controller.v1;

import java.util.*;

import org.springframework.web.bind.annotation.*;
// import org.springframework.stereotype.*;
// import org.springframework.beans.factory.annotation.*;

@RestController("apiController")
@RequestMapping(value={"${apiPrefixV1}"})
public class ApiController {
    @GetMapping("/")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/healthz")
    public String healthz() {return "running";}
}
