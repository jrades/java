/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataObjects;

import java.util.List;

/**
 *
 * @author Chris
 */
public class User {

    String fname;
    private String lname;
    public String email;
    private String password;
    private String phone;
    private String birthday;
    private String employer;
    private String country;
    private String state;
    String city;
    private String jobDescription;
    private String jobTitle;
    private String toYear;
    private String fromYear;
    


    List<Record> educationList;
    List<Record> workList;

    public List<Record> getEducationList() {
        return educationList;
    }

    public void setEducationList(List<Record> educationList) {
        this.educationList = educationList;
    }

    public List<Record> getWorkList() {
        return workList;
    }

    public void setWorkList(List<Record> workList) {
        this.workList = workList;
    }

    public User(String fname, String lname, String email, String password, String phone, String birthday, String employer, String country, String state, String city, String jobDescription, String jobTitle, String toYear, String fromYear) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.birthday = birthday;
        this.city = city;
        this.country = country;
        this.state = state;
        this.employer = employer;
        this.jobDescription = jobDescription;
        this.jobTitle = jobTitle;
        this.toYear = toYear;
        this.fromYear = fromYear;

    }



    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getToYear() {
        return toYear;
    }

    public void setToYear(String toYear) {
        this.toYear = toYear;
    }

    public String getFromYear() {
        return fromYear;
    }

    public void setFromYear(String fromYear) {
        this.fromYear = fromYear;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    

  
    }
    

