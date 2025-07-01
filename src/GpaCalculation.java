package src;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class GpaCalculation {
    public static void main(String[]args)throws IOException{
        double qualityPoint;
        Scanner Sc = new Scanner(System.in);
        ArrayList<Assessment2>Assessments = new ArrayList<Assessment2>();
        System.out.println("What will be your file name:" );
        String fileName = Sc.nextLine();
        FileWriter fWriter = new FileWriter(fileName,true);
        PrintWriter outPutFile = new PrintWriter(fWriter);
        System.out.println("Hou many course do you do :");
        int  course = Sc.nextInt();
        for (int i = 1; i <= course; i++) {
            System.out.println("Enter your grade for course " + i + ":");
            Sc.nextLine();
            String grade = Sc.nextLine();
            double gradePoint = 0.0;
            if (grade.equals("A+")){
                gradePoint= 4.30;
            }else if (grade.equals("A")){
                gradePoint = 4.0;
            }else if (grade.equals("A-")){
                gradePoint = 3.70;
            }else if (grade.equals("B+")){
                gradePoint = 3.30;
            }else if (grade.equals("B")){
                gradePoint = 3.00;
            }else if (grade.equals("B-")) {
                gradePoint = 2.70;
            }else if (grade.equals("C+")) {
                gradePoint = 2.30;
            }else if (grade.equals("C")) {
                gradePoint = 2.00;
            }else if (grade.equals("C-")) {
                gradePoint = 1.70;
            }else if (grade.equals("D")) {
                gradePoint = 1.00;
            }else if (grade.equals("F")) {
                gradePoint = 0.00;
            }else {
                System.out.println("You don't put a grade");
            }
            System.out.println("Enter grade hour for course " + i +":");
            double gradeHour = Sc.nextDouble();
            outPutFile.println("Your grade for course "+ i+":" +gradePoint);
            outPutFile.println("Your grade hour for course " +i+":" +gradeHour);

            Assessment2 g = new Assessment2(grade, gradePoint,gradeHour);
            Assessments.add(g);


        }
        gpaCalculation(Assessments,outPutFile);
        outPutFile.close();





    }
    public static void gpaCalculation (ArrayList<Assessment2>Assessments,PrintWriter outPutFile){
        double totalGradeHour =0;
        double totalQualityPoint = 0;
        for (Assessment2 a : Assessments){
            totalGradeHour = totalGradeHour + a.gradeHour;
            totalQualityPoint = totalQualityPoint + a.gradePoint * a.gradeHour;

        }
        double GPA = totalQualityPoint/totalGradeHour;
        System.out.println("Your GPA is " + GPA);
        outPutFile.println("Your GPA is: " +GPA);


    }


}
