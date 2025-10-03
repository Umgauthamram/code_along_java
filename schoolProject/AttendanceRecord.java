public class AttendanceRecord {
    private int personId;
    private String date;
    private boolean present;

    public AttendanceRecord(int personId, String date, boolean present) {
        this.personId = personId;
        this.date = date;
        this.present = present;
    }

    public void displayAttendance() {
        System.out.println("Attendance -> ID: " + personId + ", Date: " + date + ", Present: " + present);
    }
}
