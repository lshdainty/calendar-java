package com.lshdainty.calendar.controller.v1;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController("dateController")
@RequestMapping(value={"${apiPrefixV1}/dates"})
public class DateController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public String date() {
        return "date commit";
    }

    @GetMapping("/date")
    public Map<String, Object> dateController() {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));

        

        return null;
    }
}
