public class Database {
    private String url;
    private Boolean status;

    private static Database database = null;

    private Database(String url) {
        status = false;
        this.url = url;
        connect(this.url);
    }

    //to make sure only one connection is open for each Employee
    public static  Database getInstance(String url) {
        if (database == null) {
            synchronized (Database.class) {
                if (database == null) {
                    database =  new Database(url);
                }
            }
        }
        return database;
    }

    public void connect(String url) {
        //System.out.println("Connecting .... ");
        try {
            //Thread.sleep(5000);//wait for 5 seconds
            this.status = true;
        } catch (Exception e){
            System.err.println(e);
            this.status = false;
        }
        System.out.println("Connected!");
    }

    public Boolean getStatus() {
        return status;
    }

    public Object executeQuery(String query){
        if (!this.status){
            connect(this.url);
        }
        System.out.println("Executing query: " + query);
        return "done....";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && this == obj) {
            return true;
        }
        if (!(obj instanceof Database)) {
            return false;
        }
        Database database = (Database) obj;
        if( this.url.equals(database.url)) {
            return true;
        }
        return false;
    }

    String getUrl() {
        return url;
    }
}
