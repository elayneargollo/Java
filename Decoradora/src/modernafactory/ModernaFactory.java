package modernafactory;
import interfaces.ICadeira;
import interfaces.IFactory;
import interfaces.IMesa;
import interfaces.ISofa;

public class ModernaFactory implements IFactory{

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
