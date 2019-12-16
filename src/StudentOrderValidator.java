public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        checkCityRegister();
        checkWedding();
        checkChildren();
        checkStudent();
    }

    static void checkCityRegister() {
        System.out.println("CityRegister is running!");
    }

    static void checkWedding() {
        System.out.println("checkWedding is running");
    }

    static void checkChildren() {
        System.out.println("checkChildren is running");
    }

    static void checkStudent() {
        System.out.println("Студенты проверяются!");
    }

}
