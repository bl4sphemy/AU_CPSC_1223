
 /** 
 *OnlineBook subclass.
 */
public class OnlineBook extends OnlineTextItem {
   
   protected String author;
   
    /** 
    *Constructor.
    *@param nameIn name to set
    *@param priceIn price to set
    */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";  
   }
   
    /** 
    *toString: book name - author’s name : $price.
    *@return String
    */
   public String toString() {
      return name + " - " + author + ": $" + calculateCost();
   }
   
    /** 
    *setAuthor sets the author instance variable.
    *@param authorIn autor to be set
    */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
}