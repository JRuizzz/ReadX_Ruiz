package model;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Controller {

    private User[] users;
    private BiblioProducts[] products;
    
    public Controller(){
        users= new User[1000];
        products = new BiblioProducts[1000];
    }
    public boolean registerUser(String nameUser, String cc, int dayVinculationDate, int monthVinculationDate, int yearVinculationDate, int optionUser) {

        User newUser = null;

        Calendar vinculationDate = new GregorianCalendar(yearVinculationDate, monthVinculationDate - 1, dayVinculationDate);
       
        if (optionUser == 1) {
            newUser = new Standard(nameUser, cc, vinculationDate);
        } else if (optionUser == 2) {
            newUser = new Premium(nameUser, cc, vinculationDate);
        }

        if (newUser != null) {
            for (int i = 0; i < users.length; i++) {
                if (users[i] == null) {
                    users[i] = newUser;
                    return true;
                }
            }
        }
        return false;
    } 


    public boolean registerBiblioProducts(String name, String id, int numberPages,String shortReview, int genres, String URL, int value , int numSoldBooks, int optionProducts, int yearPostDate, int monthPostDate, int dayPostDate, int readedPages, int categorys, String issPeriod, int activeSubs){
        
        Genre genre = Genre.FICTION_SCIENCE;
		if(genres==2){
			genre = Genre.FANTASY;
		} else if(genres ==3){
			genre = Genre.HISTORICAL_NOVEL;
		}

        Category category = Category.VARIETIES;
		if(categorys==2){
			category = Category.DESIGN;
		} else if(categorys ==3){
			category= Category.SCIENTIST;
		}

        BiblioProducts newProduct = null;
        

        Calendar postDate = new GregorianCalendar(yearPostDate, monthPostDate - 1, dayPostDate);

        if (optionProducts == 1) {
            newProduct = new Book(name, id, numberPages, postDate, value, readedPages, URL, shortReview, genre, numSoldBooks);
        } else if (optionProducts == 2) {
            newProduct = new Magazine(name, id, numberPages, postDate, value, URL, readedPages, category, issPeriod, activeSubs);
        }

        if (newProduct != null) {
            for (int i = 0; i < products.length; i++) {
                if (products[i] == null) {
                    products[i] = newProduct;
                    return true;
                }
            }
        }
        return false;
    } 
        

    public String getUserInfo(){
        String msg = "";
            
        for(int i = 0; i< users.length; i++){

                if(users[i] != null){

                    msg += "\n"+(i+1)+". "+users[i].toString();

                }

        }

        return msg;
    }
}
