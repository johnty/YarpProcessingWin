/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class Time {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Time(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Time obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_Time(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static void delay(double seconds) {
    yarpJNI.Time_delay(seconds);
  }

  public static double now() {
    return yarpJNI.Time_now();
  }

  public static void yield() {
    yarpJNI.Time_yield();
  }

  public static void turboBoost() {
    yarpJNI.Time_turboBoost();
  }

  public static void useSystemClock() {
    yarpJNI.Time_useSystemClock();
  }

  public static void useNetworkClock(String clock) {
    yarpJNI.Time_useNetworkClock(clock);
  }

  public static void useCustomClock(SWIGTYPE_p_Clock clock) {
    yarpJNI.Time_useCustomClock(SWIGTYPE_p_Clock.getCPtr(clock));
  }

  public static boolean isSystemClock() {
    return yarpJNI.Time_isSystemClock();
  }

  public static boolean isValid() {
    return yarpJNI.Time_isValid();
  }

  public Time() {
    this(yarpJNI.new_Time(), true);
  }

}
