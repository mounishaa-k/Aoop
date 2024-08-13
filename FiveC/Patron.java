package DEMO;

public class Patron {
	private String fullName;
    private String idNumber;

    public Patron(String fullName, String idNumber) {
        this.fullName = fullName;
        this.idNumber = idNumber;
        System.out.println("Patron created: " + fullName + ", ID: " + idNumber);
    }

    public String getFullName() {
        return fullName;
    }

    public String getIdNumber() {
        return idNumber;
    }


}
