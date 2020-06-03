package rsreu;

import java.util.List;

public class ProducerAplle implements Runnable {

    List<PK> notebook;
    Thread t;

    ProducerAplle( List<PK> notebook) {
        this.notebook = notebook;
        t = new Thread((Runnable) this, "Producer");
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i<4;i++){
            PK apple = new PK(600, "apple", 500);
            this.notebook.add(apple);
            System.out.println("Закуплен ноутбук Apple");
            System.out.println("Число ноутбуков на складе " + notebook.size());
            System.out.println(" ");
        }
        try {
            System.out.println("Склад заполнен");
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
    }
    List<PK> copyList(){
        return this.notebook;
    }
}
