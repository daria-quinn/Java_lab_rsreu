package rsreu;
import java.util.List;

public class ConsumerApple implements Runnable  {
    List<PK> notebook;
    Thread t;

    ConsumerApple(List<PK> notebook){
        this.notebook = notebook;
        t = new Thread(this, "Consumer");
        t.start();

    }

    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i<4;i++) {
            count = i + 1;


            this.notebook.remove(notebook.size() - 1);
            System.out.println("Продана ноутбук: Число ноутбуков на складе: " + notebook.size());
            System.out.println("Всего продано ноутбуков: " + count);
            System.out.println(" ");
            try {
                if (this.notebook.size() == 0) {
                    System.out.println("Склад пуст, купить нельзя");
                    Thread.sleep(10000);
                }

            } catch (InterruptedException e) {

            }
        }
    }
    List<PK> copyList(){
        return this.notebook;
    }
}

