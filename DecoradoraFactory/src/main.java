import FactoryArtDeco.ArtDecoFactory;
import FactoryModerna.ModernoFactory;
import FactoryVitoriano.VitorianoFactory;
import Interfaces.ICadeira;
import Interfaces.IFactory;
import Interfaces.IMesa;
import Interfaces.ISofa;

public class main {

	public static void main(String[] args) {
		
		IFactory factory = new VitorianoFactory();
		createProduct(factory);
		
		IFactory factoryM = new ModernoFactory();
		createProduct(factoryM);
		
		IFactory factoryA = new ArtDecoFactory();
		createProduct(factoryA);

	}
	
	public static void createProduct(IFactory factory) {
		
		ICadeira cadeira = factory.createCadeira();
		cadeira.montarCadeira();
		IMesa mesa = factory.createMesa();
		mesa.montarMesa();
		ISofa sofa = factory.createSofa();
		sofa.montarSofa();
		
	}

}
