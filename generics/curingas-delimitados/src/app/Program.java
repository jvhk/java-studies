package app;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {
	public static void main(String[] args) {
		
		List<Shape> list = new ArrayList<>();
		list.add(new Rectangle(3.0, 2.0));
		list.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(list));
	}

	private static double totalArea(List<? extends Shape> list) {	//aceita listas de Shape ou de qualquer subtipo de shape
		double sum = 0.0;
		for(Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
