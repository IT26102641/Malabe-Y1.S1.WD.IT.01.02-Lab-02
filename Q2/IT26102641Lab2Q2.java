public class IT26102641Lab2Q2{
  
  public static void main(String[]args){
  
	//Given side length of the square fence
	double sidelength = 10.0;
	
	//Calculate the perimeter of the square fence
	double perimeterSquare = 4 * sidelength;//4 * length
	//Calculate the radius of the circular fence using the same perimeter
	// 4 * length = 2 * PI * radius 
	// radius + (4 * length / 2 * PI)
	double radius = perimeterSquare / (2 * 3.14);
	//Output the calculated radius
	System.out.println("Radius of the circular fence: " + radius);
	}
}