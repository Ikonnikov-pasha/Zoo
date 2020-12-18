package zoo.animals;

import zoo.food.Food;
import zoo.food.Grass;
import zoo.food.Meat;

public abstract class Animal {

    public String name;
    public int saturation;


    public Animal(String name, int saturation) {
        this.name = name;
        this.saturation = saturation;
    }

    public void eat(Food food){
        if (food instanceof Grass)
            System.out.println(name + " будет есть такую еду!");
        if (food instanceof Meat)
            System.out.println(name + " не будет есть такую еду!");
    }

}