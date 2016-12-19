package client;

import java.util.*;

import artifact_subscription.SubscriptionService;
import artifact_subscription.Subscription;
import artifact_unsubscription.UnsubscriptionService;
import artifact_unsubscription.Unsubscription;

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
					System.exit(0);
				}
			} while(option < 0 || option > 3);
			if (option == 1){
				new_subscription();
			}
			else if (option == 2){
				delete_subscription();
			}
			else if (option == 3){
				list_subscriptions();
			}
			else if (option == 0){
				System.exit(0);
			}
		}
	}
	
	public static void new_subscription(){
		String email, course;
		System.out.print("Insert your e-mail: ");
		email = sc.nextLine();
		System.out.print("Insert the course you want to subscribe: ");
		course = sc.nextLine();
		SubscriptionService as = new SubscriptionService();
		Subscription asp = as.getSubscriptionPort();
		
		asp.setParams(email, course);
	}
	
	public static void delete_subscription(){
		String email, course;
		System.out.print("Insert your e-mail: ");
		email = sc.nextLine();
		System.out.print("Insert the course you want to unsubscribe: ");
		course = sc.nextLine();
		
		UnsubscriptionService as = new UnsubscriptionService();
		Unsubscription asp = as.getUnsubscriptionPort();
		
		asp.setParams(email, course);
	}
	
	public static void list_subscriptions(){
		
	}
}
