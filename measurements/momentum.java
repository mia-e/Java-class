//Mia Escoto
//objects momentum 
//computing an object's momentum 
import java.util.Scanner;

public class momentum{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        float mass, velocity, momentum;
        //input mass and velocity 
        System.out.println("Enter mass: ");
        mass = scan.nextFloat();
        System.out.println("Enter velocity: ");
        velocity = scan.nextFloat();
        //calculate momentum
        momentum = mass * velocity;
        //output momentum
        System.out.println("The objects momentum is: " + momentum);
    }
}