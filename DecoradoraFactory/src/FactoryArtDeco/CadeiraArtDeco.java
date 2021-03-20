package FactoryArtDeco;
import Interfaces.ICadeira;

public class CadeiraArtDeco implements ICadeira {

	@Override
	public void montarCadeira() {
		System.out.println("Cadeira ArtDeco =)");
	}

}
