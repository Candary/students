package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.other.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {
        buildStudentOrder();
/*
        StudentOrder so = new StudentOrder();

        long ans = saveStudentOrder(so);
        System.out.println(ans);
*/
    }

    /**
     * @param studentOrder - объект
     * @return
     */
    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder 1 ");

        return answer;
    }

    /* static - вызываем метод без создания объекта;
    внутри этого метода нельзя обратиться к полям объекта.
    внутри него можно обратиться к полям класса.
     */
    public static StudentOrder buildStudentOrder() {
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult();
/*
        husband.setGivenName("Андрей");
        husband.setSurName("Петров");
        husband.setPassportNumber("123456");
        so.setHusband(husband);

        String ans = husband.getPersonString();
        System.out.println(ans);
*/

        return so;
    }
}
