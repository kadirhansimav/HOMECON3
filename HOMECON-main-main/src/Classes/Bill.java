 
package Classes;

/**
 *
 * @author baransonmez
 */
public class Bill extends AItems{

     String type;
    
    public Bill(String type, double price) {
        super(price);
        this.type=type;
         
       // amount=1.0;
    }
    
    public Bill(String type){
        this.type=type;
    
    }
 
   
}
