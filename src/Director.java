import java.util.ArrayList;
import java.util.List;
public class Director extends Employee{
    private List<Staff> staffList;
    private List<Manager> managerList;

    public List<Staff> getStaff() {
        return staffList;
    }
    public void addManager(Manager manager) {
        managerList.add(manager);
    }

    public List<Manager> getManagerList() {
        return managerList;
    }
    public void addStaff(Staff staf) {
        staffList.add(staf);
    }

    public Director(int ID, String Name, int Age, double hourlyRate, int completedHours) {
        super(ID, Name, Age, hourlyRate, completedHours);
        this.staffList = new ArrayList<>();
        this.managerList = new ArrayList<>();
    }
}
