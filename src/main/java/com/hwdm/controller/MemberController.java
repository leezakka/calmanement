package com.hwdm.controller;

import com.hwdm.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

/**
 * Rest API Controller for Management Member Request
 * @author Hyun Woo Lee
 */

@RestController
public class MemberController {

    private final MemberRepository membRepo;

    public MemberController(MemberRepository membRepo) {
        this.membRepo = membRepo;
    }


    @RequestMapping("/member/new")
    public Member createMember(@RequestParam(value ="userID", defaultValue = "BABO") String userID,
                               @RequestParam(value ="userPwd", defaultValue = "babo") String userPwd,
                               Map<String, Object> model) {
        Member member = new Member();
        member.setUserID(userID);
        member.setUserPwd(userPwd);
        //model.put("member", member);

        this.membRepo.save(member);

        return member;
    }

    @RequestMapping("/member/login")
    public User user(@RequestParam(value = "userID", defaultValue = "LDM") String userID,
                     @RequestParam(value = "userPwd", defaultValue = "babo") String userPwd) {

        return null;

    }
}
