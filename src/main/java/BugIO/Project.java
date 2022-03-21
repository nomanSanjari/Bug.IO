package BugIO;

import java.util.UUID; // for generating unique IDs
import java.util.ArrayList;

public class Project {
    private UUID ID;
    private String projectName;
    private Team team;
    private ArrayList<Issue> issues;

    public void Project(String pName, Team team)
    {
        this.ID = UUID.randomUUID();
        this.projectName = pName;
    }

    // setter methods
    public void assignTeam(Team team)
    {
        this.team = team;
    }

    public void addIssue(Issue issue)
    {
        this.issues.add(issue);
    }

    public void removeIssue(Issue issue)
    {
        this.issues.remove(issue);
    }

    // getter methods
    public UUID getID() { return this.ID; }

    public String getProjectName() { return this.projectName; }
}
