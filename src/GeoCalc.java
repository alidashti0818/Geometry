
public class GeoCalc {
	public static double rectArea(double x, double y){
		double area=x*y;
		return area;
	}
	public static double triArea(double a, double b){
		double areaT=a*b/2;
		return areaT;
	
	}
	public static double circArea(double r){
		double areaC=r*r*Math.PI;
		return areaC;
	}
	public static double RecPer(double l, double w){
		double perimeterR=2*l+2*w;
		return perimeterR;
	}
	public static double TriPer(double a, double b, double c){
		double perimeterT=a+b+c;
		return perimeterT;
	}
	public static double CirPer(double r){
		double circumference=2*Math.PI*r;
		return circumference;
	}
	public static double cubeVol(double l){
		double volumeC=l*l*l;
		return volumeC;
	}
}

