package slide_examples.g_inheritance.entities;

public class PartTimeStaff extends Staff{
    private double hourlyRate;
    private double hoursWorked;

    public PartTimeStaff(String first, String last, String dept, double rate, double worked){
        super(first, last, dept);

        if(rate <= 0){
            double defaultRate = 14.94;
            System.out.println("ILLEGAL TO PAY PARTTIMESTAFF NOTHING - RESETTING HOURLY RATE TO DEFAULT ("+ defaultRate + ")");
            rate = defaultRate;
        }

        if(worked < 0){
            double defaultWorked = 0;
            System.out.println("IMPOSSIBLE TO WORK FEWER THAN 0 HOURS - RESETTING HOURS WORKED TO DEFAULT " +
                    "("+ defaultWorked + ")");
            worked = defaultWorked;
        }

        this.hourlyRate = rate;
        this.hoursWorked = worked;
    }

    public double calcWage(){
        return this.hoursWorked * this.hourlyRate;
    }
}
