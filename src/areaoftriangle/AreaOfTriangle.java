/*
 * Michelle Wojdak
 * February 19th, 2019
 * To calculate the area of a scalene triangle
 */
package areaoftriangle;

import javax.swing.JOptionPane;

public class AreaOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, C, sinC, area; //declare variables  	
	

    	//Ask user for traingle sides/angle
     	String sidea = JOptionPane.showInputDialog("Area of Triangle"
		+"\nPlease enter side a");
        
        String sideb = JOptionPane.showInputDialog("Area of Triangle"
		+"\nPlease enter side b");
       
        
        String angleC = JOptionPane.showInputDialog("Area of Triangle"
		+"\nPlease enter angle C");

     	//Convert the sides from a String to a double
     	a = Double.parseDouble(sidea);
        b = Double.parseDouble(sideb);
        C = Double.parseDouble(angleC);
        
       
	//Calculations
        sinC = java.lang.Math.sin(C);
	area = ( a + b + sinC ) / 2;
 
    	//Display the results
     	JOptionPane.showMessageDialog(null, "The Area of the Traingle is "+area);
    
    }
    
}
