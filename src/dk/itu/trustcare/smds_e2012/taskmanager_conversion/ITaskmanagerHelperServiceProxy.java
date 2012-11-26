package dk.itu.trustcare.smds_e2012.taskmanager_conversion;

public class ITaskmanagerHelperServiceProxy implements dk.itu.trustcare.smds_e2012.taskmanager_conversion.ITaskmanagerHelperService {
  private String _endpoint = null;
  private dk.itu.trustcare.smds_e2012.taskmanager_conversion.ITaskmanagerHelperService iTaskmanagerHelperService = null;
  
  public ITaskmanagerHelperServiceProxy() {
    _initITaskmanagerHelperServiceProxy();
  }
  
  public ITaskmanagerHelperServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initITaskmanagerHelperServiceProxy();
  }
  
  private void _initITaskmanagerHelperServiceProxy() {
    try {
      iTaskmanagerHelperService = (new org.tempuri.TaskmanagerHelperServiceLocator()).getBasicHttpBinding_ITaskmanagerHelperService();
      if (iTaskmanagerHelperService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iTaskmanagerHelperService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iTaskmanagerHelperService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iTaskmanagerHelperService != null)
      ((javax.xml.rpc.Stub)iTaskmanagerHelperService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public dk.itu.trustcare.smds_e2012.taskmanager_conversion.ITaskmanagerHelperService getITaskmanagerHelperService() {
    if (iTaskmanagerHelperService == null)
      _initITaskmanagerHelperServiceProxy();
    return iTaskmanagerHelperService;
  }
  
  public java.lang.String taskmanagerXmlToDCRGXml(java.lang.String taskmanagerXml) throws java.rmi.RemoteException{
    if (iTaskmanagerHelperService == null)
      _initITaskmanagerHelperServiceProxy();
    return iTaskmanagerHelperService.taskmanagerXmlToDCRGXml(taskmanagerXml);
  }
  
  
}