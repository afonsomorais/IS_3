package client;

import java.util.*;

public class Client {
	public static void main(String[] args) {
		int option = 0;
		Scanner sc = new Scanner(System.in);
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
				//add subscription
			}
			else if (option == 2){
				//delete subscription
			}
			else if (option == 3){
				//list current subscriptions
			}
			else if (option == 0){
				System.exit(0);
			}
		}

	}
}
