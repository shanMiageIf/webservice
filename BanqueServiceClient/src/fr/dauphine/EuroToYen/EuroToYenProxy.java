package fr.dauphine.EuroToYen;

public class EuroToYenProxy implements fr.dauphine.EuroToYen.EuroToYen {
  private String _endpoint = null;
  private fr.dauphine.EuroToYen.EuroToYen euroToYen = null;
  
  public EuroToYenProxy() {
    _initEuroToYenProxy();
  }
  
  public EuroToYenProxy(String endpoint) {
    _endpoint = endpoint;
    _initEuroToYenProxy();
  }
  
  private void _initEuroToYenProxy() {
    try {
      euroToYen = (new fr.dauphine.EuroToYen.EuroToYenServiceLocator()).getEuroToYen();
      if (euroToYen != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)euroToYen)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)euroToYen)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (euroToYen != null)
      ((javax.xml.rpc.Stub)euroToYen)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.dauphine.EuroToYen.EuroToYen getEuroToYen() {
    if (euroToYen == null)
      _initEuroToYenProxy();
    return euroToYen;
  }
  
  public double getEuroToYen(double montant) throws java.rmi.RemoteException{
    if (euroToYen == null)
      _initEuroToYenProxy();
    return euroToYen.getEuroToYen(montant);
  }
  
  
}