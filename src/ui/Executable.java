package ui;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import model.Controller;

public class Executable {

    private Scanner lector;
    private Controller shop;

    public Executable() {

		lector = new Scanner(System.in);
		shop = new Controller();
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

			System.out.println("\nMENU PRINCIPAL");
			System.out.println("\n1. Registrar libro");
			System.out.println("2. Salir");
			int option = lector.nextInt();

			switch (option) {
      
			case 1:
				
				break;
			case 2:
				System.exit(option);
				break;

			}

		}

	}
}

