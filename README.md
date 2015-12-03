# OOSE Group project

TODO:
> Add transitions to UI. Examples of how to add a transition to the UI can be found under the "Home" Class. 
In short, call: UI.getInstance().show("Panel Name"); - with spaces. UI was designed with WindowBuilderPro:
http://www.eclipse.org/windowbuilder/download.php. Developing on the UI should be possible without WindowBuilder 
though. Use setVisible(true/false) to swap inbetween sub-panels if needed (Only used in EndShot and ViewHistory).

> CreateCourse/ViewHistory need to be added to the controller. Certain get methods need to be added to the controller, 
such as getHoleOn to determine when 18 holes have been played. Also getInfo methods are required for Round/Shot/Hole 
so that the UI can display end of Round/Shot/Hole Info as described in the use cases (Or we could just leave those blank
and "leave" it for another iteration, they should be easy to implement however).
