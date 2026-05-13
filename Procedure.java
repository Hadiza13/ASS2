public class Procedure {
    private String name;
    private String date;
    private String practitionerName;
    private double charge;

    public Procedure() {
        this.name = "";
        this.date = "";
        this.practitionerName = "";
        this.charge = 0.0;
    }

    public Procedure(String name, String date, String practitionerName) {
        this.name = name;
        this.date = date;
        this.practitionerName = practitionerName;
        this.charge = 0.0;
    }

    public Procedure(String name, String date, String practitionerName, double charge) {
        this.name = name;
        this.date = date;
        this.practitionerName = practitionerName;
        this.charge = charge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    @Override
    public String toString() {
        return "Procedure Name: " + name + "\n"
                + "Date: " + date + "\n"
                + "Practitioner: " + practitionerName + "\n"
                + String.format("Charge: $%,.2f", charge);
    }
}