package sampleProduct;

import java.util.Scanner;

public class Farmer extends Retailer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Farmer farm = new Farmer();
		System.out.print("You are a Farmer:(yes/no)");
		String check = sc.next();
		if (check.equals("yes")) {

			System.out.println("Enter Your Name");
			String farmerName = sc.next();
			System.out.println("Enter Your Id");
			int farmerId = sc.nextInt();
			switch (farmerId) {
			case 1: {
				farmer1();
				break;
			}
			case 2: {
				farmer2();
				break;
			}
			case 3: {
				farmer3();
				break;
			}
			}
			String farmerAddress = sc.nextLine();
			System.out.println("Farmer Bidamount");
			float amount = sc.nextFloat();
			System.out.println("The Retailer You Want");
			System.out.println("Enter your needed rating of Retailer");
			int rating = sc.nextInt();
			switch (rating) {
			case 2: {
				Retailer.getRetailerdetails1();
				break;
			}
			case 3: {
				Retailer.getRetailerdetails2();
				break;
			}
			case 4: {
				getRetailerdetails3();
				break;
			}
			case 5: {
				getRetailerdetails4();
				break;
			}
			}
			System.out.print("Retailer declare his bidamount");
			float retaileramt = sc.nextFloat();
			if (retaileramt >= amount) {
				gethighRetailerdetails();
			}

		} else

		{

			System.out.println("Which product you want");
			System.out.println("1st Farmer contains Apple and Orange");
			System.out.println("2nd Farmer contains Grapes and Orange");
			System.out.println("3rd Farmer contains Apple and Grapes");
			System.out.print("Enter your Number");
			int id1 = sc.nextInt();
			switch (id1) {
			case 1: {
				farmerdetails1();
				break;
			}
			case 2: {
				farmerdetails2();
				break;
			}
			case 3: {
				farmerdetails3();
				break;
			}
			}

		}
	}
}
