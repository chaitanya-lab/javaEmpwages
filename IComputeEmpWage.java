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
public interface IComputeEmpWage {
   

    public void addComapnyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth);
    public void computeEmpWage();
    public int getTotalWage(String company);
}
    

