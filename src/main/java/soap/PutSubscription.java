package soap;

import java.util.HashMap;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class PutSubscription extends AbstractTransformer {
	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		return adapt((Object[]) src);
	}
	
	public HashMap<String, String> adapt(Object[] src) {
		HashMap<String, String> result = new HashMap<String,String>();
		result.put("email", src[0].toString());
		result.put("course", src[1].toString());
		return result;
	}
}