package JDBC;
import java.util.ArrayList;
import java.util.List;

public class EmployeeTable {


    public static List<Employee> table() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1001, "MS Dhoni", 40, "India", "Cricket", 2011));
        list.add(new Employee(1002, "Kapil dev", 62, "India", "Cricket", 1983));
        list.add(new Employee(1003, "Saina Nehwal", 31, "India", "Badminton", 2012));
        list.add(new Employee(1004,"PV Sindhu",26 , "India", "Wrestling", 2016));
        list.add(new Employee(1005,"PV Sindhu",26 , "India", "Wrestling", 2020));
        list.add(new Employee(1006,"Abhinav Bindra", 38, "India", "Shooting", 2008));
        list.add(new Employee(1007,"KD Jadhav", 95, "India", "Wrestling", 1952));
        list.add(new Employee(1008,"Leander Paes", 48, "India", "Tennis", 1996));
        list.add(new Employee(1009,"Karnam Malleshwari", 46, "India", "Weightlifting", 2000));
        list.add(new Employee(1010, "Rajyavardhan", 51, "India", "Shooting", 2004));
        list.add(new Employee(1011, "Vijendra Singh", 35, "India", "Boxer",2008));
        list.add(new Employee(1012, "Sushil Kumar", 38, "India", "Wrestling", 2012));
        list.add(new Employee(1013,"Sushil Kumar", 38, "India", "Wrestling", 2012));
        list.add(new Employee(1014, "Gagan Narang", 38, "India", "Shooting", 2012));
        list.add(new Employee(1015,"Vijay Kumar", 35, "India", "Shooting", 2012));
        list.add(new Employee(1016, "Mary Kom", 38, "India", "Boxer", 2012));
        list.add(new Employee(1017, "Yogeshwar Dutt", 38, "India", "Wrestling", 2012));
        list.add(new Employee(1018, "Sakshi Malik", 28, "India", "Wrestling", 2016));
        list.add(new Employee(1019, "Mirabai Chanu", 26, "India", "Weightlifting",2020));
        list.add(new Employee(1020, "Lovlina Borgohain", 23, "India", "Boxer", 2020));

        System.out.println("Total Employees: "+ list.size());

        return list;
    }
}
