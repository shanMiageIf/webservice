package fr.dauphine.findVoiture;

public class FindVoitureProxy implements fr.dauphine.findVoiture.FindVoiture {
  private String _endpoint = null;
  private fr.dauphine.findVoiture.FindVoiture findVoiture = null;
  
  public FindVoitureProxy() {
    _initFindVoitureProxy();
  }
  
  public FindVoitureProxy(String endpoint) {
    _endpoint = endpoint;
    _initFindVoitureProxy();
  }
  
  private void _initFindVoitureProxy() {
    try {
      findVoiture = (new fr.dauphine.findVoiture.FindVoitureServiceLocator()).getFindVoiture();
      if (findVoiture != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)findVoiture)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)findVoiture)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (findVoiture != null)
      ((javax.xml.rpc.Stub)findVoiture)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.dauphine.findVoiture.FindVoiture getFindVoiture() {
    if (findVoiture == null)
      _initFindVoitureProxy();
    return findVoiture;
  }
  
  public java.lang.Object[] findVoitureByName(java.lang.String name) throws java.rmi.RemoteException{
    if (findVoiture == null)
      _initFindVoitureProxy();
    return findVoiture.findVoitureByName(name);
  }
  
  
}