package Principal;
import ProdutoAbstrato.ICookies;
import ProdutoAbstrato.IMenu;

public class Cliente {
	
	private IMenu menu;
	private ICookies cookies;
	
	public Cliente(INavegadorFactory fabrica)
	{
		menu = fabrica.createMenu();
		cookies = fabrica.createCookies();
	}
	
	void executar()
	{
		cookies.interagir(menu);
	}
	
}
