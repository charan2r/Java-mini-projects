package project4;

import java.util.Scanner;

public class Calculator{
	
	public static void main(String [] args){
		
		Calculator obj = new Calculator();
		obj.details();
		
	}

	private void details() {
		
	}
}

class Cal{
	
	static void details(){
		
			try (Scanner input1 = new Scanner(System.in)) {
				System.out.print("Enter operaters : ");
				String oper = input1.nextLine();
				
				try (Scanner input2 = new Scanner(System.in)) {
					System.out.print("Enter number : ");
					double num1 = input2.nextDouble();
					
					try (Scanner input3 = new Scanner(System.in)) {
						System.out.print("Enter number : ");
						double num2 = input3.nextDouble();
						
						
						if("+".equals(oper)){
							double val1 = sum(num1,num2);
							System.out.println("Answer : "+val1);	
						}else if("-".equals(oper)){
							double val2 = substract(num1,num2);
							System.out.println("Answer : "+val2);
						}else if("/".equals(oper)){
							double val3 = divied(num1,num2);
							System.out.println("Answer : "+val3);
						}else if("*".equals(oper)){
							double val4 = multi(num1,num2);
							System.out.println("Answer : "+val4);
						}else{
							System.out.println("");
						
						
						}
					}
				}
			}
			
		}			
	static double sum(double num1,double num2){
			
			double val;
			val = num1 + num2;
			return val;
		
		}	
		
	static double substract(double num1,double num2){
		
			double val;
			val = num1 - num2;
			return val;
		}
	static double divied(double num1,double num2){
		
			double val;
			val = num1 / num2;
			return val;
		}	
	
	static double multi(double num1,double num2){
		
			double val;
			val = num1 * num2;
			return val;
		}	
}
