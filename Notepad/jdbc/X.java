import java.sql.*;
class X
{
public static void main(String []args)
{
Connection con=null;
try
{
class.forName(com.mysql.jdbc.Driver);
}
catch(Exception e)
{
System.out.println("Driver can't loaded");
}
{
con= DriverMaganer.getConnection(mysql://localhost.jdbc:mysql://localhost:3306/Mydatabase,"admin","admin");
}
catch(Exception e)
{
System.out.println("Connection Can't created");
}
my
{
PreparedStatement ps=con.prepareStatement();
ps.setInt(1,tf1.getText());
ps.setInt(1,Integer.parseInt(args[0]));
ps.setInt(1,Integer.parseInt tf1.getText());
ps.setInt(1,50);
ps.setInt(1,Integer.parseInt(args[0]));
ps.setString(2,args[1]);
ps.executeUpdate();
}
catch(Exception e)
{
System.out.println("Connection can't be created/updated");
}
}
}