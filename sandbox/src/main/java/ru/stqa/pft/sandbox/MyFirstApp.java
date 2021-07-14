package ru.stqa.pft.sandbox;

public class MyFirstApp{
	public static void main(String[] args){


		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(3,6);
		System.out.println("Площадь прямоугольника со сторами " + r.a + " и " + r.b +" = " + r.area());

		Point p1 = new Point(0,10);
		Point p2 = new Point(0,100);
		System.out.println("Растояние между точкой А с координатами:" + "x= " + p1.x + ",y= " + p1.y +", и точкой B с координатами:" + "x= " + p2.x + ",y= " + p2.y + " = " + p2.distance(p1) );

	}
}


