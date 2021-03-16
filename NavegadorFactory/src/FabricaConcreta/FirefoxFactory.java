package FabricaConcreta;

import Principal.INavegadorFactory;
import ProdutoAbstrato.ICookies;
import ProdutoAbstrato.IMenu;
import ProdutoConcreto.CookiesFirefox;
import ProdutoConcreto.MenuFIrefox;

public class FirefoxFactory implements INavegadorFactory {  // esse carinha seria a classe concreta ;) é eles que vai fazer as paradas .. concretFactory1

	@Override
	public ICookies createCookies() {
		return new CookiesFirefox();
	}

	@Override
	public IMenu createMenu() {
		return new MenuFIrefox();
	}

}
