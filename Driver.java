
/**
 * Write a description of class Driver here.  Think about what the class does
 * not why you are creating it
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver{
    /**
     * This is the entry point for the application
     *
     * @param  args A list of command line arguments
     * @return    nothing
     * @throws    nothing
     */
    public static void main(String[] args)
    {
        // don't forget to comment your code, so others can understand your logic
        try{
        java.lang.System.out.println(firstMethod(1,2));  
    }
            catch(Exception e){
                java.lang.System.out.println(e.getMessage());
            }
        java.lang.System.exit(0);  //code properly completed
    }
    
    /**
     * This method will modify the default string based on the parameters one and two
     * @param one First word to be added to the default string
     * @param two Second word added to the default string
     * @return The modified string 
     * @throws Exception if parameter is not a 1 and parameter two is not a 2 - this is just a sample
     */
    private static String firstMethod(int one, int two) throws Exception{
        if(one!=1 || two!=2)
           throw new Exception("The first paramter must be 1 and the second must be 2.");
        return new java.lang.String("He"+one+"lo World"+two);
    }
}

