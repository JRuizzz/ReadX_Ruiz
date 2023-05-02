package model;
import java.util.Calendar;
public abstract class BiblioProducts {
    
    private String name;
    private String id;
    private int numberPages;
    private Calendar postDate;
    private int value;
    private int readedPages;
    private String URL;

    public BiblioProducts(String name, String id, int numberPages, Calendar postDate, int value,int readedPages, String URL) {
        this.name = name;
        this.id = id;
        this.numberPages = numberPages;
        this.postDate = postDate;
        this.readedPages = readedPages;
        this.URL = URL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public Calendar getPostDate() {
        return postDate;
    }

    public void setPostDate(Calendar postDate) {
        this.postDate = postDate;
    }

    public int getReadedPages() {
        return readedPages;
    }

    public void setReadedPages(int readedPages) {
        this.readedPages = readedPages;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    

    
    
}
