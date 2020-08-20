import java.util.Scanner;

public class Convertor {
	public static double fToC(double val) {
		return (val-32)*5/9;
	}
	
	public static double fToK(double val) {
		return (val-32)*5/9+273.15;
	}
	
	public static double cToF(double val) {
		return val/5*9+32;
	}
	
	public static double cToK(double val) {
		return val+273.15;
	}
	
	public static double kToF(double val) {
		return val*9/5-459.67;
	}
	
	public static double kToC(double val) {
		return val-273.15;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean runApp = true;
		System.out.println("+--------------------------------------+");
		System.out.println("| Welcome to the Temperature Convertor |");
		System.out.println("+--------------------------------------+");
		while(runApp) {
			while(true) {
				System.out.println("What would you like to do?");
				System.out.println("1. Convert from Fahrenheit to Celsius and Kelvin");
				System.out.println("2. Convert from Celsius to Fahrenheit and Kelvin");
				System.out.println("3. Convert from Kelvin to Fahrenheit and Celsius");
				System.out.println("4. Exit");
				try {
					int choice = Integer.valueOf(scan.nextLine());
					if(choice>0 && choice<5) {
						if(choice==1) {
							while(true) {
								System.out.println("Please Enter the Temperature you would like to convert: ");
								try {
									double f = Double.valueOf(scan.nextLine());
									System.out.println("You have entered "+f+"°F");
									System.out.println("When converted it is "+fToC(f)+"°C and "+fToK(f)+"°K");
									break;
								}
								catch(Exception e) {
									System.out.println("Invalid Input");
								}
							}
						}
						else if(choice==2) {
							while(true) {
								System.out.println("Please Enter the Temperature you would like to convert: ");
								try {
									double c = Double.valueOf(scan.nextLine());
									System.out.println("You have entered "+c+"°C");
									System.out.println("When converted it is "+cToF(c)+"°F and "+cToK(c)+"°K");
									break;
								}
								catch(Exception e) {
									System.out.println("Invalid Input");
								}
							}
						}
						else if(choice==3) {
							while(true) {
								System.out.println("Please Enter the Temperature you would like to convert: ");
								try {
									double k = Double.valueOf(scan.nextLine());
									System.out.println("You have entered "+k+"°K");
									System.out.println("When converted it is "+kToC(k)+"°C and "+kToF(k)+"°F");
									break;
								}
								catch(Exception e) {
									System.out.println("Invalid Input");
								}
							}
						}
						else {//choice ==4
							System.out.println("Than you for using this application! Goodbye!");
							runApp = false;
							break;
						}
					}
					else {
						System.out.println("Input value out of range! Please try again!");
					}
				}
				catch(Exception e) {
					System.out.println("Invalid input. Try again!");
				}
			}
		}
	}
}
