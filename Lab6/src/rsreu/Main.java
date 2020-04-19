package rsreu;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args) {
        final String DIRECTORY = "D:\\РГРТУ\\3 курс\\6 семестр\\Java\\";
        final String FILENAME = "D:\\РГРТУ\\3 курс\\6 семестр\\Java\\in.txt";
	// write your code here
        //запись в файл
        try {
            FileOutputStream fos = new FileOutputStream(DIRECTORY+"out.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            ProductsForConstruction productsForConstruction2 = new ProductsForConstruction("chainsaw", 45, "Product for construction",567, "battery","yes");
            PK computer2 = new PK(56, "ASUS", 456, "30l", "no", 67, true,true, "touch");
            KitchenAppliances blender2  = new KitchenAppliances(320, "BOSCH", 440,"5L","no",57, true, true, true );

            oos.writeObject( productsForConstruction2);
            oos.writeObject( computer2);
            oos.writeObject(blender2);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        //чтение из файла
        try{
            FileInputStream fis = new FileInputStream(FILENAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ProductsForConstruction productsForConstruction21 =(ProductsForConstruction) ois.readObject();
            System.out.println(productsForConstruction21.toString());
            PK computer21 =(PK) ois.readObject();
            System.out.println(computer21.toString());
            KitchenAppliances blender21 = (KitchenAppliances) ois.readObject();
            System.out.println(blender21.toString());
            fis.close();
            ois.close();
           }catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }catch (IOException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        PK notebook1 = new PK(56, "HP", 456, "30l", "no", 67, true,true, "touch");
        PK notebook2 = new PK(56, "HP", 456, "no", "no", 67, true,true, "touch");
        DynamicArray dynamicArray = new DynamicArray(notebook1.getName());
        dynamicArray.Add(notebook2.getName());
        for(int i=0; i<dynamicArray.GetCount(); i++){
            System.out.println((i+1)+"-ый элемент массива: "+dynamicArray.get(i));
        }
        System.out.println("Количество совпадений: " + dynamicArray.FindMatch());
    }
}
