package zoo.animals;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice {

    public Duck() {
        super("Утка", 3);
    }

    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println(getName() + " летит");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плывет");
    }

    @Override
    public void run() {
        System.out.println(getName() + " бежит");
    }

    @Override
    public void voice() {
        System.out.println(getName() + " кря-кря-кря");
    }

}