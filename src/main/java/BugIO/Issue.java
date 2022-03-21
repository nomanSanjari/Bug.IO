package BugIO;

import java.text.SimpleDateFormat; // for date and time formatting
import java.util.Date; // for date and time creation
import java.util.UUID; // for generating unique IDs

enum Status {
    UNATTEMPTED, WORKING, DONE;
}

public class Issue {
    private UUID ID;
    private Status status;
    private String issueDescription;

    private Project project;
    private Developer activeDeveloper;

    private String dateReported;
    private String dateFinished;

    public Issue(Project project, String issueDescription)
    {
        this.project = project;
        this.issueDescription = issueDescription;
        this.ID = UUID.randomUUID();

        // format date time
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        // set dateReported according to date and time issue is found or reported
        this.dateReported = formatter.format(date);

        // set issue status at creation
        this.status = Status.UNATTEMPTED;
    }

    // setter methods
    public void assignDeveloper(Developer developer)
    {
        this.activeDeveloper = developer;
        this.status = Status.WORKING;
    }

    public void updateStatusComplete()
    {
        // mark status as complete
        this.status = Status.DONE;

        this.activeDeveloper = null;

        // format date time
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        // set dateFinished according to date and time issue is reported complete
        this.dateFinished = formatter.format(date);
    }

    // getter methods
    public UUID getID() { return this.ID; }

    public String getIssueDescription() { return this.issueDescription; }

    public Developer getActiveDeveloper() { return this.activeDeveloper; }

    public Status getStatus() { return this.status; }
}
