package class1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] studentNames =  {"학생1", "학생2"};
        int[] studentAge = {15, 17};
        int[] studentGrade = {2, 3};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("학생이름은 " + studentNames[i] + "나이는 " + studentAge[i] + "학년은" + studentGrade[i] + "입니다.");
        }
    }
}