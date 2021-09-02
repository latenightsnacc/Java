public class App {

    static App constructor = new App();
    public static void main(String[] args) throws Exception {
        constructor.name();
    }

    public void name() {
        String fname = "Deborah";
        String lname = "Egonu";
        
        System.out.print(fname + " " + lname + "\n");
        constructor.user("Debs", 24);
    }

    public void user(String userName, int userAge ) {
        System.out.println("Hi, my name is " + userName + " and I am " + userAge + "years old");
    }
}
