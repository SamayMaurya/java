class Abc{
String name;
int id;
float Salary;
String Name;
int Pan;

Abc(String Name)
{
this.Name=Name;
}

Abc(String Name, int id)
{
this(Name);
this.id=id;
}

Abc(String Name, int id, float Salary)
{
this(Name, id);
this.Salary=Salary;
}


Abc(String Name, int id, float Salary, int Pan)
{
this(Name, id, Salary);
this.Pan=Pan;
}

void show(){
System.out.println("Name="+ Name+ "ID= "+id+ "Salary=" +Salary+ "Pan="+Pan);

}
public static void main(String args[])
{
Abc c=new Abc("Samay", 12, 15000.56f, 4584);
c.show();
}


}