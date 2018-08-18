package com.ddamik.hateoas.controller;

import com.ddamik.hateoas.domain.SampleVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/sample")
    public SampleVO makeSample() {
        SampleVO vo = new SampleVO();

        return vo;
    }
}
