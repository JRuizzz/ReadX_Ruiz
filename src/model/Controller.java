package model;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Controller {

    private ArrayList<BiblioProducts> listOfBiblioProducts;
    private ArrayList<User> listOfUser;
    
    public Controller(){

        listOfUser = new ArrayList<>();
        listOfBiblioProducts = new  ArrayList<>();
    }
    
    public boolean registerUser(String nameUser, String cc, int dayVinculationDate, int monthVinculationDate, int yearVinculationDate, int optionUser) {

        User newUser = null;

        Calendar vinculationDate = new GregorianCalendar(yearVinculationDate, (monthVinculationDate - 1), dayVinculationDate);
       
        if (optionUser == 1) {
            newUser = new Standard(nameUser, cc, vinculationDate);
        } else if (optionUser == 2) {
            newUser = new Premium(nameUser, cc, vinculationDate);
        }

        return listOfUser.add(newUser);
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
        

        Calendar postDate = new GregorianCalendar(yearPostDate, (monthPostDate - 1), dayPostDate);

        if (optionProducts == 1) {
            newProduct = new Book(name, id, numberPages, postDate, value, readedPages, URL, shortReview, genre, numSoldBooks);
        } else if (optionProducts == 2) {
            newProduct = new Magazine(name, id, numberPages, postDate, value, URL, readedPages, category, issPeriod, activeSubs);
        }

        return listOfBiblioProducts.add(newProduct);
    } 
    
    public boolean modifyBook(int option, String newName, String newId, int newNumberPages, String newShortReview, int newGenres, String newURL, int newValue, int newNumSoldBooks,int newYearPostDate, int newMonthPostDate, int newDayPostDate, int newReadedPages){

        Genre genre = Genre.FICTION_SCIENCE;
		if(newGenres==2){
			genre = Genre.FANTASY;
		} else if(newGenres ==3){
			genre = Genre.HISTORICAL_NOVEL;
		}

        Calendar newPostDate = new GregorianCalendar(newYearPostDate, (newMonthPostDate - 1), newDayPostDate);

        for(int i = 0; i< listOfBiblioProducts.size(); i++){
            

            if (option >= 0 && option < listOfBiblioProducts.size()) {
                BiblioProducts book = listOfBiblioProducts.get(option);
                if (book instanceof Book) {

                    book.setId(newId);
                    book.setName(newName);
                    book.setNumberPages(newNumberPages);
                    ((Book) book).setShortReview(newShortReview);
                    ((Book) book).setGenre(genre);
                    book.setURL(newURL);
                    book.setValue(newValue);
                    ((Book) book).setNumSoldBooks(newNumSoldBooks);
                    book.setPostDate(newPostDate);
                    book.setReadedPages(newReadedPages);
                
                    return true; 
                }   
        
        
            }
        }
        
        return false;
    }
    public boolean modifyMagazine(int option,String newName, String newId, int newNumberPages, String newURL, int newValue, int newActiveSubs, int newYearPostDate, int newMonthPostDate, int newDayPostDate, int newReadedPages, int newCategorys , String newIssPeriod){




        return false;
    }

public String viewBookDetails(int bookIndex) {
    
    String msg = "";

    if (bookIndex >= 0 && bookIndex < listOfBiblioProducts.size()) {
        BiblioProducts book = listOfBiblioProducts.get(bookIndex);
        if (book instanceof Book) {
            Book selectedBook = (Book) book;
            msg += "Book Details:\n";
            msg += "ID: " + selectedBook.getId() + "\n";
            msg += "Name: " + selectedBook.getName() + "\n";
            msg += "Number of Pages: " + selectedBook.getNumberPages() + "\n";
            msg += "Short Review: " + selectedBook.getShortReview() + "\n";
            msg += "Genres: " + selectedBook.getGenre() + "\n";
            msg += "URL: " + selectedBook.getURL() + "\n";
            msg += "Value: " + selectedBook.getValue() + "\n";
            msg += "Number of Sold Books: " + selectedBook.getNumSoldBooks() + "\n";
            msg += "Post Date: " + selectedBook.getPostDateFormated() + "\n";
            msg += "Readed Pages: " + selectedBook.getReadedPages() + "\n";
        }
    }

    return msg;
}


    public String getBHBookInfo(){
        
        String msg = "";   
        for(int i = 0; i< listOfBiblioProducts.size(); i++){

            if(listOfBiblioProducts.get(i) instanceof Book){

                msg += "\n"+(i+1)+". "+listOfBiblioProducts.get(i).getName() +"\n";

            }

        }
        return msg;
    }
    public String getBHMagazineInfo(){
        
        String msg = "";   
        for(int i = 0; i< listOfBiblioProducts.size(); i++){

            if(listOfBiblioProducts.get(i) instanceof Magazine){

                msg += "\n"+(i+1)+". "+listOfBiblioProducts.get(i).getName() +"\n";

            }

        }
        return msg;
    }
    public String getUserStandardInfo(){
        
        String msg = "";   
        for(int i = 0; i< listOfUser.size(); i++){

            if(listOfUser.get(i) instanceof Standard){

                msg += "\n"+(i+1)+". "+listOfUser.get(i).toString() +"\n";

            }

        }
        return msg;
    }
    
    public String getUserPremiumInfo(){
        
        String msg = "";   
        for(int i = 0; i< listOfUser.size(); i++){

            if(listOfUser.get(i) instanceof Premium){

                msg += "\n"+(i+1)+". "+listOfUser.get(i).toString() +"\n";

            }

        }
        return msg;
    }
}
