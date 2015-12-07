/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Cheng
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Round
//!	Generated Date	: Mon, 23, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/Business/Model/Round.java
*********************************************************************/

package Business.Model;

import java.util.*;


//----------------------------------------------------------------------------
// Business/Model/Round.java                                                                  
//----------------------------------------------------------------------------

//## package Business::Model 


//## class Round 
public class Round {
    
    protected List<Hole> holes;		//## attribute holes 
    
    protected Hole currentHole;		//## attribute currentHole 
    
    protected double startTime;		//## attribute startTime 
    
    protected double endTime;		//## attribute endTime 
    
    protected double totalDuration;		//## attribute totalDuration 
    
    protected int totalPar;		//## attribute totalPar 
    
    protected int totalShotsTaken;		//## attribute totalShotsTaken 
    
    protected int totalScore;		//## attribute totalScore 
    
    
    /**
     * Author: Karthikeyan Selvaraj
     * @param course : COurse on which the round is played on
     * Function : Initializes the Hole list in the round to the holes in the course to 
     * initialize all the par values and other holes information to the holes in the round 
     */
    public  Round(Course course) 
    {
    	totalScore =0;
    	totalPar =0;
    	totalShotsTaken =0;
    	holes = new ArrayList<Hole>();
    	for(Hole hole : course.holes)
    	{
    		this.holes.add(hole);
    	}
    }
    
    /**
     * Author: Karthikeyan Selvaraj
     * @return totalScore Calculated
     * Function: Total Score = Hole_Par * Hole_Score for each hole. Calculates the value and stores it in the instance.
     */
    public void calcScore() 
    {
    	for(Hole hole : holes)
    	{
    		totalScore += (hole.par * hole.score);
    		totalPar += hole.par;
    		totalShotsTaken+= hole.shotsTaken;
    	}
    }
    
    //## operation endCurrentHole() 
    public void endCurrentHole() {
        //#[ operation endCurrentHole() 
        //#]
    }
    
    /**
     * @param time
    */
    //## operation startNewHole(long) 
    public Hole startNewHole(long time) {
        //#[ operation startNewHole(long) 
        //#]
    	currentHole = holes.get(0);
    	return currentHole; // null
    }
    
    //## auto_generated 
    public List<Hole> getHoles() {
        return holes;
    }
    
    //## auto_generated 
    public void setHoles(List<Hole> p_holes) {
        holes = p_holes;
    }
    
    //## auto_generated 
    public Hole getCurrentHole() {
        return currentHole;
    }
    
    //## auto_generated 
    public void setCurrentHole(Hole p_currentHole) {
        currentHole = p_currentHole;
    }
    
    //## auto_generated 
    public double getStartTime() {
        return startTime;
    }
    
    //## auto_generated 
    public void setStartTime(double p_startTime) {
        startTime = p_startTime;
    }
    
    //## auto_generated 
    public double getEndTime() {
        return endTime;
    }
    
    //## auto_generated 
    public void setEndTime(double p_endTime) {
        endTime = p_endTime;
    }
    
    //## auto_generated 
    public double getTotalDuration() {
        return totalDuration;
    }
    
    //## auto_generated 
    public void setTotalDuration(double p_totalDuration) {
        totalDuration = p_totalDuration;
    }
    
    //## auto_generated 
    public int getTotalPar() {
        return totalPar;
    }
    
    //## auto_generated 
    public void setTotalPar(int p_totalPar) {
        totalPar = p_totalPar;
    }
    
    //## auto_generated 
    public int getTotalShotsTaken() {
        return totalShotsTaken;
    }
    
    //## auto_generated 
    public void setTotalShotsTaken(int p_totalShotsTaken) {
        totalShotsTaken = p_totalShotsTaken;
    }
    
    //## auto_generated 
    public int getTotalScore() {
        return totalScore;
    }
    
    //## auto_generated 
    public void setTotalScore(int p_totalScore) {
        totalScore = p_totalScore;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Business/Model/Round.java
*********************************************************************/

