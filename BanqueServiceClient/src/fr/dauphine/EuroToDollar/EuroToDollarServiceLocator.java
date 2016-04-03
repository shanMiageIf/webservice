/**
 * EuroToDollarServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.dauphine.EuroToDollar;

public class EuroToDollarServiceLocator extends org.apache.axis.client.Service implements fr.dauphine.EuroToDollar.EuroToDollarService {

    public EuroToDollarServiceLocator() {
    }


    public EuroToDollarServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EuroToDollarServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EuroToDollar
    private java.lang.String EuroToDollar_address = "http://localhost:8080/BanqueService/services/EuroToDollar";

    public java.lang.String getEuroToDollarAddress() {
        return EuroToDollar_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EuroToDollarWSDDServiceName = "EuroToDollar";

    public java.lang.String getEuroToDollarWSDDServiceName() {
        return EuroToDollarWSDDServiceName;
    }

    public void setEuroToDollarWSDDServiceName(java.lang.String name) {
        EuroToDollarWSDDServiceName = name;
    }

    public fr.dauphine.EuroToDollar.EuroToDollar getEuroToDollar() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EuroToDollar_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEuroToDollar(endpoint);
    }

    public fr.dauphine.EuroToDollar.EuroToDollar getEuroToDollar(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fr.dauphine.EuroToDollar.EuroToDollarSoapBindingStub _stub = new fr.dauphine.EuroToDollar.EuroToDollarSoapBindingStub(portAddress, this);
            _stub.setPortName(getEuroToDollarWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEuroToDollarEndpointAddress(java.lang.String address) {
        EuroToDollar_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fr.dauphine.EuroToDollar.EuroToDollar.class.isAssignableFrom(serviceEndpointInterface)) {
                fr.dauphine.EuroToDollar.EuroToDollarSoapBindingStub _stub = new fr.dauphine.EuroToDollar.EuroToDollarSoapBindingStub(new java.net.URL(EuroToDollar_address), this);
                _stub.setPortName(getEuroToDollarWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EuroToDollar".equals(inputPortName)) {
            return getEuroToDollar();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://EuroToDollar.dauphine.fr", "EuroToDollarService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://EuroToDollar.dauphine.fr", "EuroToDollar"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EuroToDollar".equals(portName)) {
            setEuroToDollarEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
