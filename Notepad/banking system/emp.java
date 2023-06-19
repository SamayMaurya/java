import java.util.Scanner;

class Abc{
    String name;
    int id;
    float salary;
    String Name;
    int pan;
    
    Abc(String Name) {
        this.Name = Name;
    }
    
    Abc(String Name, int id) {
        this(Name);
        this.id = id;
    }
    
    Abc(String Name, int id, float salary) {
        this(Name, id);
        this.salary = salary;
    }
    
    Abc(String Name, int id, float salary, int pan) {
        this(Name, id, salary);
        this.pan = pan;
    }
    
    void show() {
        System.out.println("Name=" + name + " ID=" + id + " Salary=" + salary + " Pan=" + pan);
    }
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        
        System.out.print("Enter Salary: ");
        float salary = scanner.nextFloat();
        
        System.out.print("Enter Pan: ");
        int pan = scanner.nextInt();
        
        Abc c = new Abc(name, id, salary, pan);
        c.show();
        
        scanner.close();
    }
}