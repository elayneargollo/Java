package artdecofactory;
import interfaces.ICadeira;
import interfaces.IFactory;
import interfaces.IMesa;
import interfaces.ISofa;

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
