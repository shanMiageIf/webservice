package fr.dauphine.banqueService;

public class CompteServiceProxy implements fr.dauphine.banqueService.CompteService {
  private String _endpoint = null;
  private fr.dauphine.banqueService.CompteService compteService = null;
  
  public CompteServiceProxy() {
    _initCompteServiceProxy();
  }
  
  public CompteServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCompteServiceProxy();
  }
  
  private void _initCompteServiceProxy() {
    try {
      compteService = (new fr.dauphine.banqueService.CompteServiceServiceLocator()).getCompteService();
      if (compteService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)compteService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)compteService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (compteService != null)
      ((javax.xml.rpc.Stub)compteService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.dauphine.banqueService.CompteService getCompteService() {
    if (compteService == null)
      _initCompteServiceProxy();
    return compteService;
  }
  
  public void addMoney(double money) throws java.rmi.RemoteException{
    if (compteService == null)
      _initCompteServiceProxy();
    compteService.addMoney(money);
  }
  
  public double retraitMoney(double money) throws java.rmi.RemoteException{
    if (compteService == null)
      _initCompteServiceProxy();
    return compteService.retraitMoney(money);
  }
  
  public double getMoney() throws java.rmi.RemoteException{
    if (compteService == null)
      _initCompteServiceProxy();
    return compteService.getMoney();
  }
  
  
}