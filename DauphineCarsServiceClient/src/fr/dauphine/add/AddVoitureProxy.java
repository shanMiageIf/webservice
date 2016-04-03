package fr.dauphine.add;

public class AddVoitureProxy implements fr.dauphine.add.AddVoiture {
  private String _endpoint = null;
  private fr.dauphine.add.AddVoiture addVoiture = null;
  
  public AddVoitureProxy() {
    _initAddVoitureProxy();
  }
  
  public AddVoitureProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddVoitureProxy();
  }
  
  private void _initAddVoitureProxy() {
    try {
      addVoiture = (new fr.dauphine.add.AddVoitureServiceLocator()).getaddVoiture();
      if (addVoiture != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addVoiture)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addVoiture)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addVoiture != null)
      ((javax.xml.rpc.Stub)addVoiture)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.dauphine.add.AddVoiture getAddVoiture() {
    if (addVoiture == null)
      _initAddVoitureProxy();
    return addVoiture;
  }
  
  public java.lang.Object[] getPanier() throws java.rmi.RemoteException{
    if (addVoiture == null)
      _initAddVoitureProxy();
    return addVoiture.getPanier();
  }
  
  public void addToPanier(java.lang.String name, long id) throws java.rmi.RemoteException{
    if (addVoiture == null)
      _initAddVoitureProxy();
    addVoiture.addToPanier(name, id);
  }
  
  
}