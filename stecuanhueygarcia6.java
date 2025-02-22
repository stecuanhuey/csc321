
// Santiago Tecuanhuey Garcia 
//
// Lab 6 - Java 
//
//
//
//
public class stecuanhueygarcia6{
	public static void main (String[] args){

	System.out.println("Hello welcome.");

	double x = 19.31;
	int y = 7;

	double dubX = 19.31;
	double dubY = 7.00;

	int intX = 1931;
	int intY = 7;

	// First Expression Evaluation(for both int and double within expression.)
	System.out.println("The first (for both int and double) expression evaluation is: "); 
	System.out.println(x + y * x / y - x);

	// Second Expression Evaluation(for both int and double within expression.)
        System.out.println("The second (for both int and double) expression evaluation is: ");
        System.out.println(-x - y / x * y + x);

	// Third Expression Evaluation(for both int and double within expression.)
        System.out.println("The third (for both int and double) expression evaluation is: ");
        System.out.println(x + y - x / y);

	System.out.println("----------------------------------------");

	// First Expression Evaluation(for only int within expression.)
        System.out.println("The first (for only int) expression evaluation is: ");
        System.out.println(intX + intY * intX / intY - intX);

        // Second Expression Evaluation(for only int within expression.)
        System.out.println("The second (for only int) expression evaluation is: ");
        System.out.println(- intX - intY / intX * intY + intX);

        // Third Expression Evaluation(for only int within expression.)
        System.out.println("The third (for only int) expression evaluation is: ");
        System.out.println(intX + intY - intX / intY);

	System.out.println("----------------------------------------");

	 // First Expression Evaluation(for only double within expression.)
        System.out.println("The first (for only double) expression evaluation is: ");
        System.out.println( dubX + dubY * dubX / dubY - dubX);

        // Second Expression Evaluation(for only double within expression.)
        System.out.println("The second (for only double) expression evaluation is: ");
        System.out.println(- dubX - dubY / dubX * dubY + dubX);

        // Third Expression Evaluation(for only double within expression.)
        System.out.println("The third (for only double) expression evaluation is: ");
        System.out.println(dubX + dubY -dubX / dubY);


	}
}
