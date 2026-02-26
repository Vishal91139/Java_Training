package Day_04.Accociation.Aggregation;

public class Patient {
    String patientName;
    int patientAge;
    String disease, dateOfArrival;
    Information info;
    Payment pay;

    public Patient(String patientName, int patientAge, String disease, String dateOfArrival, Information info, Payment pay){
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.disease = disease;
        this.dateOfArrival = dateOfArrival;
        this.info = info;
        this.pay = pay;
    }

    void patientDetails() {
        System.out.println("Name: "+ this.patientName);
        System.out.println("Age: "+ this.patientAge);
        System.out.println("Disease: "+ this.disease);
        System.out.println("Date of Arrival: "+ this.dateOfArrival);
        System.out.println("Block Number: "+ this.info.blockNo);
        System.out.println("Floor Number: "+ this.info.floorNo);
        System.out.println("Room Number: "+ this.info.roomNo);
        System.out.println("Bed Number: "+ this.info.bedNo);
        System.out.println("Admission Fees: "+ this.pay.admFees);
        System.out.println("Registration fees: "+ this.pay.regFees);
        System.out.println("Balance amount: "+ this.pay.balAmt);
    }

    public static void main(String[] args){
        Information info = new Information('C', 8, 810, 8);
        Payment pay = new Payment(5000, 1000, 2000);
        Patient patient = new Patient("Vishal", 20, "Fit", "25/02/2026", info, pay);
        patient.patientDetails();
    }
}
