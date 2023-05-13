package Assignment17.Assign17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

class Student {
    private int rollNumber;
    private String name;
    private char section;
    private int marks;
    
    //constructor with four parameters....rollNumber,name,section,marks
    public Student(int rollNumber, String name, char section, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.section = section;
        this.marks = marks;
    }
    
    //getters and setters...>access this different members from outside the class
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public char getSection() {
        return section;
    }

    public int getMarks() {
        return marks;
    }

    public String toString() {
        return "Roll No: " + rollNumber + ", Name: " + name + ", Section: " + section + ", Marks: " + marks;
    }
}

public class App {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Random random = new Random();
        
        // Create 20 random students
        for (int i = 1; i <= 20; i++) {
            int rollNumber = i;
            String name = "Student " + i;
            char section = (char) ('A' + random.nextInt(4));
            int marks = random.nextInt(101);
            Student student = new Student(rollNumber, name, section, marks);
            students.add(student);
        }

        // All records of student
        System.out.println("All records of students:");
        for (Student student : students) {
            System.out.println(student);
        }

        // All Records of section A only ordered on basis of roll number
        List<Student> sectionAStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getSection() == 'A') {
                sectionAStudents.add(student);
            }
        }
        
        //sorting sectionAStudents using comparator function
        Collections.sort(sectionAStudents, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getRollNumber() - s2.getRollNumber();
            }
        });
        
        System.out.println("\nAll records of Section A ordered on basis of Roll Number:");
        for (Student student : sectionAStudents) {
            System.out.println(student);
        }

        // Topper among all sections
        int maxMarks = -1;
        Student topper = null;
        for (Student student : students) {
            if (student.getMarks() > maxMarks) {
                maxMarks = student.getMarks();
                topper = student;
            }
        }
        System.out.println("\nTopper among all sections: " + topper);

        // Topper of section B
        maxMarks = -1;
        topper = null;
        for (Student student : students) {
            if (student.getSection() == 'B' && student.getMarks() > maxMarks) {
                maxMarks = student.getMarks();
                topper = student;
            }
        }
        System.out.println("\nTopper of section B: " + topper);

        // Count of students in section C and D
        int countC = 0, countD = 0;
        
      //iterate through students and check its section is C or D ...>if it is increment the count
        for (Student student : students) {
            if (student.getSection() == 'C') {
                countC++;
            } else if (student.getSection() == 'D') {
                countD++;
            }
        }
        System.out.println("\nCount of students in Section C: " + countC);
        System.out.println("Count of students in Section D: "+ countD);
    }
}
