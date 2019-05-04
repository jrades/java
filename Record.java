package DataObjects;

/**
 *
 * @author Sun
 */
public class Record {
    String fromYear; // 0-9, 4 digits
    String toYear; //toYear >= fromYear
    
    String organization;

    public Record(String fromYear, String toYear, String organization) {
        this.fromYear = fromYear;
        this.toYear = toYear;
        this.organization = organization;
        if(Integer.parseInt(toYear)< Integer.parseInt(fromYear) )
        {
             throw new IllegalArgumentException(String.format("toYear must >= fromYear"));
        }
    }

    public String getFromYear() {
        return fromYear;
    }

    public void setFromYear(String fromYear) {
        this.fromYear = fromYear;
    }

    public String getToYear() {
        return toYear;
    }

    public void setToYear(String toYear) {
        this.toYear = toYear;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
    
    
    
    
}
