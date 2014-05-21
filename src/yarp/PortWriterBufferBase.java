/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class PortWriterBufferBase {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PortWriterBufferBase(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PortWriterBufferBase obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_PortWriterBufferBase(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PortWriterWrapper create(PortWriterBufferManager man, SWIGTYPE_p_void tracker) {
    long cPtr = yarpJNI.PortWriterBufferBase_create(swigCPtr, this, PortWriterBufferManager.getCPtr(man), man, SWIGTYPE_p_void.getCPtr(tracker));
    return (cPtr == 0) ? null : new PortWriterWrapper(cPtr, false);
  }

  public SWIGTYPE_p_void getContent() {
    long cPtr = yarpJNI.PortWriterBufferBase_getContent(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public boolean releaseContent() {
    return yarpJNI.PortWriterBufferBase_releaseContent(swigCPtr, this);
  }

  public int getCount() {
    return yarpJNI.PortWriterBufferBase_getCount(swigCPtr, this);
  }

  public void attach(Port port) {
    yarpJNI.PortWriterBufferBase_attach(swigCPtr, this, Port.getCPtr(port), port);
  }

  public void detach() {
    yarpJNI.PortWriterBufferBase_detach(swigCPtr, this);
  }

  public void write(boolean strict) {
    yarpJNI.PortWriterBufferBase_write(swigCPtr, this, strict);
  }

}
