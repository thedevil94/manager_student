import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student firstStudent = new Student();
        Student secondStudent = new Student();
        Student thirdStudent = new Student();
        Student fourthStudent = new Student();
        secondStudent.setFullName("Cong");
        firstStudent.setFullName("Phong");
        thirdStudent.setFullName("David");
        fourthStudent.setFullName("Lucifer");
        Manager manager = new Manager();
        manager.setMarkStudent(firstStudent, 10);
        System.out.println(firstStudent.getFullName() + "có điểm số là: " + firstStudent.getMark());

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(firstStudent);
        studentList.add(secondStudent);
        studentList.add(thirdStudent);
        studentList.add(fourthStudent);

        for (Student student : studentList) {
            System.out.println(student.getFullName());
        }
    }
}
