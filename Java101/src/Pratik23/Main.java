package Pratik23;

public class Main {
    public static void main(String[] args) {
        Teacher ahmet = new Teacher("Ahmet","HIS","05319513578");
        Teacher mehmet = new Teacher("Mehmet","MAT","05454548695");
        Teacher yilmaz = new Teacher("Yılmaz","PHY","05524625138");


        Course history = new Course("History","101","HIS");
        history.addTeacher(ahmet);

        Course math = new Course("Mathematics","102","MAT");
        math.addTeacher(mehmet);

        Course physics = new Course("Physics","101","PHY");
        physics.addTeacher(yilmaz);

        Student s1 = new Student("Yusuf","123","4",history,math,physics);

        s1.addBulkExamNote(100,100,50,50,60,60);
        s1.isPass();
        s1.printNote();


        Student s2 = new Student("Hatice","234","4",history,math,physics);

        s2.addBulkExamNote(30,30,50,50,50,50);
        s2.isPass();
        s2.printNote();

    }
}
