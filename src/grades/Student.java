package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance  = new HashMap<>();

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
            return (double) total/grades.size();
        }
    }
    public void recordAttendance(String date, String value){
        if(value.equalsIgnoreCase("p") || value.equalsIgnoreCase("a")){
            attendance.put(date, value);
        }
    }
    public double getAttendancePercentage(){
        int daysPresent = 0;
        for(String key : attendance.keySet()){
            if(attendance.get(key).equalsIgnoreCase("p")){
                daysPresent += 1;
            }
        }
        return (double) daysPresent/attendance.size() * 100;
    }
    public void getStudentAttendance(){
        for(String key : attendance.keySet()){
            System.out.println("Day: " + key + " - " + attendance.get(key));
        }
    }
    public List<String> daysAbsent(){
        List<String> daysAbsent = new ArrayList<>();
        for(String key: attendance.keySet()){
            if(attendance.get(key).equalsIgnoreCase("a")){
                daysAbsent.add(key);
            }
        }
        return daysAbsent;
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