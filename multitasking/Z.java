class D implements Runnable{
public void run(){
for(int i=0; i<=5;i++){
System.out.println("Thread D");
}

}

}

class E implements Runnable{
public void run(){
for(int i=0;i<=4;i++){
System.out.println("Thread E");
}

}

}

class F implements Runnable{
public void run(){
for(int i=0;i<=4;i++){
System.out.println("Thread F");
}

}

}



class Z{
public static void main(String[] args){
D a= new D();
Thread t1 = new Thread(a);
t1.start();
E b=new E();
Thread t2= new Thread(b);

t2.start();
 
F c = new F();
Thread t3= new Thread(c);
t3.start();

try{
Thread.sleep(100);
}

catch(InterruptedException e){
System.out.println(e);

}
}

}