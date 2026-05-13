public class Patient {

    private String firstName;
    private String middleName;
    private String lastName;

    private String address;
    private String city;
    private String state;
    private String zipCode;

    private String phoneNumber;

    private String emergencyContactName;
    private String emergencyContactPhone;

    // Default constructor
    public Patient() {
        firstName = "";
        middleName = "";
        lastName = "";
        address = "";
        city = "";
        state = "";
        zipCode = "";
        phoneNumber = "";
        emergencyContactName = "";
        emergencyContactPhone = "";
    }

    // Constructor with 9 parameters (matches your GUI)
    public Patient(String firstName, String middleName, String lastName,
                   String address, String city, String state, String zipCode,
                   String emergencyContactName, String emergencyContactPhone) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;

        this.phoneNumber = "";

        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

    // Constructor with 10 parameters
    public Patient(String firstName, String middleName, String lastName,
                   String address, String city, String state, String zipCode,
                   String phoneNumber,
                   String emergencyContactName, String emergencyContactPhone) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;

        this.phoneNumber = phoneNumber;

        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String getAddress() {
        return address + ", " + city + ", " + state + " " + zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmergencyContact() {
        return emergencyContactName + " - " + emergencyContactPhone;
    }

    @Override
    public String toString() {
        return "Patient Information\n\n"
                + "Name: " + getFullName() + "\n"
                + "Address: " + getAddress() + "\n"
                + "Phone Number: " + phoneNumber + "\n"
                + "Emergency Contact: " + getEmergencyContact();
    }
}