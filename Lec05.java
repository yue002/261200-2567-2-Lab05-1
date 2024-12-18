public class Lec05 extends Users {
    public static void main(String[] args) {
        Users John = new Users("John", 1954, 2, 18);
        John.displayInfo();

        Admin nicolas = new Admin("Nicolas", 1964, 1, 7);
        nicolas.displayInfo();
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);

    }
}
