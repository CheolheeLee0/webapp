package com.chlee.webapp.controller;

import com.chlee.webapp.domain.dto.MemberDto;
import com.chlee.webapp.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;

    // 메인 페이지
    @GetMapping("/member")
    public String index() {
        return "view/member/index";
    }

    // 회원가입 페이지
    @GetMapping("/member/signup")
    public String dispSignup() {
        return "view/member/signup";
    }

    // 회원가입 처리
    @PostMapping("/member/signup")
    public String execSignup(MemberDto memberDto) {
        memberService.joinUser(memberDto);

        return "redirect:/member/login";
    }

    // 로그인 페이지
    @GetMapping("/member/login")
    public String dispLogin() {
        return "view/member/login";
    }

    // 로그인 결과 페이지
    @GetMapping("/member/login/result")
    public String dispLoginResult() {
        return "view/member/loginSuccess";
    }

    // 로그아웃 결과 페이지
    @GetMapping("/member/logout/result")
    public String dispLogout() {
        return "view/member/logout";
    }

    // 접근 거부 페이지
    @GetMapping("/member/denied")
    public String dispDenied() {
        return "view/member/denied";
    }

    // 내 정보 페이지
    @GetMapping("/member/info")
    public String dispMyInfo() {
        return "view/member/myinfo";
    }

    // 어드민 페이지
    @GetMapping("/admin")
    public String dispAdmin() {
        return "view/member/admin";
    }
}