package BugIO;

import java.util.UUID; // for generating unique IDs
import java.util.ArrayList;

public class Team {
    private UUID ID;
    private String teamName;
    private ArrayList<Developer> developers;
    private Project project;

    public Team(String tName)
    {
        this.teamName = tName;
        this.ID = UUID.randomUUID();
    }

    // setter methods
    public void addDeveloper(Developer developer)
    {
        this.developers.add(developer);
    }

    public void removeDeveloper(Developer developer)
    {
        this.developers.remove(developer);
    }

    public void assignProject(Project project)
    {
        this.project = project;
    }

    // getter methods
    public UUID getID() { return this.ID; }

    public String getTeamName() { return this.teamName; }

    public Project getActiveProject() { return this.project; }

}
