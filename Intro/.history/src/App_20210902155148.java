public class App {

    static App constructor = new App();
    public static void main(String[] args) throws Exception {
        constructor.name();
    }

    public void name() {
        String fname = "Deborah";
        String lname = "Egonu";
        
        System.out.print(fname + " " + lname);
    }
}
