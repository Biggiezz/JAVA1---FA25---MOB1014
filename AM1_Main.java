package ASM1;

import java.util.*;

public class AM1_Main {
    public static void main(String[] args) {

        // gọi menu vào
        ASM1_Student_Service service = new ASM1_Student_Service();

        AMS1_Menu menu = new AMS1_Menu(service);
        menu.show();

//        List<Student> students = new ArrayList(); // 0
//
//        // 1. Thêm sinh viên vào danh sách
//        // Tạo ra sinh viên mới
//        Student student = new Student(1, "Phuc", 24);
//
//        // add vào danh sách (list)
//        students.add(student);
//
//        Student student1 = new Student(2, "Nam", 14);
//        students.add(student1);
//
//        //2. Show all students (in ra console)
//        //3. Update (sửa chữa) - id = 2
//        // tìm sv có id = 2
//        // update name, age cho sv
//        for (Student s : students) {
//            if (s.getId() == 2) {
//                s.setName("Toàn");
//                s.setAge(22);
//            }
//        }
//
//        // 3. Xóa (Remove) sv có id = 1
//        for (Student s : students) {
//            if (s.getId() == 1) {
//                students.remove(s);
//            }
//        }
    }
}
