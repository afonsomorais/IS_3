package client;

import java.util.*;

public class Client {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int option = 0;

		while(true) {
			do {
				try {
					System.out.println("---- MENU ----");
					System.out.println("1- Add subscription");
					System.out.println("2- Delete subscription");
					System.out.println("3- List current subscriptions");
					System.out.println("0- Exit");
					System.out.print("Option: ");
					option = Integer.parseInt(sc.nextLine());
				} catch(NumberFormatException e) {
					System.out.println("Insert a valid number");
				}
			} while(option < 0 || option > 3);
			if (option == 1){
				new_subscription();
				break;
			}
			else if (option == 2){
				delete_subscription();
			}
			else if (option == 3){
				//list current subscriptions
			}
			else if (option == 0){
				System.exit(0);
			}
		}
		sc.close();
	}
	
	public static void new_subscription(){
		String email, course;
		System.out.println("Insert your e-mail: ");
		email = sc.nextLine();
		System.out.println("Insert the course you want to subscribe: ");
		course = sc.nextLine();
	}
	
	public static void delete_subscription(){
		String email, course;
		System.out.println("Insert your e-mail: ");
		email = sc.nextLine();
		System.out.println("Insert the course you want to unsubscribe: ");
		course = sc.nextLine();
	}
}
