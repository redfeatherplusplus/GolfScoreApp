/*********************************************************************
	Rhapsody	: 8.0.3
	Login		: dxc122030
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: RandomLocationGenerator
//!	Generated Date	: Fri, 20, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/TechnicalServices/GPS/RandomLocationGenerator.java
*********************************************************************/

package TechnicalServices.GPS;

import Business.Location;
import java.util.Random;


//----------------------------------------------------------------------------
// TechnicalServices/GPS/RandomLocationGenerator.java                                                                  
//----------------------------------------------------------------------------

//## package TechnicalServices::GPS 


//## class RandomLocationGenerator 
public class RandomLocationGenerator implements GPSInterface {
        
    // Constructors
    
    //## auto_generated 
    public  RandomLocationGenerator() {
    }

    /**
     * Author: Jonathan Ricklis
     * Function: Returns a Location object with random values for 
     * longitude (-180 to +180) and latitude (-90 to +90) 
     */
    public Location getLocation() {
        Location location = new Location();
        Random r = new Random();
        
        double longitude = (double)r.nextInt(181) + ((double)r.nextInt(100000)) / 1000000;
        double latitude = (double)r.nextInt(91) + ((double)r.nextInt(100000)) / 1000000;
        
        longitude = r.nextInt(2) == 0 ? longitude : - longitude;
        latitude = r.nextInt(2) == 0 ? latitude : - latitude;
        
        location.setLongitude(longitude);
        location.setLatitude(latitude);
        
        return location;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/TechnicalServices/GPS/RandomLocationGenerator.java
*********************************************************************/

