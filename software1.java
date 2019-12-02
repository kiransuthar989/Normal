import java.util.Scanner;
class Main
{
public static void main (String []args)
{
System.out.print("Enter the number = ");
Scanner x = new Scanner(System.in);
int a = x.nextInt();
int c = (a - 1)%2;
System.out.println("Output is = "+c + 2);
}
}
