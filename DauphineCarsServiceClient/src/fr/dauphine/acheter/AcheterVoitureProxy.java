package fr.dauphine.acheter;

public class AcheterVoitureProxy implements fr.dauphine.acheter.AcheterVoiture {
  private String _endpoint = null;
  private fr.dauphine.acheter.AcheterVoiture acheterVoiture = null;
  
  public AcheterVoitureProxy() {
    _initAcheterVoitureProxy();
  }
  
  public AcheterVoitureProxy(String endpoint) {
    _endpoint = endpoint;
    _initAcheterVoitureProxy();
  }
  
  private void _initAcheterVoitureProxy() {
    try {
      acheterVoiture = (new fr.dauphine.acheter.AcheterVoitureServiceLocator()).getAcheterVoiture();
      if (acheterVoiture != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)acheterVoiture)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)acheterVoiture)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (acheterVoiture != null)
      ((javax.xml.rpc.Stub)acheterVoiture)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.dauphine.acheter.AcheterVoiture getAcheterVoiture() {
    if (acheterVoiture == null)
      _initAcheterVoitureProxy();
    return acheterVoiture;
  }
  
  public void buyCars(long id, double prix) throws java.rmi.RemoteException{
    if (acheterVoiture == null)
      _initAcheterVoitureProxy();
    acheterVoiture.buyCars(id, prix);
  }
  
  
}