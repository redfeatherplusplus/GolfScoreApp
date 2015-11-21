/*********************************************************************
	Rhapsody	: 8.0.3
	Login		: dxc122030
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Course
//!	Generated Date	: Fri, 20, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/Business/Model/Course.java
*********************************************************************/

package Business.Model;

//## auto_generated
import java.util.*;

//----------------------------------------------------------------------------
// Business/Model/Course.java                                                                  
//----------------------------------------------------------------------------

//## package Business::Model 


//## class Course 
public class Course {
    
    protected int totalPar;		//## attribute totalPar 
    
    protected ArrayList<Hole> holes = new ArrayList<Hole>();		//## link holes 
    
    
    // Constructors
    
    //## auto_generated 
    public  Course() {
        initRelations();
    }
    
    //## auto_generated 
    public int getTotalPar() {
        return totalPar;
    }
    
    //## auto_generated 
    public void setTotalPar(int p_totalPar) {
        totalPar = p_totalPar;
    }
    
    //## auto_generated 
    public ListIterator<Hole> getHoles() {
        ListIterator<Hole> iter = holes.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public Hole newHoles() {
        Hole newHole = new Hole();
        holes.add(newHole);
        return newHole;
    }
    
    //## auto_generated 
    public void deleteHoles(Hole p_Hole) {
        holes.remove(p_Hole);
        p_Hole=null;
    }
    
    //## auto_generated 
    protected void initRelations() {
        {
            for (int i = 0; i < 18; i++) 
                newHoles();
            
        }
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Business/Model/Course.java
*********************************************************************/

