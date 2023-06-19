class Abc{
static int count=0;
Abc(){
count++;
}

void show(){
System.out.println(count);
}

public static void main(String[] args)
{
Abc c = new Abc();
c.show();
}

}