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
         double empCheck=Math.floor((Math.random()*10)%2);
         if (Full_time==empCheck){
             System.out.println("Employee is  present");
         }
         else
             System.out.println("Employee is absent");
    
}
}