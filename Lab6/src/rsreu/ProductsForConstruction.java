package rsreu;

import java.io.Serializable;

public class ProductsForConstruction extends ElectricAppliances implements Serializable {
    private static final long serialVersionUID = 3L;
    private String formPower;
    private  String type;
    private String nozzles;
    public ProductsForConstruction(String type, int power,String name,int count,String formPower,String nozzles){
        super (power,name,count);
        this.formPower = formPower;
        this.type = type;
        this.nozzles = nozzles;
    }
    public void  description(){
        System.out.println( " В строительных материалах есть различные электроприборы для строительства ");
    }

    public String getType() {
        return type;
    }

    public void setMemory(String type) {
        this.type = type;
    }

    public String getFormPower() {
        return formPower;
    }

    public void setFormPower(String formPower) {
        this.formPower = formPower;
    }

    public String getNozzles() {
        return nozzles;
    }

    public void setNozzles(String nozzles) {
        this.nozzles = nozzles;
    }

    public String toString() {
        return new StringBuilder().append("Мощность: ").append(power).append("; Название: ").append(name).append("; Колличество: ")
                .append(count).append(";").append("Вид энергии: ").append(formPower).append(" Тип: ").append(type).append(" Насадки: ").append(nozzles).toString();
    }
}


