package rsreu;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class FactoryTest {
    @Test
    public  void getName(){

        String notebookName = "Apple";
        Factory factory = new Factory();
        PKToChoose notebook = factory.getName(notebookName);
        assert (notebook.getPKName().equals("Куплен ноутбук Apple"));
        assert (notebook.getPrice()==100000);

    }
}
