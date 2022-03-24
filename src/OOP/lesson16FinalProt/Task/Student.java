package OOP.lesson16FinalProt.Task;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    private LocalDate birthDate;
    private String nameSurname;
    private String email;


    public Student (){

    }
    public Student (String nameSurname,
                    LocalDate birthDate,
                    String email){
        Period period = Period.between(birthDate, LocalDate.now());
        if (period.getYears() < 0) {
            System.out.println("Жаш терс болбошу керек!");
            System.exit(0);
        } else {
            this.birthDate = birthDate;
        }

        this.nameSurname = nameSurname;
        this.email = email;

    }

    public void setBirthDate (LocalDate date){
        Period period = Period.between(birthDate, LocalDate.now());
        if (period.getYears() < 0) {
            System.out.println("Жаш терс болбошу керек!");
            System.exit(0);
        } else {
            this.birthDate = date;
        }
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setNameSurname (String NSName){
        this.nameSurname = NSName;
    }

    public String getNameSurname () {
        return nameSurname;
    }

    public void setEmail (String email) {
        this.email = email;
    }
    public String getEmail () {
        return email;
    }
    @Override
    public String toString () {
        return "Student: " + "name = " + nameSurname
                + ", birth date = " + birthDate + ", email = "
                + email;
    }


}
