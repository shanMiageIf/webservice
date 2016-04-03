/**
 * RemoveFromPanierServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.dauphine.removeVoiture;

public class RemoveFromPanierServiceLocator extends org.apache.axis.client.Service implements fr.dauphine.removeVoiture.RemoveFromPanierService {

    public RemoveFromPanierServiceLocator() {
    }


    public RemoveFromPanierServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RemoveFromPanierServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RemoveFromPanier
    private java.lang.String RemoveFromPanier_address = "http://localhost:8080/BanqueService/services/RemoveFromPanier";

    public java.lang.String getRemoveFromPanierAddress() {
        return RemoveFromPanier_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RemoveFromPanierWSDDServiceName = "RemoveFromPanier";

    public java.lang.String getRemoveFromPanierWSDDServiceName() {
        return RemoveFromPanierWSDDServiceName;
    }

    public void setRemoveFromPanierWSDDServiceName(java.lang.String name) {
        RemoveFromPanierWSDDServiceName = name;
    }

    public fr.dauphine.removeVoiture.RemoveFromPanier getRemoveFromPanier() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RemoveFromPanier_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRemoveFromPanier(endpoint);
    }

    public fr.dauphine.removeVoiture.RemoveFromPanier getRemoveFromPanier(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fr.dauphine.removeVoiture.RemoveFromPanierSoapBindingStub _stub = new fr.dauphine.removeVoiture.RemoveFromPanierSoapBindingStub(portAddress, this);
            _stub.setPortName(getRemoveFromPanierWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRemoveFromPanierEndpointAddress(java.lang.String address) {
        RemoveFromPanier_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fr.dauphine.removeVoiture.RemoveFromPanier.class.isAssignableFrom(serviceEndpointInterface)) {
                fr.dauphine.removeVoiture.RemoveFromPanierSoapBindingStub _stub = new fr.dauphine.removeVoiture.RemoveFromPanierSoapBindingStub(new java.net.URL(RemoveFromPanier_address), this);
                _stub.setPortName(getRemoveFromPanierWSDDServiceName());
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
        if ("RemoveFromPanier".equals(inputPortName)) {
            return getRemoveFromPanier();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://removeVoiture.dauphine.fr", "RemoveFromPanierService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://removeVoiture.dauphine.fr", "RemoveFromPanier"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RemoveFromPanier".equals(portName)) {
            setRemoveFromPanierEndpointAddress(address);
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
