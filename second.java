import java.io.*;
import java.lang.*;
abstract class Shape
{
	public String color;
	public Boolean filled;
	public Shape()
	{
		color="No color";
		filled=false;
	}
	public Shape(String color,Boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String ncolor)
	{
		color=ncolor;
	}
	public Boolean isFilled()
	{
		return filled;
	}
	public void setFilled(Boolean nfilled)
	{
		filled=nfilled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract String toString();
}
class Circle extends Shape
{
	public double radius;
	public Circle()
	{
	radius=5;
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	Circle(double radius,String color,Boolean filled)
	{
		super(color,filled);
		this.radius=radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double nradius)
	{
		radius=nradius;
	}
	public double getArea()
	{
		double area;
		area=3.14*radius*radius;
		return area;
	}
	public double getPerimeter()
	{
		double per;
		per=2*3.14*radius;
		return per;
	}
	public String toString()
	{
		return ("area of a circle= "+getArea()+",perimeter of a circle is"+getPerimeter());
	}
}
class Rectangle extends Shape
{
	public double width,length;
	public Rectangle()
	{
	width=4;
	length=8;
	}
	public Rectangle(double width,double length)
	{
		this.width=width;
		this.length=length;
	}
	public Rectangle(double width,double length,String color,Boolean filled)
	{
		super(color,filled);
		this.width=width;
		this.length=length;
	}
	public double getWidth()
	{
		return width;
	}
	public void setWidth(double nwidth)
	{
		width=nwidth;
	}
	public double getLength()
	{
		return length;
	}
	public void setLength(double nlength)
	{
		length=nlength;
	}
	public double getArea()
	{
		double area;
		area=length*width;
		return area;
	}
	public double getPerimeter()
	{
		double per;
		per=2*(length+width);
		return(per);

	}
	public String toString()
	{
		return ("Rectangle area= "+getArea()+",perimeter="+getPerimeter());
	}
}
class Square extends Rectangle
{
	double side;
	public Square ()
	{
	side=2;
	}
	public Square (double side)
	{
		this.side=side;
	}
	public Square (double side,double width,double length,String color,Boolean filled)
	{
		super(width,length,color,filled);
		this.side=side;
	}
	public double getSide()
	{
		return  side;
	}
	public void setSide(double nside)
	{
		side=nside;
	}
	public void setWidth(double side)
	{
		width=side;
	}
	public void setLength(double side)
	{
		length=side;
	}
	public double getArea(double side)
	{
	double area;
	area=side*side;
	return area;
	}
	public double getPerimeter(double side)
	{
	double per;
	per=4*side;
	return per;
	}
	public String toString()
	{
		return ("Square area="+getArea()+"perimeter="+getPerimeter());
	}

}
class Second
{
	public static void main(String a[])
	{
		Circle c=new Circle (4,"black",true);
		System.out.println(c.toString());
		Rectangle r=new Rectangle(3,5,"red",true);
		System.out.println(r.toString());

		Square s=new Square(10,6,7,"white",false);
		System.out.println(s.toString());
	}
}