package com.ddamik.hateoas.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString

@Data
@ToString(exclude = {"val3"})
public class SampleVO {

    private String val1;
    private String val2;
    private String val3;
}
