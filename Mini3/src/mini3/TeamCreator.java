/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mini3;

/**
 *
 * @author erika normande 2022436
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Enum to represent people's data fields
enum PersonField {
    ID, FIRST_NAME, LAST_NAME, EMAIL
}



// Main class of the program
public class TeamCreator {
    public static void main(String[] args) {
        
        // Path to the data file
        String csvFile = "C:/Users/erika/Documents/MOCK_DATA.csv";
        List<Person> people = readData(csvFile);

        int numTeams = 20;
        int teamSize = 5;
        List<Team> teams = createTeams(people, numTeams, teamSize);

        printTeams(teams);
    }

 // Method to read data from the file and create instances of Person
    private static List<Person> readData(String filePath) {
        List<Person> people = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String firstName = parts[1];
                String lastName = parts[2];
                String email = parts[3];
                people.add(new Person(id, firstName, lastName, email));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return people;
    }

 // Method to create random teams from the list of people
    private static List<Team> createTeams(List<Person> people, int numTeams, int teamSize) {
        Collections.shuffle(people);
        List<Team> teams = new ArrayList<>();

        for (int i = 0; i < numTeams; i++) {
            String teamName = "Team " + (i + 1);
            Team team = new Team(teamName);

            for (int j = 0; j < teamSize; j++) {
                Person person = people.get(i * teamSize + j);
                team.addMember(person);
            }

            teams.add(team);
        }

        return teams;
    }

 // Method to print team information to the console   
    private static void printTeams(List<Team> teams) {
        for (Team team : teams) {
            System.out.println("\n" + team.getName() + " - Members:");
            for (Person member : team.getMembers()) {
                System.out.println("  " + member);
            }
        }
    }
}