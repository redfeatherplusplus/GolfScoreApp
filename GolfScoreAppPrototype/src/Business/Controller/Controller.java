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

//## attribute currentRound 
import java.util.List;

import TechnicalServices.Clock.ClockAdapter;
import TechnicalServices.LocalStorage.LocalStorageAdapter;

import Business.Model.Round;
//## operation startRound(Course) 
import Business.Model.Course;

//----------------------------------------------------------------------------
// Business/Controller/Controller.java                                                                  
//----------------------------------------------------------------------------

//## package Business::Controller 


//## class Controller 
public class Controller {
    
    protected List<String> clubList;		//## attribute clubList 
    
    protected Round currentRound;		//## attribute currentRound 
    
    private ClockAdapter clockInstance = null;
    private LocalStorageAdapter storageAdapter =null;
    // Constructors
    
    //## auto_generated 
    public  Controller() 
    {
    	clockInstance = ClockAdapter.getInstance();
    	storageAdapter = new LocalStorageAdapter();
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
    
    //## operation newShot() 
    public void newShot() {
        //#[ operation newShot() 
        //#]
    }
    
    //## operation selectClub() 
    public void selectClub() {
        //#[ operation selectClub() 
        //#]
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
    
    //## auto_generated 
    public void setClubList(List<String> p_clubList) {
        clubList = p_clubList;
    }
    
    //## auto_generated 
    public Round getCurrentRound() {
        return currentRound;
    }
    
    //## auto_generated 
    public void setCurrentRound(Round p_currentRound) {
        currentRound = p_currentRound;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Business/Controller/Controller.java
*********************************************************************/

