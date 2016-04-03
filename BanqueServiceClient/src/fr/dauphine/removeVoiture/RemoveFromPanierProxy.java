package fr.dauphine.removeVoiture;

public class RemoveFromPanierProxy implements fr.dauphine.removeVoiture.RemoveFromPanier {
  private String _endpoint = null;
  private fr.dauphine.removeVoiture.RemoveFromPanier removeFromPanier = null;
  
  public RemoveFromPanierProxy() {
    _initRemoveFromPanierProxy();
  }
  
  public RemoveFromPanierProxy(String endpoint) {
    _endpoint = endpoint;
    _initRemoveFromPanierProxy();
  }
  
  private void _initRemoveFromPanierProxy() {
    try {
      removeFromPanier = (new fr.dauphine.removeVoiture.RemoveFromPanierServiceLocator()).getRemoveFromPanier();
      if (removeFromPanier != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)removeFromPanier)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)removeFromPanier)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (removeFromPanier != null)
      ((javax.xml.rpc.Stub)removeFromPanier)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.dauphine.removeVoiture.RemoveFromPanier getRemoveFromPanier() {
    if (removeFromPanier == null)
      _initRemoveFromPanierProxy();
    return removeFromPanier;
  }
  
  public void removeVoiture(java.lang.String name, long id) throws java.rmi.RemoteException{
    if (removeFromPanier == null)
      _initRemoveFromPanierProxy();
    removeFromPanier.removeVoiture(name, id);
  }
  
  
}