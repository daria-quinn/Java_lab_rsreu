package rsreu;

public class Car extends Transport {
    public int CostPassenger;
    public int CostCargo;
    public Car(int time,int CostPassenger,int CostCargo){
        super(time);
        this.CostPassenger = CostPassenger;
        this.CostCargo = CostCargo;
    }

    public Car() {
        super();
    }

    public void setCostPassenger(int CostPassenger) {
        System.out.printf("Введите стоимость перевозки пассажира: " + CostPassenger );
    }
    public void setCostCargo(int CostCargo) {
        System.out.printf("Введите стоимость перевозки груза: " + CostCargo );
    }
}
