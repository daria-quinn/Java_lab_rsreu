package rsreu;

public class Factory {
    public PKToChoose getName(String name) {
        PKToChoose notebook = null;
        if (name.equals("Apple")) {
            notebook = new Apple(); }
        else if (name.equals("HP")) {
            notebook = new HP(); }
        else if (name.equals("ASUS")) {
            notebook = new ASUS(); }
        return notebook; }
}
interface PKToChoose {
    String getPKName();
    float getPrice();
}
class Apple implements PKToChoose{
    public String getPKName(){
        return "Куплен ноутбук Apple";
    }
    public float getPrice() {
        return 100000;
    }
}
class HP implements PKToChoose{
    public String getPKName(){
        return "Куплен ноутбук HP";
    }
    public float getPrice() {
        return 50000;
    }
}
class ASUS implements PKToChoose{
    public String getPKName(){
        return "Куплен ноутбук ASUS";
    }
    public float getPrice() {
        return 70000;
    }
}

