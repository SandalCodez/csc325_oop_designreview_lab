/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 * Main class to demonstrate the functionality of Student, Freshman, and Senior classes
 * @author MoaathAlrajab
 */
public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// student object
		Student std1 = new Student("James", (short) 20);

		// freshman object with name, age, and credits
		Freshman freshman1 = new Freshman("James", (short) 20, 12);

		// senior object with name, age, and credits (minimum 85)
		Senior senior1 = new Senior("John", (short) 30, 90);

		// Get GPA for student with validation
		double gpa = getValidGPA(scanner, "student " + std1.getName());
		std1.setGpa(gpa);

		// Get GPA for freshman with validation
		double freshmanGpa = getValidGPA(scanner, "freshman " + freshman1.getName());
		freshman1.setGpa(freshmanGpa);

		// Get GPA for senior with validation
		double seniorGpa = getValidGPA(scanner, "senior " + senior1.getName());
		senior1.setGpa(seniorGpa);

		// Print the output using toString methods
		System.out.println("\n--- Student Information ---");
		System.out.println(std1);

		System.out.println("\n--- Freshman Information ---");
		System.out.println(freshman1);

		System.out.println("\n--- Senior Information ---");
		System.out.println(senior1);

		scanner.close();

	}

	private static double getValidGPA(Scanner scanner, String studentType) {
		double gpa = -1;
		boolean validInput = false;

		while (!validInput) {
			try {
				System.out.print("Enter GPA for " + studentType + " (0.0 - 4.0): ");
				gpa = scanner.nextDouble();

				// Validate GPA range
				if (gpa < 0.0 || gpa > 4.0) {
					System.out.println("Error: GPA must be between 0.0 and 4.0. Please try again.");
				} else {
					validInput = true;
				}

			} catch (java.util.InputMismatchException e) {
				System.out.println("Error: Please enter a valid number for GPA.");
				scanner.next(); // Clear the invalid input
			}
		}

		return gpa;
	}
}