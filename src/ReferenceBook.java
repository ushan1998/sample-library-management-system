/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tharukshi nadeera
 */
public class ReferenceBook extends Book {
    private String forCourse;
    
    public ReferenceBook(String bookName, String ISBNumber, String authorName,String forCourse){ 
        super (bookName,0,ISBNumber,authorName);
        this.forCourse=forCourse;
        
                
    }
            
    
}
