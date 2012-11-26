/**
 * VerificationSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.ITU_DK_DCRS_CommonTypes_Verification;

public class VerificationSettings  implements java.io.Serializable {
    private java.lang.Boolean fullErrorMessage;

    private java.lang.Boolean generateDotFiles;

    private java.lang.Boolean printStatesNotReachable;

    private java.lang.Boolean printVelocitiesinStates;

    private java.lang.Boolean skipStrongProperties;

    private java.lang.Boolean transposeGraph;

    private java.lang.Boolean writeIncludedPendingResponses;

    public VerificationSettings() {
    }

    public VerificationSettings(
           java.lang.Boolean fullErrorMessage,
           java.lang.Boolean generateDotFiles,
           java.lang.Boolean printStatesNotReachable,
           java.lang.Boolean printVelocitiesinStates,
           java.lang.Boolean skipStrongProperties,
           java.lang.Boolean transposeGraph,
           java.lang.Boolean writeIncludedPendingResponses) {
           this.fullErrorMessage = fullErrorMessage;
           this.generateDotFiles = generateDotFiles;
           this.printStatesNotReachable = printStatesNotReachable;
           this.printVelocitiesinStates = printVelocitiesinStates;
           this.skipStrongProperties = skipStrongProperties;
           this.transposeGraph = transposeGraph;
           this.writeIncludedPendingResponses = writeIncludedPendingResponses;
    }


    /**
     * Gets the fullErrorMessage value for this VerificationSettings.
     * 
     * @return fullErrorMessage
     */
    public java.lang.Boolean getFullErrorMessage() {
        return fullErrorMessage;
    }


    /**
     * Sets the fullErrorMessage value for this VerificationSettings.
     * 
     * @param fullErrorMessage
     */
    public void setFullErrorMessage(java.lang.Boolean fullErrorMessage) {
        this.fullErrorMessage = fullErrorMessage;
    }


    /**
     * Gets the generateDotFiles value for this VerificationSettings.
     * 
     * @return generateDotFiles
     */
    public java.lang.Boolean getGenerateDotFiles() {
        return generateDotFiles;
    }


    /**
     * Sets the generateDotFiles value for this VerificationSettings.
     * 
     * @param generateDotFiles
     */
    public void setGenerateDotFiles(java.lang.Boolean generateDotFiles) {
        this.generateDotFiles = generateDotFiles;
    }


    /**
     * Gets the printStatesNotReachable value for this VerificationSettings.
     * 
     * @return printStatesNotReachable
     */
    public java.lang.Boolean getPrintStatesNotReachable() {
        return printStatesNotReachable;
    }


    /**
     * Sets the printStatesNotReachable value for this VerificationSettings.
     * 
     * @param printStatesNotReachable
     */
    public void setPrintStatesNotReachable(java.lang.Boolean printStatesNotReachable) {
        this.printStatesNotReachable = printStatesNotReachable;
    }


    /**
     * Gets the printVelocitiesinStates value for this VerificationSettings.
     * 
     * @return printVelocitiesinStates
     */
    public java.lang.Boolean getPrintVelocitiesinStates() {
        return printVelocitiesinStates;
    }


    /**
     * Sets the printVelocitiesinStates value for this VerificationSettings.
     * 
     * @param printVelocitiesinStates
     */
    public void setPrintVelocitiesinStates(java.lang.Boolean printVelocitiesinStates) {
        this.printVelocitiesinStates = printVelocitiesinStates;
    }


    /**
     * Gets the skipStrongProperties value for this VerificationSettings.
     * 
     * @return skipStrongProperties
     */
    public java.lang.Boolean getSkipStrongProperties() {
        return skipStrongProperties;
    }


    /**
     * Sets the skipStrongProperties value for this VerificationSettings.
     * 
     * @param skipStrongProperties
     */
    public void setSkipStrongProperties(java.lang.Boolean skipStrongProperties) {
        this.skipStrongProperties = skipStrongProperties;
    }


    /**
     * Gets the transposeGraph value for this VerificationSettings.
     * 
     * @return transposeGraph
     */
    public java.lang.Boolean getTransposeGraph() {
        return transposeGraph;
    }


    /**
     * Sets the transposeGraph value for this VerificationSettings.
     * 
     * @param transposeGraph
     */
    public void setTransposeGraph(java.lang.Boolean transposeGraph) {
        this.transposeGraph = transposeGraph;
    }


    /**
     * Gets the writeIncludedPendingResponses value for this VerificationSettings.
     * 
     * @return writeIncludedPendingResponses
     */
    public java.lang.Boolean getWriteIncludedPendingResponses() {
        return writeIncludedPendingResponses;
    }


    /**
     * Sets the writeIncludedPendingResponses value for this VerificationSettings.
     * 
     * @param writeIncludedPendingResponses
     */
    public void setWriteIncludedPendingResponses(java.lang.Boolean writeIncludedPendingResponses) {
        this.writeIncludedPendingResponses = writeIncludedPendingResponses;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VerificationSettings)) return false;
        VerificationSettings other = (VerificationSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fullErrorMessage==null && other.getFullErrorMessage()==null) || 
             (this.fullErrorMessage!=null &&
              this.fullErrorMessage.equals(other.getFullErrorMessage()))) &&
            ((this.generateDotFiles==null && other.getGenerateDotFiles()==null) || 
             (this.generateDotFiles!=null &&
              this.generateDotFiles.equals(other.getGenerateDotFiles()))) &&
            ((this.printStatesNotReachable==null && other.getPrintStatesNotReachable()==null) || 
             (this.printStatesNotReachable!=null &&
              this.printStatesNotReachable.equals(other.getPrintStatesNotReachable()))) &&
            ((this.printVelocitiesinStates==null && other.getPrintVelocitiesinStates()==null) || 
             (this.printVelocitiesinStates!=null &&
              this.printVelocitiesinStates.equals(other.getPrintVelocitiesinStates()))) &&
            ((this.skipStrongProperties==null && other.getSkipStrongProperties()==null) || 
             (this.skipStrongProperties!=null &&
              this.skipStrongProperties.equals(other.getSkipStrongProperties()))) &&
            ((this.transposeGraph==null && other.getTransposeGraph()==null) || 
             (this.transposeGraph!=null &&
              this.transposeGraph.equals(other.getTransposeGraph()))) &&
            ((this.writeIncludedPendingResponses==null && other.getWriteIncludedPendingResponses()==null) || 
             (this.writeIncludedPendingResponses!=null &&
              this.writeIncludedPendingResponses.equals(other.getWriteIncludedPendingResponses())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFullErrorMessage() != null) {
            _hashCode += getFullErrorMessage().hashCode();
        }
        if (getGenerateDotFiles() != null) {
            _hashCode += getGenerateDotFiles().hashCode();
        }
        if (getPrintStatesNotReachable() != null) {
            _hashCode += getPrintStatesNotReachable().hashCode();
        }
        if (getPrintVelocitiesinStates() != null) {
            _hashCode += getPrintVelocitiesinStates().hashCode();
        }
        if (getSkipStrongProperties() != null) {
            _hashCode += getSkipStrongProperties().hashCode();
        }
        if (getTransposeGraph() != null) {
            _hashCode += getTransposeGraph().hashCode();
        }
        if (getWriteIncludedPendingResponses() != null) {
            _hashCode += getWriteIncludedPendingResponses().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VerificationSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ITU.DK.DCRS.CommonTypes.Verification", "VerificationSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullErrorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ITU.DK.DCRS.CommonTypes.Verification", "FullErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generateDotFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ITU.DK.DCRS.CommonTypes.Verification", "GenerateDotFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printStatesNotReachable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ITU.DK.DCRS.CommonTypes.Verification", "PrintStatesNotReachable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printVelocitiesinStates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ITU.DK.DCRS.CommonTypes.Verification", "PrintVelocitiesinStates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipStrongProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ITU.DK.DCRS.CommonTypes.Verification", "SkipStrongProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transposeGraph");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ITU.DK.DCRS.CommonTypes.Verification", "TransposeGraph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writeIncludedPendingResponses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/ITU.DK.DCRS.CommonTypes.Verification", "WriteIncludedPendingResponses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
