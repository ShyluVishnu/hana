import java.io.*;
import java.util.Scanner;
class posneg{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n==0)
{
System.out.println("Zero");
}
else if(n%2==0)
{
System.out.println("Positive);
}
else{
System.out.println("Negative");
}
}
}
