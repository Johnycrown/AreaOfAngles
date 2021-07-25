import java.util.Scanner;
public class AreaOfRectangle{

public static void main(String []args){


Scanner input = new Scanner(System.in);
System.out.println("enter the length of the rectangle");
int length = input.nextInt();


System.out.println("enter the breadth of the rectangle");
int breadth = input.nextInt();

int area = breadth * length;

System.out.printf("the area of the rectangle is %d%n", area);


}
}
