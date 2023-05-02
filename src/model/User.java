package model;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public abstract class User {

    private String nameUser;
    private String cc;
    private Calendar vinculationDate;
    private DateFormat formatter;
    public User(String nameUser, String cc, Calendar vinculationDate) {
        this.nameUser = nameUser;
        this.cc = cc;
        this.vinculationDate = vinculationDate;
        this.formatter = new SimpleDateFormat("dd/M/yyyy");
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
    public String getVinculationDateFormated(){
		return formatter.format(this.vinculationDate.getTime());
	}
    
    @Override
    public String toString() {
        String msg = "";
        msg = "\nName: " + nameUser + "\nCC: " + cc + "\nInitial Date: " + getVinculationDateFormated();
		
		return msg;
    }
}
