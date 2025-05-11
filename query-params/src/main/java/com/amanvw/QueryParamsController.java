package com.amanvw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryParamsController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/hello-address")
    public String sayHelloAddress(@RequestParam String name,
                                  @RequestParam(required = false, name = "address") String place) {
        if (place == null) {
            return "Hello, " + name + "!";
        }
        return "Hello, " + name + " from " + place + "!";
    }
}
