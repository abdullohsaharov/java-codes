
public class D extends B {

    public D(String dog, String name) {
        super(dog, name);
    }


    @Override
    public void sound() {
        System.out.println(getDog() + " (second dog) says: Bark bark!");
    }


    @Override
    public String getName() {
        return "Second dog name is" + super.getName().substring(15);
    }
}
