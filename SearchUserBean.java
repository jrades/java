
package DataObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="searchUserBean")
public class SearchUserBean {

    List<User> userList;
    String firstNameInput;
    String cityInput;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public String getfirstNameInput() {
        return firstNameInput;
    }

    public void setfirstNameInput(String firstNameInput) {
        this.firstNameInput = firstNameInput;
    }

    public String getCityInput() {
        return cityInput;
    }

    public void setCityInput(String cityInput) {
        this.cityInput = cityInput;
    }
    
    
    public void search(){
        
        if(firstNameInput.equals(""))
            return;
        
        userList = this.SearchUser();
        
        List<User> matchedUser = new ArrayList<User>();
        
        for(User u:userList){
            if(u.fname.toLowerCase().contains(firstNameInput.toLowerCase())||u.city.toLowerCase().contains(cityInput.toLowerCase()))
            {
                matchedUser.add(u);
            }
        }
        
        userList = matchedUser;
                
    }

    public List<User> SearchUser() {
        MyJDBCLayer myJDBC = new MyJDBCLayer();
        userList = (Arrays.asList(myJDBC.getAllUsers()));
        return userList;
    }
    
}