import java.util.Scanner;

public class RocketShip {
	public static void main(String arg[]){
	int size = 0;
	
	Scanner scnr = new Scanner(System.in);

	System.out.println("Enter a size of the rocket.");
	size = scnr.nextInt();
	rocketCone(size);
	sectSep(size);
	midSect1(size);
	midSect2(size);
	sectSep(size);
	midSect2(size);
	midSect1(size);
	sectSep(size);
	rocketCone(size);
	}
	
	public static void rocketCone(int size){	
	for (int line = 1; line <= size * 2 - 1; ++line) {
		for (int spaces = 1; spaces <= size * 2 - line; ++spaces) {
			System.out.print(" ");
		}
		for (int f = 1; f <= line; ++f) {
			System.out.print("/");
		}	
		System.out.print("**");
		for (int b = 1; b <= line; ++b) {
			System.out.print("\\");
		}
		System.out.println();
	}
	}
	public static void sectSep(int size){
	System.out.print("+");
	for (int e = 1; e <= size * 2; ++e) {
		System.out.print("=*");
	}
	System.out.print("+");
	System.out.println();
	
	}

	public static void midSect1(int size){
	for (int line = 1; line <= size; ++line) {
		System.out.print("|");
		for (int dot = size - line; dot > 0; --dot) {
			System.out.print(".");
		}
		for (int t = 1; t <= line; ++t) {
			System.out.print("/\\");
		}
		for (int sDot = (size * 2) - (line * 2); sDot > 0; --sDot) {
			System.out.print(".");
		}
		for (int sT = 1; sT <= line; ++sT) {
			System.out.print("/\\");
		}
		for (int tDot = size - line; tDot > 0; --tDot) {
			System.out.print(".");
		}
		System.out.print("|");
		System.out.println();
	}
}
	public static void midSect2(int size){
	for (int line = 1; line <= size; ++line) {
		System.out.print("|");
		for (int dot = 0; dot < line - 1; ++dot) {
			System.out.print(".");
		}
		for (int t = size - (line - 1); t > 0; --t) {
			System.out.print("\\/");
		}
		for (int sDot = 1; sDot < line * 2 - 1; ++sDot) {
			System.out.print(".");
		}
		for (int sT = size - (line - 1); sT > 0; --sT) {
			System.out.print("\\/");
		}
		for (int tDot = 0; tDot < line - 1; ++tDot) {
			System.out.print(".");
		}
		System.out.print("|");
		System.out.println();
	}
	}
	

}	

