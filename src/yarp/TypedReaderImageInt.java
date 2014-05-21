/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class TypedReaderImageInt {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected TypedReaderImageInt(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TypedReaderImageInt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_TypedReaderImageInt(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setStrict(boolean strict) {
    yarpJNI.TypedReaderImageInt_setStrict__SWIG_0(swigCPtr, this, strict);
  }

  public void setStrict() {
    yarpJNI.TypedReaderImageInt_setStrict__SWIG_1(swigCPtr, this);
  }

  public ImageInt read(boolean shouldWait) {
    long cPtr = yarpJNI.TypedReaderImageInt_read__SWIG_0(swigCPtr, this, shouldWait);
    return (cPtr == 0) ? null : new ImageInt(cPtr, false);
  }

  public ImageInt read() {
    long cPtr = yarpJNI.TypedReaderImageInt_read__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new ImageInt(cPtr, false);
  }

  public void interrupt() {
    yarpJNI.TypedReaderImageInt_interrupt(swigCPtr, this);
  }

  public ImageInt lastRead() {
    long cPtr = yarpJNI.TypedReaderImageInt_lastRead(swigCPtr, this);
    return (cPtr == 0) ? null : new ImageInt(cPtr, false);
  }

  public boolean isClosed() {
    return yarpJNI.TypedReaderImageInt_isClosed(swigCPtr, this);
  }

  public void useCallback(TypedReaderCallbackImageInt callback) {
    yarpJNI.TypedReaderImageInt_useCallback(swigCPtr, this, TypedReaderCallbackImageInt.getCPtr(callback), callback);
  }

  public void disableCallback() {
    yarpJNI.TypedReaderImageInt_disableCallback(swigCPtr, this);
  }

  public int getPendingReads() {
    return yarpJNI.TypedReaderImageInt_getPendingReads(swigCPtr, this);
  }

  public String getName() {
    return yarpJNI.TypedReaderImageInt_getName(swigCPtr, this);
  }

  public void setReplier(PortReader reader) {
    yarpJNI.TypedReaderImageInt_setReplier(swigCPtr, this, PortReader.getCPtr(reader), reader);
  }

  public SWIGTYPE_p_void acquire() {
    long cPtr = yarpJNI.TypedReaderImageInt_acquire(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void release(SWIGTYPE_p_void handle) {
    yarpJNI.TypedReaderImageInt_release(swigCPtr, this, SWIGTYPE_p_void.getCPtr(handle));
  }

  public void setTargetPeriod(double period) {
    yarpJNI.TypedReaderImageInt_setTargetPeriod(swigCPtr, this, period);
  }

}
