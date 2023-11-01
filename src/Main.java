// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Director director1 = new Director(1 , "Jawad" , 40 , 31 , 180);

        Manager manager1 = new Manager(50 , "Adham" , 34 , 24 , 190);
        Manager manager2 = new Manager(51 , "seren" , 32 , 22 , 197);

        Staff staff1 = new Staff(100 , "narjes" , 27 , 17 , 200);
        Staff staff2 = new Staff(101 , "ayan" , 26 , 14 , 220);
        Staff staff3 = new Staff(102 , "Abed" , 22 , 21 , 200);
        Staff staff4 = new Staff(103 , "sana" , 25 , 19 , 230);
        Staff staff5 = new Staff(104 , "Adnan" , 22 , 24 , 222);
        Staff staff6 = new Staff(105 , "seren" , 22 , 18 , 214);
        DirectorReport dr=new DirectorReport();
        dr.calculatebudget(director1);
        dr.listofstaff(director1);
        director1.addManager(manager1);
        director1.addManager(manager2);
        director1.addStaff(staff1);
        director1.addStaff(staff2);
        director1.runQuery("select*from directort_table");
        director1.runQuery("select*from table");
        manager1.addStaff(staff1);
        manager1.addStaff(staff1);
        manager1.addStaff(staff2);
        manager1.runQuery("select*from manager_table");
        manager1.runQuery("select*from table");
    }

}