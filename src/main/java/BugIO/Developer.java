package BugIO;

import java.util.UUID; // for generating unique IDs
import java.util.ArrayList;

public class Developer {
    private UUID ID;
    private String firstName;
    private String lastName;
    private UUID activeProject;

    public void Developer(String fName, String lName)
    {
        this.ID = UUID.randomUUID();
        this.firstName = fName;
        this.lastName = lName;
    }

    // setter methods
    public void setActiveProject(UUID projectID)
    {
        this.activeProject = projectID;
    }

    public void removeFromProject()
    {
        this.activeProject = null;
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

    @Override
    public String toString()
    {
        String data = this.ID + " ---> " + this.firstName + " " + this.lastName + " ---> " + activeProject;
        return data;
    }
}