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
        int maxHrsInmonth=100;
        int TotalempHr=0;
        int TotalWorkingDay=0;
        int empHrs=0;
        while( TotalempHr <= maxHrsInmonth && TotalWorkingDay <= Working_day_permonth ){
            TotalWorkingDay++;
       int empCheck=(int)Math.floor((Math.random()*10)%3);
        switch(empCheck){
                case 1:
                                         empHrs=8;
                                break;
                case 2:
                                 empHrs=8;
                                break;

                default:
                               empHrs=0;
                               break;

        }
TotalempHr=(TotalempHr+empHrs);
        }
 int salary=(TotalempHr*Wage_per_hr);

System.out.println("totoal salary :" +salary);
         
         
    }
}