/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Cheng
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Course
//!	Generated Date	: Mon, 23, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/Business/Model/Course.java
*********************************************************************/

package Business.Model;

import java.util.List;


//----------------------------------------------------------------------------
// Business/Model/Course.java                                                                  
//----------------------------------------------------------------------------

//## package Business::Model 


//## class Course 
public class Course {
    
    protected List<Hole> holes;		//## attribute holes 
    
    protected int totalPar;		//## attribute totalPar 
    
    protected String name;
    
    // Constructors
    
    //## auto_generated 
    public  Course() {
    }
    
    //## auto_generated 
    public  Course(String name) {
    	this.name = name;
    }
    
    //## auto_generated 
    public List<Hole> getHoles() {
        return null;
    }
    
    //## auto_generated 
    public void setHoles(List<Hole> p_holes) {
        holes = p_holes;
    }
    
    //## auto_generated 
    public int getTotalPar() {
        return totalPar;
    }

    //## auto_generated 
    public String getName() {
        return name;
    }
    
    //## auto_generated 
    public void setTotalPar(int p_totalPar) {
        totalPar = p_totalPar;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Business/Model/Course.java
*********************************************************************/

