package zoo.food;

public abstract class Food {
    protected String typeFood;
    protected int increaseSaturation;

    public Food(String typeFood, int increaseSaturation){
        this.typeFood = typeFood;
        this.increaseSaturation = increaseSaturation;
    }
}