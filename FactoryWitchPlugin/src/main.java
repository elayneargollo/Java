import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Scanner;

import Interfaces.ICadeira;
import Interfaces.IFactory;
import Interfaces.IMesa;
import Interfaces.ISofa;


public class main {

	/*public static void main(String[] args) {
		
		IFactory factory = new VitorianoFactory();
		createProduct(factory);
		
		IFactory factoryM = new ModernoFactory();
		createProduct(factoryM);
		
		IFactory factoryA = new ArtDecoFactory();
		createProduct(factoryA);

	}*/
	
	 public static void main(String []args) throws Exception 
	  {
	    int op;
	    do
	    {
	      File currentDir = new File("./plugins");
	      String []plugins = currentDir.list();
	      int i;
	      URL[] jars = new URL[plugins.length];
	      for (i = 0; i < plugins.length; i++)
	      {
		System.out.println(i+1 + " - " + plugins[i].split("\\.")[0]);
		jars[i] = (new File("./plugins/" + plugins[i])).toURL();
	      }
	      URLClassLoader ulc = new URLClassLoader(jars);
	      System.out.println(i+1 + " - Plugin refresh");
	      System.out.println("Escolha sua opção ou 0 para sair: ");
	      Scanner sc = new Scanner(System.in);
	      op = sc.nextInt();
	      if (op != 0 && op != i+1)
	      {
		String factoryName = plugins[op-1].split("\\.")[0];		
		IFactory factory = (IFactory) Class.forName(factoryName.toLowerCase() + "." + factoryName, true, ulc).newInstance();
		createProduct(factory);
	     }
	    } while (op != 0);
	  }

	
	public static void createProduct(IFactory factory) {
		
		ICadeira cadeira = factory.createCadeira();
		cadeira.montarCadeira();
		IMesa mesa = factory.createMesa();
		mesa.montarMesa();
		ISofa sofa = factory.createSofa();
		sofa.montarSofa();

	}

}
