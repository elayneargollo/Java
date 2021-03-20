package artdecofactory;
import Interfaces.ICadeira;
import Interfaces.IFactory;
import Interfaces.IMesa;
import Interfaces.ISofa;

public class ArtDecoFactory implements IFactory {

	@Override
	public ICadeira createCadeira() {
		return new CadeiraArtDeco();
	}

	@Override
	public IMesa createMesa() {
		return new MesaArtDeco();
	}

	@Override
	public ISofa createSofa() {
		return new SofaArtDeco();
	}

}
