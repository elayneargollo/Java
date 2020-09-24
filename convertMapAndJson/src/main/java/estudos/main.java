package estudos;

import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gson.Gson;

public class main {

	public static void main(String[] args) {

		Map<Object, Object> from = new LinkedHashMap<Object, Object>();
		from.put("from", 0);
		from.put("size", 1);

		Map<Object, Object> campos = new LinkedHashMap<Object, Object>();
		campos.put("xtr", "0");

		Map<Object, Object> match = new LinkedHashMap<Object, Object>();
		match.put("match", campos);

		Map<Object, Object> mapping = new LinkedHashMap<Object, Object>();
		mapping.put("query", match);

		Map<Object, Object> total = new LinkedHashMap<Object, Object>();
		total.putAll(from);
		total.putAll(mapping);

		Gson gson = new Gson();
		String json = gson.toJson(total);

		System.out.println(json);

	}

}
