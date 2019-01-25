package com.rbleek.messageService.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {

    @Value("${message-service.msg:Fallback value}")
    String configuredMessage;

    @GetMapping("/msg")
    public String msg(Model model) {
        model.addAttribute("message", configuredMessage);
        return "msgView";
    }
}
