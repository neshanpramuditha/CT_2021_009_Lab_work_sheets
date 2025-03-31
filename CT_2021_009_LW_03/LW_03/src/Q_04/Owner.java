package Q_04;

class Owner {
    private String ownerName;
    private String phoneNo;

    // Default Constructor
    public Owner() {
        this.ownerName = "Unknown";
        this.phoneNo = "Not Available";
    }

    // Parameterized Constructor
    public Owner(String ownerName, String phoneNo) {
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    // Getter and Setter for Owner Name
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Getter and Setter for Phone Number
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    // Method to display owner details
    public String toString() {
        return "Owner Name: " + ownerName + ", Phone No: " + phoneNo;
    }
}