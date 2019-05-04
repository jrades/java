/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataObjects;

import javax.faces.bean.ManagedBean;



/**
 *
 * @author raderj7915
 */
@ManagedBean(name="registerBean")
public class RegisterBean {

    private String fname;
    private String lname;
    private String email;
    private String password;
    private String phone;
    private String birthday;
    private String employer;
    private String country;
    private String state;
    private String city;
    private String jobDescription;
    private String jobTitle;
    private String toYear;
    private String fromYear;

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


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    String warningMsg;

    
    public String getWarningMsg() {
        return warningMsg;
    }

    public void setWarningMsg(String warningMsg) {
        this.warningMsg = warningMsg;
    }
    
    
    public String getFname()
    {
        return fname;
    }
    
    
    public void setFname(String fname)
    {
        this.fname = fname;
    }
    
     public String getLname()
    {
        return lname;
    }
    
    
    public void setLname(String lname)
    {
        this.lname = lname;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getEmployer()
    {
        return employer;
    }
    
    
    public void setEmployer(String employer)
    {
        this.employer = employer;
    }
    
    public String getCity()
    {
        return city;
    }
    
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
        public String getCountry()
    {
        return country;
    }
    
    
    public void setCountry(String country)
    {
        this.country = country;
    }
    
    public String getState()
    {
        return state;
    }
    
    
    public void setState(String state)
    {
        this.state = state;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    

    
    public void submit(){
        User myUser = new User(this.fname, this.lname, this.email, this.password, this.phone, this.birthday, 
                this.employer, this.country, this.state, this.city, this.jobDescription, this.jobTitle, this.toYear, this.fromYear);
        
        MyJDBCLayer myJDBCObject = new MyJDBCLayer();
         this.warningMsg = myJDBCObject.saveUser(myUser);
        
         this.warningMsg = "Congratulations! " + fname + " " 
                + lname + " with email:" + email + " and phone#"
                + phone + " has registered successfully!";
        
    }
    
//    public void LoadUsers(){
//        MyJDBCLayer myJDBCObject = new MyJDBCLayer();
//        User[] userArray = myJDBCObject.getAllUsers();
//    }
    
    public String getResult()
    {
        if (fname != null && lname != null && email != null && city != null && password != null)
            return "<p style =\"background-color: rgb(0, 107, 183); width: 200px;" 
                    + "padding:5px\">Name: " + getFname() + " " + getLname() + "<br/>E-Mail: " + getEmail() + 
                    "<br/> Employer: " + getEmployer() + "<br/>" + getCity() + " " + getState() + " , " + getCountry() + "</p>";
        else
            return "";
                    
    }
    
}
