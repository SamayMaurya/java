import java.sql.*;
class Y
{
public static void main(String []args)
{
Connection con=null;
try
{
Class.forName("com.mysql.jdbc.Driver");
}
catch(Exception e)
{
System.out.println("Driver can't loaded");
}
}
}