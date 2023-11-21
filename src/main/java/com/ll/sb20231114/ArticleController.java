package com.ll.sb20231114;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ArticleController{
    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
        return "안녕하세요. 메뚜기 월드에 오신걸 환영합니다.";
    }
}