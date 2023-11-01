import java.util.ArrayList;
import java.util.List;
public class Manager extends Employee{
    private  List<Staff> StaffList ;
    public List<Staff> getStaffList() {
        return StaffList;
    }
    public void addStaff(Staff staff) {
        StaffList.add(staff);
    }

    public Manager(int ID, String Name, int Age, double hourlyRate, int completedHours) {
        super(ID, Name, Age, hourlyRate, completedHours);
        this.StaffList = new ArrayList<>();
    }
}
