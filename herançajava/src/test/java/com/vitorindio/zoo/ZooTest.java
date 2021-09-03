package com.vitorindio.zoo;

import org.junit.Test;

public class ZooTest {

    @Test
    public void shouldFeedAllAnimalsAndReturnAge(){
        Zoo zoo = new Zoo();
        Animal[] animals =
                {new Dog(), new Gorilla(), new Lion(), new Tiger()};
        zoo.feedAnimals(animals);
    }

}
