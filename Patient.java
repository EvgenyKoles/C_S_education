import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Date;
import javax.swing.Painter;

class AllTable {

    //for Allergy
	private int AlNumber;
	private String AlAllergy;
	private String AlRecVAccType;

	public AllTable (int AlNumber, String AlAllergy, String AlRecVAccType){
		this.AlNumber = AlNumber;
		this.AlAllergy = AlAllergy;
		this.AlRecVAccType = AlRecVAccType;
	}

    @Override
	public String toString(){

		return "Allergy id "+ AlNumber +
               ", Allergy name ='" + AlAllergy + '\'' + ", Recommended  ='" + AlRecVAccType ; 
	}


}

public class Patient {

	//for Patient
	private int Number;
	private String Fname;
	private String Lname;
	private int Age;
	private String Allergy;
	private String VaccineType;
	private Date Date;

	



	public Patient (int Number, String Fname, 
					String Lname, 
					int Age, 
					String  Allergy, 
					String VaccineType, 
					Date Date)
	{
		this.Number = Number;
		this.Fname = Fname;
		this.Lname = Lname;
		this.Age = Age;
		this.Allergy = Allergy;
		this.VaccineType = VaccineType;
		this.Date = Date;
	}

	public String getFname(){
		return Fname;
	}

	public int getAge(){

		return Age;
	}

	public int getNumber(){

		return Number;
	}

	public String getAllergy(){

		return Allergy;
	}


	@Override
	public String toString(){

		return "Patient id "+ Number +
               ", name ='" + Fname + '\'' + ", surname ='" + Lname + '\'' +
               ", age =" + Age + ", Allergy = " + Allergy +
               ", recommendedVaccine ='" + VaccineType + '\'' + ", Date = " + Date  ; 
	}



