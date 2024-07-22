package com.ust.Spring_Reactive.controller;

import com.ust.Spring_Reactive.Repository.Triprepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trip")


public class TripController {
    @Autowired
    private Triprepo triprepo;
}
