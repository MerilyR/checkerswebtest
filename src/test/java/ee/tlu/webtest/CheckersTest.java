/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.tlu.webtest;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Merily.Rooparg
 */
public class CheckersTest {
    
    public CheckersTest() {
    }

    @Test
    public void opening() {
        open ("http://web.zone.ee/merxgirl/tlu/checkers.html");
        //open ("C:\\Users\\merily.rooparg\\Documents\\NetBeansProjects\\webtest\\src\\main\\resources\\checkers.html");
        $("h1").shouldHave(text("Checkers"));
        assertEquals("dark", $("#table1").$$("tr").get(0).
                        $$("td").get(1).getAttribute("class"));
        assertEquals("", $("#table1").$$("tr").get(0).
                        $$("td").get(0).getAttribute("class"));
        $("#table1").$$("tr").get(7).
                        $$("td").get(0).shouldHave(text("m"));
        $("#table1").$$("tr").get(2).
                        $$("td").get(1).shouldHave(text("v"));
        $("#table1").$$("tr").get(3).
                        $$("td").get(0).shouldHave(text(""));
        assertEquals ("k01", $("#table1").$$("tr").get(0).
                        $$("td").get(1).getAttribute("id"));
        
    }

}
