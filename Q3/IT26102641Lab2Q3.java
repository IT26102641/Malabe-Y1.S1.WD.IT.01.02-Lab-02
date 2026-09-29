public class IT26102641Lab2Q3{
	public static void main(String[] args){
	//Given lengths of the two legs of the right triangle
	double sideA = 3.0;
	double sideB = 4.0;
	//Calculate the length of the hypotenuse using the phythagorean theorem
	// c =squareroot(sideA)
	double hypotenuse = Math.sqrt(sideA*sideA+sideB*sideB);
	
	//output the calculated hypotenuse
	System.out.println("Length of the hypotenuse: " + hypotenuse);
	}
}