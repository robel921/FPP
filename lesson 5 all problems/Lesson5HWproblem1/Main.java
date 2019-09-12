package Lesson5HWproblem1;

public class Main {

	public static void main(String[] args)  {
				// TODO Auto-generated method stub
				Shape[] shapes = new Shape[6];
				
				Rectangle purpleRectangle = new Rectangle("Tan", 9, 18);
				shapes[0] = purpleRectangle;
				
				Rectangle redRectangle = new Rectangle("Gray", 11, 13);
				shapes[1] = redRectangle;
				
				Circle whiteCircle = new Circle("Green", 5);
				shapes[2] = whiteCircle;
				
				Circle blueCircle = new Circle("White", 1);
				shapes[3] = blueCircle;
				
				Square greenSquare = new Square("White", 10);
				shapes[4] = greenSquare;
				
				Square greySquare = new Square("Blue", 8);
				shapes[5] = greySquare;
				
				printTotal(shapes);
			}
			
			public static void printTotal(Shape[] shapes){
				double totalArea = 0, totalPerimeter = 0;
				for(Shape s: shapes) {
					totalArea += s.calcualteArea();
					totalPerimeter += s.calculatePerimeter();
				}
				System.out.println("Total Area of all the Shapes     : "+totalArea);
				System.out.println("Total Perimeter of all the Shapes: "+totalPerimeter);
			}

		


	}


