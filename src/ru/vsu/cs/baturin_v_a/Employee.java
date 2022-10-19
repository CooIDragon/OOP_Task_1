package ru.vsu.cs.baturin_v_a;

public class Employee {
    public String surname;
    public String name;
    public String email;
    public String phoneNumber;
    public String city;
    public String salary;

    @Override
    public String toString() {
        return "Employee (" + "surname: " + surname + " | name:" + name + " | email:" + email + " | phone number:" + phoneNumber + " | city:" + city + " | salary:" + salary + ")";
    }
}
