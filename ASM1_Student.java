package ASM1;

public class ASM1_Student {
    //1. các trường (fields)

    private int id;
    private String name;
    private int age;

    //2a. Contructur (không tham số)
    public ASM1_Student() {
    }

    //2b. Contructur (đầy đủ tham số)
    public ASM1_Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //2c. Getter, Setter 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student " + "id = " + id
                + ", name = " + name
                + ", age = " + age;
    }
    
}
