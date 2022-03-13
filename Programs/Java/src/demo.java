import java.util.Scanner;
class Dev {
public String name;
public int age;
int sal;
String desig;
void create_Dev()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name");
name=sc.nextLine();
System.out.println("Enter The age:");
age=sc.nextInt();
System.out.println("Enter the salary");
sal=sc.nextInt();
System.out.println("enter designation");
sc.nextLine();
desig=sc.nextLine();
}
void display()
{
System.out.println("*****Dev*****");
System.out.println("My name is: "+name);
System.out.println("My age is: "+age);
System.out.println("My salary is: "+sal);
System.out.println("My desig is: "+desig);
}
}
class Manager {
String name;
int age;
int sal;
String desig;
void create_Manager()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name");
name=sc.nextLine();
System.out.println("Enter The age:");
sal=sc.nextInt();
System.out.println("Enter the salary");
age=sc.nextInt();
System.out.println("enter designation");
sc.nextLine();
desig=sc.nextLine();
}
void display()
{
System.out.println("*****Manager*****");
System.out.println("My name is: "+name);
System.out.println("My age is: "+age);
System.out.println("My salary is: "+sal);
System.out.println("My desig is: "+desig);
}
}
class Clerk {
String name;
int age;
int sal;
String desig;
void create_Clerk()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name");
name=sc.nextLine();
System.out.println("Enter The age:");
sal=sc.nextInt();
System.out.println("Enter the salary");
age=sc.nextInt();
System.out.println("enter designation");
sc.nextLine();
desig=sc.nextLine();
}
void display()
{
System.out.println("*****Dev*****");
System.out.println("My name is: "+name);
System.out.println("My age is: "+age);
System.out.println("My salary is: "+sal);
System.out.println("My desig is: "+desig);
}
}
public class demo
{
public static void main(String[] args) {
Manager m=new Manager();
Clerk c=new Clerk();
Dev d=new Dev();
while(true){
Scanner sc=new Scanner(System.in);
System.out.println("Press 1 to create");
System.out.println("Press 2 to display");
System.out.println("Press 3 to Rise Salary ");
System.out.println("Press 4 to exit");
System.out.println("Enter your choice");
int ch=sc.nextInt();
switch (ch) {
case 1:
System.out.println("Press 1 to create Manager");
System.out.println("Press 2 to create Clerk");
System.out.println("Press 3 to create Programmer");
System.out.println("Press any key to exit");
System.out.println("Enter your choice");
int num=sc.nextInt();
switch (num) {
case 1: m.create_Manager();
break;
case 2:c.create_Clerk();
case 3:
d.create_Dev();
default:
break;
}
case 2:
System.out.println("Press 1 to display Manager");
System.out.println("Press 2 to display Clerk");
System.out.println("Press 3 to display Programmer");
System.out.println("Press any key to exit");
System.out.println("Enter your choice");
int num2=sc.nextInt();
switch (num2) {
case 1:
m.display();
break;
case 2:
c.display();
case 3:
d.display();
default:
break;
}
}
}
}
}