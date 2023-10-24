/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mini2;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erika normande 2022436
 */
// Class representing a team
class Team {
    private final String name;
    private final List<Person> members;

// Constructor to create an instance of a team
    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

// Method to add a member to the team
    public void addMember(Person person) {
        members.add(person);
    }

// Accessor methods to get the name and members of the team
    public String getName() {
        return name;
    }

    public List<Person> getMembers() {
        return members;
    }
}

