
import java.util.Scanner;


public class AreaCircumferenceRect {

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int length, width,area,circumference;
        
        System.out.println("===== Rectangle Measurements =====");
        System.out.print("Enter width of rectangle:");
        width = scn.nextInt();
        
        System.out.print("Enter length of rectangle:");
        length = scn.nextInt();
                
        area = length * width;
        circumference = 2 * (length + width);
       
        System.out.println("===== Results =====");
        System.out.println("Area: " + area + "cm");
        //To get cm² you need to select alt and 0178
        System.out.println("Circumference: " + circumference + "cm²"); 
    }
    
}
