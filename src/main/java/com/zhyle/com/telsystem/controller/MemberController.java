package com.zhyle.com.telsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
    @RequestMapping("/memberlist")
    public String memberlist(){
        return "member-list";
    }
    @RequestMapping("/memberadd")
    public String memberadd(){
        return "member-add";
    }
}
