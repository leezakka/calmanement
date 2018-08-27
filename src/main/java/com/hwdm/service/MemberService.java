package com.hwdm.service;

import com.hwdm.controller.Member;

/**
 * MemberService interface
 * @author Hyun Woo Lee
 */
public interface MemberService {

    /**
     * To return a member object fetched by ID
     * @param memberID
     * @return
     */
    Member findById(String memberID);

    /**
     * @param member Member entity to be saved
     */
    Member insertMember(Member member);

    /**
     * @param member Member entity to be updated
     */
    Member updateMember(Member member);

    /**
     * @param memberID memberID to be deleted
     * @return true, if deleted; otherwise, return false
     */
    Boolean deleteMember(String memberID);
}
