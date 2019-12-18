public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {

        StudentOrder so = readStudentOrder();

        checkCityRegister(so);
        checkWedding(so);
        checkChildren(so);
        checkStudent(so);
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static void checkCityRegister(StudentOrder so) {
        System.out.println("CityRegister is running!");
    }

    static void checkWedding(StudentOrder so) {
        System.out.println("checkWedding is running");
    }

    static void checkChildren(StudentOrder so) {
        System.out.println("checkChildren is running");
    }

    static void checkStudent(StudentOrder so) {
        System.out.println("Студенты проверяются!");
    }

}
