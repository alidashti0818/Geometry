import java.util.Scanner;

public class Geometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		menu();
		int choice = in.nextInt();
		while (choice<15){
			//Ask the user which shape they want
			//Read in the values
			if (choice==1) {
				//Rectangle area
				double l, w;
				System.out.println("Give me the length:");
				l = in.nextDouble();
				System.out.println("Give me the width:");
				w = in.nextDouble();
				double area = GeoCalc.rectArea(l, w);
				System.out.println("**************The area of " + l + " by " + w + " is "+area+".**************");
				System.out.println();
				menu();
				choice=in.nextInt();
			}	
			if (choice==2) {
				//rectangle perimeter
				double l, w;
				System.out.println("Give me a length");
				l = in.nextDouble();
				System.out.println("Give me a width");
				w = in.nextDouble();
				double perimeterR = GeoCalc.RecPer(l, w);
				System.out.println("**************The perimeter of " + l + " by " + w + " is " + perimeterR + ".**************");	
				System.out.println();
				menu();
				choice=in.nextInt();
			}
			if (choice==3) {
				//triangle area
				double b, h;
				System.out.println("Give me a base:");
				b = in.nextDouble();
				System.out.println("Give me a height:");
				h = in.nextDouble();
				double areaT = GeoCalc.triArea(b, h);
				System.out.println("**************The area of " + b + " by " + h + " is "+areaT+".**************");
				System.out.println();
				menu();
				choice=in.nextInt();
			}
			
			if (choice==4) {
				//Triangle perimeter
				double a, b, c;
				System.out.println("Give me a side");
				a = in.nextDouble();
				System.out.println("Give me another side");
				b = in.nextDouble();
				System.out.println("Give me a side");
				c = in.nextDouble();
				double perimeterT = GeoCalc.TriPer(a, b, c);
				System.out.println("**************The perimeter of " + a + " by " + b + " by " + c + " is " + perimeterT + ".**************");
				System.out.println();
				menu();
				choice=in.nextInt();
			}
			if (choice==5) {
				//Circle Area
				double r;
				System.out.println("Give me a radius:");
				r = in.nextDouble();
				double areaC = GeoCalc.circArea(r);
				System.out.println("**************The area of the circle with radius " + r + " is " + areaC + ".**************");
				System.out.println();
				menu();
				choice=in.nextInt();
			}
			
			if (choice==6) {
				//Circle circumference
				double r;
				System.out.println("Give me a radius");
				r = in.nextDouble();
				double circumference = GeoCalc.CirPer(r);
				System.out.println("**************The area of the circle with radius " + r + " is " + circumference + ".**************");
				System.out.println();
				menu();
				choice=in.nextInt();
				
			}if(choice==7){
				//cube volume
				double l;
				System.out.println("Give me a length");
				l=in.nextDouble();
				double volumeC=GeoCalc.cubeVol(l);
				System.out.println("**************The volume of the cube " + l + " is " + volumeC + ".**************");
				System.out.println();
				menu();
				choice=in.nextInt();
				
			}if (choice==8){
				double l;
				System.out.println("Give me a length");
				l=in.nextDouble();
				double surfaceAreaC=GeoCalc.cubeSur(l);
				System.out.println("**************The surface area of the cube with length " + l + " is " + surfaceAreaC + ".**************");
				menu();
				choice=in.nextInt();
				
			}if (choice==9){
				double l,w,h;
				System.out.println("Give me a length");
				l=in.nextDouble();
				System.out.println("Give me a width");
				w=in.nextDouble();
				System.out.println("Give me a height");
				h=in.nextDouble();
				double volumeR=GeoCalc.recVol(l,w,h);
				System.out.println("**************The volume of the cube " + l + ", "+w+" and "+h+"  is " + volumeR + ".**************");
				menu();
				choice=in.nextInt();
				
			}if (choice==10){
				double l,w,h;
				System.out.println("Give me a length");
				l=in.nextDouble();
				System.out.println("Give me a width");
				w=in.nextDouble();
				System.out.println("Give me a height");
				h=in.nextDouble();
				double surfaceAreaR=GeoCalc.recSur(l,w,h);
				System.out.println("**************The surface area of the cube " + l + ", "+w+" and "+h+"  is " + surfaceAreaR + ".**************");
				menu();
				choice=in.nextInt();
				
			}if (choice==11){
				double r;
				System.out.println("Give me a radius");
				r=in.nextDouble();
				double volumeS=GeoCalc.sphVol(r);
				System.out.println("**************The volume of the sphere " + r + " is " + volumeS + ".**************");
				menu();
				choice=in.nextInt();
				
			}if (choice==12){
				double r;
				System.out.println("Give me a radius");
				r=in.nextDouble();
				double surfaceAreaS=GeoCalc.sphSur(r);
				System.out.println("**************The surface area of the sphere " + r + "  is " + surfaceAreaS + ".**************");
				menu();
				choice=in.nextInt();
				
			}if (choice==13) {
				System.err.println("See you next time!");
				System.exit(0);
			}
		}
			//Call the right method
			//Print out the answer
			//Repeat until quit
			//**************
		}

	

	public static void menu() {
		System.out.println("Pick one of the following options");
		System.out.println("1. Rectangle area");
		System.out.println("2. Rectangle perimeter");
		System.out.println("3. Triangle area");
		System.out.println("4. Triangle perimeter");
		System.out.println("5. Circle area");
		System.out.println("6. Circle circumference");
		System.out.println("7. Cube volume");
		System.out.println("8. Cube surface area");
		System.out.println("9. Rectangle volume");
		System.out.println("10. Rectangle surface area");
		System.out.println("11. Sphere volume");
		System.out.println("12. Sphere surface area");
		System.out.println("13. Quit");
		System.out.println("Your choice:");

	}

}
