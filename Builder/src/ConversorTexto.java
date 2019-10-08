import java.awt.Font;

abstract class ConversorTexto {
	
	public void converterCaractere(char c) {
		System.out.println("converter caractere");
	}
	
	public void converterParagrafo() {
		System.out.println("converter paragrafo");
	}
	
	public void converterFonte(Font f) {
		System.out.println("converter fonte");
	}
}
