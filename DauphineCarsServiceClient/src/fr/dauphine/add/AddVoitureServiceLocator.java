/**
 * AddVoitureServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.dauphine.add;

public class AddVoitureServiceLocator extends org.apache.axis.client.Service implements fr.dauphine.add.AddVoitureService {

    public AddVoitureServiceLocator() {
    }


    public AddVoitureServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddVoitureServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for addVoiture
    private java.lang.String addVoiture_address = "http://localhost:8080/DauphineCarsService/services/addVoiture";

    public java.lang.String getaddVoitureAddress() {
        return addVoiture_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String addVoitureWSDDServiceName = "addVoiture";

    public java.lang.String getaddVoitureWSDDServiceName() {
        return addVoitureWSDDServiceName;
    }

    public void setaddVoitureWSDDServiceName(java.lang.String name) {
        addVoitureWSDDServiceName = name;
    }

    public fr.dauphine.add.AddVoiture getaddVoiture() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(addVoiture_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getaddVoiture(endpoint);
    }

    public fr.dauphine.add.AddVoiture getaddVoiture(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fr.dauphine.add.AddVoitureSoapBindingStub _stub = new fr.dauphine.add.AddVoitureSoapBindingStub(portAddress, this);
            _stub.setPortName(getaddVoitureWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setaddVoitureEndpointAddress(java.lang.String address) {
        addVoiture_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fr.dauphine.add.AddVoiture.class.isAssignableFrom(serviceEndpointInterface)) {
                fr.dauphine.add.AddVoitureSoapBindingStub _stub = new fr.dauphine.add.AddVoitureSoapBindingStub(new java.net.URL(addVoiture_address), this);
                _stub.setPortName(getaddVoitureWSDDServiceName());
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
        if ("addVoiture".equals(inputPortName)) {
            return getaddVoiture();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://add.dauphine.fr", "addVoitureService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://add.dauphine.fr", "addVoiture"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("addVoiture".equals(portName)) {
            setaddVoitureEndpointAddress(address);
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
