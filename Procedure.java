/**
 * Class: CMSC203
 * Instructor: Prof. G. Grinberg
 * Description: Procedure class for medical information
 */

public class Procedure {
    private String procedureName, procedureDate, practitionerName;
    private double charges;

    public Procedure() {}

    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    public Procedure(String procedureName, String procedureDate, String practitionerName, double charges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }

    public String getProcedureName() { return procedureName; }
    public String getProcedureDate() { return procedureDate; }
    public String getPractitionerName() { return practitionerName; }
    public double getCharges() { return charges; }

    public void setProcedureName(String name) { this.procedureName = name; }
    public void setProcedureDate(String date) { this.procedureDate = date; }
    public void setPractitionerName(String name) { this.practitionerName = name; }
    public void setCharges(double charges) { this.charges = charges; }

    public String toString() {
        return "Procedure: " + procedureName + ", Date: " + procedureDate +
               ", Practitioner: " + practitionerName + ", Charges: $" + charges;
    }
}
