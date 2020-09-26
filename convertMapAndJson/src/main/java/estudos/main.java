package estudos;

import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gson.Gson;

public class main {

	public static void main(String[] args) {

		String texto = convertMapInJson("CPF","000.000.000-00");
		
	}
	
	public static String convertMapInJson(String campo, Object valor) {
		
		Map<Object, Object> from = new LinkedHashMap<Object, Object>();
		from.put("from", 0);
		from.put("size", 1);

		Map<Object, Object> campos = new LinkedHashMap<Object, Object>();
		campos.put(campo, valor);

		Map<Object, Object> match = new LinkedHashMap<Object, Object>();
		match.put("match", campos);

		Map<Object, Object> mapping = new LinkedHashMap<Object, Object>();
		mapping.put("query", match);

		Map<Object, Object> total = new LinkedHashMap<Object, Object>();
		total.putAll(from);
		total.putAll(mapping);

		Gson gson = new Gson();

		return gson.toJson(total); 

	}

}
