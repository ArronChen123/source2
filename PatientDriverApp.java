/**
 * Class: CMSC203
 * Instructor: Prof. G. Grinberg
 * Description: Driver application to test Patient and Procedure classes
 */

public class PatientDriverApp {
    public static void main(String[] args) {
        Patient patient = new Patient("John", "M.", "Doe", "123 Main St", "Anytown", "MD", "21000",
                                      "301-123-4567", "Jane Doe", "301-765-4321");

        Procedure proc1 = new Procedure("Physical Exam", "06/20/2025", "Dr. Smith", 250.0);
        Procedure proc2 = new Procedure("X-ray", "06/21/2025", "Dr. Lee", 500.0);
        Procedure proc3 = new Procedure("Blood Test", "06/22/2025", "Dr. Kim", 150.0);

        System.out.println(patient.toString());
        System.out.println();
        System.out.println(proc1.toString());
        System.out.println(proc2.toString());
        System.out.println(proc3.toString());

        double total = proc1.getCharges() + proc2.getCharges() + proc3.getCharges();
        System.out.println("\nTotal Charges: $" + total);
    }
}
