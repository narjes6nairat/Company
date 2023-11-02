import java.util.ArrayList;
import java.util.List;
public class DirectorReport implements DirectorReportable{
    @Override
    public void listofstaff(Director director) {
        List<Staff> staffList=director.getStaff();
        for (var staff:staffList
             ) {
        System.out.println("id: "+ staff.getID() + " " +staff.getName() );
        }
    }

    @Override
    public void calculatebudget(Director director) {
        double budgetResult=0;
        List<Staff> staffList=director.getStaff();
        List<Manager> managerList=director.getManagerList();
        for (var stuff:staffList) {
            budgetResult += stuff.getHourlyRate() * stuff.getCompletedHours();
        }
        for (var manager:managerList) {
            budgetResult += manager.getHourlyRate() * manager.getCompletedHours();
        }
        System.out.println("budget="+budgetResult);
    }
}
