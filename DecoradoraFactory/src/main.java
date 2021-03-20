

public class main {

	public static void main(String[] args) {
		
		IFactory factory = new ModernoFActory();
		Cliente cliente = new Cliente(factory);
		cliente.execute();

	}

}
