package com.lshdainty.calendar.controller.v1;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController("userController")
@RequestMapping(value={"${apiPrefixV1}/users"})
public class UserController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public String user() {
        return "user commit";
    }

    @GetMapping("/first")
    public Map<String, Object> firstController() {
        return null;
    }
}
