package comp163labquiz1;

/**
 *
 * @author bousabacw
 */
//  Box.java       Author: C.BouSaba   
public class Box			
{
    private double length;		
    private double width;		
    private double height;		
    private String color;		

//Constructor1:  Sets up this Box object 
//with the specified length, width, height, and color.	

    public Box()
    {	
        length =1.5;   
        width = 2.5;    
        height = 1.0;     
        color = "white"; 
    }	

    //Constructor2:  Sets up this box object 
    //with the specified dimenssions.	
    public Box(double lengthInit, double widthInit, 
            double heightInit, String colorInit)	
    {	
        length = lengthInit; 
        width = widthInit;  
        height = heightInit; 
        color = colorInit;		
    }

    //  Returns this box’s length.
    public double getLength() 
    {	
        return length; 	
    }	
    //  Returns this box’s color.
    public String getColor() 
    {	
        return color; 	
    }			
    //  Returns this box’s weight.
    public double getHeight() 
    {	
        return height; 	
    }			
    //  Returns this box’s width.
    public double getWidth() 
    {	
        return width; 	
    }		


    //  Sets this box’s length.
    public void setlength(double lengthUpdate) 
    {	
        length = lengthUpdate; 		
    }		
    //  Sets this box’s color.
    public void setColor(String colorUpdate) 
    {		
        color = colorUpdate; 			
    }	
    //  Sets this box’s height.
    public void setHeight(double heightUpdate) 
    {	
        height = heightUpdate; 		
    } 	
    //  Sets this box’s width.
    public void setWidth(double widthUpdate) 
    {		
        width = widthUpdate; 		
    } 	

    //  Computes and returns the volume of this box. 
    public double volume()     
    {	
        return length * height * width; 	
    } 			
    //  Computes and returns the surface area of this box.
    public double area() 
    { 
        return (2*(length * width) 
                + 2*(length * height) 
                + 2 * (width * height)); 
    }

    //  Returns a string representation of this box.	
        public String toString()  
        {
            return "Box’s length = " + length 
                    + ", Box’s height = " + height 
                    + ", Box’s width = " + width 
                    + ", Box’s volume = " + volume() 
                    + ", Box’s area =  " + area() 
                    + ", Box’s color = " + color;
        }
}
