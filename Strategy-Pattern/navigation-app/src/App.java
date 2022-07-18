import dbAPI.NavDB;

public class App {
    public static void main(String[] args) throws Exception {
        NavDB navDB = new NavDB();
        navDB.loadDB();
        
        NavUI navUI = new NavUI();
        navUI.loadUI();
    }
}
