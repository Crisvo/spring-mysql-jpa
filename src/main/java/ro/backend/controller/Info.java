package ro.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Info {

    @GetMapping(path = "/info")
    public String getInfo() {
        return "Is running";
    }
}
