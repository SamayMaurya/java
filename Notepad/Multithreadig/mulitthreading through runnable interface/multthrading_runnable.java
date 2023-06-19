class A implements Runnable{
public void run(){
for(int i=1; i<=5;i++){
System.out.println("This is thread class A and i"+i);
}
}
}


class B implements Runnable{
public void run(){
for(int i=1; i<=5;i++){
System.out.println("This is thread class B and i"+i);
}
}
}


class C implements Runnable{
public void run(){
for(int i=1; i<=5;i++){
System.out.println("This is thread class C and i"+i);
}
}
}


class Y{
public static void main(String[] args){
A a=new A();
Thread t1=new Thread(a);
t1.start();

B b=new B();
Thread t2=new Thread(b);
t2.start();

C c=new C();
Thread t3=new Thread(c);
t3.start();

try{
Thread.sleep(100);
}	

catch(InterruptedException e){
System.out.println(e);
}

}

}