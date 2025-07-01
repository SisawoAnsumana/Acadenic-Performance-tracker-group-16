package src;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class WeightCalculation {
    public static void main(String[] args)throws IOException{
        Scanner Sc = new Scanner (System.in);
        ArrayList<Assessment>Assessments = new ArrayList<Assessment>();
        System.out.println("What will be your file name:");
        String fileName = Sc.nextLine();
        FileWriter fWriter = new FileWriter(fileName,true);
        PrintWriter outPutFile = new PrintWriter(fWriter);
        System.out.println("Enter course name:");
        String course = Sc.nextLine();
        outPutFile.println(course);
        System.out.println("Enter the the number of Assessments");
        int numOfAssessment = Sc.nextInt();


        for (int i = 1; i <= numOfAssessment; i++) {
            System.out.println("Enter score " + i + " in % ");
            double score = Sc.nextDouble();
            System.out.println("Enter weight"+i + " in %");
            double weight = Sc.nextDouble();
            outPutFile.println("Your score for "+i+":"+score);
            outPutFile.println("Your weight for cour "+i+": "+weight);
            double marks=(score/100)*weight;
            Assessment a = new Assessment(score, weight,course,marks);
            Assessments.add(a);

        }

        weightInfo(Assessments,outPutFile);
        outPutFile.close();


    }
    public  static void weightInfo(ArrayList<Assessment>Assessments,PrintWriter outPutFile){
        double totalWeight = 0.0;
        double totalScore = 0.0;
        double totalMarks=0;
        for (Assessment a: Assessments){
            totalMarks+=a.marks;


        }

        double weightAverage = totalMarks;
        System.out.println("Weight average = " + weightAverage);
        outPutFile.println("Weight average = " +weightAverage);
    }

}
