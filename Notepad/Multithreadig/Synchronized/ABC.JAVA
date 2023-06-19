class Y{
synchronized void table(int x){
for(int i=1;i<=5;i++){
System.out.println(i*x);
try{
Thread.sleep(1000);

}

catch(InterruptedException e){
System.out.println(e);
}
}
}
}


class A extends Thread{
Y d;
A(Y d){
this.d=d;
}
public void run(){
d.table(5);
}
}

class B extends Thread{
Y d;
B(Y d){
this.d=d;
}
public void run(){
d.table(6);
}
}

class Xyz{
public static void main(String[] args){
Y d=new Y();
A t1=new A(d);
t1.start();
B t2=new B(d);
t2.start();




}
}