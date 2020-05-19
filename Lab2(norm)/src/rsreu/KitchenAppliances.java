package rsreu;

import java.io.Serializable;
import java.io.ObjectInputValidation;
public class KitchenAppliances extends HomeTech implements Serializable {
    private static final long serialVersionUID = 4L;
    private boolean defrostingSystem;
    private boolean freezer;
    private boolean areaOfFreshness;
    public KitchenAppliances (int power,String name,int count,String volume,String integrated,int energyConsumption,
                   boolean defrostingSystem,boolean freezer,boolean areaOfFreshness){
        super(power,name,count,volume,integrated,energyConsumption);
        this.defrostingSystem = defrostingSystem;
        this.freezer = freezer;
        this.areaOfFreshness = areaOfFreshness;
    }
    public void  description(){
        System.out.println( " Холоди́льник — устройство, поддерживающее низкую температуру в теплоизолированной камере.");
    }
    public boolean getDefrostingSystem(){
        return defrostingSystem;
    }

    public void setDefrostingSystem(boolean defrostingSystem) {
        this.defrostingSystem = defrostingSystem;
    }

    public boolean getFreezer(){
        return freezer;
    }

    public void setFreezer(boolean freezer) {
        this.freezer = freezer;
    }

    public boolean getAreaOfFreshness(){
        return areaOfFreshness;
    }

    public void setAreaOfFreshness(boolean areaOfFreshness) {
        this.areaOfFreshness = areaOfFreshness;
    }
}
