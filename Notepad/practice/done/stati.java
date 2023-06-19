class sDemo{
static int c=0;

static{
System.out.println("Inside static block");
c++;
}

static void increment(){
c++;
}

public static void main(String[] args){
System.out.println("Count before incerment"+c);
increment();
System.out.println("Count after incerment"+c);

}



}