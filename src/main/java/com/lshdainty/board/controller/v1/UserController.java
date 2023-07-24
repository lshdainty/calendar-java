package com.lshdainty.board.controller.v1;

import java.util.*;

import org.springframework.web.bind.annotation.*;
// import org.springframework.stereotype.*;
// import org.springframework.beans.factory.annotation.*;

@RestController("userController")
@RequestMapping(value={"${apiPrefixV1}/user"})
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
