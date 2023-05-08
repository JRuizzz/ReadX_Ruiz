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
			System.out.println("VIEW");
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
					System.out.println("Type the option product you want to modify \n1. Book \n2. Magazine");
					int optionMO = lector.nextInt();
						switch(optionMO){
							case 1: 
							modifyBook();
							break;
							case 2:
							modifyMagazine();
							break;
						}
				}
			
			break;
			case 3:
			showUserInfo();
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
	
	private void registerBiblioProducts() {
		System.out.println("Type the type of bibliographic product option you want to register:\n1. Book\n2. Magazine");
		int optionProducts = lector.nextInt();
		lector.nextLine();
	
		System.out.println("Type the product ID");
		String id = lector.nextLine();
	
		System.out.println("Type the product name");
		String name = lector.nextLine();
	
		System.out.println("Type the number of pages");
		int numberPages = lector.nextInt();
	
		System.out.println("----Type the post date----");
		System.out.println("Day: ");
		int dayPostDate = lector.nextInt();
		System.out.println("Month: ");
		int monthPostDate = lector.nextInt();
		System.out.println("Year: ");
		int yearPostDate = lector.nextInt();
	
		String shortReview = "";
		String issPeriod = "";
		int genres = 0;
		int categorys = 0;
		lector.nextLine();
	
		if (optionProducts == 1) {
			System.out.println("Write a short review for the book");
			shortReview = lector.nextLine();
			System.out.println("Type the book genre option:\n1. Science fiction\n2. Fantasy\n3. Historical novel");
			genres = lector.nextInt();
		} else if (optionProducts==2) {
			System.out.println("Type the magazine category option:\n1. Varieties\n2. Design\n3. Scientist");
			categorys = lector.nextInt();
			lector.nextLine();
			System.out.println("Type the issuance periodicity");
			issPeriod = lector.nextLine();
		}
		
		lector.nextLine(); // Limpia el buffer de la nueva línea pendiente
		System.out.println("Type the front page URL");
		String URL = lector.nextLine();
	
		System.out.println("Type the value of the product");
		int value = lector.nextInt();
	
		int numSoldBooks = 0;
		int activeSubs = 0;
		lector.nextLine();
	
		if (optionProducts == 1) {
			System.out.println("Type the number of sold books");
			numSoldBooks = lector.nextInt();
		} else {
			System.out.println("Type the active subscriptions");
			activeSubs = lector.nextInt();
		}
	
		System.out.println("Type the accumulated pages read");
		int readedPages = lector.nextInt();
	
		if (controller.registerBiblioProducts(name, id, numberPages, shortReview, genres, URL, value, numSoldBooks, optionProducts, yearPostDate, monthPostDate, dayPostDate, readedPages, categorys, issPeriod, activeSubs)) {
			System.out.println("The product has been created successfully");
		} else {
			System.out.println("Sorry, the product couldn't be registered");
		}
	}
	
	private void modifyBook(){
		String query = controller.getBHBookInfo();
		if(query.equals("")){
			System.out.println("No books registered");
		}else{
			
			System.out.println("\nThis is the list of books registered in the system");

			System.out.println(query);
			
			System.out.println("\nSelect the book to edit");
			int option = lector.nextInt();

			lector.nextLine();

			System.out.println("Type the new product ID");
			String newId = lector.nextLine();
		
			System.out.println("Type the new product name");
			String newName = lector.nextLine();
		
			System.out.println("Type the number of pages");
			int newNumberPages = lector.nextInt();
		
			System.out.println("----Type the post date----");
			System.out.println("Day: ");
			int newDayPostDate = lector.nextInt();
			System.out.println("Month: ");
			int newMonthPostDate = lector.nextInt();
			System.out.println("Year: ");
			int newYearPostDate = lector.nextInt();
		
			System.out.println("Write a short review for the book");
			String newShortReview = lector.nextLine();

			System.out.println("Type the book genre option:\n1. Science fiction\n2. Fantasy\n3. Historical novel");
			int newGenres = lector.nextInt();

			lector.nextLine(); // Limpia el buffer de la nueva línea pendiente
			System.out.println("Type the front page URL");
			String newURL = lector.nextLine();
		
			System.out.println("Type the value of the product");
			int newValue = lector.nextInt();
		
			System.out.println("Type the number of sold books");
			int newNumSoldBooks = lector.nextInt();

			System.out.println("Type the accumulated pages read");
			int newReadedPages = lector.nextInt();
		
			if (controller.modifyBook((option-1),newName, newId, newNumberPages, newShortReview, newGenres, newURL, newValue, newNumSoldBooks,newYearPostDate, newMonthPostDate, newDayPostDate, newReadedPages)) {
				System.out.println("The book has been modified successfully");
			} else {
				System.out.println("Sorry, the book couldn't be modified");
			}
		
		}

	}
	private void modifyMagazine(){
		String query = controller.getBHMagazineInfo();
		if(query.equals("")){
			System.out.println("No magazines registered");
		}else{

			System.out.println("\nThis is the list of magazines registered in the system");

			System.out.println(query);
			
			System.out.println("\nSelect the magzine to edit");
			int option = lector.nextInt();
			
			lector.nextLine();

			System.out.println("Type the new product ID");
			String newId = lector.nextLine();
		
			System.out.println("Type the new product name");
			String newName = lector.nextLine();
		
			System.out.println("Type the number of pages");
			int newNumberPages = lector.nextInt();
		
			System.out.println("----Type the post date----");
			System.out.println("Day: ");
			int newDayPostDate = lector.nextInt();
			System.out.println("Month: ");
			int newMonthPostDate = lector.nextInt();
			System.out.println("Year: ");
			int newYearPostDate = lector.nextInt();
		
			System.out.println("Type the magazine category option:\n1. Varieties\n2. Design\n3. Scientist");
			int newCategorys = lector.nextInt();
			lector.nextLine();

			System.out.println("Type the issuance periodicity");
			String newIssPeriod = lector.nextLine();

			System.out.println("Type the front page URL");
			String newURL = lector.nextLine();
		
			System.out.println("Type the value of the product");
			int newValue = lector.nextInt();
		
			System.out.println("Type the active subscriptions");
			int newActiveSubs = lector.nextInt();

			System.out.println("Type the accumulated pages read");
			int newReadedPages = lector.nextInt();
		
			if (controller.modifyMagazine((option-1),newName, newId, newNumberPages, newURL, newValue, newActiveSubs,newYearPostDate, newMonthPostDate, newDayPostDate, newReadedPages, newCategorys, newIssPeriod)) {
				System.out.println("The book has been modified successfully");
			} else {
				System.out.println("Sorry, the book couldn't be modified");
			}
		}

	}
	
	private void showUserInfo() {

		String query = controller.getBHBookInfo();

		if (query.equals("")) {

			System.out.println("No hay usuarios registrados");
		} else {

			System.out.println("\nEste es el listado de usuarios registrados en el sistema");

			System.out.println(query);

			System.out.println("\nSeleccione el usuario a consultar");

			int bookIndex = lector.nextInt();

			String query2 = controller.viewBookDetails(bookIndex-1);

			if (query2.equals("")) {
				System.out.println("La operación no pudo realizarse");
			} else {
				System.out.println(query2);
			}

		}

	}





}


