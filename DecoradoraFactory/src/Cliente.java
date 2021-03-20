
public class Cliente {

	private ICadeira cadeira;
	private IMesa mesa;
	private ISofa sofa;

	public Cliente(IFactory fabrica) {
		cadeira = fabrica.createCadeira();
		mesa = fabrica.createMesa();
		sofa = fabrica.createSofa();
	}

	void execute() {
		cadeira.montarCadeira();
		mesa.montarMesa();
		sofa.montarSofa();
	}

}
