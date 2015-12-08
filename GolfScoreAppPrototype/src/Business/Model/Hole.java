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

import java.util.ArrayList;
import java.util.List;
import Business.Model.*;

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
    
    protected int score;		//## attribute score 
    
    protected long startTime;		//## attribute startTime 
    
    protected long endTime;		//## attribute endTime 
    
    protected long duration;		//## attribute duration 
    
    protected List<Shot> shots;
    
    // Constructors
    
    //## auto_generated 
    public Hole(long time) {
    	startTime = time;
    	shots = new ArrayList<Shot>();
    }

    /**
     * Author : Daren Cheng
     * UseCase: EndHole
     * Function: Calculates score for the current shot.
     */
    public void calcScore() {
    	score = this.getShotsTaken() - par;
    }
    
    /**
     * Author: Jonathan Ricklis
     * UseCase: StartShot
     * Function: Creates a new shot, adds it to the list of shots, and return the new shot.
     */
    public Shot createNewShot() {
        currentShot = new Shot();
        return currentShot;
    }
    
    /**
     * Athor: Jonathan Ricklis
     * UseCase: StartShot
     * Function: sets start location of currentShot on hole.
     * @param startLocation
     */
    public void startShot(Location startLocation){
    	if (currentShot != null){
    		currentShot.setStartLocation(startLocation);
    	}
    }
    /**
     * Author: Jonathan Ricklis
     * UseCase: EndShot
     * Function: sets end location of currentShot, adds the shot to shots list, and then sets currentShot = null
     * @param location
    */
    //## operation endShot(Location) 
    public String endShot(final Location location) {
    	System.out.println("in end shot: " + currentShot);
    	if (currentShot != null){
        	currentShot.setEndLocation(location);
        	shots.add(currentShot);

            String shotInfo = String.format(
                    "Shot: %d%nClub: %s%nStart Location: (%3.4f, %3.4f)%nEnd Location: (%3.4f, %3.4f)%nDistance: %3.2f meters",
                    getShotsTaken(), currentShot.getClub(),
                    currentShot.getStartLocation().getLatitude(), currentShot.getStartLocation().getLongitude(),
                    currentShot.getEndLocation().getLatitude(), currentShot.getStartLocation().getLongitude(),
                    currentShot.getDistance()
            );
        	
        	currentShot = null;
        	return shotInfo;
        }
        return null;
    }
    
    //## auto_generated 
    public Shot getCurrentShot() {
        return currentShot;
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
        return shots.size();
    }
    
//    //## auto_generated 
//    public void setShotsTaken(int p_shotsTaken) {
//        shotsTaken = p_shotsTaken;
//    }
    
    //## auto_generated 
    public int getScore() {
        return score;
    }
    
    //## auto_generated 
    public long getStartTime() {
        return startTime;
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
    	duration = endTime - startTime;
        return duration;
    }
    
    public List<Shot> getShotList()
    {
    	return shots;
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Business/Model/Hole.java
*********************************************************************/

