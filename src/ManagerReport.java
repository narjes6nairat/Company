import java.util.List;

public class ManagerReport implements ManagerReportable {

    @Override
    public void listofstaff(Manager manager) {
        List<Staff> staffList=manager.getStaffList();
        for (var staff:staffList
        ) {
            System.out.println("id: "+ staff.getID() + " " +staff.getName() );
        }
    }

    @Override
    public void calculatebudget(Manager manager) {
        double budgetResult=0;
        List<Staff> staffList=manager.getStaffList();
        for (var stuff:staffList) {
            budgetResult += stuff.getHourlyRate() * stuff.getCompletedHours();
        }
        System.out.println("budget= "+budgetResult);
    }
}
