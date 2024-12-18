import java.time.LocalDate;

public class Admin extends Users {
    public Admin(String name, int year, int day, int mont ) {
        super(name,  year,  day,  mont);
    }
//    @Override
    public void displayInfo(boolean full){
        if(full){
            System.out.println("name: " + getName());
            System.out.println("Birthday: " + getDob());
            System.out.println("User type: admin ");
            System.out.println("Today"+ LocalDate.now());

        }
        else {
            System.out.println("name: " + getName());
        }
    }

}
