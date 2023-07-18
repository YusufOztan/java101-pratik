package Pratik23;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note1;
    double note2;

    Course(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;

        } else {
            System.out.println("Teacher's Branch and Course Branch don't fit.");
        }

    }
    void printTeacherInfo(){
        this.teacher.print();
    }

}
