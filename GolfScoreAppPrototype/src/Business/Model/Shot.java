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
    
    protected Double distance;		//## attribute distance 
    
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
    	return 0.0;
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
    	if (startLocation == null || endLocation == null){
    		return 0;
    	}
    	if (distance == null){
    		distance = calculateDistance(
            		startLocation.getLatitude(),
            		endLocation.getLatitude(),
            		startLocation.getLongitude(),
            		endLocation.getLongitude(),
            		0,
            		0);
    	}
        return distance;
    }
    
    /* Source: http://stackoverflow.com/a/16794680
     * 
     * Calculate distance between two points in latitude and longitude taking
     * into account height difference. If you are not interested in height
     * difference pass 0.0. Uses Haversine method as its base.
     * 
     * lat1, lon1 Start point lat2, lon2 End point el1 Start altitude in meters
     * el2 End altitude in meters
     * @returns Distance in Meters
     */
    private static double calculateDistance(double lat1, double lat2, double lon1,
            double lon2, double el1, double el2) {

        final int R = 6371; // Radius of the earth

        Double latDistance = Math.toRadians(lat2 - lat1);
        Double lonDistance = Math.toRadians(lon2 - lon1);
        Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters

        double height = el1 - el2;

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
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

