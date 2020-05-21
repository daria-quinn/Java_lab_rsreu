package rsreu;

interface PK {
    void cost();
    void count();
}
class Apple implements PK {
    public void cost() {
        System.out.print("Cost of Apple: ");
        System.out.println(1000000);
    }
    public void count() {
        System.out.print("Count of Apple: ");
        System.out.println(50);
    }
}
class HP implements PK {
    public void cost() {
        System.out.print("Cost of HP: ");
        System.out.println(32000);
    }
    public void count() {
        System.out.print("Count of HP: ");
        System.out.println(20);
    }
}
class Facade {
    private Apple apple;
    private HP hp;
    public Facade() {
        apple = new Apple();
        hp = new HP();
    }
    public void costPK() {
        apple.cost();
        hp.cost();
    }
    public void countPK() {
        apple.count();
        hp.count();
    }
}
public class FacadeTest {//тест
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.costPK();
        System.out.println();
        facade.countPK();
    }
}
