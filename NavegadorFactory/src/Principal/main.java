package Principal;

import FabricaConcreta.ChromeFactory;
import FabricaConcreta.FirefoxFactory;

public class main {

	public static void main(String[] args) {
		
		INavegadorFactory fabrica = new ChromeFactory();
		
		Cliente cliente = new Cliente(fabrica);
		cliente.executar();
		
		INavegadorFactory fabrica2 = new FirefoxFactory();
		
		Cliente cliente2 = new Cliente(fabrica2);
		cliente2.executar();
	}

}

// primeiro a fabrica, depois a fabricaconcreta, depois produtosabstros e por ultimo os rodutos concretos
