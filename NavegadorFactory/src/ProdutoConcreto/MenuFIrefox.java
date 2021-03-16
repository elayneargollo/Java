package ProdutoConcreto;

import ProdutoAbstrato.IMenu;

public class MenuFIrefox implements IMenu{ // esse carinha é meu produto concreto ;) ... productConcret

	@Override
	public IMenu createMenu() {
		return new MenuFIrefox();
	}

}
