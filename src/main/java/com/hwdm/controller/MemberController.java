package com.hwdm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * Rest API Controller for Management Member Request
 * @author Hyun Woo Lee
 */

@RestController
public class MemberController {

    @Autowired
    private final MemberRepository membRepo;

    public MemberController(MemberRepository membRepo) {
        this.membRepo = membRepo;
    }

    // Create Member
    @RequestMapping("/member/new")
    public Member createMember(@RequestParam(value ="userID", defaultValue = "tester") String userID,
                               @RequestParam(value ="userPwd", defaultValue = "babo") String userPwd,
                               Map<String, Object> model) {
        Member member = new Member();
        member.setUserID(userID);
        member.setUserPwd(userPwd);
        //model.put("member", member);

        this.membRepo.save(member);

        return member;
    }

    // Login Member
    @RequestMapping("/member/login")
    public Member member(@RequestParam(value = "userID", defaultValue = "LDM") String userID,
                     @RequestParam(value = "userPwd", defaultValue = "babo") String userPwd) {
        return null;
    }

    // Get All Members
    @RequestMapping("/member/all")
    public List<Member> getAllMembers() {
        return this.membRepo.findAll();
    }

    // Get Specific Member
    @RequestMapping("/member/{user_id}")
    public Member showMember(@PathVariable(value = "user_id") String userID) {
       return this.membRepo.findByUserID(userID);
    }

}
