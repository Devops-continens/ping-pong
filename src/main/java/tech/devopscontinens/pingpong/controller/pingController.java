package tech.devopscontinens.pingpong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pingController {

    @RequestMapping(value={"/ping"})
    public String returnPong(){
        return "pong";
    }
}