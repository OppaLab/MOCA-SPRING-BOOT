package com.moca.springboot.controller;

import com.moca.springboot.dto.SignUp;
import com.moca.springboot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Api(tags = {"1. User"})
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "회원가입", notes = "처음 구글 로그인시 회원가입을진행하고 인증 쿠키를 발급합니다")
    @PostMapping("/signup")
    public Long signUp(SignUp signUp, HttpServletResponse response) {


        Long userId = userService.signUp(signUp);

        Cookie session = new Cookie("userId", userId.toString());
        session.setMaxAge(60 * 60 * 24 * 30 * 3);

        response.addCookie(session);
        return userId;

    }
}