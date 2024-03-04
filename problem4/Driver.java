package problem4;

public class Driver {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new CommissionEmployee("Sam","Winchester","12345",10000.0,10);
        employees[1] = new HourlyEmployee("Dean","Winchester","12345",10000.0,8);
        employees[2] = new SalariedEmplyee("Luffy","Monkey","12345",3000.0);
        employees[3] = new BasePlusCommissionEmployee("Sanji","Vinsmoke","12345",1000.0,8,3000);
        employees[4] = new CommissionEmployee("Jack","Winchester","12345",9000.0,10);
        double totalSalary = 0.0;
        for(Employee e:employees){
            totalSalary += e.getPayment();
            System.out.println(e);
        }
        System.out.println("Total Salaries : "+totalSalary);
    }
}
