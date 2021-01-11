package Animal;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    @Override
    public String brack() {
        System.out.println("道格的叫声");
        return "汪汪汪";
    }
}
