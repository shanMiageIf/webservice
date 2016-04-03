/**
 * EuroToYenServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.dauphine.EuroToYen;

public class EuroToYenServiceLocator extends org.apache.axis.client.Service implements fr.dauphine.EuroToYen.EuroToYenService {

    public EuroToYenServiceLocator() {
    }


    public EuroToYenServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EuroToYenServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EuroToYen
    private java.lang.String EuroToYen_address = "http://localhost:8080/BanqueService/services/EuroToYen";

    public java.lang.String getEuroToYenAddress() {
        return EuroToYen_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EuroToYenWSDDServiceName = "EuroToYen";

    public java.lang.String getEuroToYenWSDDServiceName() {
        return EuroToYenWSDDServiceName;
    }

    public void setEuroToYenWSDDServiceName(java.lang.String name) {
        EuroToYenWSDDServiceName = name;
    }

    public fr.dauphine.EuroToYen.EuroToYen getEuroToYen() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EuroToYen_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEuroToYen(endpoint);
    }

    public fr.dauphine.EuroToYen.EuroToYen getEuroToYen(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fr.dauphine.EuroToYen.EuroToYenSoapBindingStub _stub = new fr.dauphine.EuroToYen.EuroToYenSoapBindingStub(portAddress, this);
            _stub.setPortName(getEuroToYenWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEuroToYenEndpointAddress(java.lang.String address) {
        EuroToYen_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fr.dauphine.EuroToYen.EuroToYen.class.isAssignableFrom(serviceEndpointInterface)) {
                fr.dauphine.EuroToYen.EuroToYenSoapBindingStub _stub = new fr.dauphine.EuroToYen.EuroToYenSoapBindingStub(new java.net.URL(EuroToYen_address), this);
                _stub.setPortName(getEuroToYenWSDDServiceName());
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
        if ("EuroToYen".equals(inputPortName)) {
            return getEuroToYen();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://EuroToYen.dauphine.fr", "EuroToYenService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://EuroToYen.dauphine.fr", "EuroToYen"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EuroToYen".equals(portName)) {
            setEuroToYenEndpointAddress(address);
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
