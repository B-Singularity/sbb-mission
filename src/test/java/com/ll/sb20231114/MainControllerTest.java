package com.ll.sb20231114;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Test;

public class MainControllerTest {
    @Test
    public void testIndexMethod() {
        MainController mainController = new MainController();
        assertEquals("index", mainController.index());
    }

}
