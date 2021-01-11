package Animal;

public class Text {
    public static void main(String[] args) {
        Animal dog=new Dog("道格");//向上转型：父类的引用赋值为子类的对象
        System.out.println(dog.brack());
        Animal cat=new Cat("凯特");//向上转型
        System.out.println(cat.brack());
    }
}
