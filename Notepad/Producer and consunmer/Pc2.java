import java.util.*;

class Pc2
{
//java corection same as STL
LinkedList<Integer> list=new LinkedList<>();
int capacity=2;
void produce() throws InterruptedException
{
int val=0;
while(true){
synchronized(this){
while(list.size()==capacity){
wait();
}
System.out.println("Going to Prodice items.....");
System.out.println("Item produce ="+val);

list.add(val++);

notify();  //notifyall to notify all the consumer
Thread.sleep(1000);
}

}

}
void consume() throws InterruptedException
{
while(true)
{
synchronized(this)
{
while(list.size()==0)
{
wait();
}
System.out.println("Going to Consume items.....");
int item=list.removeFirst();
System.out.println("Item produce ="+item);
notify();
Thread.sleep(1000);
}
}
}
}


class A extends Thread
{
Pc2 d;
A(Pc2 d){
this.d=d;
}
public void run()
{
try{
d.produce();

}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}


class B extends Thread
{
Pc2 d;
B(Pc2 d){
this.d=d;
}
public void run()
{
try{
d.consume();

}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}



class Xyz{
public static void main(String[] args){
Pc2 d= new Pc2();
A t1= new A(d);

t1.start();
B t2= new B(d);

t2.start();

}

}

