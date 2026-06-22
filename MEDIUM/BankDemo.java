class Bank {
    double getRateOfInterest() {
        return 0;
    }
}
class SBI extends Bank {
    double getRateOfInterest() {
        return 8.4;
    }
}
class ICICI extends Bank {
    double getRateOfInterest() {
        return 7.3;
    }
}
class AXIS extends Bank {
    double getRateOfInterest() {
        return 9.7;
    }
}
public class BankDemo {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI = " + s.getRateOfInterest());
        System.out.println("ICICI = " + i.getRateOfInterest());
        System.out.println("AXIS = " + a.getRateOfInterest());
    }
}