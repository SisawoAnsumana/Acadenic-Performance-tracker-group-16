import java.util.ArrayList;
import java.util.Scanner;

public class TargetGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Assessment3> assessments = new ArrayList<>();
        System.out.println("Enter course name");
        String course = sc.nextLine();
        System.out.println("enter number of present assessments: ");
        int numOfPresentAssessments = sc.nextInt();
        double avgNewGrade = 0.0;
        for (int i = 1; i <= numOfPresentAssessments; i++) {
            System.out.println("enter score" + i);
            double score = sc.nextDouble();
            System.out.println("enter weight " + i);
            double weight = sc.nextDouble();
            avgNewGrade += (score * weight);

            assessments.add(new Assessment3(course, score, weight));
        }

        double Average = calculateAverage(assessments);
        System.out.println("average is " + Average);

        double initialGPA = gpa(Average);
        System.out.println("Initial GPA is " + initialGPA);

        System.out.println("Your current average is " + Average + " \n What is your target grade");
        double targetGrade = sc.nextDouble();

        System.out.println("what is the gpa of your target grade");
        double finalGPA = sc.nextDouble();

        System.out.println("what is the weight of your unknown grade");
        double weight2 = sc.nextDouble();

        double newGrade = ((100 * targetGrade)- avgNewGrade) /weight2;
        System.out.println("you need "+ newGrade + "% in finals to get "+ targetGrade);
        System.out.println("Current GPA is "+ initialGPA + " .You need " + newGrade + "% in finals to reach " + finalGPA);

        

    }
    public static double calculateAverage(ArrayList<Assessment3> assessments) {
        double currentAvg = 0.0;
        double totalWeight = 0.0;

        for (Assessment3 a : assessments) {
            currentAvg += (a.score * a.weight);
            totalWeight += a.weight;
        }

        return currentAvg/totalWeight;


    }
    public static double gpa(double Average) {
        double GPA;
        if (90 <= Average && Average <= 100) {
            GPA = 4.30;
        } else if (80 <= Average && Average <= 89) {
            GPA = 4.00;
        } else if (70 <= Average && Average <= 79) {
            GPA = 3.70;
        } else if (67 <= Average && Average <= 69) {
            GPA = 3.30;
        } else if (64 <= Average && Average <= 66) {
            GPA = 3.00;
        } else if (60 <= Average && Average <= 63) {
            GPA = 2.70;
        } else if (57 <= Average && Average <= 59) {
            GPA = 2.30;
        } else if (54 <= Average && Average <= 56) {
            GPA = 2.00;
        } else if (50 <= Average && Average <= 53) {
            GPA = 1.70;
        } else if (40 <= Average && Average <= 49) {
            GPA = 1.00;
        } else {
            GPA = 0.00;
        }
        return GPA;
    }
}
