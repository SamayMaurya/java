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


class G{
public static void main(String[] args){
A a=new A();
Thread t1=new Thread(a);


B b=new B();
Thread t2=new Thread(b);

C c=new C();
Thread t3=new Thread(c);

t1.setPriority(Thread.MAX_PRIORITY);
t2.setPriority(Thread.MIN_PRIORITY);
t3.setPriority(Thread.NORM_PRIORITY);
t1.start();
t2.start();
t3.start();

System.out.println(Thread.currentThread().getName());

System.out.println(Thread.currentThread().getPriority());
try{
Thread.sleep(100);
}

catch(InterruptedException e){
System.out.println(e);

}


}
}