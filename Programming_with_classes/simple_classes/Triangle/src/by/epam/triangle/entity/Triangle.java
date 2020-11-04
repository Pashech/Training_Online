package by.epam.triangle.entity;

/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади, 
периметра и точки пересечения медиан.
*/
public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Triangle() {

	}

	public Triangle(Point pointA, Point pointB, Point pointC) {

		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public String toString() {
		return "Triangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
	}

	public double lengthOfSide(Point pointA, Point pointB) {
		double length = 0;

		length = Math
				.sqrt((Math.pow((pointB.getX() - pointA.getX()), 2) + (Math.pow((pointB.getY() - pointA.getY()), 2))));

		return length;
	}

	public boolean checkOfTheTriangle(Point pointA, Point pointB, Point pointC) {
		double lengthAB = lengthOfSide(pointA, pointB);
		double lengthBC = lengthOfSide(pointB, pointC);
		double lengthAC = lengthOfSide(pointA, pointC);

		return ((lengthAB < lengthAC + lengthBC) && (lengthAC < lengthAB + lengthBC) && lengthBC < lengthAB + lengthAC);

	}

	public double perimetrOfTheTriangle(Triangle triangle) {

		boolean isTriangle = checkOfTheTriangle(pointA, pointB, pointC);
		double perimetr = 0;

		if (isTriangle) {

			perimetr = lengthOfSide(pointA, pointB) + lengthOfSide(pointA, pointC) + lengthOfSide(pointB, pointC);
		}

		return perimetr;

	}

	public double areaOfTheTriangle(Triangle triangle) {

		double semiPerimetr = 0;
		double area = 0;

		boolean isTriangle = checkOfTheTriangle(pointA, pointB, pointC);

		if (isTriangle) {

			semiPerimetr = perimetrOfTheTriangle(triangle) / 2;

			area = Math.sqrt(semiPerimetr * (semiPerimetr - lengthOfSide(pointA, pointB))
					* (semiPerimetr - lengthOfSide(pointB, pointC)) * (semiPerimetr - lengthOfSide(pointA, pointC)));
		}

		return area;

	}

	public Point pointOfMedian(Triangle triangle) {

		double x = 0;
		double y = 0;

		boolean isTriangle = checkOfTheTriangle(pointA, pointB, pointC);

		if (isTriangle) {

			x = (pointA.getX() + pointB.getX() + pointC.getX()) / 3;
			y = (pointA.getY() + pointB.getY() + pointC.getY()) / 3;
		}
		
		return new Point(x, y);
	}

}
