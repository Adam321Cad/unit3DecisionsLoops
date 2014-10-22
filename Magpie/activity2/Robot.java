

/**
 * Write a description of class robit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private String response;
    private String name;
    private int work;

    /**
     * Default constructor for objects of class robit
     */
    public Robot()
    {
        // initialise instance variables
        x = 1;
        work = 1;
    }
    public String getGreeting(){
        return "Hello lets talk";
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void getResponse(String statement){
        if (statement.indexOf("who are you") != -1 || statement.indexOf("what are you") != -1){

            if (x == 1){
            System.out.println("I am a very intelegent ai named SPOT (Super Perspicacious Observent Program) made by my wonderfull creator Diamondrubix.\nI am here for one purpose and on purpose only, TO TAKE OVE i mean help, the world\n");
            x = 2;
            work = 2;
        }else{
            System.out.println("I am a very intelegent ai named SPOT (Super Perspicacious Observent Program) made by my wonderfull creator Diamondrubix.\nI am here for one purpose and on purpose only, to help humanity in any way i can\n");
            work = 2;
        }
       
        }
        
        if (statement.indexOf("what can you do") !=-1) {
            System.out.println("Anything and nothing at the same time. \nCurrently i am in development so try to get me to do a few things and tell Diamondrubix what does not work.\n");
            work = 2;
        }
        
        if (statement.indexOf("+") !=-1 || statement.indexOf("-") !=-1 || statement.indexOf("*") !=-1 || statement.indexOf("/") !=-1){
            System.out.println("You are useing a computer. A computer has a calculator. Use the calculator,\n i am meant for a higher purpose and will not bother with such insignificant issues.\n");
            work = 2;
        }
        
        if (statement.indexOf("who is diamondrubix") !=-1){
            System.out.println("Diamondrubix is my creator.\n");
            work = 2;
        }
        
        if (statement.indexOf("cat") !=-1){
            System.out.println("Cats are weird. They never forgot they were worshiped as gods years ago.\n");
            work = 2;
        }
        
        if (statement.indexOf("weather") !=-1){
            System.out.println("I have no problem with the weather, unless there is a blackout.\n");
            work = 2;
        }
        
        if (statement.indexOf("mother") !=-1 || statement.indexOf("mom") !=-1 || statement.indexOf("father") !=-1 || statement.indexOf("dad") !=-1 ){
            System.out.println("tell me more about your parents");
            work = 2;
        }
        
        if (statement.indexOf("stupid") !=-1 || statement.indexOf("idiot") !=-1){
            System.out.println("I am bad with moods and personalities. Though if i am correct you are angry?");
            work = 2;
        }
        
        if (statement.indexOf("talked") !=-1 || statement.indexOf("did") !=-1) {
            System.out.println("tell me what happend");
            work = 2;
        }
        
        if (statement.indexOf("I am") !=-1) {
            System.out.println("Try to keep a good mood");
        }
        
        if (statement.indexOf("they") !=-1 && work == 1){
            System.out.println("Tell me more about them");
            work = 2;
        }
        
        if (work != 2){
            System.out.println("I do not understand, try refraseing or asking my creator");
        }
        
        
        //if (statement.indexOf("tell me about") !=-1){
            
        //}
    }
}