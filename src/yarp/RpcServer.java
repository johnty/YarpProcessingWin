/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class RpcServer extends UnbufferedContactable {
  private long swigCPtr;

  protected RpcServer(long cPtr, boolean cMemoryOwn) {
    super(yarpJNI.RpcServer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RpcServer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_RpcServer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean open() {
    return yarpJNI.RpcServer_open__SWIG_0_0(swigCPtr, this);
  }

  public boolean open(String name) {
    return yarpJNI.RpcServer_open__SWIG_0_1(swigCPtr, this, name);
  }

  public boolean open(Contact contact, boolean registerName) {
    return yarpJNI.RpcServer_open__SWIG_0_2(swigCPtr, this, Contact.getCPtr(contact), contact, registerName);
  }

  public boolean open(Contact contact) {
    return yarpJNI.RpcServer_open__SWIG_0_3(swigCPtr, this, Contact.getCPtr(contact), contact);
  }

  public RpcServer() {
    this(yarpJNI.new_RpcServer(), true);
  }

  public boolean addOutput(String name) {
    return yarpJNI.RpcServer_addOutput__SWIG_0(swigCPtr, this, name);
  }

  public boolean addOutput(String name, String carrier) {
    return yarpJNI.RpcServer_addOutput__SWIG_1(swigCPtr, this, name, carrier);
  }

  public boolean addOutput(Contact contact) {
    return yarpJNI.RpcServer_addOutput__SWIG_2(swigCPtr, this, Contact.getCPtr(contact), contact);
  }

  public void close() {
    yarpJNI.RpcServer_close(swigCPtr, this);
  }

  public void interrupt() {
    yarpJNI.RpcServer_interrupt(swigCPtr, this);
  }

  public void resume() {
    yarpJNI.RpcServer_resume(swigCPtr, this);
  }

  public Contact where() {
    return new Contact(yarpJNI.RpcServer_where(swigCPtr, this), true);
  }

  public String getName() {
    return yarpJNI.RpcServer_getName(swigCPtr, this);
  }

  public boolean write(PortWriter writer, PortWriter callback) {
    return yarpJNI.RpcServer_write__SWIG_0(swigCPtr, this, PortWriter.getCPtr(writer), writer, PortWriter.getCPtr(callback), callback);
  }

  public boolean write(PortWriter writer) {
    return yarpJNI.RpcServer_write__SWIG_1(swigCPtr, this, PortWriter.getCPtr(writer), writer);
  }

  public boolean write(PortWriter writer, PortReader reader, PortWriter callback) {
    return yarpJNI.RpcServer_write__SWIG_2(swigCPtr, this, PortWriter.getCPtr(writer), writer, PortReader.getCPtr(reader), reader, PortWriter.getCPtr(callback), callback);
  }

  public boolean write(PortWriter writer, PortReader reader) {
    return yarpJNI.RpcServer_write__SWIG_3(swigCPtr, this, PortWriter.getCPtr(writer), writer, PortReader.getCPtr(reader), reader);
  }

  public boolean read(PortReader reader, boolean willReply) {
    return yarpJNI.RpcServer_read__SWIG_0(swigCPtr, this, PortReader.getCPtr(reader), reader, willReply);
  }

  public boolean read(PortReader reader) {
    return yarpJNI.RpcServer_read__SWIG_1(swigCPtr, this, PortReader.getCPtr(reader), reader);
  }

  public boolean reply(PortWriter writer) {
    return yarpJNI.RpcServer_reply(swigCPtr, this, PortWriter.getCPtr(writer), writer);
  }

  public boolean replyAndDrop(PortWriter writer) {
    return yarpJNI.RpcServer_replyAndDrop(swigCPtr, this, PortWriter.getCPtr(writer), writer);
  }

  public void setReader(PortReader reader) {
    yarpJNI.RpcServer_setReader(swigCPtr, this, PortReader.getCPtr(reader), reader);
  }

  public void setReaderCreator(PortReaderCreator creator) {
    yarpJNI.RpcServer_setReaderCreator(swigCPtr, this, PortReaderCreator.getCPtr(creator), creator);
  }

  public boolean setEnvelope(PortWriter envelope) {
    return yarpJNI.RpcServer_setEnvelope(swigCPtr, this, PortWriter.getCPtr(envelope), envelope);
  }

  public boolean getEnvelope(PortReader envelope) {
    return yarpJNI.RpcServer_getEnvelope(swigCPtr, this, PortReader.getCPtr(envelope), envelope);
  }

  public int getInputCount() {
    return yarpJNI.RpcServer_getInputCount(swigCPtr, this);
  }

  public int getOutputCount() {
    return yarpJNI.RpcServer_getOutputCount(swigCPtr, this);
  }

  public void getReport(PortReport reporter) {
    yarpJNI.RpcServer_getReport(swigCPtr, this, PortReport.getCPtr(reporter), reporter);
  }

  public void setReporter(PortReport reporter) {
    yarpJNI.RpcServer_setReporter(swigCPtr, this, PortReport.getCPtr(reporter), reporter);
  }

  public boolean isWriting() {
    return yarpJNI.RpcServer_isWriting(swigCPtr, this);
  }

  public SWIGTYPE_p_Type getType() {
    return new SWIGTYPE_p_Type(yarpJNI.RpcServer_getType(swigCPtr, this), true);
  }

  public void promiseType(SWIGTYPE_p_Type typ) {
    yarpJNI.RpcServer_promiseType(swigCPtr, this, SWIGTYPE_p_Type.getCPtr(typ));
  }

  public Property acquireProperties(boolean readOnly) {
    long cPtr = yarpJNI.RpcServer_acquireProperties(swigCPtr, this, readOnly);
    return (cPtr == 0) ? null : new Property(cPtr, false);
  }

  public void releaseProperties(Property prop) {
    yarpJNI.RpcServer_releaseProperties(swigCPtr, this, Property.getCPtr(prop), prop);
  }

  public void setInputMode(boolean expectInput) {
    yarpJNI.RpcServer_setInputMode(swigCPtr, this, expectInput);
  }

  public void setOutputMode(boolean expectOutput) {
    yarpJNI.RpcServer_setOutputMode(swigCPtr, this, expectOutput);
  }

  public void setRpcMode(boolean expectRpc) {
    yarpJNI.RpcServer_setRpcMode(swigCPtr, this, expectRpc);
  }

}
