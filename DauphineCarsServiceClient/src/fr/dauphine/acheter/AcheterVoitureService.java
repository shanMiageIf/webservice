/**
 * AcheterVoitureService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.dauphine.acheter;

public interface AcheterVoitureService extends javax.xml.rpc.Service {
    public java.lang.String getAcheterVoitureAddress();

    public fr.dauphine.acheter.AcheterVoiture getAcheterVoiture() throws javax.xml.rpc.ServiceException;

    public fr.dauphine.acheter.AcheterVoiture getAcheterVoiture(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
