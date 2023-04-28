package model;
import java.util.Calendar;

public abstract class User {

    private String nameUser;
    private String cc;
    private Calendar vinculationDate;

    public User(String nameUser, String cc, Calendar vinculationDate) {
        this.nameUser = nameUser;
        this.cc = cc;
        this.vinculationDate = vinculationDate;
    }
    public String getNameUser() {
        return nameUser;
    }
    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
    public String getCc() {
        return cc;
    }
    public void setCc(String cc) {
        this.cc = cc;
    }
    public Calendar getVinculationDate() {
        return vinculationDate;
    }
    public void setVinculationDate(Calendar vinculationDate) {
        this.vinculationDate = vinculationDate;
    }
    
}
