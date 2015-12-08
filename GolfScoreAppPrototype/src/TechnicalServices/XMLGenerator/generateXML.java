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
    	RoundXML += "<Round>\n";
    	
    	RoundXML += "\t<StartTime>";
    		RoundXML += round.getStartTime();
    	RoundXML += "</StartTime>\n";
    	
    	RoundXML += "\t<EndTime>";
    		RoundXML += round.getEndTime();
    	RoundXML += "</EndTime>\n";
    	
    	RoundXML += "\t<Score>";
    		RoundXML += round.getTotalScore();
    	RoundXML += "</Score>\n";
    	
    	RoundXML += "\t<TotalPar>";
    		RoundXML += round.getTotalPar();
    	RoundXML += "</TotalPar>\n";
    	
    	for(Hole hole : round.getHoles())
    	{
    		HoleNumber++;
    		RoundXML += GenerateXML(hole,HoleNumber);
    	}
    	RoundXML += "</Round>\n";
    	
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
    	HoleXML += "\t<Hole>\n";
    	
    	HoleXML += "\t\t<Number>";
    		HoleXML += HoleNumber;
    	HoleXML += "</Number>\n";
    	
    	HoleXML += "\t\t<StartTime>";
    		HoleXML += hole.getStartTime();
    	HoleXML += "</StartTime>\n";
    	
    	HoleXML += "\t\t<EndTime>";
    		HoleXML += hole.getEndTime();
    	HoleXML += "</EndTime>\n";
    	
    	HoleXML += "\t\t<Score>";
    		HoleXML += hole.getScore();
    	HoleXML += "</Score>\n";
    	
    	HoleXML += "\t\t<Par>";
    		HoleXML += hole.getPar();
    	HoleXML += "</Par>\n";
    	
    	for(Shot shot : hole.getShotList())
    	{
    		ShotNumber++;
    		HoleXML += GenerateXML(shot,ShotNumber);
    	}
    	HoleXML += "\t</Hole>\n";
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
    	
    	ShotXML += "\t\t<Stroke>\n";
    	
    	ShotXML += "\t\t\t<Number>";
    		ShotXML += ShotNumber;
		ShotXML += "</Number>\n";
		
		ShotXML += "\t\t\t<Club>";
			ShotXML+= shot.getClub();
		ShotXML += "</Club>\n";
		
		ShotXML += "\t\t\t<StartLocation>\n";
			ShotXML += "\t\t\t\t<Latitude>";
				ShotXML += shot.getStartLocation().getLatitude();
			ShotXML += "</Latitude>\n";
			ShotXML += "\t\t\t\t<Longitude>";
				ShotXML += shot.getStartLocation().getLongitude();
			ShotXML += "</Longitude>\n";
		ShotXML += "\t\t\t</StartLocation>\n";
		
		ShotXML += "\t\t\t<EndLocation>\n";
			ShotXML += "\t\t\t\t<Latitude>";
				ShotXML += shot.getEndLocation().getLongitude();
			ShotXML += "</Latitude>\n";
			ShotXML += "\t\t\t\t<Longitude>";
				ShotXML += shot.getEndLocation().getLongitude();
			ShotXML += "</Longitude>\n";
		ShotXML += "\t\t\t</EndLocation>\n";
		
		ShotXML += "\t\t</Stroke>\n";
		
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
