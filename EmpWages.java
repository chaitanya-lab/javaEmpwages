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
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to Employe wages computation");
        int Full_time=1;
        int Part_Time=2;
        int Wage_per_hr=20;
        int Working_day_permonth=20;
        int working_hr_perday=8;
        int working_parttime=8;
         int empCheck=(int)Math.floor((Math.random()*10)%3);
         switch(empCheck){
             case 1:          
             System.out.println("Employee is  present");
            int Total_wageper_day=( Wage_per_hr*working_hr_perday);
            int MonthlyWages=(Total_wageper_day*Working_day_permonth);
            System.out.println(Total_wageper_day);
            System.out.println(MonthlyWages);
            break;
             case 2:
             System.out.println("Employee is working parttime");
             int Total_part_timewage=(Wage_per_hr*working_parttime);
             int MonthlyWagesparttime=(Total_part_timewage*Working_day_permonth);
             System.out.println(Total_part_timewage);
              System.out.println(MonthlyWagesparttime);
             break;
             default:
             System.out.println("Employee is absent");
    
         }
         
         }
    
}