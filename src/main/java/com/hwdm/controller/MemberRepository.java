package com.hwdm.controller;

import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Member Repository
 * @author Hyun Woo Lee
 */
@Component
public interface MemberRepository extends Repository<Member, String> {
    /**
     * save an {@link Member} to the data store, either inserting or updating it
     * @param member the {@link Member} to save
     */
    void save(Member member);

    /**
     * return all {@link Member} from data store
     */
    List<Member> findAll();

    /**
     * return an {@link Member} from data store
     * @param memberID the {@link Member} to select
     */
    Member findByUserID(String memberID);
}
