/**
 * TaskmanagerHelperServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class TaskmanagerHelperServiceLocator extends org.apache.axis.client.Service implements org.tempuri.TaskmanagerHelperService {

    public TaskmanagerHelperServiceLocator() {
    }


    public TaskmanagerHelperServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TaskmanagerHelperServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_ITaskmanagerHelperService
    private java.lang.String BasicHttpBinding_ITaskmanagerHelperService_address = "http://trustcare.itu.dk/DCRGraphVerificationServices/TaskmanagerHelperService.svc/DCRGraphVerificationServices/TaskmanagerHelperService.svc";

    public java.lang.String getBasicHttpBinding_ITaskmanagerHelperServiceAddress() {
        return BasicHttpBinding_ITaskmanagerHelperService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_ITaskmanagerHelperServiceWSDDServiceName = "BasicHttpBinding_ITaskmanagerHelperService";

    public java.lang.String getBasicHttpBinding_ITaskmanagerHelperServiceWSDDServiceName() {
        return BasicHttpBinding_ITaskmanagerHelperServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_ITaskmanagerHelperServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_ITaskmanagerHelperServiceWSDDServiceName = name;
    }

    public dk.itu.trustcare.smds_e2012.taskmanager_conversion.ITaskmanagerHelperService getBasicHttpBinding_ITaskmanagerHelperService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_ITaskmanagerHelperService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_ITaskmanagerHelperService(endpoint);
    }

    public dk.itu.trustcare.smds_e2012.taskmanager_conversion.ITaskmanagerHelperService getBasicHttpBinding_ITaskmanagerHelperService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.BasicHttpBinding_ITaskmanagerHelperServiceStub _stub = new org.tempuri.BasicHttpBinding_ITaskmanagerHelperServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_ITaskmanagerHelperServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_ITaskmanagerHelperServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_ITaskmanagerHelperService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (dk.itu.trustcare.smds_e2012.taskmanager_conversion.ITaskmanagerHelperService.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.BasicHttpBinding_ITaskmanagerHelperServiceStub _stub = new org.tempuri.BasicHttpBinding_ITaskmanagerHelperServiceStub(new java.net.URL(BasicHttpBinding_ITaskmanagerHelperService_address), this);
                _stub.setPortName(getBasicHttpBinding_ITaskmanagerHelperServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_ITaskmanagerHelperService".equals(inputPortName)) {
            return getBasicHttpBinding_ITaskmanagerHelperService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "TaskmanagerHelperService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_ITaskmanagerHelperService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_ITaskmanagerHelperService".equals(portName)) {
            setBasicHttpBinding_ITaskmanagerHelperServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
