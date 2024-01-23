public class Student {
    String name = "Goutham";

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
    }
}
