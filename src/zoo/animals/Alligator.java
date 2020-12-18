package zoo.animals;

public class Alligator extends Carnivorous implements Run, Swim{

    public Alligator(){
        super("Алигатор", 3);
    }

    public String getName(){
        return name;
    }

    @Override
    public void run() {
        System.out.println(getName() + " бежит");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плывет");
    }
}