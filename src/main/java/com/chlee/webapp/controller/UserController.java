package com.chlee.webapp.controller;

import com.chlee.webapp.domain.dto.UserDto;
import com.chlee.webapp.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @GetMapping("/user/signup")
    public String dispSignup(UserDto userDto) {
        return "view/user/signup";
    }

    @PostMapping("/user/signup")
    public String execSignup(@Valid UserDto userDto, Errors errors, Model model) {
        if (errors.hasErrors()) {
            // 회원가입 실패시, 입력 데이터를 유지
            model.addAttribute("userDto", userDto);

            // 유효성 통과 못한 필드와 메시지를 핸들링
            Map<String, String> validatorResult = userService.validateHandling(errors);
            for (String key : validatorResult.keySet()) {
                model.addAttribute(key, validatorResult.get(key));
            }

            return "view/user/signup";
        }

        userService.signUp(userDto);
        return "redirect:/user/login";
    }

    @GetMapping("/user/login")
    public String displogin() {
        return "view/user/login";
    }
}