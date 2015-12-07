/*********************************************************************
	Rhapsody	: 8.0.3
	Login		: dxc122030
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Controller
//!	Generated Date	: Fri, 20, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/Business/Controller/Controller.java
*********************************************************************/

package Business.Controller;

import java.io.File;
import java.io.FileNotFoundException;
//## attribute currentRound 
import java.util.*;
import Business.Model.*;
import Business.Location;

import TechnicalServices.Clock.ClockAdapter;
import TechnicalServices.LocalStorage.LocalStorageAdapter;
import TechnicalServices.GPS.*;

//## operation startRound(Course) 

//----------------------------------------------------------------------------
// Business/Controller/Controller.java                                                                  
//----------------------------------------------------------------------------

//## package Business::Controller 


//## class Controller 
public class Controller {
    
    protected List<String> clubList;		//## attribute clubList 
    
    protected Round currentRound;		//## attribute currentRound 
    
    private static final Controller INSTANCE = new Controller();
    private ClockAdapter clockInstance = null;
    private LocalStorageAdapter storageAdapter =null;
    private GPSInterface gps = null;
    
    private Shot currentShot = null;
    private Hole currentHole = null;
    // Constructors
    
    //## auto_generated 
    private Controller() 
    {
    	clockInstance = ClockAdapter.getInstance();
    	storageAdapter = new LocalStorageAdapter();
    	gps = new RandomLocationGenerator();
    	
    	clubList = new ArrayList<String>();
    	clubList.add("Driver");
    	clubList.add("3-Wood");
    	clubList.add("3-Hybrid");
    	clubList.add("4-Hybrid");
    	clubList.add("4-Iron");
    	clubList.add("5-Iron");
    	clubList.add("6-Iron");
    	clubList.add("7-Iron");
    	clubList.add("8-Iron");
    	clubList.add("9-Iron");
    	clubList.add("52 degree Wedge");
    	clubList.add("60 degree Wedge");
    	clubList.add("Pitching Wedge");
    	clubList.add("Putter");

    }
    
    /**
     * Author: Daren Cheng
     * Function : Returns controller instance
     */
    public static Controller getInstance() 
    {
    	return(INSTANCE);
    }
    
    //## operation endHole() 
    public void endHole() {
        //#[ operation endHole() 
        //#]
    }
    
     /**
      * Author: Karthikeyan Selvaraj
      * UseCase: EndRound
      * Function : Sets the endtime for the round and Calculates the total score for the round and save 
      * it to the local storage as an XML string in the file named "RoundPlayer_<Timestamp>"
      */
    public void endRound() 
    {
    	currentRound.setEndTime(clockInstance.getTime());
    	currentRound.calcScore();
    	storageAdapter.saveRound(currentRound);
    }
    
    //## operation listCourses() 
    public void listCourses() {
        //#[ operation listCourses() 
        //#]
    }
    
    /**
     * Author: Jonathan Ricklis
     * UseCase: StartShot
     * Function: Creates a new shot on the current hole.
     */
    public void newShot() {
        currentHole = currentRound.getCurrentHole();
        currentShot = currentHole.createNewShot();
    }
    /**
     * Author: Jonathan Ricklis
     * UseCase: StartShot
     * Function: Sets the club for the current shot.
     */
    public void selectClub(String club) {
        if (currentShot != null){
        	currentShot.setClub(club);
        }
    }
    /**
     * Author: Jonathan Ricklis
     * UseCase: StartShot
     * Function: Call start shot on current hole with current location
     */
    public void startShot(){
    	//if (currentHole != null){
    		Location currentLocation = gps.getLocation();
    		currentHole.startShot(currentLocation);
    	//}
    }
    
    /**
     * Author: Jonathan Ricklis
     * UseCase: EndShot
     * Function: 
     */
    public String endShot(){
//    	if (currentHole != null){
    		Location currentLocation = gps.getLocation();
    		return currentHole.endShot(currentLocation);
//    	}
//    	return null;
    }
    
    
    //## operation startHole() 
    public void startHole() {
        //#[ operation startHole() 
        //#]
    }
    
    /**
     * Author: Karthikeyan Selvaraj
     * @param course : Course Information on which the round is played
     * UseCase : StartRound
     * Function : Starts the round instance with the course selected
     */
    public void startRound(final Course course) 
    {
       Round round = new Round(course);
       currentRound = round;
       round.setStartTime(clockInstance.getTime());
    }
    
    //## auto_generated 
    public List<String> getClubList() {
        return clubList;
    }
    
//    //## auto_generated 
//    public void setClubList(List<String> p_clubList) {
//        clubList = p_clubList;
//    }
    
    //## auto_generated 
    public Round getCurrentRound() {
        return currentRound;
    }
    
    /**
     * 
     */
    public void setCurrentRound(Round p_currentRound) {
        currentRound = p_currentRound;
    }
    
    /**
     * Author: Karthikeyan Selvaraj
     * @return List of Files in the RoundInformation Directory
     * Function: All the Course Information is saved in a directory "Round Information" This
     * Function return all the files in the directory
     */
    public List<String> GetRoundPlayed()
    {
    	List<String> roundsPlayed = new ArrayList<String>();
    	File[] files = new File("RoundInformation").listFiles();
    	
    	for (File file : files) 
    	{
    	    if (file.isFile()) 
    	    {
    	    	roundsPlayed.add(file.getName());
    	    }
    	}
    	return roundsPlayed;
    }
    
    /**
     *  Author: Karthikeyan Selvaraj
     * @param fileName fileName of the round for which you have to get the XML
     * @return returns the XML Information read from the file
     * Function: Reads the input file and return the entire content.
     */
    public String GetRoundInformation(String fileName)
    {
    	String XmlInfo = "";
    	File file =new File(fileName);
        Scanner in = null;
        try 
        {
            in = new Scanner(file);
            while(in.hasNext())
            {
                XmlInfo+=in.nextLine();
            }
        } 
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    	return XmlInfo;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Business/Controller/Controller.java
*********************************************************************/

