/**
 * EuroToRmbServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.dauphine.EuroToRmb;

public class EuroToRmbServiceLocator extends org.apache.axis.client.Service implements fr.dauphine.EuroToRmb.EuroToRmbService {

    public EuroToRmbServiceLocator() {
    }


    public EuroToRmbServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EuroToRmbServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EuroToRmb
    private java.lang.String EuroToRmb_address = "http://localhost:8080/BanqueService/services/EuroToRmb";

    public java.lang.String getEuroToRmbAddress() {
        return EuroToRmb_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EuroToRmbWSDDServiceName = "EuroToRmb";

    public java.lang.String getEuroToRmbWSDDServiceName() {
        return EuroToRmbWSDDServiceName;
    }

    public void setEuroToRmbWSDDServiceName(java.lang.String name) {
        EuroToRmbWSDDServiceName = name;
    }

    public fr.dauphine.EuroToRmb.EuroToRmb getEuroToRmb() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EuroToRmb_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEuroToRmb(endpoint);
    }

    public fr.dauphine.EuroToRmb.EuroToRmb getEuroToRmb(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fr.dauphine.EuroToRmb.EuroToRmbSoapBindingStub _stub = new fr.dauphine.EuroToRmb.EuroToRmbSoapBindingStub(portAddress, this);
            _stub.setPortName(getEuroToRmbWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEuroToRmbEndpointAddress(java.lang.String address) {
        EuroToRmb_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fr.dauphine.EuroToRmb.EuroToRmb.class.isAssignableFrom(serviceEndpointInterface)) {
                fr.dauphine.EuroToRmb.EuroToRmbSoapBindingStub _stub = new fr.dauphine.EuroToRmb.EuroToRmbSoapBindingStub(new java.net.URL(EuroToRmb_address), this);
                _stub.setPortName(getEuroToRmbWSDDServiceName());
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
        if ("EuroToRmb".equals(inputPortName)) {
            return getEuroToRmb();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://EuroToRmb.dauphine.fr", "EuroToRmbService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://EuroToRmb.dauphine.fr", "EuroToRmb"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EuroToRmb".equals(portName)) {
            setEuroToRmbEndpointAddress(address);
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
