/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class BufferedPortProperty extends Contactable {
  private long swigCPtr;

  protected BufferedPortProperty(long cPtr, boolean cMemoryOwn) {
    super(yarpJNI.BufferedPortProperty_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BufferedPortProperty obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_BufferedPortProperty(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BufferedPortProperty() {
    this(yarpJNI.new_BufferedPortProperty(), true);
  }

  public boolean addOutput(String name) {
    return yarpJNI.BufferedPortProperty_addOutput__SWIG_0(swigCPtr, this, name);
  }

  public boolean addOutput(String name, String carrier) {
    return yarpJNI.BufferedPortProperty_addOutput__SWIG_1(swigCPtr, this, name, carrier);
  }

  public boolean addOutput(Contact contact) {
    return yarpJNI.BufferedPortProperty_addOutput__SWIG_2(swigCPtr, this, Contact.getCPtr(contact), contact);
  }

  public void close() {
    yarpJNI.BufferedPortProperty_close(swigCPtr, this);
  }

  public void interrupt() {
    yarpJNI.BufferedPortProperty_interrupt(swigCPtr, this);
  }

  public void resume() {
    yarpJNI.BufferedPortProperty_resume(swigCPtr, this);
  }

  public int getPendingReads() {
    return yarpJNI.BufferedPortProperty_getPendingReads(swigCPtr, this);
  }

  public Contact where() {
    return new Contact(yarpJNI.BufferedPortProperty_where(swigCPtr, this), true);
  }

  public String getName() {
    return yarpJNI.BufferedPortProperty_getName(swigCPtr, this);
  }

  public Property prepare() {
    return new Property(yarpJNI.BufferedPortProperty_prepare(swigCPtr, this), false);
  }

  public boolean unprepare() {
    return yarpJNI.BufferedPortProperty_unprepare(swigCPtr, this);
  }

  public void write(boolean forceStrict) {
    yarpJNI.BufferedPortProperty_write__SWIG_0(swigCPtr, this, forceStrict);
  }

  public void write() {
    yarpJNI.BufferedPortProperty_write__SWIG_1(swigCPtr, this);
  }

  public void writeStrict() {
    yarpJNI.BufferedPortProperty_writeStrict(swigCPtr, this);
  }

  public void setStrict(boolean strict) {
    yarpJNI.BufferedPortProperty_setStrict__SWIG_0(swigCPtr, this, strict);
  }

  public void setStrict() {
    yarpJNI.BufferedPortProperty_setStrict__SWIG_1(swigCPtr, this);
  }

  public Property read(boolean shouldWait) {
    long cPtr = yarpJNI.BufferedPortProperty_read__SWIG_0(swigCPtr, this, shouldWait);
    return (cPtr == 0) ? null : new Property(cPtr, false);
  }

  public Property read() {
    long cPtr = yarpJNI.BufferedPortProperty_read__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new Property(cPtr, false);
  }

  public Property lastRead() {
    long cPtr = yarpJNI.BufferedPortProperty_lastRead(swigCPtr, this);
    return (cPtr == 0) ? null : new Property(cPtr, false);
  }

  public boolean isClosed() {
    return yarpJNI.BufferedPortProperty_isClosed(swigCPtr, this);
  }

  public void setReplier(PortReader reader) {
    yarpJNI.BufferedPortProperty_setReplier(swigCPtr, this, PortReader.getCPtr(reader), reader);
  }

  public void setReader(PortReader reader) {
    yarpJNI.BufferedPortProperty_setReader(swigCPtr, this, PortReader.getCPtr(reader), reader);
  }

  public void onRead(Property datum) {
    yarpJNI.BufferedPortProperty_onRead(swigCPtr, this, Property.getCPtr(datum), datum);
  }

  public void useCallback(PropertyCallback callback) {
    yarpJNI.BufferedPortProperty_useCallback__SWIG_0(swigCPtr, this, PropertyCallback.getCPtr(callback), callback);
  }

  public void useCallback() {
    yarpJNI.BufferedPortProperty_useCallback__SWIG_1(swigCPtr, this);
  }

  public void disableCallback() {
    yarpJNI.BufferedPortProperty_disableCallback(swigCPtr, this);
  }

  public boolean setEnvelope(PortWriter envelope) {
    return yarpJNI.BufferedPortProperty_setEnvelope(swigCPtr, this, PortWriter.getCPtr(envelope), envelope);
  }

  public boolean getEnvelope(PortReader envelope) {
    return yarpJNI.BufferedPortProperty_getEnvelope(swigCPtr, this, PortReader.getCPtr(envelope), envelope);
  }

  public int getInputCount() {
    return yarpJNI.BufferedPortProperty_getInputCount(swigCPtr, this);
  }

  public int getOutputCount() {
    return yarpJNI.BufferedPortProperty_getOutputCount(swigCPtr, this);
  }

  public boolean isWriting() {
    return yarpJNI.BufferedPortProperty_isWriting(swigCPtr, this);
  }

  public void getReport(PortReport reporter) {
    yarpJNI.BufferedPortProperty_getReport(swigCPtr, this, PortReport.getCPtr(reporter), reporter);
  }

  public void setReporter(PortReport reporter) {
    yarpJNI.BufferedPortProperty_setReporter(swigCPtr, this, PortReport.getCPtr(reporter), reporter);
  }

  public SWIGTYPE_p_void acquire() {
    long cPtr = yarpJNI.BufferedPortProperty_acquire(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void release(SWIGTYPE_p_void handle) {
    yarpJNI.BufferedPortProperty_release(swigCPtr, this, SWIGTYPE_p_void.getCPtr(handle));
  }

  public void setTargetPeriod(double period) {
    yarpJNI.BufferedPortProperty_setTargetPeriod(swigCPtr, this, period);
  }

  public SWIGTYPE_p_Type getType() {
    return new SWIGTYPE_p_Type(yarpJNI.BufferedPortProperty_getType(swigCPtr, this), true);
  }

  public void promiseType(SWIGTYPE_p_Type typ) {
    yarpJNI.BufferedPortProperty_promiseType(swigCPtr, this, SWIGTYPE_p_Type.getCPtr(typ));
  }

  public void setInputMode(boolean expectInput) {
    yarpJNI.BufferedPortProperty_setInputMode(swigCPtr, this, expectInput);
  }

  public void setOutputMode(boolean expectOutput) {
    yarpJNI.BufferedPortProperty_setOutputMode(swigCPtr, this, expectOutput);
  }

  public void setRpcMode(boolean expectRpc) {
    yarpJNI.BufferedPortProperty_setRpcMode(swigCPtr, this, expectRpc);
  }

  public Property acquireProperties(boolean readOnly) {
    long cPtr = yarpJNI.BufferedPortProperty_acquireProperties(swigCPtr, this, readOnly);
    return (cPtr == 0) ? null : new Property(cPtr, false);
  }

  public void releaseProperties(Property prop) {
    yarpJNI.BufferedPortProperty_releaseProperties(swigCPtr, this, Property.getCPtr(prop), prop);
  }

}
