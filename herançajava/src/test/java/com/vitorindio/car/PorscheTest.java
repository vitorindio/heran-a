package com.vitorindio.car;

import org.junit.Test;

import static org.junit.Assert.*;

public class PorscheTest {

    @Test
    public void shouldCloneStringArray(){
        String[] array = {"one", "two", "three"};
        String [] copiedArray= array.clone();
        assertSame(array, array); /*true*/
        assertNotSame(array, copiedArray); /*true*/

        for (String string: copiedArray) {
            System.out.println(string);
        }
    }

    @Test
    public void shouldClonePorsche(){
        Porsche porsche = new Porsche("Vitor");
        Porsche arnonPorsche = porsche.clone();
        assertNotSame(porsche, arnonPorsche);
        arnonPorsche.sellTo("Arnon");
        assertEquals("Porsche of Arnon",
                               arnonPorsche.asString());
        assertEquals("Porsche of Vitor", porsche.asString());
        System.out.println(porsche.asString() + " e " + "" +arnonPorsche.asString());
    }
}
