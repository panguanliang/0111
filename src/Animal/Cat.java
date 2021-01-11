package Animal;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }
    @Override
    public String brack() {
        System.out.println("凯特的叫声");
        return "喵喵喵";
    }
}
