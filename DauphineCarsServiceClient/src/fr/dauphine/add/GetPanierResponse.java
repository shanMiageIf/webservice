/**
 * GetPanierResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.dauphine.add;

public class GetPanierResponse  implements java.io.Serializable {
    private java.lang.Object[] getPanierReturn;

    public GetPanierResponse() {
    }

    public GetPanierResponse(
           java.lang.Object[] getPanierReturn) {
           this.getPanierReturn = getPanierReturn;
    }


    /**
     * Gets the getPanierReturn value for this GetPanierResponse.
     * 
     * @return getPanierReturn
     */
    public java.lang.Object[] getGetPanierReturn() {
        return getPanierReturn;
    }


    /**
     * Sets the getPanierReturn value for this GetPanierResponse.
     * 
     * @param getPanierReturn
     */
    public void setGetPanierReturn(java.lang.Object[] getPanierReturn) {
        this.getPanierReturn = getPanierReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPanierResponse)) return false;
        GetPanierResponse other = (GetPanierResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPanierReturn==null && other.getGetPanierReturn()==null) || 
             (this.getPanierReturn!=null &&
              java.util.Arrays.equals(this.getPanierReturn, other.getGetPanierReturn())));
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
        if (getGetPanierReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetPanierReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetPanierReturn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPanierResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://add.dauphine.fr", ">getPanierResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPanierReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://add.dauphine.fr", "getPanierReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://add.dauphine.fr", "item"));
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
