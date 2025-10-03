public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", "10th Grade");
        Teacher t1 = new Teacher("Mr. John", "Mathematics");
        Staff st1 = new Staff("Mr. Ravi", "Librarian");

        s1.displayDetails();
        t1.displayDetails();
        st1.displayDetails();

        System.out.println(" Attendance Record ");

        AttendanceRecord record = new AttendanceRecord(s1.getId(), "2025-10-03", true);
        record.displayAttendance();
    }
}
