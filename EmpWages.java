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
  
         public static void CalculateWage(int WagePerHr ,int WorkPerDay,int WorkingDays){
        int TotalEmpHr = 0;
        int TotalWorkingDay = 1;
        int MxHrsInMonth = 100;
        int WagePerDay = 0;

        while (TotalEmpHr < MxHrsInMonth && TotalWorkingDay <= WorkingDays) {

            WagePerDay = (WagePerHr * WorkPerDay);
            System.out.println("The Day "+TotalWorkingDay+" Wage Of Employee Is :" + WagePerDay);
            TotalWorkingDay++;
        }
        int MonthlyWage = (WagePerDay * TotalWorkingDay);
         
        System.out.println("The Monthly Wage Of Employee Is :" + MonthlyWage);
         }

     

        public static void main(String[] args) {
        // TODO code application logic here
          CalculateWage(20,2,10);
        CalculateWage(10,4,20);
        CalculateWage(10,4,20);
        CalculateWage(10,4,20); 
    }
}