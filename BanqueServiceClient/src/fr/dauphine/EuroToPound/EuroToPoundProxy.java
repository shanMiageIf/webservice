package fr.dauphine.EuroToPound;

public class EuroToPoundProxy implements fr.dauphine.EuroToPound.EuroToPound {
  private String _endpoint = null;
  private fr.dauphine.EuroToPound.EuroToPound euroToPound = null;
  
  public EuroToPoundProxy() {
    _initEuroToPoundProxy();
  }
  
  public EuroToPoundProxy(String endpoint) {
    _endpoint = endpoint;
    _initEuroToPoundProxy();
  }
  
  private void _initEuroToPoundProxy() {
    try {
      euroToPound = (new fr.dauphine.EuroToPound.EuroToPoundServiceLocator()).getEuroToPound();
      if (euroToPound != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)euroToPound)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)euroToPound)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (euroToPound != null)
      ((javax.xml.rpc.Stub)euroToPound)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.dauphine.EuroToPound.EuroToPound getEuroToPound() {
    if (euroToPound == null)
      _initEuroToPoundProxy();
    return euroToPound;
  }
  
  public double getEuroToPound(double montant) throws java.rmi.RemoteException{
    if (euroToPound == null)
      _initEuroToPoundProxy();
    return euroToPound.getEuroToPound(montant);
  }
  
  
}