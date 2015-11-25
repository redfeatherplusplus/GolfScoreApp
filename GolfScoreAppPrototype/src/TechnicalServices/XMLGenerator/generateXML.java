/*********************************************************************
	Rhapsody	: 8.0.3
	Login		: dxc122030
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: generateXML
//!	Generated Date	: Fri, 20, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/TechnicalServices/XMLGenerator/generateXML.java
*********************************************************************/

package TechnicalServices.XMLGenerator;

//## operation generateXML(Round) 
import Business.Model.Hole;
import Business.Model.Round;
import Business.Model.Shot;
//## operation generateXML(Course) 
import Business.Model.Course;


//----------------------------------------------------------------------------
// TechnicalServices/XMLGenerator/generateXML.java                                                                  
//----------------------------------------------------------------------------

//## package TechnicalServices::XMLGenerator 


//## class generateXML 
public class generateXML {
    
    
    // Constructor
    public  generateXML() {
    }
    
    /**
     * Author: Karthikeyan Selvaraj
     * @param round : Round Instance for which the XML has to be generated
     * @return XML String for the Round Instance
     * Function : Builds the XML String for the Round Instance Passed.
     */
    public String GenerateXML(final Round round) 
    {
    	int HoleNumber =0;
    	
    	String RoundXML = "";
    	RoundXML += "<Round>";
    	
    	RoundXML += "<StartTime>";
    		RoundXML += round.getStartTime();
    	RoundXML += "</StartTime>";
    	
    	RoundXML += "<EndTime>";
    		RoundXML += round.getEndTime();
    	RoundXML += "</EndTime>";
    	
    	RoundXML += "<Score>";
    		RoundXML += round.getTotalScore();
    	RoundXML += "</Score>";
    	
    	RoundXML += "<TotalPar>";
    		RoundXML += round.getTotalPar();
    	RoundXML += "</TotalPar>";
    	
    	for(Hole hole : round.getHoles())
    	{
    		HoleNumber++;
    		RoundXML += GenerateXML(hole,HoleNumber);
    	}
    	RoundXML += "</Round>";
    	
    	return RoundXML;
    	
    }
    
    /**
     * Author: Karthikeyan Selvaraj
     * @param hole : Current Hole Instace of the Current Round Instance 
     * @param HoleNumber : Number indicating the hole in the particular round.
     * @return : XML String for the Hole Instance
     * Function: Builds the XML String for the current Hole Instance Passed
     */
    public String GenerateXML(final Hole hole, int HoleNumber)
    {
    	int ShotNumber =0;
    	
    	String HoleXML = "";
    	HoleXML += "<Hole>";
    	
    	HoleXML += "<Number>";
    		HoleXML += HoleNumber;
    	HoleXML += "</Number>";
    	
    	HoleXML += "<StartTime>";
    		HoleXML += hole.getStartTime();
    	HoleXML += "</StartTime>";
    	
    	HoleXML += "<EndTime>";
    		HoleXML += hole.getEndTime();
    	HoleXML += "</EndTime>";
    	
    	HoleXML += "<Score>";
    		HoleXML += hole.getScore();
    	HoleXML += "</Score>";
    	
    	HoleXML += "<Par>";
    		HoleXML += hole.getPar();
    	HoleXML += "</Par>";
    	
    	for(Shot shot : hole.getShotList())
    	{
    		ShotNumber++;
    		HoleXML += GenerateXML(shot,ShotNumber);
    	}
    	HoleXML += "</Hole>";
    	return HoleXML;
    }
    
    /**
     * Author: Karthikeyan Selvaraj
     * @param shot : Shot Instance associated with the current Hole Instance
     * @param ShotNumber : Number indicating the shot in the particular hole.
     * @return XML String for the current shot
     * Function: Builds the XML for the shot Model and returns it.
     */
    public String GenerateXML(final Shot shot, int ShotNumber)
    {
    	String ShotXML = "";
    	
    	ShotXML += "<Stroke>";
    	
    	ShotXML += "<Number>";
    		ShotXML += ShotNumber;
		ShotXML += "</Number>";
		
		ShotXML += "<Club>";
			ShotXML+= shot.getClub();
		ShotXML += "</Club>";
		
		ShotXML += "<StartLocation>";
			ShotXML += "<Latitude>";
				ShotXML += shot.getStartLocation().getLatitude();
			ShotXML += "</Latitude>";
			ShotXML += "<Longitude>";
				ShotXML += shot.getStartLocation().getLongitude();
			ShotXML += "</Longitude>";
		ShotXML += "</StartLocation>";
		
		ShotXML += "<EndLocation>";
			ShotXML += "<Latitude>";
				ShotXML += shot.getEndLocation().getLongitude();
			ShotXML += "</Latitude>";
			ShotXML += "<Longitude>";
				ShotXML += shot.getEndLocation().getLongitude();
			ShotXML += "</Longitude>";
		ShotXML += "</EndLocation>";
		
		ShotXML += "</Stroke>";
		
		return ShotXML;
    }
    
    
    
    /**
     * @param course
    */
    //## operation generateXML(Course) 
    public String GenerateXML(final Course course) {
        //#[ operation generateXML(Course) 
        //#]
    	return null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/TechnicalServices/XMLGenerator/generateXML.java
*********************************************************************/
/*
 <Round>
    <StartTime></StartTime>
    <EndTime></EndTime>
    <Score></Score>
    <TotalPar></TotalPar>
    <Hole>
        <Number></Number>
        <StartTime></StartTime>
        <EndTime></EndTime>
        <Score></Score>
        <Par></Par>
        <Stroke>
            <Number></Number>
            <Club></Club>
            <StartLocation>
	        	<Longitude></Longitude>
	            <Latitude></Latitude>
			</StartLocation>
			<EndLocation>
	            <Longitude></Longitude>
	            <Latitude></Latitude>
			</EndLocation>				
		</Stroke>
    </Hole>
</Round>
*/
