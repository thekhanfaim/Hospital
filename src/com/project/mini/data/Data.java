package com.project.mini.data;

import java.util.ArrayList;
import java.util.List;

import com.project.mini.model.Doctor;
import com.project.mini.model.Nurse;
import com.project.mini.model.Patient;

public class Data {
	
	private List<Doctor> listOfDoctors = new ArrayList<>();
	private List<Nurse> listOfNurses = new ArrayList<>();
	private List<Patient> listOfPatient = new ArrayList<>();
	
	public List<Nurse> getListOfNurses() {
		
		Nurse n = new Nurse("Neha@gmail.com", "neha", "Kanpur", 27000.50f, "BioTech");
		Nurse n1 = new Nurse("Shalu@gmail.com", "Shalu", "Chandigarh", 27000.50f, "BioTech");
		Nurse n2 = new Nurse("Genny@gmail.com","Genny", "Delhi", 67000.50f, "Bio");
		Nurse n3 = new Nurse("Maya@gmail.com", "Maya", "UP", 75000.50f, "Bio");
		
		listOfNurses.add(n);
		listOfNurses.add(n1);
		listOfNurses.add(n2);
		listOfNurses.add(n3);
		
		return listOfNurses;
	}
	
	public List<Doctor> getListOfDoctors() {
		
		Doctor d = new Doctor("john@gmail.com", "John", "up", 67000.00f, "MBBS");
		Doctor d1 = new Doctor("Rahul@gmail.com", "Rahul Kumar", "delhi", 75000.00f, "BAMS");
		Doctor d2 = new Doctor("Shailesh@gmail.com","Shailesh Pandey", "Kanpur", 67000.00f, "MBBS");
		Doctor d3 = new Doctor("Ganesh@gmail.com", "Ganesh", "Haryana", 75000.00f, "BAMS");
		
		listOfDoctors.add(d);
		listOfDoctors.add(d1);
		listOfDoctors.add(d2);
		listOfDoctors.add(d3);
		
		return listOfDoctors;
	}
	
	public List<Patient> getListOfPatients() {
		
		return listOfPatient;
	}
}
