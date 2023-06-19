package pack2;
import pack1.C1;
import pack1.I1;

class C2 implements I1{
public int div(int a, int b)
{
return a/b;
}

public static void main(String args[]){

C1 d=new C1();
C2 d1=new C2();

System.out.println("sum="+d.sum(4,5));
System.out.println("sub="+d.sub(5,2));
System.out.println("div="+d1.div(4,2));


}


}