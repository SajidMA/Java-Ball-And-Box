package comp163labquiz1;

/**
 *
 * @author bousabacw
 */
//  Ball.java       Author: C.BouSaba         
public class Ball
{
private double diameter;	
private String color;		
private double weight;		

//Constructor1:  Sets up this ball object with 
//the specified diameter.	
public Ball()
{	
    diameter =1.5;	
    color = "white"; 
    weight = 2.75;
}	

//Constructor2:  Sets up this ball object with 
//the specified diameter.		
public Ball(double diameterInit, String colorInit, double weightInit)	
{	
    diameter = diameterInit; 
    color = "colorInit";
    weight = weightInit;
}

//  Returns this ball’s diameter.
public double getDiameter() 
{	
    return diameter; 	
}	
//  Returns this ball’s color.	
public String getColor() 
{	
    return color; 	
}			
//  Returns this ball’s weight.
public double getWeight() 
{	
    return weight; 	
}			

//  Sets this ball’s diameter.
public void setDiameter(double diameterUpdate) 
{	
    diameter = diameterUpdate; 		
}		
//  Sets this ball’s color.
public void setColor(String colorUpdate) 
{	
    color = colorUpdate; 		
}			
//  Sets this ball’s diameter.
public void setWeight(double weightUpdate) 
{	
    weight = weightUpdate; 		
} 
//  Computes and returns the volume of this ball. 
public double volume()     
{	
    return 4.0 / 3.0 * Math.PI * Math.pow(diameter/2, 3); 	
} 
//  Computes and returns the surface area of this ball.
public double area() 	
{	
    return 4 * Math.PI * Math.pow(diameter/2, 2); 	
}	   

    //----------------------------------------------------
    //  Returns a string representation of this ball.	
    //----------------------------------------------------
    public String toString()  
    {
        return "Ball’s diameter = " + diameter 
                + ", Ball’s  volume = " + volume() 
                + ", Ball’s  area =  " + area() 
                + ", Ball’s weight = " + weight;
    }
}

