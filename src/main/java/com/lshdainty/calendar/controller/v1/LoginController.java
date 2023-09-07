package com.lshdainty.calendar.controller.v1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

@RestController("loginController")
@RequestMapping(value={"${apiPrefixV1}"})
public class LoginController {
    @PostMapping("/login")
    public Map<String, Object> login() {
        Map result = new HashMap<String, Object>();

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
