package OOP;

public class OOP_Buoi5_huong_doi_tuong {

    public static void main(String[] args) {
        System.out.println("OOP basics");

//        OOP_Student student1 = new OOP_Student(1L, "OOP_Student 1", "Email 1", "Phone 1", "Toán 1 ", "Lý 1", "Hóa 1");
//        student1.output();
//
//        student1.setId(student1.getId());
//        student1.setFullName(student1.getFullName());
//        student1.setEmail(student1.getEmail());
//        student1.setPhone(student1.getPhone());
//        student1.setToan(student1.getToan());
//        student1.setToan(student1.getLy());
//        student1.setToan(student1.getHoa());
//
//        student1.output();

//        OOP_Student student2 = new OOP_Student();
//        student2.setId(2L);
//        student2.setFullName("OOP_Student 2");
//        student2.setEmail("Email 2");
//        student2.setPhone("Phone 2");
//        student2.output();
//        OOP_Student student3 = new OOP_Student(3L);
//        student3.setFullName("Nguyen Manh Phuc");
//        student3.setEmail("manhphuc300501@gmail.com");
//        student3.setPhone("0943718195");
//        student3.output();

        // nhập từ bàn phím
        OOP_Student student4 = new OOP_Student();
        student4.input();
        student4.output();
    }
}
