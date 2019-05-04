package DataObjects;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author skyla
 */

@ManagedBean(name="educationBean")
public class EducationBean {

    /**
     * Creates a new instance of EducationBean
     */
    
    String userNameInput;
    User[] userList;
    List<EducationRecord> eduList;
    
    //List<Record> recordList;

    public User[] getUserList() {
        return userList;
    }

    public void setUserList(User[] userList) {
        this.userList = userList;
    }

    

    public List<EducationRecord> getEduList() {
        return eduList;
    }

    public void setEduList(List<EducationRecord> eduList) {
        this.eduList = eduList;
    }

    
    public String getUserNameInput() {
        return userNameInput;
    }

    public void setUserNameInput(String userNameInput) {
        this.userNameInput = userNameInput;
    }

    
    
    public EducationBean() {
        this.userNameInput= "";
    }
    
   
    /*WorkRecord(String jobDescription, String title, String fromYear, String toYear, String organization)
    EducationRecord(String degree, String major, String fromYear, String toYear, String organization)
    
    */
    public void search(){

        
        MyJDBCLayer myJDBC = new MyJDBCLayer();
        userList = myJDBC.getAllUsers();
        
    }
    
    
    
    public List<EducationRecord> createEduList(){
        List<EducationRecord> hardCodedEduList = new ArrayList<EducationRecord>();
        
        
        EducationRecord  edu1 = new EducationRecord("Bachelor", "CS", "2010", "2014", "University of Houston");
        EducationRecord edu2 = new EducationRecord("Bachelor", "Health Assistant", "1996", "2000", "University of Houston");
        
        hardCodedEduList.add(edu1);
         hardCodedEduList.add(edu2);
        return hardCodedEduList;
    }

    
}
