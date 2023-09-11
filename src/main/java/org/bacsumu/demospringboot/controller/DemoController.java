package org.bacsumu.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping(value = "/")
    public String home(){
        return "this is github springboot demo page";
    }
}
