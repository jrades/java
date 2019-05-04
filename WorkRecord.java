/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataObjects;
/**
 *
 * @author Sun
 */
public class WorkRecord extends Record{
    String jobDescription;
    String title;

    public WorkRecord(String jobDescription, String title, String fromYear, String toYear, String organization) {
        super(fromYear, toYear, organization);
        this.jobDescription = jobDescription;
        this.title = title;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return organization;
    }

    public void setEmployer(String employer) {
        this.organization = employer;
    }
    
     
    
}
