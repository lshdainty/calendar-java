package com.lshdainty.calendar.controller.v1;

import java.util.*;

import org.springframework.web.bind.annotation.*;

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
