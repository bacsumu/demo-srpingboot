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
        // 시스템 부하를 위해 loop 처리
        for(int i=0,j=0; i < 100000; i++){
            j = j * i;
        }
        return "this is github springboot demo page";
    }
}
