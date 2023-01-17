package com.ojas.management.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String getValues() {
        // testing
        return "Hello world";
    }
}
