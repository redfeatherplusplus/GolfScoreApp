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

    protected String name;
    
    protected List<Hole> holes;		//## attribute holes 
    
    protected int totalPar;		//## attribute totalPar 
    
    
    // Constructors
    
    //## auto_generated 
    public Course(String name, List<Integer> pars) {
        this.name = name;
        for(Integer par : pars) {
            Hole hole = new Hole();
            hole.setPar(par);
            holes.add(hole);
        }
    }
    
    //## auto_generated 
    public List<Hole> getHoles() {
        return null;
    }

    public String getName() {
        return name;
    }
    
    //## auto_generated 
    public void setHoles(List<Hole> p_holes) {
        holes = p_holes;
        totalPar = 0;
        for(Hole hole : holes) {
            totalPar += hole.par;
        }
    }
    
    //## auto_generated 
    public int getTotalPar() {
        return totalPar;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Business/Model/Course.java
*********************************************************************/

