/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thrukshi nadeera
 */
public class Book extends LibItem {
    protected String authorName;
    protected String ISBNumber;
    
    public Book (String bookName, int length, String ISBNumber, String authorName){ 
        super(bookName,length);
        this.ISBNumber = ISBNumber;
        this.authorName = authorName;
        
        
    }    
    
    
     @Override
     public String toString(){
         return super.toString()+ "Book Details: Author Name:" +this.authorName+"...";
     }
    
    
}
