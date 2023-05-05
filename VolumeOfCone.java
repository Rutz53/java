import java.util.*;
class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v=0,r,h;
       
        System.out.println("Enter Radius :");
        r =sc.nextDouble();
        System.out.println("Enter Height :");
        h =sc.nextDouble();

        v = 0.33*3.14*r*r*h;
        System.out.println("Volume of Box :"+ v);


    }
    
}
