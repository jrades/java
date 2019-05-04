/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataObjects;


import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author skyla
 */
@ManagedBean(name="workBean")
public class WorkBean {

    /**
     * Creates a new instance of WorkBean
     */
    String userNameInput;
    User[] userList;
    List<WorkRecord> workList;

    public String getUserNameInput() {
        return userNameInput;
    }

    public void setUserNameInput(String userNameInput) {
        this.userNameInput = userNameInput;
    }

    public User[] getUserList() {
        return userList;
    }

    public void setUserList(User[] userList) {
        this.userList = userList;
    }

    

    public List<WorkRecord> getWorkList() {
        return workList;
    }

    public void setWorkList(List<WorkRecord> workList) {
        this.workList = workList;
    }
    
    public WorkBean() {
        this.userNameInput = "";
    }
    
    public void search(){
        
        MyJDBCLayer myJDBC = new MyJDBCLayer();
        userList = myJDBC.getAllUsers();
        
    }
    

    }
    
    

