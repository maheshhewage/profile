package Test2.demo.controllers;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;

@RestController
@RequestMapping("/profile")

public class ProfileContrpller {

    @GetMapping(value = "/cust", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getProfile(
            final HttpServletRequest httpServletRequest, @RequestHeader(value = "Authorization") String aut) {
        return "S";

    }
}
