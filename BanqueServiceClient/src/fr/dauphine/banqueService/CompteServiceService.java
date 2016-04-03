/**
 * CompteServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.dauphine.banqueService;

public interface CompteServiceService extends javax.xml.rpc.Service {
    public java.lang.String getCompteServiceAddress();

    public fr.dauphine.banqueService.CompteService getCompteService() throws javax.xml.rpc.ServiceException;

    public fr.dauphine.banqueService.CompteService getCompteService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
