package com.lshdainty.calendar.controller.v1;

import java.util.*;

import org.springframework.web.bind.annotation.*;

@RestController("userController")
@RequestMapping(value={"${apiPrefixV1}/users"})
public class UserController {
    @GetMapping("/")
    public String user() {
        return "user commit";
    }

    @GetMapping("/first")
    public Map<String, Object> firstController() {
        return null;
    }
}
