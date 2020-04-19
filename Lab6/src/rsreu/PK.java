package rsreu;

import java.io.Serializable;

public class PK  extends HomeTech implements Serializable {
    private boolean processor;
    private boolean typeOfPower;
    private String typeOfControl;
    public PK (int power,String name,int count,String volume,String integrated,int energyConsumption,
                          boolean processor,boolean defrost,String typeOfControl){
        super(power,name,count,volume,integrated,energyConsumption);
        this.processor = processor;
        this.typeOfPower = typeOfPower ;
        this.typeOfControl =typeOfControl ;
    }
    public void  description(){
        System.out.println( " Микроволно́вая печь (также СВЧ-печь; устар. микрово́лновая; разг. микроволно́вка) " +
                "— электроприбор, позволяющий совершать разогрев водосодержащих веществ");
    }
    public boolean getTheGrillMode(){
        return processor;
    }

    public void setTheGrillMode(boolean processor) {
        this.processor = processor;
    }

    public String getTypeOfControl() {
        return typeOfControl;
    }

    public void setTypeOfControl(String typeOfControl) {
        this.typeOfControl = typeOfControl;
    }

    public boolean getDefrost() {
        return typeOfPower;
    }

    public void setDefrost(boolean typeOfPowe) {
        this.typeOfPower = typeOfPower;
    }


    public String toString() {
        return new StringBuilder().append("Мощность: ").append(power).append("; Название: ").append(name).append("; Колличество: ")
                .append(count).append(";").append("Процессор: ").append(processor).append(" Тип энергии: ").append(typeOfPower).append(" Тип управления ").append(typeOfControl).toString();
    }
}
