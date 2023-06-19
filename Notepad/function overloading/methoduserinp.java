import java.util.Scanner;


class Ab{
void add(){
int a=10, b=20;
int c;
c=a+b;
System.out.println(c);

}
void add(int x, int y){
int c;
c=x+y;
System.out.println(c);

}

void add(int x, double y){
double c;
c=x+y;
System.out.println(c);

}

public static void main(String[] args){
Scanner scanner= new Scanner(System.in);
Ab r=new Ab();
r.add();
System.out.println("Enter two integers: ");
int x = scanner.nextInt();
int y = scanner.nextInt();

r.add(x,y);
System.out.println("Enter two numbers: ");
int a = scanner.nextInt();
double b = scanner.nextDouble();

r.add(a,b);

}

}
