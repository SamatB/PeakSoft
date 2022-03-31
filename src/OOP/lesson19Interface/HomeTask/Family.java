package OOP.lesson19Interface.HomeTask;

import OOP.lesson19Interface.HomeTask.Actions.Liveable;
import OOP.lesson19Interface.HomeTask.Actions.Payable;

import java.util.Arrays;

public  class Family implements Liveable, Payable {
    private String surname;
    private int familyQuantity;
    private Person[] humans;

    public Family(String surname, int quantity, Person[] humans) {
        this.surname = surname;
        this.familyQuantity = quantity;
        this.humans = humans;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getFamilyQuantity() {
        return familyQuantity;
    }

    public void setFamilyQuantity(int familyQuantity) {
        this.familyQuantity = familyQuantity;
    }

    public Person[] getHumans() {
        return humans;
    }

    public void setHumans(Person[] humans) {
        this.humans = humans;
    }

    @Override
    public String toString() {
        return  "\n Family surname - " + surname +
                ", family quantity - " + familyQuantity +
                ", family members - " + Arrays.toString(humans);
    }

    @Override
    public void live() {
        System.out.println("\n There are " +  + getFamilyQuantity()  + " members in "
                + "\"" + getSurname() + "\" family.");
    }

    @Override
    public void publicUtilities() {
        System.out.println(getSurname() + " family pays public utilities every month.");
    }

    @Override
    public void rentPay() {
        System.out.println(getSurname() + " family pays for rent every month.");
    }
}
