
public class ModernoFActory implements IFactory{

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
