/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damoninastrangeland;

import java.util.Scanner;

/**
 *
 * @author oswego3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double distance = kb.nextDouble();
        double weight = kb.nextDouble();
        double power = kb.nextDouble();
        int oxy_mars = kb.nextInt();
        int oxy_pod = kb.nextInt();
        
        double velocity = distance / oxy_pod;
        int i = 1;
        while(velocity > 0) {
            //System.out.print("Vi: " + velocity + "   ");
            velocity = velocity - ( power / (weight * i));
            i++;
            //System.out.println("Vf: " + velocity);
        }
        
        //System.out.println("");
        
        velocity = distance / oxy_mars;
        while(velocity > 0) {
            //System.out.print("Vi: " + velocity + "   ");
            velocity = velocity - ( power / (weight * i));
            i++;
            //System.out.println("Vf: " + velocity);
        }
        
        i = i - 1;
        
        System.out.println(i);
    }
    
}
