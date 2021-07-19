package Assignment4.Question3;

import java.util.ArrayList;

public class DriverCode {

// ------------------------------------------------------------------------------------
    public static void check(String name, ArrayList<String> Name) throws employeeExist{
        if(!Name.contains(name))
            throw new employeeExist("["+name+"]" + " does not exist in Employee list");
        else
            System.out.println(name + "exist in Employee list");
    }

// -----------------------------------------------------------------------------------------

    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Sachin Tendulkar");
        nameList.add("Kapil Dev");
        nameList.add("Mahendra Singh Dhoni");
        nameList.add("Sunil Gavaskar");
        nameList.add("Ganguly");
        nameList.add("Virat Kohli");
        nameList.add("Rohit Sharma");

        try{
            check("Zaheer Khan", nameList);
        }
        catch (employeeExist error) {
            System.out.printf("Error: %s%n", error.getMessage());
        }
        finally {
            System.out.println("Finally block executed: checking name in given list");
        }
    }
}
