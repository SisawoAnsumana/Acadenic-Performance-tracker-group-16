package src;

class Assessment2 {
    public String grade;
    public double gradePoint;
    public double gradeHour;
    public Assessment2(String grade, double gradePoint,double gradeHour){
        this.grade = grade;
        this.gradePoint = gradePoint;
        this.gradeHour = gradeHour;
        class gpaCalculation {
            void gpaCalculation() {
                double  totalQualityPoint = 0;
                double totalGradeHour = 0;
                System.out.println(totalQualityPoint/totalGradeHour);

            }
        }
    }

}
