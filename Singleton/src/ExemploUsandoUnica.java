
public class ExemploUsandoUnica {
	public static void main(String[] args) {
		Unica u = new Unica();
		
		Unica u1 = Unica.getInstancia();
		u1.setMensagem("Classe Unica");
		
		Unica u2 = Unica.getInstancia();
		
		if (u1 == u2) {
			System.out.println("u1 e u2 são objetos!");
			System.out.println(u1);
			System.out.println(u2);
		}
	}
}
