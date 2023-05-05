import java.util.*;
class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v=0,b,h;
       
        System.out.println("Enter Area of Base :");
        b =sc.nextDouble();
        System.out.println("Enter Height :");
        h =sc.nextDouble();

        v = b*h;
        System.out.println("Volume of Box :"+ v);


    }
    
}

