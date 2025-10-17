package ASM1;

import java.util.*;

public class ASM1_Student_Service {

    // 1. data
    private List<ASM1_Student> students = new ArrayList();

    //2. methods
    // Thêm sinh viên vào danh sách
    public void addStudent(ASM1_Student student) {

        students.add(student);
    }

    // Lấy ra toàn bộ sinh viên (danh sách sv)
    public List<ASM1_Student> getAllStudent() {

        return students;
    }

    // Tìm sinh viên theo id
    public ASM1_Student findStudentById(int id) {

        for (ASM1_Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public ASM1_Student_Service() {
    }

    // Sửa sinh viên theo id
    public boolean updateStudent(int id) {
        for (ASM1_Student s : students) {
            if (s.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // Xóa sv theo id
    public boolean removeStudent(int id) {

        return students.remove(findStudentById(id));
    }

}
