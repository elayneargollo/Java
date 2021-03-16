package FabricaConcreta;

import Principal.INavegadorFactory;
import ProdutoAbstrato.ICookies;
import ProdutoAbstrato.IMenu;
import ProdutoConcreto.CookiesChrome;
import ProdutoConcreto.MenuChrome;

public class ChromeFactory implements INavegadorFactory{ // esse carinha seria a classe concreta ;) é eles que vai fazer as paradas .. concretFactory

	@Override
	public ICookies createCookies() {
		return new CookiesChrome();
	}

	@Override
	public IMenu createMenu() {
		return new MenuChrome();
	}

}
