public class SingletonRun {
    public static void main(String[] args) {
        Database.getInstance();
        Database.getInstance();
        Database.getInstance();
    }


}
