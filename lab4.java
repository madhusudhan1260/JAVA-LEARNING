class Patient {

    private int patientId;
    private String patientName;
    private int age;
    private String diagnosis;

    static String hospitalName = "Apollo Hospitals";

    static final int MAXIMUM_PATIENTS = 100;

    // Constructor
    Patient(int patientId, String patientName, int age, String diagnosis) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Getters
    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    // Setters
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // Display details
    public void displayDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Maximum Patients: " + MAXIMUM_PATIENTS);
    }
}

public class lab4 {

    public static void main(String[] args) {

        Patient p1 = new Patient(101, "Rahul", 25, "Fever");
        Patient p2 = new Patient(102, "Priya", 30, "Diabetes");

        p1.displayDetails();

        System.out.println();

        p2.displayDetails();

        // Using setter
        p1.setAge(26);

        // Using getter
        System.out.println("\nUpdated Age: " + p1.getAge());
    }
}