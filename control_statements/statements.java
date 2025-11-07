package control_statements;

import java.util.Scanner;

public class statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID:");
        int ID = sc.nextInt();

        System.out.println("Enter Student Name:");
        String StudentName =  sc.next();

        System.out.println("Enter Attendance:");   
        double attendance = sc.nextDouble();

        int totalscore = 0;
        int noOfSubjects = 0;

        //repeatedly ask user to enter the score

        char Continueinput = 'y';
        while (Continueinput == 'y' || Continueinput == 'Y') {
            System.out.println("Enter score for subject:" +(noOfSubjects+1));
            int currentscore = sc.nextInt();
             totalscore += currentscore;
             noOfSubjects++;
              System.out.println("Do you want to enter another subject score (y/n):");
              Continueinput = sc.next().charAt(0);
        }
        double avgscore = (double)totalscore/noOfSubjects;
        System.out.println("Avaregescore:" +avgscore);

        String performance;
        if(avgscore>=85){
            performance = "Excellent";
       }else if(avgscore>=70){
         performance = "Good";

       }else if(avgscore>=50){
        performance = "Average";

       }else{
        performance = "Need Improvement";

       }

       String attandenceStatus = attendance>=75 ? "ok":"not ok";  
       
       System.out.println("Name:" +StudentName);
       System.out.println("Student Attendance:" +attendance);
       System.out.println("Total Score:" +totalscore);
       System.out.println("Avarage Score:" +avgscore);
       System.out.println("pefirmance:" +performance);
       System.out.println("Status:" +attandenceStatus);
    }

    
}
