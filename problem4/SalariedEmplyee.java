package problem4;

public class SalariedEmplyee extends Employee{
    private double weeklySalary;
    public SalariedEmplyee(String firstName,String lastName,String socialSecurityNumber,double weeklySalary){
        super(firstName,lastName,socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPayment() {
        return this.weeklySalary;
    }
}
