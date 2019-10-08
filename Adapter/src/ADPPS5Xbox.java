
public class ADPPS5Xbox extends SensorPS5{
	private SensorXbox adaptee;
	
	public ADPPS5Xbox(SensorXbox adaptee) {
		this.adaptee = adaptee;
	}
	
	public void conectarPS5() {
		adaptee.conectarXbox();
        System.out.println("But stadia wins!");
	}
}
