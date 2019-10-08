
public class ControleNintendo {
	private SensorNintendo sensorAQueSeConecta;
	
	public void Conectar(SensorNintendo adapter1) {
		this.sensorAQueSeConecta = adapter1;
		sensorAQueSeConecta.conectarNintendo();
	}
}
