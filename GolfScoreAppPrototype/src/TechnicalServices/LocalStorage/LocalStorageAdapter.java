/*********************************************************************
	Rhapsody	: 8.0.3
	Login		: dxc122030
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: LocalStorageAdapter
//!	Generated Date	: Fri, 20, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/TechnicalServices/LocalStorage/LocalStorageAdapter.java
*********************************************************************/

package TechnicalServices.LocalStorage;

//## operation saveRound(Round) 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import TechnicalServices.Clock.ClockAdapter;
import TechnicalServices.XMLGenerator.generateXML;
import Business.Model.Round;
//## operation saveCourse(Course) 
import Business.Model.Course;

//----------------------------------------------------------------------------
// TechnicalServices/LocalStorage/LocalStorageAdapter.java                                                                  
//----------------------------------------------------------------------------

//## package TechnicalServices::LocalStorage 


//## class LocalStorageAdapter 
public class LocalStorageAdapter 
{
    
	private generateXML XMLGenerator;
    
	// Constructors
    public  LocalStorageAdapter() 
    {
    	XMLGenerator = new generateXML();
    }
    
    //## operation getCourses() 
    public String getCourses() {
        //#[ operation getCourses() 
        //#]
    	return null;
    }
    
    /**
     * @param course
    */
    //## operation saveCourse(Course) 
    public void saveCourse(final Course course) {
        //#[ operation saveCourse(Course) 
        //#]
    }
    
    /**
     * Author: Karthikeyan Selvaraj
     * @param round : Round Information that has to be saved in the local storage
     * Function : Converts the Round informtion as XMl String and saves the string in a file named "RoundPlayed_<TimeStamp>"
    */ 
    public void saveRound(final Round round) 
    {
    	String RoundXML = XMLGenerator.GenerateXML(round);
    	String FileName = "RoundPlayed_"+ClockAdapter.getInstance().getTime();
    	File saveFile = new File(FileName);
    	FileWriter fw = null;
    	BufferedWriter bw =null;
    	try
    	{
	        fw = new FileWriter( saveFile.getAbsoluteFile() );
		    bw = new BufferedWriter( fw );
		    bw.write(RoundXML);
		    bw.close();
		    fw.close();
    	}
        catch(Exception e)
        {
        	
        }
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/TechnicalServices/LocalStorage/LocalStorageAdapter.java
*********************************************************************/

