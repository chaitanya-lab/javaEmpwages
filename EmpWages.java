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
    public static final int Full_time=1;
    public static final int Part_Time=2;
    public static final int Wage_per_hr=20;
    public static final int Working_day_permonth=20;
    public static int computeEmpwage(){
        System.out.println("Welcome to Employe wages computation");
        int maxHrsInmonth=100;
        int TotalempHr=0;
        int TotalWorkingDay=0;
        int empHrs=0,salary=0;
        while( TotalempHr <= maxHrsInmonth && TotalWorkingDay <= Working_day_permonth ){
        TotalWorkingDay++;
        int empCheck=(int)Math.floor((Math.random()*10)%3);
        switch(empCheck){
                case 1:
                    empHrs=8;
                     break;
                case 2:
                    empHrs=4;
                     break;

                default:
                    empHrs=0;
                     break;

        }
        TotalempHr=(TotalempHr+empHrs);
        int salary_per_day=(empHrs*Wage_per_hr);
        System.out.println(salary_per_day);
        salary=(TotalempHr*Wage_per_hr);
      }
        System.out.println("totoal salary :" +salary);
        return(salary);
   }     

        public static void main(String[] args) {
        // TODO code application logic here
        computeEmpwage();  
    }
}