	public static void how_many_patients_are_given_each_vaccination_type(ArrayList<Patient> list){

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < list.size(); i++) {
			int count = 1;
			String k = list.get(i).VaccineType; 
			int l = list.get(i).Number;
					for (int j = 1; j < list.size(); j++) {
							if (list.get(j).VaccineType == k && list.get(j).Number == l) {
								count ++;
							}
					}	
			map.put(list.get(i).VaccineType, count);	
        }
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}


	public static void vaccine_type_given_to_patients(ArrayList<Patient> list) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the choice of vaccine type (AstraZeneca/Pfizer): ");
		String n = scanner.next();

			Collections.sort(list, new Comparator<Patient>() {
				@Override
				public int compare (Patient p1, Patient p2){

					return(p1.getFname().compareTo(p2.getFname()));
				}
			}
							);
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			Set <Integer> printedNumbers  = new HashSet<>();

		for (Patient patient : list) {
			if (n.equals(patient.VaccineType)) {
				if (!printedNumbers.contains(patient.getNumber())){
				System.out.println(patient.Number+" "+ patient.Fname +" "+ patient.Lname +" "
				+ patient.Age +" "+ patient.Allergy +" "+ patient.VaccineType+" "+ formatter.format(patient.Date) ); 
					printedNumbers.add(patient.getNumber());
				}
			}
        }
		scanner.close();
	}



	public static void next_vaccination_appointment(ArrayList<Patient> list){

		Collections.sort(list, new Comparator<Patient>() {
			@Override
			public int compare(Patient p1, Patient p2) {
				return Integer.compare(p2.getAge(), p1.getAge()); // Sorting in descending order
			}
		});

		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Set <Integer> printedNumbers  = new HashSet<>();

		for(Patient patient : list){

			if (!printedNumbers.contains(patient.getNumber())){
				System.out.println(patient.Number+" "+ patient.Fname +" "+ patient.Lname +" "
				+ patient.Age +" "+ patient.Allergy +" "+ patient.VaccineType+" "+ formatter.format(patient.Date) ); 
				printedNumbers.add(patient.getNumber());
			}
		}
	}


	public static void Patient_count_based_on_allergy_type(ArrayList<Patient> list) {
			
		Map<String, Integer> allergyCount = new HashMap<>();
		Set <Integer> printedNumbers  = new HashSet<>();

		for (Patient patient : list){

			String allergy = patient.getAllergy();

			if (!printedNumbers.contains(patient.getNumber())){
			allergyCount.put(allergy, allergyCount.getOrDefault(allergy, 0)+1);
			printedNumbers.add(patient.getNumber());
			}
		}

		for (Map.Entry<String, Integer> entry : allergyCount.entrySet()) {
            System.out.println (entry.getKey() +" "+ entry.getValue());
        }
	}

	
	public static void completed_vaccine_doses (ArrayList<Patient> list){

		Map<Integer, Integer> doseCouns = new HashMap<>();

		for (Patient patient : list){ // itterate by a ArrayList
			int dose = patient.getNumber(); 
			doseCouns.put(dose, doseCouns.getOrDefault(dose, 0)+1); //add patients with a count of doses
		}

		for (Map.Entry<Integer, Integer> entry : doseCouns.entrySet()) { // itterate by a new HashMap 
			if (entry.getValue() >= 3) { // chose where doses more than 3 
				
				System.out.println (list.get(entry.getKey()-1).Number + " " //print a result
				+ list.get(entry.getKey()-1).Fname + " " + list.get(entry.getKey()-1).Lname
				+ " " + list.get(entry.getKey()-1).Age + " " + list.get(entry.getKey()-1).Allergy 
				+ " " + list.get(entry.getKey()-1). VaccineType + " " +  entry.getValue() );	
			}
        }
	}

	public static void lowest_vaccine_doses (ArrayList<Patient> list){

		Map<Integer, Integer> doseCouns = new HashMap<>();

		for (Patient patient : list){ // itterate by a ArrayList
			int dose = patient.getNumber(); 
			doseCouns.put(dose, doseCouns.getOrDefault(dose, 0)+1); //add patients with a count of doses
		}

		for (Map.Entry<Integer, Integer> entry : doseCouns.entrySet()) { // itterate by a new HashMap 
			if (entry.getValue() < 3 && list.get(entry.getKey()-1).Age >= 70) { // chose where doses more than 3 and Patient Age more or equal than 70
				
				System.out.println (list.get(entry.getKey()-1).Number + " "  //print a result
				+ list.get(entry.getKey()-1).Fname + " " + list.get(entry.getKey()-1).Lname
				+ " " + list.get(entry.getKey()-1).Age + " " + list.get(entry.getKey()-1).Allergy 
				+ " " + list.get(entry.getKey()-1). VaccineType + " " +  entry.getValue() );	
			}
        }
	}



	public static void main(String[] args) {
		
		
		 ArrayList<Patient> patientList = new ArrayList<>();
//created for testing
		String[][] patientsData = {
            {"1","Georgia", "Roberts", "23", "Gelatin", "Pfizer", "06/15/2021"},
            {"2","Charlie", "Smith", "40", "Gelatin", "Pfizer", "06/15/2021"},
            {"3","Mariam", "Dawson", "27", "Gelatin", "Pfizer", "06/17/2021"},
            {"4","Emmett", "Miller", "30", "Gelatin", "Pfizer", "06/20/2021"},
            {"5","Lily", "Taylor", "18", "PEG", "AstraZeneca", "06/21/2021"},
            {"6","Bill", "Harley", "70", "PS80", "AstraZeneca", "07/21/2021"},
            {"3","Mariam", "Dawson", "27", "Gelatin", "Pfizer", "07/17/2021"},
            {"4","Emmett", "Miller", "30", "Gelatin", "Pfizer", "07/20/2021"},
            {"3","Mariam", "Dawson", "27", "Gelatin", "Pfizer", "08/19/2021"}
			//{"4","Emmett", "Miller", "30", "Gelatin", "Pfizer", "08/20/2021"}
        };
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 

        // Adding patients to the list
        for (String[] patientData : patientsData) {
            try {
				int Number =  Integer.parseInt(patientData[0]);
                String firstName = patientData[1];
                String lastName = patientData[2];
                int age = Integer.parseInt(patientData[3]);
                String allergy = patientData[4];
                String vaccineType = patientData[5];
                Date date = dateFormat.parse(patientData[6]);

                patientList.add(new Patient(Number, firstName, lastName, age, allergy, vaccineType, date));

            } catch (ParseException e) {
                System.out.println("Error parsing the date for " + patientData[0] + " " + patientData[1]);
            } catch (NumberFormatException e) {
                System.out.println("Error parsing the age for " + patientData[0] + " " + patientData[1]);
            }
        }



		ArrayList<AllTable> allergies  = new ArrayList<>();

		String[][] allergiesData = {
            {"1","Polyethylene Glycol (PEG)", "AstraZeneca"},
            {"2","Polysorbate 80 (PS80)", "AstraZeneca"},
            {"3","Gelatin", "Pfizer"},
        };
		for (String[] allergyData : allergiesData) {
            try {
				int Number =  Integer.parseInt(allergyData[0]);
                String AlAllergy = allergyData[1];
                String AlRecVAccType = allergyData[2];

                allergies.add(new AllTable(Number, AlAllergy, AlRecVAccType));

            } catch (NumberFormatException e) {
                System.out.println("Error parsing the age for " + allergyData[0] + " " + allergyData[1]);
            }
        }





		// fill the table ( !!!!!add ID for every patient later)

		// Scanner scanner = new Scanner(System.in);

		// System.out.println("How many patients would you like to add?");
		// int count = scanner.nextInt();

		// for (int i = 0; i < count; i++){

		// 	System.out.println("ID Patient please(It can be the same ID if you have this patient already): ");
		// 	int number = scanner.nextInt();
			
		// 	System.out.println("Name please: ");
		// 	String name = scanner.next();

		// 	System.out.println("Surname please: ");
		// 	String Sname = scanner.next();

		// 	System.out.println("Age please: ");
		// 	int age = scanner.nextInt();

		// 	System.out.println("Allergy please: ");
		// 	String aller = scanner.next();

		// 	System.out.println("Name of vaccine please: ");
		// 	String Vname = scanner.next();
			
		// 	System.out.println("Enter a date (dd.MM.yyyy): ");
		// 	String dateString = scanner.next();
		// 	Date date;
	
		// 	SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd.MM.yyyy"); 

		// 		try {
		// 			date = dateFormat2.parse(dateString);
		// 		}catch(ParseException e){

		// 			System.out.println("Invalid date format");
		// 			scanner.close();
		// 			return;
		// 		}

		// 		patientList.add(new Patient
		// 				(number,
		// 				name, 
		// 				Sname,
		// 				age,
		// 				aller,
		// 				Vname,
		// 				date) );

        // }
		//end of table editing

	
		//print Arraylist
		// System.out.println("For testing below ");
		// for (Patient patient : patientList) {
        //     System.out.println(patient);
        // }


			//RUN
		//how_many_patients_are_given_each_vaccination_type(patientList);
		//vaccine_type_given_to_patients(patientList);
		//next_vaccination_appointment(patientList);
		//Patient_count_based_on_allergy_type(patientList);
		//completed_vaccine_doses(patientList);
		lowest_vaccine_doses(patientList);


	}
}