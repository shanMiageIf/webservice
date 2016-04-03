package fr.dauphine.EuroToRmb;

public class EuroToRmbProxy implements fr.dauphine.EuroToRmb.EuroToRmb {
  private String _endpoint = null;
  private fr.dauphine.EuroToRmb.EuroToRmb euroToRmb = null;
  
  public EuroToRmbProxy() {
    _initEuroToRmbProxy();
  }
  
  public EuroToRmbProxy(String endpoint) {
    _endpoint = endpoint;
    _initEuroToRmbProxy();
  }
  
  private void _initEuroToRmbProxy() {
    try {
      euroToRmb = (new fr.dauphine.EuroToRmb.EuroToRmbServiceLocator()).getEuroToRmb();
      if (euroToRmb != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)euroToRmb)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)euroToRmb)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (euroToRmb != null)
      ((javax.xml.rpc.Stub)euroToRmb)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.dauphine.EuroToRmb.EuroToRmb getEuroToRmb() {
    if (euroToRmb == null)
      _initEuroToRmbProxy();
    return euroToRmb;
  }
  
  public double getEuroToDollar(double montant) throws java.rmi.RemoteException{
    if (euroToRmb == null)
      _initEuroToRmbProxy();
    return euroToRmb.getEuroToDollar(montant);
  }
  
  
}