/*********************************************************************
	Rhapsody	: 8.0.3
	Login		: dxc122030
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ClockAdapter
//!	Generated Date	: Fri, 20, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/TechnicalServices/Clock/ClockAdapter.java
*********************************************************************/

package TechnicalServices.Clock;


//----------------------------------------------------------------------------
// TechnicalServices/Clock/ClockAdapter.java                                                                  
//----------------------------------------------------------------------------

//## package TechnicalServices::Clock 


/**
 *Author: Karthikeyan Selvaraj 
 *This class has a singleton Instance
 *Use getInstance() to get the singleton Instance of the class
 */
public class ClockAdapter 
{
    
    private static ClockAdapter ClockInstance = null;
	
    // Constructors 
    private ClockAdapter() 
    {   }
    
    /**
     * Author: Karthikeyan Selvaraj
     * @return singleton Instance of the Class
     */    
    public static ClockAdapter getInstance()
    {
    	if(ClockInstance==null)
    	    ClockInstance = new ClockAdapter();
    	
    	return ClockInstance;
    }
    
    /**
     * Author: Karthikeyan Selvaraj
     * Function: Return current Time in the system in MilliSeconds.
     * @return Current System Time in Long Format
     */
    public long getTime() {

    	return System.currentTimeMillis();
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/TechnicalServices/Clock/ClockAdapter.java
*********************************************************************/

