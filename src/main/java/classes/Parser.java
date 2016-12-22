package classes;

import org.codehaus.jettison.json.JSONArray;
import org.json.JSONObject;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class Parser extends AbstractTransformer{
	
	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		return makeParse(src);
	}
	
	public String makeParse(Object src){
		 String test = "{" + "\"lista\":" + (String)src + "}";	
		 String emails = "";
		
		 final JSONObject obj = new JSONObject(test);
	     final org.json.JSONArray geodata = obj.getJSONArray("lista");
	     final int n = geodata.length();
	     for (int i = 0; i < n; ++i) {
	      final JSONObject person = geodata.getJSONObject(i);
	      String email= person.getString("email");
	      
	      emails+="Email : " + " " + email+"\n";
	    }

		return emails;
	}
}