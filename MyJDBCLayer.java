package DataObjects;


/**
 *
 * @author Chris
 */


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author sun
 */
public class MyJDBCLayer {
//    private String databaseUrl = "jdbc:mysql://mis-sql.uhcl.edu:3306/sun";
//    private String username = "sun";
//    private String password = "spring15";
//    public String errorMsg = "";
    private String databaseUrl = "jdbc:mysql://mis-sql.uhcl.edu:3306/martineza4850";
    private String username = "martineza4850";
    private String password = "1389494";
    public String errorMsg = "";
    
    public void loadMySQLDriver(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            errorMsg = "Driver is OK!";
        }catch(ClassNotFoundException e){
            errorMsg = e.getMessage();
        }
    }
    
    public String saveUser(User myUser){
        this.loadMySQLDriver();
        
        String msg = "";
        String insertUser =" Insert INTO persons_0001(LastName, FirstName, Email, Password, Phone, Birthday, Employer, Country, State, City, JobDescription, JobTitle, FromYear, ToYear)";     //Add the codes for the other fields here!!!
        insertUser +=" VALUES ('" + myUser.getFname()
                + "','" + myUser.getLname()
                + "','" + myUser.getEmail()
                +"','" + myUser.getPassword() 
                + "','" + myUser.getPhone()
                + "','" + myUser.getBirthday()
                + "','" + myUser.getEmployer()
                + "','" + myUser.getCountry()
                + "','" + myUser.getState()
                + "','" + myUser.getCity()
                + "','" + myUser.getJobDescription()
                + "','" + myUser.getJobTitle()
                + "','" + myUser.getFromYear()
                + "','" + myUser.getToYear()
                +"');";
        try{
            Connection c = DriverManager.getConnection(this.databaseUrl, this.username, this.password);
            Statement s = c.createStatement();
            s.execute(insertUser);
            msg="User:" + myUser.getFname() + " " + myUser.getLname() + " is saved successfully!";
            
        }catch(SQLException e){
            msg = e.getMessage();
        }
        
        return msg;
    }
    
    public User[] getAllUsers(){
        String msg;
        this.loadMySQLDriver();
        User[] userArray = new User[100];
        String selectUser = "Select * from persons_1234";
        
        try{
            Connection c = DriverManager.getConnection(this.databaseUrl, this.username, this.password);
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(selectUser);
            //read the database records row by row
            int counter =0;
            while(r.next()){
                User tempUser = 
                  new User(r.getNString("LastName"), r.getNString("FirstName"),
                          r.getNString("Email"), r.getNString("Password"), r.getNString("Phone"),
                          r.getNString("Birthday"), r.getNString("Employer"), r.getNString("Country"),
                          r.getNString("State"), r.getNString("City"), r.getNString("JobDescription"), 
                          r.getNString("JobTitle"), r.getNString("FromYear"), r.getNString("ToYear"));
                userArray[counter] = tempUser;
                counter++;
            }
            
        }catch(SQLException e){
            msg = e.getMessage();
        }       
        
        return userArray;
    }
    
    
    
}

