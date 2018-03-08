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
        lynette.addGrade(100); lynette.addGrade(90); lynette.addGrade(80);
        fito.addGrade(90); fito.addGrade(80); fito.addGrade(70);
        lyndsey.addGrade(80); lyndsey.addGrade(70); lyndsey.addGrade(60);
        jasper.addGrade(70); jasper.addGrade(60); jasper.addGrade(50);

        //place students in hashmap
        students.put("lynettenb", lynette); students.put("fitoc", fito); students.put("lyndseymb", lyndsey); students.put("jasperf", jasper);
        do {
            System.out.println("Type the username for more information on the user or type 'all' to view all user's grades. ");
            for (String key : students.keySet()){
                System.out.print("| " + key + " | ");
            }
            String check = input.getString("\n");
            if (students.containsKey(check)) {
                System.out.println("\nName: " + students.get(check).getName() + " - Github Username: " + check);
                System.out.println("Current Average: " + students.get(check).getGradeAverage());
                System.out.print("All Grades: " + studentAllGrades(students, check));
            } else if (check.equalsIgnoreCase("all")){
                for(String key : students.keySet()){
                    System.out.print("\n" + students.get(key).getName() + "'s grades: " + studentAllGrades(students, key));
                }
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
}