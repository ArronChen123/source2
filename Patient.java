/**
 * Class: CMSC203
 * Instructor: Prof. G. Grinberg
 * Description: Patient class for storing personal and emergency information
 */

public class Patient {
    private String firstName, middleName, lastName;
    private String address, city, state, zip;
    private String phoneNumber, emergencyName, emergencyPhone;

    public Patient() {}

    public Patient(String f, String m, String l) {
        this.firstName = f;
        this.middleName = m;
        this.lastName = l;
    }

    public Patient(String f, String m, String l, String address, String city, String state, String zip,
                   String phoneNumber, String emergencyName, String emergencyPhone) {
        this.firstName = f;
        this.middleName = m;
        this.lastName = l;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.emergencyName = emergencyName;
        this.emergencyPhone = emergencyPhone;
    }

    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }
    public String getAddress() { return address; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZip() { return zip; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmergencyName() { return emergencyName; }
    public String getEmergencyPhone() { return emergencyPhone; }

    public void setFirstName(String f) { this.firstName = f; }
    public void setMiddleName(String m) { this.middleName = m; }
    public void setLastName(String l) { this.lastName = l; }
    public void setAddress(String a) { this.address = a; }
    public void setCity(String c) { this.city = c; }
    public void setState(String s) { this.state = s; }
    public void setZip(String z) { this.zip = z; }
    public void setPhoneNumber(String p) { this.phoneNumber = p; }
    public void setEmergencyName(String e) { this.emergencyName = e; }
    public void setEmergencyPhone(String ep) { this.emergencyPhone = ep; }

    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String buildAddress() {
        return address + ", " + city + ", " + state + " " + zip;
    }

    public String buildEmergencyContact() {
        return emergencyName + " (" + emergencyPhone + ")";
    }

    public String toString() {
        return "Name: " + buildFullName() + "\nAddress: " + buildAddress() +
               "\nPhone: " + phoneNumber + "\nEmergency Contact: " + buildEmergencyContact();
    }
}
