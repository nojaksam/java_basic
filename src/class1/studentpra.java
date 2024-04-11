package class1;


public class studentpra {
    public static void main(String[] args) {
        student student1 = new student();
        student1.name = "학생1";
        student1.age = 17;
        student1.score = 89;

        student student2 = new student();
        student2.name  = "학생2";
        student2.age = 18;
        student2.score = 78;

        student student3 = new student();
        student3.name = "학생3";
        student3.age = 15;
        student3.score = 100;

        student [] students = new student[]{student1, student2,  student3};

        for (int i = 0; i < students.length; i++){
            System.out.println("이름 : " + students[i].name + " 나이 : " +  students[i].age + " 성적: " + students[i].score);

        }

    }
}
