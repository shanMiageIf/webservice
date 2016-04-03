package fr.dauphine.EuroToDollar;

public class EuroToDollarProxy implements fr.dauphine.EuroToDollar.EuroToDollar {
  private String _endpoint = null;
  private fr.dauphine.EuroToDollar.EuroToDollar euroToDollar = null;
  
  public EuroToDollarProxy() {
    _initEuroToDollarProxy();
  }
  
  public EuroToDollarProxy(String endpoint) {
    _endpoint = endpoint;
    _initEuroToDollarProxy();
  }
  
  private void _initEuroToDollarProxy() {
    try {
      euroToDollar = (new fr.dauphine.EuroToDollar.EuroToDollarServiceLocator()).getEuroToDollar();
      if (euroToDollar != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)euroToDollar)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)euroToDollar)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (euroToDollar != null)
      ((javax.xml.rpc.Stub)euroToDollar)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.dauphine.EuroToDollar.EuroToDollar getEuroToDollar() {
    if (euroToDollar == null)
      _initEuroToDollarProxy();
    return euroToDollar;
  }
  
  
}