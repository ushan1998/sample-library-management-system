
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tharukshi nadeera
 */
public class LibItem {
   protected boolean checkedOut;
   protected Date checkOutDate;
   protected Date dueDate;
   protected String itemName;
   protected String loanedTo;
   protected int LoanPeriodLength;
   
   public LibItem (String itemName, int length){
       this.itemName=itemName;
       this.LoanPeriodLength = length;
       
   }
   
   public void setCheckedOut (boolean checkedOut){
       this.checkedOut = checkedOut;
   }
   
   public void setCheckOutDate (Date checkOutDate){
       this.checkOutDate= checkOutDate;
   }
   
   public void setDueDate (Date DueDate){
       this.dueDate = dueDate;
   }
   
   public void setItemName (String ItemName){
       this.itemName = itemName;
       
   }
   
   public String getLoanedTo(){
       return loanedTo;
   }
   
   public void setLoanPeriodLength (int loanPeriodLength){
       this.LoanPeriodLength = loanPeriodLength;
   }
   
   public boolean getCheckedOut() {
       return this.checkedOut;
   }
   
   public Date getCheckOutDate(){
       return checkOutDate;
   }
   
   public Date getDueDate (){
       return dueDate;
   }
   
  public int getLoanPeriodLength(){
      return LoanPeriodLength;
      
  }
  
  public String getItemName(){
      return itemName;
  }
  
  public void CheckOut (){
      
  }
  
  public void renew (){
  


    


}
  
public void checkOut (int forNumDays){
    
}

public void returnToLibrary(){
    
}

@Override
public String toString (){
    return "Library Item Details: Name :"+ this.itemName+" Availability="+this.checkedOut+" By Whom="+this.loanedTo+" Checked Outed Date = "+this.checkOutDate+"When Will Item Available ="+this.LoanPeriodLength;
}
    
}