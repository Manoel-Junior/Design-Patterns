import java.util.ArrayList;
import java.util.List;

public abstract class MazeGame {
	
    private final List<Room> rooms = new ArrayList<>();
    
    abstract protected Room makeRoom();
    
    public MazeGame() {
    	Room sala1 = makeRoom();
    	Room sala2 = makeRoom();
    	Room sala3 = makeRoom();
    	Room sala4 = makeRoom();
    	
    	sala1.conect(sala2);
    	sala3.conect(sala4);
    }

	
}
