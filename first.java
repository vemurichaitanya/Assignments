import java.io.*;
import java.lang.*;
class Person
{
public String name;
public String address;
public Person(String name,String address)
{
this.name=name;
this.address=address;
}
public String getName()
{
return(name);
}
public String getAddress()
{
return(address);
}
public void setAddress(String naddress)
{
address=naddress;
}
public String toString()
{
return String.format("person name="+name+"address="+address);
}
}
class Student extends Person
{
int year;
double fee;
String program;

public Student(String name,String address,String program,int year,double fee)
{
super(name,address);
this.program=program;
this.year=year;
this.fee=fee;
}
public String getProgram()
{
return program;
}
public int getYear()
{
return year;
}
public double getFee()
{
return fee;
}
public void setProgram(String nprogram)
{
program=nprogram;
}
public void setYear(int nyear)
{
year=nyear;
}
public void setFee(double nfee)
{
fee=nfee;
}
public String toString()
{
return String.format("Studen person name="+name+"address"+address+"program="+program+"Year="+year+"fee="+fee);
}
}
class Staff extends Person
{
String school;
double pay;
public Staff(String name,String address,String school,double pay)
{
super(name,address);
this.school=school;
this.pay=pay;
}
public void setSchool(String nschool)
{
school=nschool;
}
public String getSchool()
{
return school;
}
public void setPay(double npay)
{
pay=npay;
}
public double getPay()
{
return pay;
}
public String toString()
{
return String.format("Staff person name="+name+"address="+address+"school="+school+"pay="+pay);
}
}
class first
{
public static void main(String args[])
{
Person p=new Person("A","HYD");
Staff s=new Staff("chaitanya","Nandyal","SREC",30000);
Student st=new Student("vlc","knl","BTech",4,62000.0);
String s1=s.toString();
System.out.println("For staff class data is:"+s1);

String s2=st.toString();
System.out.println("For student class data is:"+s2);
}
}




