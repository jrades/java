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
public class EducationRecord extends Record {
    String degree;
    String major;

    public EducationRecord(String degree, String major, String fromYear, String toYear, String organization) {
        super(fromYear, toYear, organization);
        this.degree = degree;
        this.major = major;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchool() {
        return organization;
    }

    public void setSchool(String school) {
        this.organization = school;
    }

 
    
    
}
