public class Lec05 extends Users {
    public static void main(String[] args) {
        Users John = new Users("John", 1954, 2, 18);
        John.displayInfo();
        System.out.println();
        Admin nicolas = new Admin("Nicolas", 1964, 1, 7);
        nicolas.displayInfo();
        System.out.println();
        nicolas.displayInfo(true);
        System.out.println();
        nicolas.displayInfo(false);

    }
}
