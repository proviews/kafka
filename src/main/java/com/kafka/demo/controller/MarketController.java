package com.kafka.demo.controller;

import com.kafka.demo.entity.User;
import com.kafka.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MarketController {
    @Autowired
    private KafkaTemplate kafkaTemplate;
    @Autowired
    private UserService userService;

    @RequestMapping("/{ss}")
    @ResponseBody
    public String aaController(@PathVariable Object ss) {

        kafkaTemplate.send("market", ss);
        return "success";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String abController() {

        List<User> list = userService.qryAll();
        String a = list.toString();
        return a;
    }
}
