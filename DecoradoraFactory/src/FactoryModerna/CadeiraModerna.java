package FactoryModerna;
import Interfaces.ICadeira;

public class CadeiraModerna implements ICadeira{

	@Override
	public void montarCadeira() {
		System.out.println("Cadeira Moderna  ;)");
	}

}
