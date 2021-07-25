import java.util.Scanner;
public class AreaOfTriangle{

public static void main(String[]args){
 Scanner input = new Scanner(System.in);
 System.out.println("enter the base  of the triangle");
 double  base = input.nextDouble();
 System.out.println("enter the height of the triangle");
 double height = input.nextDouble();
 
 double areaofTriangle = (base * height)/2;
 
 System.out.println("the area of triangle is: " + areaofTriangle);
  
  }

}
