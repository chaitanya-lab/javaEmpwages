/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author chaitanya
 */
public class ComapnyEmpWage {
        public final String company;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHoursInMonth;
    public int totalEmpWage;

    public ComapnyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursInMonth = maxHoursInMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "\n * Total Employee Wage for Comapny : " + company + " Is : " + totalEmpWage;
    }
    
}
