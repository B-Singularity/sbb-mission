package com.ll.sb20231114;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainControllerTest {
    @Test
    public void testIndexMethod() {
        MainController mainController = new MainController();
        assertEquals("안녕하세요, sbb에 오신걸 환영합니다.", mainController.index());
    }

}
