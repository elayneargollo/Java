package Principal;
import ProdutoAbstrato.ICookies;
import ProdutoAbstrato.IMenu;

public interface INavegadorFactory {  // minha fabrica =) é um abstractFactory ;)
	public abstract ICookies createCookies();
	public abstract IMenu createMenu();
}
