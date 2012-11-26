package org.tempuri;

public class IVerificationServiceProxy implements org.tempuri.IVerificationService {
  private String _endpoint = null;
  private org.tempuri.IVerificationService iVerificationService = null;
  
  public IVerificationServiceProxy() {
    _initIVerificationServiceProxy();
  }
  
  public IVerificationServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIVerificationServiceProxy();
  }
  
  private void _initIVerificationServiceProxy() {
    try {
      iVerificationService = (new org.tempuri.VerificationServiceLocator()).getBasicHttpBinding_IVerificationService();
      if (iVerificationService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iVerificationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iVerificationService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iVerificationService != null)
      ((javax.xml.rpc.Stub)iVerificationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IVerificationService getIVerificationService() {
    if (iVerificationService == null)
      _initIVerificationServiceProxy();
    return iVerificationService;
  }
  
  public java.lang.String verifyDCRGraph(java.lang.String dcrgraphXml) throws java.rmi.RemoteException{
    if (iVerificationService == null)
      _initIVerificationServiceProxy();
    return iVerificationService.verifyDCRGraph(dcrgraphXml);
  }
  
  public java.lang.String verifyProperty(java.lang.String dcrgraphXml, java.lang.String propertyXml) throws java.rmi.RemoteException{
    if (iVerificationService == null)
      _initIVerificationServiceProxy();
    return iVerificationService.verifyProperty(dcrgraphXml, propertyXml);
  }
  
  public java.lang.String verify(java.lang.String dcrgraphXml, java.lang.String propertyXml, org.datacontract.schemas._2004._07.ITU_DK_DCRS_CommonTypes_Verification.VerificationSettings generationSettings) throws java.rmi.RemoteException{
    if (iVerificationService == null)
      _initIVerificationServiceProxy();
    return iVerificationService.verify(dcrgraphXml, propertyXml, generationSettings);
  }
  
  
}