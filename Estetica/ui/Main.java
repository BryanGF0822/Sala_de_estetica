package ui;

import model.*;

import java.util.Scanner;

public class Main{

	//Relations

	private BeautyShop control;

	//Constructor


	public Main(){
		init();
	
	}

			public static void main(String[] args) {
				Main program = new Main();
				program.menu();

	}

	public void menu(){

		Scanner entrada = new Scanner(System.in);


		



			System.out. println("------------------------------------------------------------------------------");

			System.out. println(".                          BIENVENIDOS A BEAUTY-SHOP");

			System.out. println("------------------------------------------------------------------------------");

			System.out.println(" ");




		Scanner sn = new Scanner(System.in);

		boolean salir = false;

		int opcion;

		while (salir == false){

			System.out.println(" ");

			System.out.println("MENU");

			System.out.println("1. Registrar un servicio.");

			System.out.println("2. Calcular el promedio de ingreso por servicio de los empleados.");

			System.out.println("3. Consultar la ganacia que obtuvo al prestar servicios de un tipo especifico.");

			System.out.println("4. Generar un reporte por cada empleado.");

			System.out.println("5. Salir del menu");



			System.out.println(" ");

			System.out.println("Selecciona la opcion que deseas realizar:");

			opcion = sn.nextInt();


				switch(opcion){

					case 1:

						System.out.println();
						break;

					case 2:

						System.out.println();
						break;

					case 3:

						System.out.println();
						break;

					case 4:

						System.out.println();
						break;

					case 5:

					salir = true;
					System.out.println("Menu Cerrado");




				}
			

			
		}

	}

	public void init(){

		Service s3 = new Service ("Pedicure", 0, 9000, 2250);

		Service s2 = new Service ("Manicure", 0, 7000, 2450);

		Service s1 = new Service ("Corte de cabello", 0, 8000, 1600);

		Employee emplo2 = new Employee ("Alexandra", 6701722, "empleada", 2017, s1, s2, s3);

		Employee emplo1 = new Employee ("Natalia", 1143756934, "empleada", 2015,s1, s2, s3);

		control = new BeautyShop (emplo1, emplo2);
	
	}


}