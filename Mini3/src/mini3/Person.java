/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini3;

/**
 *
 * @author erika normande 2022436
 */
// Class representing a person
class Person {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String email;

// Constructor to create an instance of a person    
    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

// Method to format the representation of the person as a string
    @Override
    public String toString() {
        return String.format("%s %s (%d), Email: %s", firstName, lastName, id, email);
    }
}
