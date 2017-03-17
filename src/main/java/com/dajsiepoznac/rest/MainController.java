package com.dajsiepoznac.rest;

import java.time.LocalTime;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest-api")
public class MainController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request, @RequestParam(value = "name", defaultValue = "nieznajomy") String name) {
        return String.format("Witaj %s pochodzący z %s, który dobijasz się tu z %s, aktualny czas to %s",
                name, request.getLocale(), request.getRemoteHost(), LocalTime.now().toString());
    }
}
