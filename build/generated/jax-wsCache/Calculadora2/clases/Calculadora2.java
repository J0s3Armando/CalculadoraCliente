
package clases;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Calculadora2", targetNamespace = "http://clases/", wsdlLocation = "http://localhost:8085/axis2/services/Calculadora2?wsdl")
public class Calculadora2
    extends Service
{

    private final static URL CALCULADORA2_WSDL_LOCATION;
    private final static WebServiceException CALCULADORA2_EXCEPTION;
    private final static QName CALCULADORA2_QNAME = new QName("http://clases/", "Calculadora2");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8085/axis2/services/Calculadora2?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULADORA2_WSDL_LOCATION = url;
        CALCULADORA2_EXCEPTION = e;
    }

    public Calculadora2() {
        super(__getWsdlLocation(), CALCULADORA2_QNAME);
    }

    public Calculadora2(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULADORA2_QNAME, features);
    }

    public Calculadora2(URL wsdlLocation) {
        super(wsdlLocation, CALCULADORA2_QNAME);
    }

    public Calculadora2(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULADORA2_QNAME, features);
    }

    public Calculadora2(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Calculadora2(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Calculadora2PortType
     */
    @WebEndpoint(name = "Calculadora2SOAP11port_http")
    public Calculadora2PortType getCalculadora2SOAP11PortHttp() {
        return super.getPort(new QName("http://clases/", "Calculadora2SOAP11port_http"), Calculadora2PortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Calculadora2PortType
     */
    @WebEndpoint(name = "Calculadora2SOAP11port_http")
    public Calculadora2PortType getCalculadora2SOAP11PortHttp(WebServiceFeature... features) {
        return super.getPort(new QName("http://clases/", "Calculadora2SOAP11port_http"), Calculadora2PortType.class, features);
    }

    /**
     * 
     * @return
     *     returns Calculadora2PortType
     */
    @WebEndpoint(name = "Calculadora2SOAP12port_http")
    public Calculadora2PortType getCalculadora2SOAP12PortHttp() {
        return super.getPort(new QName("http://clases/", "Calculadora2SOAP12port_http"), Calculadora2PortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Calculadora2PortType
     */
    @WebEndpoint(name = "Calculadora2SOAP12port_http")
    public Calculadora2PortType getCalculadora2SOAP12PortHttp(WebServiceFeature... features) {
        return super.getPort(new QName("http://clases/", "Calculadora2SOAP12port_http"), Calculadora2PortType.class, features);
    }

    /**
     * 
     * @return
     *     returns Calculadora2PortType
     */
    @WebEndpoint(name = "Calculadora2Httpport")
    public Calculadora2PortType getCalculadora2Httpport() {
        return super.getPort(new QName("http://clases/", "Calculadora2Httpport"), Calculadora2PortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Calculadora2PortType
     */
    @WebEndpoint(name = "Calculadora2Httpport")
    public Calculadora2PortType getCalculadora2Httpport(WebServiceFeature... features) {
        return super.getPort(new QName("http://clases/", "Calculadora2Httpport"), Calculadora2PortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULADORA2_EXCEPTION!= null) {
            throw CALCULADORA2_EXCEPTION;
        }
        return CALCULADORA2_WSDL_LOCATION;
    }

}
