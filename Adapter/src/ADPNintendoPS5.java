
public class ADPNintendoPS5 {
	SensorPS5 adapt = new SensorPS5();
	
	public ADPNintendoPS5(SensorPS5 adapt) {
		this.adapt = adapt;
	}
	
	public void conectarNintendo() {
		adapt.conectarPS5();
		System.out.println("Nintendo conectado");
	}
}
