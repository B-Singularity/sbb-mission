package com.ll.sb20231114;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/sbb")
    private void index() {
        System.out.println("index");
    }
}
