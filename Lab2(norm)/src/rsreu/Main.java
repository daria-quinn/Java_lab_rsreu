package rsreu;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final String DIRECTORY = "D:\\РГРТУ\\3 курс\\6 семестр\\Java\\";
    private static final String FILENAME = "D:\\РГРТУ\\3 курс\\6 семестр\\Java\\in.txt";

    public static void main(String[] args) throws Exception, IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        ProductsForConstruction productsForConstruction1 = new ProductsForConstruction("Дрель", 45, "Строительные материалы",567, "аккумулятор","есть");

        int productsForConstruction1Power = productsForConstruction1.getPower();
        String productsForConstruction1Name = productsForConstruction1.getName();
        int productsForConstruction1Count = productsForConstruction1.getCount();
        String productsForConstruction1FormPower = productsForConstruction1.getFormPower();
        String productsForConstruction1Type = productsForConstruction1.getType();
        String productsForConstruction1Processor = productsForConstruction1.getNozzles();

            System.out.println("_________________________________________________ ");
            System.out.println("Мощность: " + productsForConstruction1Power);
            System.out.println("Наименование: "+productsForConstruction1Name);
            System.out.println("Колличество: "+productsForConstruction1Count);
            System.out.println("Вид питания: "+productsForConstruction1FormPower);
            System.out.println("Память: "+productsForConstruction1Type);
            System.out.println("Тип процессора: "+productsForConstruction1Processor);

           // productsForConstruction1.sail();
           // boolean flag = scanner.nextBoolean();


        PK microwaveOven1 = new PK(56, "Samsung", 456, "30l",
                "no", 67, true,true, "Сенсорное");

        int microwaveOven1Power = microwaveOven1.getPower();
        String microwaveOven1Name = microwaveOven1.getName();
        int microwaveOven1Count = microwaveOven1.getCount();
        String microwaveOven1Volume = microwaveOven1.getVolume();
        String microwaveOven1Integrated = microwaveOven1.getIntegrated();
        int microwaveOven1EnergyConsumption = microwaveOven1.getEnergyConsumption();
        boolean microwaveOven1TheGrillMode = microwaveOven1.getTheGrillMode();
        boolean microwaveOven1Defrost = microwaveOven1.getDefrost();
        String microwaveOven1TypeOfControl = microwaveOven1.getTypeOfControl();

            System.out.println("_________________________________________________ ");
            System.out.println("Микроволновая печь: ");
            System.out.println("Мощность: " + microwaveOven1Power);
            System.out.println("Наименование: "+microwaveOven1Name);
            System.out.println("Колличество: "+microwaveOven1Count);
            System.out.println("Объём: "+microwaveOven1Volume);
            System.out.println("Встраиваемость: "+microwaveOven1Integrated);
            System.out.println("энергопотребление: "+ microwaveOven1EnergyConsumption);
            System.out.println("Режим гриля: "+ microwaveOven1TheGrillMode);
            System.out.println("Режим разморозки: "+ microwaveOven1Defrost);
            System.out.println("Управление: "+ microwaveOven1TypeOfControl);

           // microwaveOven1.sail();
           // boolean flag1 = scanner.nextBoolean();

        KitchenAppliances fridge1 = new KitchenAppliances(320, "LG", 440,"20L","yes",57,
                                    true, true, true );
        int fridge1Power = fridge1.getPower();
        String fridge1Name  = fridge1.getName();
        int fridge1Count = fridge1.getCount();
        String fridge1Volume = fridge1.getVolume();
        String fridge1Integrated = fridge1.getIntegrated();
        int fridge1Consumption = fridge1.getEnergyConsumption();
        boolean fridge1DefrosingSystem = fridge1.getDefrostingSystem();
        boolean fridge1Freezer = fridge1.getFreezer();
        boolean fridge1AreaOfFreshness = fridge1.getAreaOfFreshness();

            System.out.println("_________________________________________________ ");
            System.out.println("Холодильник: ");
            System.out.println("Мощность: " + fridge1Power );
            System.out.println("Наименование: "+fridge1Name );
            System.out.println("Колличество: "+fridge1Count);
            System.out.println("Объём: "+fridge1Volume);
            System.out.println("Встраиваемость: "+fridge1Integrated);
            System.out.println("энергопотребление: "+ fridge1Consumption);
            System.out.println("Система разморозки: "+ fridge1DefrosingSystem);
            System.out.println("Морозильная камера: "+ fridge1Freezer);
            System.out.println("Зона свежести: "+ fridge1AreaOfFreshness);

           // fridge1.sail();
           // boolean flag2 = scanner.nextBoolean();

           // fridge1.setPower(-340);
          //  System.out.println(fridge1.getPower());

                List<ElectricAppliances> electricAppliancesList = Arrays.asList(productsForConstruction1,microwaveOven1, fridge1);
                for (ElectricAppliances c : electricAppliancesList)
                {
                    c.description();
                }

              //запись в файл
             try {
                  FileOutputStream fos = new FileOutputStream(DIRECTORY+"in.txt");
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
                }
    }
}
