package org.bacsumu.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DemoController {
    @RequestMapping(value = "/")
    public String home(){
        log.info("home is called");
        return "this is github springboot demo page";
    }
}
