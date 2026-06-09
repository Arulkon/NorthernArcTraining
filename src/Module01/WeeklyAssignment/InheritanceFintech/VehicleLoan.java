package Module01.WeeklyAssignment.InheritanceFintech;

public class VehicleLoan extends Loan{
    private String vehicleType;
    public VehicleLoan(String loanId,double outstandingAmount,double interestRate,String vehicleType){
        super(loanId, outstandingAmount,interestRate);
        setVehicleType(vehicleType);
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}

