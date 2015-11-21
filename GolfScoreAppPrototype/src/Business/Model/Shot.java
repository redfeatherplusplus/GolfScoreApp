/*********************************************************************
	Rhapsody	: 8.0.3
	Login		: dxc122030
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Shot
//!	Generated Date	: Fri, 20, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/Business/Model/Shot.java
*********************************************************************/

package Business.Model;

//## attribute endLocation 
import Business.Location;

//----------------------------------------------------------------------------
// Business/Model/Shot.java                                                                  
//----------------------------------------------------------------------------

//## package Business::Model 


//## class Shot 
public class Shot {
    
    protected String club;		//## attribute club 
    
    protected double distance;		//## attribute distance 
    
    protected Location endLocation;		//## attribute endLocation 
    
    protected Location startLocation;		//## attribute startLocation 
    
    
    // Constructors
    
    /**
     * @param club
     * @param location
    */
    //## operation Shot(String,Location) 
    public  Shot(final String club, final Location location) {
        //#[ operation Shot(String,Location) 
        //#]
    }
    //## auto_generated 
    public  Shot() {
    }
    
    //## operation calculateDistance() 
    public double calculateDistance() {
        //#[ operation calculateDistance() 
        //#]
    }
    
    //## auto_generated 
    public String getClub() {
        return club;
    }
    
    //## auto_generated 
    public void setClub(String p_club) {
        club = p_club;
    }
    
    //## auto_generated 
    public double getDistance() {
        return distance;
    }
    
    //## auto_generated 
    public void setDistance(double p_distance) {
        distance = p_distance;
    }
    
    //## auto_generated 
    public Location getEndLocation() {
        return endLocation;
    }
    
    //## auto_generated 
    public void setEndLocation(Location p_endLocation) {
        endLocation = p_endLocation;
    }
    
    //## auto_generated 
    public Location getStartLocation() {
        return startLocation;
    }
    
    //## auto_generated 
    public void setStartLocation(Location p_startLocation) {
        startLocation = p_startLocation;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Business/Model/Shot.java
*********************************************************************/

