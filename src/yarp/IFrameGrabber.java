/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class IFrameGrabber {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected IFrameGrabber(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IFrameGrabber obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_IFrameGrabber(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean getRawBuffer(SWIGTYPE_p_unsigned_char buffer) {
    return yarpJNI.IFrameGrabber_getRawBuffer(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(buffer));
  }

  public int getRawBufferSize() {
    return yarpJNI.IFrameGrabber_getRawBufferSize(swigCPtr, this);
  }

  public int height() {
    return yarpJNI.IFrameGrabber_height(swigCPtr, this);
  }

  public int width() {
    return yarpJNI.IFrameGrabber_width(swigCPtr, this);
  }

}
