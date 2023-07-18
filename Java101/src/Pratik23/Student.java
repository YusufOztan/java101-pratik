package Pratik23;

public class Student {

    Course c1;
    Course c2;
    Course c3;
    String name;
    String stdNo;
    String classes;
    double avg;
    boolean isPass;

    Student (String name,String stdNo,String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avg = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1,int note1i,int note2,int note2i,int note3,int note3i){
        if (note1 >= 0 && note1 <= 100){
            this.c1.note1 = note1;
        }
        if (note1i >= 0 && note1i <= 100){
            this.c1.note2 = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note1 = note2;
        }
        if (note2i >= 0 && note2i <= 100) {
            this.c2.note2 = note2;
        }
        if (note3i >= 0 && note3i <= 100) {
            this.c3.note1 = note3;
        }
        if (note3i >= 0 && note3i <= 100) {
            this.c3.note2 = note3;
        }
        else{
            System.out.println("Please enter valid grade.");
        }
    }
    void isPass(){
        System.out.println("---------------------------------------------");
        double avgc1 = (this.c1.note1 * 0.80) + (this.c1.note2 * 0.20);
        double avgc2 = (this.c2.note1 * 0.80) + (this.c2.note2 * 0.20);
        double avgc3 = (this.c3.note1 * 0.80) + (this.c3.note2 * 0.20);
        this.avg = (avgc1 + avgc2 + avgc3)/3.0;
        if(this.avg > 55) {
            System.out.println("You passed the class!");
            this.isPass = true;
        } else {
            System.out.println("You failed the class!");
            this.isPass = false;
        }
    }

    void printNote(){
        System.out.println(c1.name + " Written Grade: " + this.c1.note1 + " | Verbal Grade: " + this.c1.note2);
        System.out.println(c2.name + " Written Grade: " + this.c2.note1 + " | Verbal Grade: " + this.c2.note2);
        System.out.println(c3.name + " Written Grade: " + this.c3.note1 + " | Verbal Grade: " + this.c3.note2);
    }
}
