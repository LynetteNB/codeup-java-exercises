package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        Input input = new Input();
        boolean repeat;

        Student lynette = new Student("Lynette");
        Student fito = new Student("Fito");
        Student lyndsey = new Student("Lyndsey");
        Student jasper = new Student("Jasper");

        //assign at least 3 grades to all students
        lynette.addGrade(randomGrade()); lynette.addGrade(randomGrade()); lynette.addGrade(randomGrade()); lynette.addGrade(randomGrade()); lynette.addGrade(randomGrade());
        fito.addGrade(randomGrade()); fito.addGrade(randomGrade()); fito.addGrade(randomGrade()); fito.addGrade(randomGrade()); fito.addGrade(randomGrade());
        lyndsey.addGrade(randomGrade()); lyndsey.addGrade(randomGrade()); lyndsey.addGrade(randomGrade()); lyndsey.addGrade(randomGrade()); lyndsey.addGrade(randomGrade());
        jasper.addGrade(randomGrade()); jasper.addGrade(randomGrade()); jasper.addGrade(randomGrade()); jasper.addGrade(randomGrade()); jasper.addGrade(randomGrade());

        //add attendance info
        lynette.recordAttendance("2017-11-10", "p"); lynette.recordAttendance("2017-11-11", "p"); lynette.recordAttendance("2017-11-12", "p"); lynette.recordAttendance("2017-11-13", "p");
        fito.recordAttendance("2017-11-10", "p"); fito.recordAttendance("2017-11-11", "a"); fito.recordAttendance("2017-11-12", "p"); fito.recordAttendance("2017-11-13", "p");
        lyndsey.recordAttendance("2017-11-10", "p"); lyndsey.recordAttendance("2017-11-11", "p"); lyndsey.recordAttendance("2017-11-12", "a"); lyndsey.recordAttendance("2017-11-13", "a");
        jasper.recordAttendance("2017-11-10", "p"); jasper.recordAttendance("2017-11-11", "a"); jasper.recordAttendance("2017-11-12", "a"); jasper.recordAttendance("2017-11-13", "a");
        lynette.recordAttendance("2017-11-09", "h");

        //place students in hashmap
        students.put("lynettenb", lynette); students.put("fitoc", fito); students.put("lyndseymb", lyndsey); students.put("jasperf", jasper);
        do {
            System.out.println("- type the username for more information on the user\n- type 'all' to view all user's grades\n- type 'avg' to view the overall class average\n- type 'csv' for a csv report of all students");
            for (String key : students.keySet()){
                System.out.print("| " + key + " | ");
            }
            String check = input.getString("\n");
            if (students.containsKey(check)) {
                System.out.println("\nName: " + students.get(check).getName() + " - Github Username: " + check);
                System.out.println("Current Average: " + students.get(check).getGradeAverage());
                System.out.println("All Grades: " + studentAllGrades(students, check));
                System.out.printf("Attendance Percentage: %.0f%%\n", students.get(check).getAttendancePercentage());
                System.out.print("Dates Absent: " + students.get(check).daysAbsent());
            } else if (check.equalsIgnoreCase("all")){
                for(String key : students.keySet()){
                    System.out.print("\n" + students.get(key).getName() + "'s grades: " + studentAllGrades(students, key));
                }
            } else if (check.equalsIgnoreCase("avg")){
                double total = 0;
                for(String key : students.keySet()){
                    total += students.get(key).getGradeAverage();
                }
                System.out.print("\nThe overall class average is " + total/students.size() + ".");
            }  else if (check.equalsIgnoreCase("csv")){
                String csv = "\nname,github_username,average,attendance_percentage\n";
                for(String key : students.keySet()){
                    csv += students.get(key).getName() + "," + key + "," + students.get(key).getGradeAverage() + "," + (int) students.get(key).getAttendancePercentage() + "\n";
                }
                System.out.print(csv);
            } else {
                System.out.print("\nSorry, no student found with the gihub username of \"" + check + "\".");
            }
            repeat = input.yesNo("\n\nWould you like to see another student? ");
            input.getString("\n");
        }while(repeat);

    }
    public static String studentAllGrades(HashMap<String, Student> students, String check){
        String grades = "";
        for(int i = 0; i<students.get(check).getGrades().size(); i++){
            if(i == students.get(check).getGrades().size()-1){
                grades += students.get(check).getGrades().get(i);
            } else {
                grades += students.get(check).getGrades().get(i) + ", ";
            }
        }
        return grades;
    }
    public static int randomGrade (){
        return (int) Math.floor(Math.random()*40+60);
    }
}