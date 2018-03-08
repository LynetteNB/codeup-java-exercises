package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return name;
    }
    public ArrayList<Integer> getGrades(){
        return grades;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        int total = 0;
        if(grades.isEmpty()){
            System.out.print("This student has no grades! ");
            return 0.0;
        } else{
            for (int i = 0; i<grades.size(); i++) {
                total += grades.get(i);
            }
            return total/grades.size();
        }
    }

    public static void main(String[] args) {
        //TESTING
        Student lynette = new Student("Lynette");
        System.out.println(lynette.getGradeAverage());
        lynette.addGrade(100);
        lynette.addGrade(90);
        System.out.println(lynette.getGradeAverage());
        lynette.addGrade(80);
        System.out.println(lynette.getGradeAverage());
    }
}