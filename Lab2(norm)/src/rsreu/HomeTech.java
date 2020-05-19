package rsreu;

import java.io.Serializable;
import java.io.ObjectInputValidation;
public class HomeTech extends ElectricAppliances implements Serializable {
    private static final long serialVersionUID = 2L;
    private String volume;
    private String integrated;
    private int energyConsumption;

    public HomeTech(int power, String name, int count, String volume, String integrated, int energyConsumption) {
        super(power, name, count);
        this.volume = volume;
        this.integrated = integrated;
        this.energyConsumption = energyConsumption;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public String getIntegrated() {
        return integrated;
    }

    public void setIntegrated(String integrated) {
        this.integrated = integrated;
    }
    @Override

    public String toString() {
        return new StringBuilder().append("Мощность: ").append(power).append("; Название: ").append(name).append("; Колличество: ")
                .append(count).append(";").append("Нагрузка: ").append(volume).append(" Интеграция: ").append(integrated).append(" Энергия: ").append(energyConsumption).toString();
    }
}