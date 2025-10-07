public class B {

    private String dog;
    private String name;

    public B() {}

    public B(String dog, String name) {
        this.dog = dog;
        this.name = name;
    }


    public void setDog(String dog) {
        this.dog = dog;
    }

    public String getDog() {
        return dog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return "Dog name is" + name;
    }


    public void sound() {
        System.out.println(dog + " Woof woof");
    }
}
