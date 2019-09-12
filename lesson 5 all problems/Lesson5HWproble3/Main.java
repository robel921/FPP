package Lesson5HWproble3;

public class Main {

	public static void main(String[] args) {
		Figure f[] = new Figure[5];

		f[0] = new UpwardHat(); f[1] = new UpwardHat(); f[2] = new DownwardHat(); f[3] = new FaceMaker(); f[4] = new Vertical();

		for (Figure figure : f) { figure.getFugure();

		}

		System.out.println(); 
		for (Figure figure : f) {System.out.print(figure.getClass().getSimpleName() + ": "); figure.getFugure();

		System.out.println();

		}

	}

}
