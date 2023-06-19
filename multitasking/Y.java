class A extends Thread{
public void run(){
for(int i=0;i<=5;i++){
System.out.println("This is class A Thread");
}
}

}

class C extends Thread{
public void run(){
for(int i=0;i<=4;i++){
System.out.println("This is class C Thread");
}
}

}



class B extends Thread{
public void run(){
for(int i=0;i<=3;i++){
System.out.println("This is class B Thread");
}
}

}



class Y{
public static void main(String args[]){
A t1=new A();
t1.start();
B t2= new B();
t2.start();
C t3 = new C();
t3.start();



}

}