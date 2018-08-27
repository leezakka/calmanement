package com.hwdm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest API Controller for Management Member Request
 * @author Hyun Woo Lee
 */

@RestController
public class MemberController {

    @RequestMapping("/member/new")
    public String createMember() {
        Member member = new Member();

        return "What are needs to create new member?";
    }

    @RequestMapping("/member/login")
    public Member member(@RequestParam(value = "company", defaultValue = "LDM") String company,
                         @RequestParam(value = "telephone", defaultValue = "babo") String telephone) {
        Member member = new Member();
        member.setCompany(company);
        member.setTelephone(telephone);

        return member;
    }
}
