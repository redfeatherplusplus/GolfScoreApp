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


//## class ClockAdapter 
public class ClockAdapter {
    
    
    // Constructors
    
    //## auto_generated 
    public  ClockAdapter() {
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

