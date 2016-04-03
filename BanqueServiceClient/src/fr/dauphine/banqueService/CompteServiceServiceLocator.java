/**
 * CompteServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.dauphine.banqueService;

public class CompteServiceServiceLocator extends org.apache.axis.client.Service implements fr.dauphine.banqueService.CompteServiceService {

    public CompteServiceServiceLocator() {
    }


    public CompteServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CompteServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CompteService
    private java.lang.String CompteService_address = "http://localhost:8080/BanqueService/services/CompteService";

    public java.lang.String getCompteServiceAddress() {
        return CompteService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CompteServiceWSDDServiceName = "CompteService";

    public java.lang.String getCompteServiceWSDDServiceName() {
        return CompteServiceWSDDServiceName;
    }

    public void setCompteServiceWSDDServiceName(java.lang.String name) {
        CompteServiceWSDDServiceName = name;
    }

    public fr.dauphine.banqueService.CompteService getCompteService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CompteService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCompteService(endpoint);
    }

    public fr.dauphine.banqueService.CompteService getCompteService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fr.dauphine.banqueService.CompteServiceSoapBindingStub _stub = new fr.dauphine.banqueService.CompteServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCompteServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCompteServiceEndpointAddress(java.lang.String address) {
        CompteService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fr.dauphine.banqueService.CompteService.class.isAssignableFrom(serviceEndpointInterface)) {
                fr.dauphine.banqueService.CompteServiceSoapBindingStub _stub = new fr.dauphine.banqueService.CompteServiceSoapBindingStub(new java.net.URL(CompteService_address), this);
                _stub.setPortName(getCompteServiceWSDDServiceName());
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
        if ("CompteService".equals(inputPortName)) {
            return getCompteService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://banqueService.dauphine.fr", "CompteServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://banqueService.dauphine.fr", "CompteService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CompteService".equals(portName)) {
            setCompteServiceEndpointAddress(address);
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
