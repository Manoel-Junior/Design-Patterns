import java.util.List;
import java.util.Random;
import javax.xml.parsers.FactoryConfigurationError;

public class Principal {
	public static void main(String[] args) {
	
	      var randomAppearance = List.of("osx", "win").get(new Random().nextInt(2));
	      
	      var factory = factory(randomAppearance);
	      
	      var button = factory.createButton();
	      button.paint();
	}
}
