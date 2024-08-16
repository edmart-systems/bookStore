package com.bookStore.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//Indicates that this class belows to controller
@Controller
public class BookController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
