/**
 * IVerificationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IVerificationService extends java.rmi.Remote {
    public java.lang.String verifyDCRGraph(java.lang.String dcrgraphXml) throws java.rmi.RemoteException;
    public java.lang.String verifyProperty(java.lang.String dcrgraphXml, java.lang.String propertyXml) throws java.rmi.RemoteException;
    public java.lang.String verify(java.lang.String dcrgraphXml, java.lang.String propertyXml, org.datacontract.schemas._2004._07.ITU_DK_DCRS_CommonTypes_Verification.VerificationSettings generationSettings) throws java.rmi.RemoteException;
}
