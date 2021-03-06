package FactoryModerna;
import Interfaces.ICadeira;
import Interfaces.IFactory;
import Interfaces.IMesa;
import Interfaces.ISofa;

public class ModernoFactory implements IFactory{

	@Override
	public ICadeira createCadeira() {
		return new CadeiraModerna();
	}

	@Override
	public IMesa createMesa() {
		return new MesaModerna();
	}

	@Override
	public ISofa createSofa() {
		return new SofaModerna();
	}

}
