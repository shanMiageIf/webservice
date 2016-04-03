/**
 * AddVoiture.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.dauphine.add;

public interface AddVoiture extends java.rmi.Remote {
    public java.lang.Object[] getPanier() throws java.rmi.RemoteException;
    public void addToPanier(java.lang.String name, long id) throws java.rmi.RemoteException;
}
