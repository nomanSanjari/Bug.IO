package BugIO;

import java.util.UUID; // for generating unique IDs
import java.util.ArrayList;

public class Project {
    private UUID ID;
    private String projectName;
    private Team team;
    private ArrayList<Issue> issues;

    // setter methods


    // getter methods
    public UUID getID() { return this.ID; }

    public String getProjectName() { return this.projectName; }
}
