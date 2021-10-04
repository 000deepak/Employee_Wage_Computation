public class UC1_EmployeeAttendence {

    static int is_full_time = 1;

    public static void main(String[] args) {
        empCheck();
    }

    public static void empCheck() {
        double random = Math.floor(Math.random() * 10) % 2;
        System.out.println(random);
        if (is_full_time == random) {
            System.out.println("employee is present");

        } else {
            System.out.println("employee is absent");

        }
    }
}
