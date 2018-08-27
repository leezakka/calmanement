package com.hwdm.controller;


import org.springframework.data.repository.Repository;

public interface MemberRepository extends Repository<Member, String> {


    /**
     * save an {@link Member} to the data store, either inserting or updating it
     * @param member the {@link Member} to save
     */
    void save(Member member);
}
