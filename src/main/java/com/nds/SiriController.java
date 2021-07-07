package com.nds;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class SiriController {
    @RequestMapping(method = RequestMethod.GET)
    public String homepage(Model model) {
        model.addAttribute("message", "welcome to siri club");
        return "homepage";
    }
}
