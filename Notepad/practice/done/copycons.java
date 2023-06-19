import java.util.Scanner;
class Abc{
int x,y;
Abc(){
this.x=0;
this.y=0;
}

Abc(int x, int y){
this.x=x;
this.y=y;

}

//copy
Abc(Abc c){
this(c.x,c.y);

}

public static void main(String[] args){
Scanner input =new Scanner(System.in);

System.out.println("Enter the value of x:");

int xvalue=input.nextInt();
System.out.println("Enter the value of y:");

int yvalue=input.nextInt();

Abc obj1= new Abc(xvalue, yvalue);
Abc obj2= new Abc(obj1);
System.out.println("Values of obj1: x = " + obj1.x + ", y = " + obj1.y);


System.out.println("Values of obj2: x = " + obj2.x + ", y = " + obj2.y);





}

}