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
    
    protected long startTime;		//## attribute startTime
    
    protected long endTime;		//## attribute endTime
    
    protected long totalDuration;		//## attribute totalDuration
    
    protected int totalPar;		//## attribute totalPar 
    
    protected int totalShotsTaken;		//## attribute totalShotsTaken 
    
    protected int currentHoleNumber;
    
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
    	currentHoleNumber =0;
    	holes = new ArrayList<Hole>();
    	for(Hole hole : course.holes)
    	{
    		this.holes.add(hole);
    	}
    }

    public String getInformation() {
        return  "Number of Holes: " + getNumHoles() + "\n" +
                "Start Time: " + getStartTime() + "\n" +
                "End Time:" + getEndTime() + "\n" +
                "Total Duration: " + getTotalDuration() + "\n" +
                "Total Par: " + getTotalPar() + "\n" +
                "Total Shots Taken: " + getTotalShotsTaken() + "\n" +
                "Total Score: " + getTotalScore();
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
    		totalPar += hole.getPar();
    		totalShotsTaken += hole.getShotsTaken();
            totalScore += hole.getScore();
    	}
    }
    
    //## operation endCurrentHole() 
    public String endCurrentHole(long time) {
    	currentHole.setEndTime(time);
    	currentHole.calcScore();
    	currentHoleNumber++;
    	
    	String holeInfo = 	"Current Hole: " + currentHoleNumber + "\n" + 
    						"Start Time: " + currentHole.getStartTime() + "\n" +
    						"End Time: " + currentHole.getEndTime() + "\n" +
    						"Duration: " + currentHole.getDuration() + "\n" +
    						"Par: " + currentHole.getPar()+ "\n"+
    						"Shots Taken: " + currentHole.getShotsTaken()+ "\n"+
    						"Score: " + currentHole.getScore()+ "\n";
    	return holeInfo;
    }
    
    /**
     * @param time
    */
    //## operation startNewHole(long) 
    public Hole startNewHole(long time) {
        //#[ operation startNewHole(long) 
        //#]
    	currentHole = holes.get(getCurrentHoleNumber());
    	return currentHole; // null
    }
    
    //## auto_generated 
    public List<Hole> getHoles() {
        return holes;
    }
    
    //## auto_generated 
    public Hole getCurrentHole() {
        return currentHole;
    }
    
    //## auto_generated 
    public int getCurrentHoleNumber() {
        return currentHoleNumber;
    }
    
    //## auto_generated 
    public int getNumHoles() {
        return holes.size();
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
    public long getTotalDuration() {
        totalDuration = endTime - startTime;
        return totalDuration;
    }

    //## auto_generated 
    public int getTotalPar() {
        return totalPar;
    }
    
    //## auto_generated 
    public int getTotalShotsTaken() {
        return totalShotsTaken;
    }
    
    //## auto_generated 
    public int getTotalScore() {
        return totalScore;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Business/Model/Round.java
*********************************************************************/

