package Seminar_7.Observer.src.jobagency;

public class Specialist implements Observer {
    String name;
    

    public Specialist(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (salary <= 100 && salary > 10){
            System.out.println(String.format("Specialist %s: I need this work! (company, salary) = %s, %d", name, nameCompany, salary));
        }
        else{
            System.out.println(String.format("Specialist %s: I dont need this work! (company, salary) = %s, %d", name, nameCompany, salary));
        }
        
    }
    
}