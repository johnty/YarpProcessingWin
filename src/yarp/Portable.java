/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class Portable extends PortReader {
  private long swigCPtr;

  protected Portable(long cPtr, boolean cMemoryOwn) {
    super(yarpJNI.Portable_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Portable obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_Portable(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean read(ConnectionReader connection) {
    return yarpJNI.Portable_read(swigCPtr, this, ConnectionReader.getCPtr(connection), connection);
  }

  public boolean write(ConnectionWriter connection) {
    return yarpJNI.Portable_write(swigCPtr, this, ConnectionWriter.getCPtr(connection), connection);
  }

  public SWIGTYPE_p_Type getType() {
    return new SWIGTYPE_p_Type(yarpJNI.Portable_getType(swigCPtr, this), true);
  }

}
