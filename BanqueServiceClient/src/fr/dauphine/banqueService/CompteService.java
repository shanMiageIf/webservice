/**
 * CompteService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.dauphine.banqueService;

public interface CompteService extends java.rmi.Remote {
    public void addMoney(double money) throws java.rmi.RemoteException;
    public double retraitMoney(double money) throws java.rmi.RemoteException;
    public double getMoney() throws java.rmi.RemoteException;
}
