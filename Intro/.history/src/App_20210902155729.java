public class App {

    static App constructor = new App();
    public static void main(String[] args) throws Exception {
        constructor.user();
    }

    public void user() {
        // String fname = "Deborah";
        // String lname = "Egonu";
        
        // System.out.print(fname + " " + lname + "\n");
        constructor.createUser("Debs", 24);
    }

    public void createUser(String userName, int userAge ) {
        System.out.println("Hi, my name is " + userName + " and I am " + userAge + " years old");
    }
}
