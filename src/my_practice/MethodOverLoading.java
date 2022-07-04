package my_practice;
public class MethodOverLoading {
public static void main(String[] args)
{
// created object of a class
add();
add(10, 30);
add(12.22f,12.13f);
}
public static void add() // method with zero parameter
{
int a=10;
int b=20;
int sum=a+b;
System.out.println("Sum is "+sum);
}
public static void add(int a, int b)//method with two parameters
{
int sum=a+b;
System.out.println("Sum is "+sum);
}
public static void add(float a, float b)
{
double sum= a+b;
System.out.println("Sum is "+sum);
}
}