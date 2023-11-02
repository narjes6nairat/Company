public abstract class Employee implements Payable {
        private int ID;
        private String Name;
        private int Age;
        private double hourlyRate;
        private int completedHours;

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }

        public double getHourlyRate() {
            return hourlyRate;
        }

        public void setHourlyRate(double hourlyRate) {
            this.hourlyRate = hourlyRate;
        }

        public int getCompletedHours() {
            return completedHours;
        }

        public void setCompletedHours(int completedHours) {
            this.completedHours = completedHours;
        }

        public Employee(int ID, String Name, int Age, double hourlyRate, int completedHours) {
            this.ID = ID;
            this.Name = Name;
            this.Age = Age;
            this.hourlyRate = hourlyRate;
            this.completedHours = completedHours;
        }
        private static final String DatabaseUrl = "127.0.0:44433/myDB";
        private Database database = null;
        public void runQuery(String query) {
            database = Database.getInstance(DatabaseUrl);
            database.executeQuery(query);
        }
        @Override
        public double MonthlyPay() {
            return hourlyRate * completedHours;
        }


}
