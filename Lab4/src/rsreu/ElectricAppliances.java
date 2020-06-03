package rsreu;

import java.io.Serializable;

public class ElectricAppliances implements Purchase, Serializable {
    private static final long serialVersionUID = 1L;
    public int power;
    public String name;
    public int count;


    ElectricAppliances(int power, String name, int count){

        this.power = power;
        this.name = name;
        this.count = count;
    }

    private ElectricAppliances(){

    }
    public String getName() {
        return name;
    }
    public void setName(String name)  {

        this.name = name;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) throws Exception {
        if (power >=0){
            this.power = power;
        }else {
           throw new Exception("Изменение этого значения невозможно, так как это значение не может быть отрицательным!");
        }

    }

    @Override
    public void sail() {
        System.out.println("Хотите купить этот товар? ");
    }

    @Override
    public void discount() {

    }

    public void description() {
    }

    public String toString() {
        return new StringBuilder().append("Мощность: ").append(power).append("; Название: ").append(name).append("; Колличество: ")
                .append(count).append(";").toString();
    }


}
