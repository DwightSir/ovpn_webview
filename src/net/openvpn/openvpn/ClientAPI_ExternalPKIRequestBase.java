/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.openvpn.openvpn;

public class ClientAPI_ExternalPKIRequestBase {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ClientAPI_ExternalPKIRequestBase(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ClientAPI_ExternalPKIRequestBase obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ovpncliJNI.delete_ClientAPI_ExternalPKIRequestBase(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setError(boolean value) {
    ovpncliJNI.ClientAPI_ExternalPKIRequestBase_error_set(swigCPtr, this, value);
  }

  public boolean getError() {
    return ovpncliJNI.ClientAPI_ExternalPKIRequestBase_error_get(swigCPtr, this);
  }

  public void setErrorText(String value) {
    ovpncliJNI.ClientAPI_ExternalPKIRequestBase_errorText_set(swigCPtr, this, value);
  }

  public String getErrorText() {
    return ovpncliJNI.ClientAPI_ExternalPKIRequestBase_errorText_get(swigCPtr, this);
  }

  public void setInvalidAlias(boolean value) {
    ovpncliJNI.ClientAPI_ExternalPKIRequestBase_invalidAlias_set(swigCPtr, this, value);
  }

  public boolean getInvalidAlias() {
    return ovpncliJNI.ClientAPI_ExternalPKIRequestBase_invalidAlias_get(swigCPtr, this);
  }

  public void setAlias(String value) {
    ovpncliJNI.ClientAPI_ExternalPKIRequestBase_alias_set(swigCPtr, this, value);
  }

  public String getAlias() {
    return ovpncliJNI.ClientAPI_ExternalPKIRequestBase_alias_get(swigCPtr, this);
  }

  public ClientAPI_ExternalPKIRequestBase() {
    this(ovpncliJNI.new_ClientAPI_ExternalPKIRequestBase(), true);
  }

}
