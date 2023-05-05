package com.company;

import java.util.*;
class Day12Inheritance{
	static class Person {
		protected String firstName;
		protected String lastName;
		protected int idNumber;

		// Constructor
		Person(String firstName, String lastName, int identification){
			this.firstName = firstName;
			this.lastName = lastName;
			this.idNumber = identification;
		}

		// Print person data
		public void printPerson(){
			System.out.println(
					"Name: " + lastName + ", " + firstName
							+ 	"\nID: " + idNumber);
		}

	}

	static class Student extends Person{
		private int[] testScores;

		/*
		 *   Class Constructor
		 *
		 *   @param firstName - A string denoting the Person's first name.
		 *   @param lastName - A string denoting the Person's last name.
		 *   @param id - An integer denoting the Person's ID number.
		 *   @param scores - An array of integers denoting the Person's test scores.
		 */
		// Write your constructor here
		Student(String firstName, String lastName, int idNumber, int[] scores ){
			super(firstName, lastName, idNumber);
			this.testScores = scores;
		}

		/*
		 *   Method Name: calculate
		 *   @return A character denoting the grade.
		 */
		// Write your method here
		char calculate(){
			int scoresSum = 0;
			int scoresAvg = 0;
			char grade = 'Z';
			for(int score : testScores){
				scoresSum += score;
			}
			scoresAvg = scoresSum / testScores.length;
			if(scoresAvg < 40) grade = 'T';
			if(scoresAvg >= 40 && scoresAvg < 55) grade = 'D';
			if(scoresAvg >= 55 && scoresAvg < 70) grade = 'P';
			if(scoresAvg >= 70 && scoresAvg < 80) grade = 'A';
			if(scoresAvg >= 80 && scoresAvg < 90) grade = 'E';
			if(scoresAvg >= 90 && scoresAvg <= 100) grade = 'O';
			return grade;

		}
	}

	class Solution {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String firstName = scan.next();
			String lastName = scan.next();
			int id = scan.nextInt();
			int numScores = scan.nextInt();
			int[] testScores = new int[numScores];
			for(int i = 0; i < numScores; i++){
				testScores[i] = scan.nextInt();
			}
			scan.close();

			Student s = new Student(firstName, lastName, id, testScores);
			s.printPerson();
			System.out.println("Grade: " + s.calculate());
		}
	}

}
