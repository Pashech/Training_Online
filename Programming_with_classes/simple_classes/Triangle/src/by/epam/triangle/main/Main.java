package by.epam.triangle.main;

import by.epam.triangle.entity.Point;
import by.epam.triangle.entity.Triangle;

public class Main {

	public static void main(String[] args) {

		Point pointA = new Point(-5, 2);
		Point pointB = new Point(-1, -1);
		Point pointC = new Point(7, 6);

		Triangle triangle = new Triangle(pointA, pointB, pointC);

		System.out.println(triangle.toString() + "\n");

		triangle.checkOfTheTriangle(pointA, pointB, pointC);

		System.out.println("Perimetr = " + triangle.perimetrOfTheTriangle(triangle) + "\n");

		System.out.println("Area = " + triangle.areaOfTheTriangle(triangle) + "\n");

		System.out.println("The point of intersection of medians = " + triangle.pointOfMedian(triangle));
	}

}
