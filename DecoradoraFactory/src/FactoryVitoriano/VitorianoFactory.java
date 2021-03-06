package FactoryVitoriano;
import Interfaces.ICadeira;
import Interfaces.IFactory;
import Interfaces.IMesa;
import Interfaces.ISofa;

public class VitorianoFactory implements IFactory{

	@Override
	public ICadeira createCadeira() {
		return new CadeiraVitoriano();
	}

	@Override
	public IMesa createMesa() {
		return new MesaVitoriano();
	}

	@Override
	public ISofa createSofa() {
		return new SofaVitoriano();
	}

}
