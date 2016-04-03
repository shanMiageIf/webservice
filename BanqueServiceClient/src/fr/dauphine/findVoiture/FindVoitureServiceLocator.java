/**
 * FindVoitureServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.dauphine.findVoiture;

public class FindVoitureServiceLocator extends org.apache.axis.client.Service implements fr.dauphine.findVoiture.FindVoitureService {

    public FindVoitureServiceLocator() {
    }


    public FindVoitureServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FindVoitureServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FindVoiture
    private java.lang.String FindVoiture_address = "http://localhost:8080/BanqueService/services/FindVoiture";

    public java.lang.String getFindVoitureAddress() {
        return FindVoiture_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FindVoitureWSDDServiceName = "FindVoiture";

    public java.lang.String getFindVoitureWSDDServiceName() {
        return FindVoitureWSDDServiceName;
    }

    public void setFindVoitureWSDDServiceName(java.lang.String name) {
        FindVoitureWSDDServiceName = name;
    }

    public fr.dauphine.findVoiture.FindVoiture getFindVoiture() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FindVoiture_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFindVoiture(endpoint);
    }

    public fr.dauphine.findVoiture.FindVoiture getFindVoiture(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fr.dauphine.findVoiture.FindVoitureSoapBindingStub _stub = new fr.dauphine.findVoiture.FindVoitureSoapBindingStub(portAddress, this);
            _stub.setPortName(getFindVoitureWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFindVoitureEndpointAddress(java.lang.String address) {
        FindVoiture_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fr.dauphine.findVoiture.FindVoiture.class.isAssignableFrom(serviceEndpointInterface)) {
                fr.dauphine.findVoiture.FindVoitureSoapBindingStub _stub = new fr.dauphine.findVoiture.FindVoitureSoapBindingStub(new java.net.URL(FindVoiture_address), this);
                _stub.setPortName(getFindVoitureWSDDServiceName());
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
        if ("FindVoiture".equals(inputPortName)) {
            return getFindVoiture();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://findVoiture.dauphine.fr", "FindVoitureService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://findVoiture.dauphine.fr", "FindVoiture"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FindVoiture".equals(portName)) {
            setFindVoitureEndpointAddress(address);
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
