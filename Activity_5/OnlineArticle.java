/** 
*OnlineArticle subclass.
*/
public class OnlineArticle extends OnlineTextItem {
   
   private int wordCount;
   
   /** 
   *Constructor.
   *@param nameIn name to set
   *@param priceIn price to set
   */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   /** 
   *Sets the wordCount instance variable.
   *@param wcIn word count to set
   */
   public void setWordCount(int wcIn) {
      wordCount = wcIn;
   }
}