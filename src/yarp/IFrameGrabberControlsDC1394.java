/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class IFrameGrabberControlsDC1394 extends IFrameGrabberControls {
  private long swigCPtr;

  protected IFrameGrabberControlsDC1394(long cPtr, boolean cMemoryOwn) {
    super(yarpJNI.IFrameGrabberControlsDC1394_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IFrameGrabberControlsDC1394 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_IFrameGrabberControlsDC1394(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean hasFeatureDC1394(int feature) {
    return yarpJNI.IFrameGrabberControlsDC1394_hasFeatureDC1394(swigCPtr, this, feature);
  }

  public boolean setFeatureDC1394(int feature, double value) {
    return yarpJNI.IFrameGrabberControlsDC1394_setFeatureDC1394(swigCPtr, this, feature, value);
  }

  public double getFeatureDC1394(int feature) {
    return yarpJNI.IFrameGrabberControlsDC1394_getFeatureDC1394(swigCPtr, this, feature);
  }

  public boolean hasOnOffDC1394(int feature) {
    return yarpJNI.IFrameGrabberControlsDC1394_hasOnOffDC1394(swigCPtr, this, feature);
  }

  public boolean setActiveDC1394(int feature, boolean onoff) {
    return yarpJNI.IFrameGrabberControlsDC1394_setActiveDC1394(swigCPtr, this, feature, onoff);
  }

  public boolean getActiveDC1394(int feature) {
    return yarpJNI.IFrameGrabberControlsDC1394_getActiveDC1394(swigCPtr, this, feature);
  }

  public boolean hasAutoDC1394(int feature) {
    return yarpJNI.IFrameGrabberControlsDC1394_hasAutoDC1394(swigCPtr, this, feature);
  }

  public boolean hasManualDC1394(int feature) {
    return yarpJNI.IFrameGrabberControlsDC1394_hasManualDC1394(swigCPtr, this, feature);
  }

  public boolean hasOnePushDC1394(int feature) {
    return yarpJNI.IFrameGrabberControlsDC1394_hasOnePushDC1394(swigCPtr, this, feature);
  }

  public boolean setModeDC1394(int feature, boolean auto_onoff) {
    return yarpJNI.IFrameGrabberControlsDC1394_setModeDC1394(swigCPtr, this, feature, auto_onoff);
  }

  public boolean getModeDC1394(int feature) {
    return yarpJNI.IFrameGrabberControlsDC1394_getModeDC1394(swigCPtr, this, feature);
  }

  public boolean setOnePushDC1394(int feature) {
    return yarpJNI.IFrameGrabberControlsDC1394_setOnePushDC1394(swigCPtr, this, feature);
  }

  public long getVideoModeMaskDC1394() {
    return yarpJNI.IFrameGrabberControlsDC1394_getVideoModeMaskDC1394(swigCPtr, this);
  }

  public long getVideoModeDC1394() {
    return yarpJNI.IFrameGrabberControlsDC1394_getVideoModeDC1394(swigCPtr, this);
  }

  public boolean setVideoModeDC1394(int video_mode) {
    return yarpJNI.IFrameGrabberControlsDC1394_setVideoModeDC1394(swigCPtr, this, video_mode);
  }

  public long getFPSMaskDC1394() {
    return yarpJNI.IFrameGrabberControlsDC1394_getFPSMaskDC1394(swigCPtr, this);
  }

  public long getFPSDC1394() {
    return yarpJNI.IFrameGrabberControlsDC1394_getFPSDC1394(swigCPtr, this);
  }

  public boolean setFPSDC1394(int fps) {
    return yarpJNI.IFrameGrabberControlsDC1394_setFPSDC1394(swigCPtr, this, fps);
  }

  public long getISOSpeedDC1394() {
    return yarpJNI.IFrameGrabberControlsDC1394_getISOSpeedDC1394(swigCPtr, this);
  }

  public boolean setISOSpeedDC1394(int speed) {
    return yarpJNI.IFrameGrabberControlsDC1394_setISOSpeedDC1394(swigCPtr, this, speed);
  }

  public long getColorCodingMaskDC1394(long video_mode) {
    return yarpJNI.IFrameGrabberControlsDC1394_getColorCodingMaskDC1394(swigCPtr, this, video_mode);
  }

  public long getColorCodingDC1394() {
    return yarpJNI.IFrameGrabberControlsDC1394_getColorCodingDC1394(swigCPtr, this);
  }

  public boolean setColorCodingDC1394(int coding) {
    return yarpJNI.IFrameGrabberControlsDC1394_setColorCodingDC1394(swigCPtr, this, coding);
  }

  public boolean setWhiteBalanceDC1394(double b, double r) {
    return yarpJNI.IFrameGrabberControlsDC1394_setWhiteBalanceDC1394(swigCPtr, this, b, r);
  }

  public boolean getWhiteBalanceDC1394(SWIGTYPE_p_double b, SWIGTYPE_p_double r) {
    return yarpJNI.IFrameGrabberControlsDC1394_getWhiteBalanceDC1394(swigCPtr, this, SWIGTYPE_p_double.getCPtr(b), SWIGTYPE_p_double.getCPtr(r));
  }

  public boolean getFormat7MaxWindowDC1394(SWIGTYPE_p_unsigned_int xdim, SWIGTYPE_p_unsigned_int ydim, SWIGTYPE_p_unsigned_int xstep, SWIGTYPE_p_unsigned_int ystep, SWIGTYPE_p_unsigned_int xoffstep, SWIGTYPE_p_unsigned_int yoffstep) {
    return yarpJNI.IFrameGrabberControlsDC1394_getFormat7MaxWindowDC1394(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(xdim), SWIGTYPE_p_unsigned_int.getCPtr(ydim), SWIGTYPE_p_unsigned_int.getCPtr(xstep), SWIGTYPE_p_unsigned_int.getCPtr(ystep), SWIGTYPE_p_unsigned_int.getCPtr(xoffstep), SWIGTYPE_p_unsigned_int.getCPtr(yoffstep));
  }

  public boolean getFormat7WindowDC1394(SWIGTYPE_p_unsigned_int xdim, SWIGTYPE_p_unsigned_int ydim, SWIGTYPE_p_int x0, SWIGTYPE_p_int y0) {
    return yarpJNI.IFrameGrabberControlsDC1394_getFormat7WindowDC1394(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(xdim), SWIGTYPE_p_unsigned_int.getCPtr(ydim), SWIGTYPE_p_int.getCPtr(x0), SWIGTYPE_p_int.getCPtr(y0));
  }

  public boolean setFormat7WindowDC1394(long xdim, long ydim, int x0, int y0) {
    return yarpJNI.IFrameGrabberControlsDC1394_setFormat7WindowDC1394(swigCPtr, this, xdim, ydim, x0, y0);
  }

  public boolean setOperationModeDC1394(boolean b1394b) {
    return yarpJNI.IFrameGrabberControlsDC1394_setOperationModeDC1394(swigCPtr, this, b1394b);
  }

  public boolean getOperationModeDC1394() {
    return yarpJNI.IFrameGrabberControlsDC1394_getOperationModeDC1394(swigCPtr, this);
  }

  public boolean setTransmissionDC1394(boolean bTxON) {
    return yarpJNI.IFrameGrabberControlsDC1394_setTransmissionDC1394(swigCPtr, this, bTxON);
  }

  public boolean getTransmissionDC1394() {
    return yarpJNI.IFrameGrabberControlsDC1394_getTransmissionDC1394(swigCPtr, this);
  }

  public boolean setBroadcastDC1394(boolean onoff) {
    return yarpJNI.IFrameGrabberControlsDC1394_setBroadcastDC1394(swigCPtr, this, onoff);
  }

  public boolean setDefaultsDC1394() {
    return yarpJNI.IFrameGrabberControlsDC1394_setDefaultsDC1394(swigCPtr, this);
  }

  public boolean setResetDC1394() {
    return yarpJNI.IFrameGrabberControlsDC1394_setResetDC1394(swigCPtr, this);
  }

  public boolean setPowerDC1394(boolean onoff) {
    return yarpJNI.IFrameGrabberControlsDC1394_setPowerDC1394(swigCPtr, this, onoff);
  }

  public boolean setCaptureDC1394(boolean bON) {
    return yarpJNI.IFrameGrabberControlsDC1394_setCaptureDC1394(swigCPtr, this, bON);
  }

  public long getBytesPerPacketDC1394() {
    return yarpJNI.IFrameGrabberControlsDC1394_getBytesPerPacketDC1394(swigCPtr, this);
  }

  public boolean setBytesPerPacketDC1394(long bpp) {
    return yarpJNI.IFrameGrabberControlsDC1394_setBytesPerPacketDC1394(swigCPtr, this, bpp);
  }

}
