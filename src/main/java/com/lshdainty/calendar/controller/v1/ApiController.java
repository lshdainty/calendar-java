package com.lshdainty.calendar.controller.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// import java.util.*;

import org.springframework.web.bind.annotation.*;

@RestController("apiController")
@RequestMapping(value={"${apiPrefixV1}"})
public class ApiController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/healthz")
    public String healthz() {return "running";}
}
