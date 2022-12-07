public class Database {
    private static Database instance;

    public static Database getInstance() {
        if (instance == null) {
            System.out.println("Création d'une nouvelle instance de database");
            instance = new Database();
        }
        System.out.println("Retour de l'instance de database en cours");
        return instance;
    }

    private void Database() {

    }
}
