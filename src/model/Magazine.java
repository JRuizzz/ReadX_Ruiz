package model;

import java.util.Calendar;

public class Magazine extends BiblioProducts{

    private Category category;
    private String issPeriod;
    private int activeSubs;


    public Magazine(String name, String id, int numberPages, Calendar postDate, int value, String URL, int readedPages, Category category,String issPeriod, int activeSubs) {
        super(name, id, numberPages, postDate, value, readedPages, URL);

        this.category= category;
        this.issPeriod = issPeriod;
        this.activeSubs = activeSubs;
    }
    
    public Category getCategory() {
        return category;
    }


    public void setCategory(Category category) {
        this.category = category;
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
