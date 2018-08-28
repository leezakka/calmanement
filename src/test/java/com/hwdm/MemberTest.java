package com.hwdm;

import com.hwdm.controller.MemberController;
import org.apache.catalina.startup.UserConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.hamcrest.Matchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MemberController.class)
public class MemberTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void createUser_JSON() throws Exception {
        String newUser ="{\"userID\":\"huming\", \"userPwd]\":\"dkatjr1\"}";
        mockMvc.perform(post("/member/new").contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .content(newUser))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) jsonPath("$.userID", is(equalTo("huming"))))
                .andExpect((ResultMatcher) jsonPath("$.userPwd", is(equalTo("dkatjr1"))));
    }

}
