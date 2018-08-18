package com.ddamik.hateoas;

import com.ddamik.hateoas.controller.SampleController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
public class SampleControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testHello() throws Exception {
        //  perform()을 이용해 객체를 브라우저에서 서버의 url을 호출하듯이 테스트 진행가능
        //  andExpect()를 이용해 결과 확인 가능, response에 대한 정보를 체크하는 용도로도 사용 가능
        mockMvc.perform(get("/hello")).andExpect(content().string("Hello World"));

        MvcResult result = mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World")).andReturn();

        System.out.println(result.getResponse().getContentAsString());
    }
}
