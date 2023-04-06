package Methodover;
class Bank {
    public float getRateOfInterest() {
        return 0.0f;
    }
}

class SBI extends Bank {
    @Override
    public float getRateOfInterest() {
        return 8.0f;
    }
}

class ICICI extends Bank {
    @Override
    public float getRateOfInterest() {
        return 9.0f;
    }
}
class AXIS extends Bank {
    @Override
    public float getRateOfInterest() {
        return 7.0f;
    }
}
public class Eg4 {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();
        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + icici.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + axis.getRateOfInterest());
    }
}



