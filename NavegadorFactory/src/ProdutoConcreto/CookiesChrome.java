package ProdutoConcreto;

import ProdutoAbstrato.ICookies;
import ProdutoAbstrato.IMenu;

public class CookiesChrome implements ICookies { // esse carinha é meu produto concreto ;) ... productConcret

	@Override
	public ICookies createCookies() {
		return new CookiesChrome();
	}

	@Override
	public void interagir(IMenu menu) {
		 System.out.println(this.getClass().getName() + " interage com " + menu.getClass().getName());
	}

}

