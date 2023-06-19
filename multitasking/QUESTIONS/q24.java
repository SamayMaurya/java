class q24{
public static void main(String args[]){
Thread a = new Thread(new MyRunnable());
a.setName("MyThreads");

a.setPriority(Thread.MAX_PRIORITY);

String aName= a.getName();
System.out.println("Thread Nmae:"+aName);

int tprio= a.getPriority();
System.out.println("Thread PRIO:"+tprio);


}

static class MyRunnable implements Runnable{
public void run(){


}

}


}
