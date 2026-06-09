package Module01.WeeklyAssignment.PolymorphismFintech;

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

    @Override
    public void makePayment(double amt){
        if(amt<=0 || super.getOutstandingAmount()<amt ){
            System.out.println("Invalid Payment for Vehicle Loan.....");
        }
        else{
            super.setOutstandingAmount(super.getOutstandingAmount()-amt);
            System.out.println("The available outstanding amount for the Vehicle Loan is :"+super.getOutstandingAmount());
        }
    }
    @Override
    public void calculateMonthInterest(){
        System.out.println("The Vehicle Loan monthly interest for this month is: "+super.getOutstandingAmount()*(super.getInterestRate()/1200));
    }
    public void makePayment(double amt,double penality){
        System.out.println("The Vehilcle loan penality paid is "+penality);
        makePayment(amt);
    }
}

