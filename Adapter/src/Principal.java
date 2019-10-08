
public class Principal {
public static void main(String[] args) {
		
		SensorXbox adaptee = new SensorXbox();
		ControlePS5 target = new ControlePS5();
		ADPPS5Xbox adapter = new ADPPS5Xbox(adaptee);

		
		SensorPS5 adaptee1 = new SensorPS5();
		ControleNintendo target1 = new ControleNintendo();
		ADPNintendoPS5 adapter1 = new ADPNintendoPS5(adaptee1);
		
		target.Conectar(adapter);
		
	}
}
