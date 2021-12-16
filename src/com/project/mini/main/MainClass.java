package com.project.mini.main;

import java.util.Scanner;

import com.project.mini.data.Data;
import com.project.mini.model.Doctor;
import com.project.mini.model.Nurse;
import com.project.mini.model.Patient;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		while(true) {

			System.out.println("Enter the Choice");

			System.out.println("1. See Doctors List");
			System.out.println("2. Nurses List");
			System.out.println("3. Get Your Status");
			System.out.println("4. See Tablets Prescribed");
			System.out.println("0. To Exit");

			int input = scanner.nextInt();

			if(input == 0) {
				break;
			}

			switch(input) {
			
			case 1:
				Data data = new Data();
				System.out.println("Doctor List");
				for(Doctor doctor : data.getListOfDoctors()) {
					System.out.println(doctor);
				}
				break;
				
			case 2:
				Data nurseData = new Data();
				System.out.println("Doctor List");
				for(Nurse nurse : nurseData.getListOfNurses()) {
					System.out.println(nurse);
				}
				break;
				
			case 3:
				Patient patient = new Patient();
				System.out.println(patient);
				break;
			}
		
		}
	
	}

}
