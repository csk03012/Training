package JDBC;

public class Employee {
    private final String name;
    private final int age;
    private final String team;
    private final String discipline;
    private final int year;
    private final int id;

    Employee(int id, String name, int age, String team, String discipline, int year){
        this.id = id;
        this.name = name;
        this.age = age;
        this.team = team;
        this.discipline = discipline;
        this.year = year;

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String getDiscipline() {
        return discipline;
    }

    public int getYear() {
        return year;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "(" +
                getId() + "," +
                "'" + getName() + "'" + ","+
                getAge() + "," +
                "'" + getTeam() + "'" + "," +
                "'" + getDiscipline() + "'" + "," +
                getYear() +
                ")";
    }
}
