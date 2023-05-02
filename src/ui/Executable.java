package ui;

import java.util.Scanner;


import model.Controller;

public class Executable {

    private Scanner lector;
    private Controller controller;

    public Executable() {

		lector = new Scanner(System.in);
		controller = new Controller();
	}

    public static void main(String[] args) {

		Executable ejecutable = new Executable();
		ejecutable.menu();

	}

    public void menu(){
    System.out.println("---------------------------------");
    System.out.println("       Welcome to ReadX       ");
    System.out.println("---------------------------------");
    
    boolean flag = false;

		while (!flag) {

			System.out.println("1. Sign Up");
			System.out.println("2. Manage bibliographic products");
			System.out.println("3. Consult users created");
			System.out.println("3. Exit");
			int option = lector.nextInt();

			switch (option) {
      
			case 1:
				registerUser();
				break;
			case 2:
				System.out.println("1. Register");
				System.out.println("2. Modify");
				System.out.println("3. Delete");
				int optionBH = lector.nextInt();

				switch(optionBH){
					case 1:
					registerBiblioProducts();
					break;
					case 2:

					break;
					case 3:

					break;
				}
				break;
			case 3:
				show();
				break;
			case 4:
				flag = true;
				break;

			}

		}

	}

	private void registerUser(){
		
		lector.nextLine();

		System.out.println("Type the type of user option you want  \n1. Standard \n2. Premium");
		int optionUser = lector.nextInt();
		lector.nextLine();
		System.out.println("Type your full name");
		String nameUser = lector.nextLine();
		System.out.println("Type your document number: ");
		String cc = lector.nextLine();
		System.out.println("----Type the vinculation date----");
		System.out.println("Day: ");
		int dayVinculationDate = lector.nextInt();
		System.out.println("Month: ");
		int monthVinculationDate = lector.nextInt();
		System.out.println("Year: ");
		int yearVinculationDate = lector.nextInt();
	
		if (controller.registerUser(nameUser,cc,dayVinculationDate,monthVinculationDate,yearVinculationDate,optionUser)){
			
			System.out.println("The user has been created successfully");

		} else {
			System.out.println("Sorry, the user couldn't be registered");
		}
	}
	
	private	void registerBiblioProducts(){
		System.out.println("Type the type of bibliographic products option you want to register \n1. Book \n2. Magazine");
		int optionProducts = lector.nextInt();
		lector.nextLine();
		System.out.println("Type the product ID");
		String id = lector.nextLine();
		System.out.println("Type the product name");
		String name = lector.nextLine();
		System.out.println("Type the number of pages");
		int numberPages  = lector.nextInt();
		System.out.println("----Type the post date----");
		System.out.println("Day: ");
		int dayPostDate = lector.nextInt();
		System.out.println("Month: ");
		int monthPostDate = lector.nextInt();
		System.out.println("Year: ");
		int yearPostDate = lector.nextInt();
		String shortReview = "";
		String issPeriod = "";
		int genre = 0;
		int category = 0;
		lector.nextLine();
		if (optionProducts==1){
			System.out.println("Write a short review for the book");
			shortReview = lector.nextLine();
			System.out.println("Type the book genre option \n1. Science fiction \n2. Fantasy \n3. Historical novel");
			genre = lector.nextInt();
		} else {
			System.out.println("Type the magazine category option \n1. Varieties \n2. Design \n3.Scientist");
			category = lector.nextInt();
			lector.nextLine();
			System.out.println("Type the issuance periodicity");
			issPeriod = lector.nextLine();
		}
		System.out.println("Type the front page URL");
		String URL = lector.nextLine();
		System.out.println("Type the value of the product");
		int value = lector.nextInt();
		int numSoldBooks = 0;
		int activeSubs = 0;
		
		lector.nextLine();

		if (optionProducts==1){
			System.out.println("Type the number of selled books");
			numSoldBooks = lector.nextInt();
		} else {
			System.out.println("Type the active subscriptions");
			activeSubs= lector.nextInt();
		}
		System.out.println("Type the accumulated pages read");
		int readedPages = lector.nextInt();

		if (controller.registerBiblioProducts(name, id, numberPages, shortReview, genre, URL, value , numSoldBooks, optionProducts, yearPostDate, monthPostDate, dayPostDate, readedPages, category, issPeriod, activeSubs)){
			
			System.out.println("The product has been created successfully");

		} else {
			System.out.println("Sorry, the product couldn't be registered");
		}
	}
	
	//Metodo hecho solamente para ver como se estan creando los usuarios
	private void show(){
		System.out.println(controller.getUserInfo());
	}

}

