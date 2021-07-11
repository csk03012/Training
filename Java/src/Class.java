public class Class {
    int id;
    String name;
    int age;

    Class(int Id, int age, String Name){
        // observation: we can initialize without "this" if variable name is different.
        name = Name;
        id = Id;
        this.age = age;
    }

    Class(){
    }

}

class Driver{
    public static void main(String[] args) {
        // instance or object of class Class
        // java will create a default constructor if constructor not created.
        Class student1 = new Class();
        student1.age = 14;
        student1.id = 1;
        student1.name = "Smith";

        System.out.printf("Student1%nAge: %d%nid: %d%nName: %s%n", student1.age, student1.id, student1.name);
    }
}
