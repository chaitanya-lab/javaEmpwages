/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empwages;

/**
 *
 * @author chaitanya
 */
public class EmpWages {

    /**
     * @param args the command line arguments
     */
  
       



    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private final String Company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;

    EmpWages(String Company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {

        this.Company = Company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;

    }

    private int Calculate() {

        int empHrs = 0;
        int empWage = 0;
        int TotalEmpWage = 0;
        int TotalWorkingHours = 0;
        int day = 0;

        while (day < numOfWorkingDays || TotalWorkingHours <= maxHoursPerMonth) {
            double empCheck = Math.floor(Math.random() * 10 % 3);
            day++;
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;

            }
            TotalWorkingHours += empHrs;
            empWage = empHrs * empRatePerHour;
            TotalEmpWage += empWage;
        }
        return TotalEmpWage;

    }

  
        public static void main(String[] args) {
        // TODO code application logic here
              EmpWages Apple = new EmpWages("Apple", 20, 20, 100);
        EmpWages Google = new EmpWages("Google", 30, 20, 80);
        EmpWages Microsoft = new EmpWages("Microsoft", 30, 20, 80);

        System.out.println("\nTotal Employee Wage Of Apple Company Is : " + Apple.Calculate());
        System.out.println("Total Employee Wage Of Google Company Is : " + Google.Calculate());
        System.out.println("Total Employee Wage Of Microsoft Company Is : " + Microsoft.Calculate());
    }
}