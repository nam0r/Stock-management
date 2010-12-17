package view;
import controler.Data;

/**
 * Class used as the IHM for the application. It intercepts user inputs and call controllers 
 * to modify the model.
 */
public class Terminal {
    private Data data;
    /**
     * The constructor of the Terminal view class.
     * @param data The Data controller instance of the application.
     */
    public Terminal(Data data){
        this.data=data;
    }
    /**
     * 
     */
    public void launchMenu(){
        
    }
}
