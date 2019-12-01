package consul01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestCOntroller {
    @Value("${test}")
    private String test;
   /* @Value("${test.yy}")
    private String testyy;*/

    @RequestMapping("test01")
    public String test01(){
        return test+"------";
    }
}
