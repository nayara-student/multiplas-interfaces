package multiplasInterfaces;

public class Programa {

	public static void main(String[] args) {
		Cliente maria = new Cliente("Maria", "Silva");
		
		System.out.println("Bem-vindo ao Cons�rcio Taizai!");
		maria.calcularParcela(0.7, 1500.0);
		maria.solicitarSeguro(maria.getPrimeiroNome());
		
	}
}
