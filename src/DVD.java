

/**
 *
 * @author tharukshi nadeera
 */
public class DVD extends LibItem {
    private String director;
    private String makerStudio;
    private boolean subtitled;
    
   public DVD(String movieName, String director, String makerStudio, boolean subtitled){
       super(movieName,2);
       this.director = director;
       this.makerStudio= makerStudio;
       this.subtitled= subtitled;
   }
           
    
  
    @Override
    public String toString(){
        return super.toString();
        
    }   
}
