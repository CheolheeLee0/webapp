package com.chlee.webapp.controller.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ApplyWorkController {
    @GetMapping("user/apply")
    public String main() {

        return "view/user/apply";
    }

}
