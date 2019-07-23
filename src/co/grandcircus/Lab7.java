package co.grandcircus;

import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(inputName(scan));
		System.out.println(inputEmail(scan));
		System.out.println(inputPhoneNumber(scan));
		System.out.println(inputDate(scan));
		
		scan.close();
	}
	private static String inputName(Scanner scan) {
		boolean checkName = false;
		String input;
		do {
			System.out.println("Please enter a valid Name: ");
			input = scan.nextLine();
			
			if(input.matches("^[a-z A-Z ,.'-]+{1,31}$")) {
				checkName = true;
			} else {
				System.out.println("Sorry, name is not valid!");
			}
			
		} while (!checkName);
		return input;
	}
	private static String inputEmail(Scanner scan) {
		boolean checkEmail = false;
		String input;
		do {
			System.out.println("Please enter a valid email: ");
			input = scan.nextLine();
			
			if(input.matches("^[a-zA-Z0-9_.+-]{5,30}+@[a-zA-Z0-9-]{5,10}+\\.[a-zA-Z0-9-.]{2,3}+$")) {
				checkEmail = true;
				System.out.println("Email is valid!");
			}else {
				System.out.println("Email not valid!");
			}
		}while(!checkEmail);
		return input;
			
		
	}
	private static String inputPhoneNumber(Scanner scan) {
		boolean checkPhoneNumber = false;
		String input;
		do {
			System.out.println("Please enter a valid phone number: ");
			input = scan.nextLine();
			
			if(input.matches("\\d{3}-\\d{3}-\\d{4}")) {
				checkPhoneNumber = true;
			}else {
				System.out.println("Sorry, phone is not valid!");
			}
		}while(!checkPhoneNumber);
		return input;
	}
	private static String inputDate(Scanner scan) {
		boolean checkDate = false;
		String input;
		do {
			System.out.println("Please enter a valid date: ");
			input = scan.nextLine();
			
			if(input.matches("\\d{2}/\\d{2}/\\d{4}")) {
				checkDate = true;
			}else {
				System.out.println("Sorry, date is not valid!");
			}
		}while (!checkDate);
		return input;
	}

}
