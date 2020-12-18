package zoo;

import zoo.animals.*;
import zoo.food.Grass;
import zoo.food.Meat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {

        HashMap<Integer, Animal> zoo = new HashMap<>();
        Grass grass = new Grass("для травоядных", 2);
        Meat meat = new Meat("для плотоядных", 2);
        Duck duck = new Duck();
        Fish fish = new Fish();
        Alligator alligator = new Alligator();
        Worker worker = new Worker();
        List<Swim> lake = Arrays.asList(alligator, fish);
        for (Swim animal : lake) {
            animal.swim();
        }
        worker.feed(duck, grass);
        worker.feed(duck, grass);
        worker.feed(duck, grass);
        worker.feed(duck, meat);
        alligator.swim();
        worker.getVoice(duck);
        duck.swim();
        duck.run();
        duck.fly();
        worker.feed(fish, grass);
        worker.feed(fish, grass);
        worker.feed(fish, grass);
        worker.feed(fish, meat);
        fish.swim();
        worker.feed(alligator, meat);
        worker.feed(alligator,grass);
        worker.feed(alligator,meat);
    }
}