
package artifact_list;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ListSubscriptions", targetNamespace = "http://soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ListSubscriptions {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getList", targetNamespace = "http://soap/", className = "artifact_list.GetList")
    @ResponseWrapper(localName = "getListResponse", targetNamespace = "http://soap/", className = "artifact_list.GetListResponse")
    public String getList();

}
