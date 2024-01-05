package com.lshdainty.calendar.controller.v1;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController("loginController")
@RequestMapping(value={"${apiPrefixV1}"})
public class LoginController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody HashMap<String, Object> data) {
        data.forEach((key, value) -> { log.debug(key + " : " + value); });

        Map result = new HashMap<String, Object>();
        result.put("result", "success");
        log.error("hello-------------------------------------------------------------------------------------");

        return result;
    }

    @PostMapping("/relogin")
    public Map<String, Object> reLogin() {
        return null;
    }

    @PostMapping("/logout")
    public Map<String, Object> logout() {
        return null;
    }

    @PostMapping("/login/check")
    public Map<String, Object> loginCheck() {
        return null;
    }
}
