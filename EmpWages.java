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
        int Wage_per_hr=20;
        int working_hr_perday=8;
         double empCheck=Math.floor((Math.random()*10)%2);
         if (Full_time==empCheck){
             System.out.println("Employee is  present");
            int Total_wageper_day=( Wage_per_hr*working_hr_perday);
            System.out.println(Total_wageper_day);
             
         }
         else
             System.out.println("Employee is absent");
    
}
}