package com.pineapple.quant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pine-quant")
public class QuantController {
    @GetMapping
    public String quant()
    {
        return "quant start";
    }
}
