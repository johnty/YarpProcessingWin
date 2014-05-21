/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class RateThread {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RateThread(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RateThread obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_RateThread(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean threadInit() {
    return yarpJNI.RateThread_threadInit(swigCPtr, this);
  }

  public void threadRelease() {
    yarpJNI.RateThread_threadRelease(swigCPtr, this);
  }

  public void run() {
    yarpJNI.RateThread_run(swigCPtr, this);
  }

  public boolean start() {
    return yarpJNI.RateThread_start(swigCPtr, this);
  }

  public boolean step() {
    return yarpJNI.RateThread_step(swigCPtr, this);
  }

  public void stop() {
    yarpJNI.RateThread_stop(swigCPtr, this);
  }

  public void askToStop() {
    yarpJNI.RateThread_askToStop(swigCPtr, this);
  }

  public boolean isRunning() {
    return yarpJNI.RateThread_isRunning(swigCPtr, this);
  }

  public boolean isSuspended() {
    return yarpJNI.RateThread_isSuspended(swigCPtr, this);
  }

  public boolean setRate(int p) {
    return yarpJNI.RateThread_setRate(swigCPtr, this, p);
  }

  public double getRate() {
    return yarpJNI.RateThread_getRate(swigCPtr, this);
  }

  public void suspend() {
    yarpJNI.RateThread_suspend(swigCPtr, this);
  }

  public void resume() {
    yarpJNI.RateThread_resume(swigCPtr, this);
  }

  public void resetStat() {
    yarpJNI.RateThread_resetStat(swigCPtr, this);
  }

  public double getEstPeriod() {
    return yarpJNI.RateThread_getEstPeriod__SWIG_0(swigCPtr, this);
  }

  public void getEstPeriod(SWIGTYPE_p_double av, SWIGTYPE_p_double std) {
    yarpJNI.RateThread_getEstPeriod__SWIG_1(swigCPtr, this, SWIGTYPE_p_double.getCPtr(av), SWIGTYPE_p_double.getCPtr(std));
  }

  public long getIterations() {
    return yarpJNI.RateThread_getIterations(swigCPtr, this);
  }

  public double getEstUsed() {
    return yarpJNI.RateThread_getEstUsed__SWIG_0(swigCPtr, this);
  }

  public void getEstUsed(SWIGTYPE_p_double av, SWIGTYPE_p_double std) {
    yarpJNI.RateThread_getEstUsed__SWIG_1(swigCPtr, this, SWIGTYPE_p_double.getCPtr(av), SWIGTYPE_p_double.getCPtr(std));
  }

  public void beforeStart() {
    yarpJNI.RateThread_beforeStart(swigCPtr, this);
  }

  public void afterStart(boolean success) {
    yarpJNI.RateThread_afterStart(swigCPtr, this, success);
  }

}
