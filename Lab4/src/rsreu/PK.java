package rsreu;

import java.io.Serializable;
import java.util.List;

public class PK extends HomeTech implements Serializable {


    public PK (int power, String name, int count){
        super(power,name,count);


    }
    public void  description(){
        System.out.println( " Микроволно́вая печь (также СВЧ-печь; устар. микрово́лновая; разг. микроволно́вка) " +
                "— электроприбор, позволяющий совершать разогрев водосодержащих веществ");
    }



    public String toString() {
        return new StringBuilder().append("Мощность: ").append(power).append("; Название: ").append(name).append("; Колличество: ")
                .append(count).append(";").toString();
    }
}
