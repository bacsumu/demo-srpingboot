package org.bacsumu.demospringboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.bacsumu.demospringboot.config.JwtConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/auth")
@Slf4j
public class JwtController {
    @Autowired
    JwtConfig jwtConfig;

    @RequestMapping(value = "/requestToken")
    public String requestToken() {
        List<String> roleList = new ArrayList<String>();
        roleList.add("ADMIN");
        roleList.add("USER");

        return jwtConfig.createToken("bacsumu", roleList);
    }

    @RequestMapping(value = "/validateToken")
    public String validateToken(HttpServletRequest request) {
        return jwtConfig.resolveToken(request);
    }
}
