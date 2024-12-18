import java.time.LocalDate;

public class Users {
    private String name;
    private LocalDate dob;

    Users(){
        this.name = null;
        this.dob = LocalDate.now();
    }
    public Users(String name, int year, int mont, int day){
        this.name = name;
        this.dob = LocalDate.of(year , mont , day);

    }
    public String getName(){
        this.name = name ;
        return name;
    }

    public LocalDate getDob(){
        return  dob;
    }

    public void displayInfo(){
        System.out.println(name+ " was born on "+dob );

    }

}
