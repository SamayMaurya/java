import java.util.Scanner;

class Ab{
int id;
String name;
float salary;
int pan;

Ab(String name){
this.name=name;
}
Ab(String name, int id){
this(name);
this.id=id;
}
Ab(String name, int id, float salary){
this(name,id);
this.salary=salary;
}
Ab(String name, int id, float salary,int pan){
this(name,id,salary);
this.pan=pan;
}

void show(){
System.out.println("Name=" + name + "ID=" + id + "Salary=" + salary + "Pan=" + pan);
}


public static void main(String[] args){
Scanner scanner=new Scanner(System.in);

System.out.println("Enter Name:");
String name= scanner.nextLine();

System.out.println("Enter id:");
int id=scanner.nextInt();

System.out.println("Enter salary:");
float salary= scanner.nextFloat();

System.out.println("Enter Pan:");
int pan= scanner.nextInt();

Ab c=new Ab(name, id, salary,pan);
c.show();

}


}