package zoo.animals;

public class Fish extends Carnivorous implements Swim{

    public Fish() {
        super("Щука", 3);
    }

    @Override
    public void swim() {

        System.out.println(getName() + " плавает ");
    }

    @Override
    public void run() {

    }
}