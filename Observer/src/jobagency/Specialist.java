package jobagency;

public class Specialist implements Observer{
    public Specialist(String name) {
        this.name = name;
    }

    String name;
    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (nameCompany.equalsIgnoreCase("google")){
            System.out.println(String.format("Specialist %s: OK! I'm ready for this work! (company, salary) = %s, %d", name, nameCompany, salary));
        } else {
            System.out.println(String.format("Specialist %s: I am waiting for the better job! (company, salary) = %s, %d", name, nameCompany, salary));
        }
    }
}
