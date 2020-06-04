package rsreu;

public class ObserverTest {//тест

    public static void main(String[] args) {
        PK notebook = new PK();
        Director director = new Director();
        notebook.addProduct("Apple");
        notebook.addObserver(director);
        notebook.addProduct("HP");
        notebook.removeStudent("Apple");
    }
}
