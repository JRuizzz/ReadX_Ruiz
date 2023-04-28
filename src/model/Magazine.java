package model;

import java.util.Calendar;

public class Magazine extends BiblioProducts{

    private Category category;
    private String urlMGZ;
    private int subValue;
    private String issPeriod;
    private int activeSubs;


    public Magazine(String name, String id, int numberPages, Calendar postDate, int readedPages, Category category, String urlMGZ, int subValue, String issPeriod, int activeSubs) {
        super(name, id, numberPages, postDate, readedPages);

        this.category= category;
        this.urlMGZ= urlMGZ;
        this.subValue = subValue;
        this.issPeriod = issPeriod;
        this.activeSubs = activeSubs;
    }
    
    public Category getCategory() {
        return category;
    }


    public void setCategory(Category category) {
        this.category = category;
    }


    public String getUrlMGZ() {
        return urlMGZ;
    }


    public void setUrlMGZ(String urlMGZ) {
        this.urlMGZ = urlMGZ;
    }


    public int getSubValue() {
        return subValue;
    }


    public void setSubValue(int subValue) {
        this.subValue = subValue;
    }


    public String getIssPeriod() {
        return issPeriod;
    }


    public void setIssPeriod(String issPeriod) {
        this.issPeriod = issPeriod;
    }


    public int getActiveSubs() {
        return activeSubs;
    }


    public void setActiveSubs(int activeSubs) {
        this.activeSubs = activeSubs;
    }
    
    
}
