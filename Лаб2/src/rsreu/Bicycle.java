package rsreu;

public class Bicycle extends Transport {
    private int CostPassenger;
    private int CostCargo;
    public Bicycle(int time,int CostPassenger,int CostCargo){
        super(time);
        this.CostPassenger = CostPassenger;
        this.CostCargo = CostCargo;
    }
    public Bicycle() {
        super();
    }

    public void setCostPassenger(int CostPassenger) {
        this.CostPassenger = CostPassenger;
    }
    public void setCostCargo(int CostCargo) {
        this.CostCargo = CostCargo;
    }

}
