package zoo.animals;

import zoo.food.Food;
import zoo.food.Meat;

public abstract class Carnivorous extends Animal{

    public Carnivorous(String name, int saturation){
        super(name, saturation);
    }

    public String getName(){
        return name;
    }
}