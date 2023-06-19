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


B b=new B();
Thread t2=new Thread(b);

C c=new C();
Thread t3=new Thread(c);

t1.setPriority(Thread.MAX_PRIORITY);  // Setting maximum priority
t2.setPriority(Thread.MIN_PRIORITY);  // Setting minimum priority
t3.setPriority(Thread.NORM_PRIORITY); // Setting normal priority




t1.start();
t2.start();
t3.start();
  
//int priority_name=Thread.currentThread().getName();
//int mainPriority=Thread.currentThread().getPriority();

System.out.println(Thread.currentThread().getName());

System.out.println(Thread.currentThread().getPriority());


try{
Thread.sleep(100000);
}

catch(InterruptedException e){
System.out.println(e);
}

}

}