package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.other.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {
       buildStudentOrder(10);

/*         StudentOrder so = new StudentOrder();

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
    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        StudentOrder so1 = so;
        // если ссылка используется как параметр - создаётся ещё одна ссылка
        // вернее, so1 копируется...
        // теперь она будет stOr
        // такая вот особенность...
        printStudentOrder(so1);

//        Adult husband = new Adult("Васильев", "Андрей", "Петрович", null);
        return so;
    }

    static void printStudentOrder(StudentOrder stOr) {
        System.out.println(stOr.getStudentOrderId());
    }
}
