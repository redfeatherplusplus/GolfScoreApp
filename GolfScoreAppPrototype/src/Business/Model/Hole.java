/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Cheng
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Hole
//!	Generated Date	: Mon, 23, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/Business/Model/Hole.java
*********************************************************************/

package Business.Model;

//## operation endShot(Location) 
import Business.Location;

//----------------------------------------------------------------------------
// Business/Model/Hole.java                                                                  
//----------------------------------------------------------------------------

//## package Business::Model 


//## class Hole 
public class Hole {
    
    protected Shot currentShot;		//## attribute currentShot 
    
    protected int par;		//## attribute par 
    
    protected int shotsTaken;		//## attribute shotsTaken 
    
    protected int score;		//## attribute score 
    
    protected long startTime;		//## attribute startTime 
    
    protected long endTime;		//## attribute endTime 
    
    protected long duration;		//## attribute duration 
    
    
    // Constructors
    
    //## auto_generated 
    public  Hole() {
    }
    
    //## operation calcScore() 
    public int calcScore() {
        //#[ operation calcScore() 
        //#]
    	return(0);
    }
    
    //## operation createNewShot() 
    public void createNewShot() {
        //#[ operation createNewShot() 
        //#]
    }
    
    /**
     * @param location
    */
    //## operation endShot(Location) 
    public void endShot(final Location location) {
        //#[ operation endShot(Location) 
        //#]
    }
    
    //## auto_generated 
    public Shot getCurrentShot() {
        return currentShot;
    }
    
    //## auto_generated 
    public void setCurrentShot(Shot p_currentShot) {
        currentShot = p_currentShot;
    }
    
    //## auto_generated 
    public int getPar() {
        return par;
    }
    
    //## auto_generated 
    public void setPar(int p_par) {
        par = p_par;
    }
    
    //## auto_generated 
    public int getShotsTaken() {
        return shotsTaken;
    }
    
    //## auto_generated 
    public void setShotsTaken(int p_shotsTaken) {
        shotsTaken = p_shotsTaken;
    }
    
    //## auto_generated 
    public int getScore() {
        return score;
    }
    
    //## auto_generated 
    public void setScore(int p_score) {
        score = p_score;
    }
    
    //## auto_generated 
    public long getStartTime() {
        return startTime;
    }
    
    //## auto_generated 
    public void setStartTime(long p_startTime) {
        startTime = p_startTime;
    }
    
    //## auto_generated 
    public long getEndTime() {
        return endTime;
    }
    
    //## auto_generated 
    public void setEndTime(long p_endTime) {
        endTime = p_endTime;
    }
    
    //## auto_generated 
    public long getDuration() {
        return duration;
    }
    
    //## auto_generated 
    public void setDuration(long p_duration) {
        duration = p_duration;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Business/Model/Hole.java
*********************************************************************/

