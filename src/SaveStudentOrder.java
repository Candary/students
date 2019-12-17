
public class SaveStudentOrder {

    public static void main(String[] args) {
        var so = new StudentOrder();
        so.hFirstName = "Алексей";
        so.hLastName = "Петров";
        so.wFirstName = "Галина";
        so.wLastName = "Петрова";

        long ans = saveStudentOrder(so);
        System.out.println(ans);
    }

    /**
     * @param studentOrder - объект
     * @return
     */
    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("SaveStudentOrder 1 " + studentOrder.hFirstName);

        return answer;
    }
}
