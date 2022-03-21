package BugIO;

import java.util.UUID; // for generating unique IDs
import java.util.ArrayList;

public class Developer {
    private UUID ID;
    private String firstName;
    private String lastName;
    private ArrayList<UUID> Projects;

    public void Developer(String fName, String lName)
    {
        this.ID = UUID.randomUUID();
        this.firstName = fName;
        this.lastName = lName;
    }

    // setter methods
    public void addProject(UUID projectID)
    {
    }

    // getter methods
    public UUID getID()
    {
        return this.ID;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }
}