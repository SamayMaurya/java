class Abc
{
public static void main(String args[])
{
String s="Samay";
String s1="Maurya";
String s2="FeatureSM is a growing UX startup";
System.out.println(s.length());
System.out.println(s1.length());
System.out.println(s2.length());

System.out.println(s.concat(s1));

String s3= "Graphic Era Hill University";
char res= s3.charAt(4);
System.out.println(res);

System.out.println(s.equals(s1));


String s4="SamAy"; 
System.out.println(s.equalsIgnoreCase(s4));


System.out.println(s4.indexOf('a'));



String s5=" Sama ";
System.out.println(s5.trim()); 


String s6="sdfjskulgdlau";
System.out.println(s6.isEmpty());


String s7="SamayFeatureSM";
System.out.println(s7.substring(2));
System.out.println(s7.substring(2,4));



}
}