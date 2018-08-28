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
    //@RequestMapping("/member/new")
    //public Member createMember(@RequestParam(value ="userID", defaultValue = "tester") String userID,
    //                           @RequestParam(value ="userPwd", defaultValue = "babo") String userPwd,
    //                           @RequestParam(value ="address", defaultValue = "Korea Seoul") String address,
    //                           @RequestParam(value ="company", defaultValue = "dataroad") String company,
    //                           @RequestParam(value ="department", defaultValue = "TSV") String department,
    //                           @RequestParam(value ="extension", defaultValue = "02-3775-0093") String extension,
    //                           @RequestParam(value ="telephone", defaultValue = "010-7200-8625") String telephone,
    //                           Map<String, Object> model) {
    //    Member member = new Member();
    //    member.setUserID(userID);
    //    member.setUserPwd(userPwd);
    //    member.setAddress(address);
    //    member.setCompany(company);
    //    member.setDepartment(department);
    //    member.setExtension(extension);
    //    member.setTelephone(telephone);
    //    this.membRepo.save(member);

    //    return member;
    //}
    @RequestMapping("/member/new")
    public Member createMember(@RequestBody Member member) {
        this.membRepo.save(member);
        return member;
    }

    // Login Member
    @RequestMapping("/member/login")
    public Member member(@RequestBody Member member, @RequestParam(value = "userID", defaultValue = "LDM") String userID,
                     @RequestParam(value = "userPwd", defaultValue = "babo") String userPwd) {
        return member;
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
