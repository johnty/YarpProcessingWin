/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class Bottle extends Portable {
  private long swigCPtr;

  protected Bottle(long cPtr, boolean cMemoryOwn) {
    super(yarpJNI.Bottle_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Bottle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_Bottle(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean check(String key) {
    return yarpJNI.Bottle_check__SWIG_0_0(swigCPtr, this, key);
  }

  public boolean check(String key, String comment) {
    return yarpJNI.Bottle_check__SWIG_0_1(swigCPtr, this, key, comment);
  }

  public boolean check(String key, SWIGTYPE_p_p_yarp__os__Value result, String comment) {
    return yarpJNI.Bottle_check__SWIG_0_2(swigCPtr, this, key, SWIGTYPE_p_p_yarp__os__Value.getCPtr(result), comment);
  }

  public boolean check(String key, SWIGTYPE_p_p_yarp__os__Value result) {
    return yarpJNI.Bottle_check__SWIG_0_3(swigCPtr, this, key, SWIGTYPE_p_p_yarp__os__Value.getCPtr(result));
  }

  public Value check(String key, Value fallback, String comment) {
    return new Value(yarpJNI.Bottle_check__SWIG_0_4(swigCPtr, this, key, Value.getCPtr(fallback), fallback, comment), true);
  }

  public Value check(String key, Value fallback) {
    return new Value(yarpJNI.Bottle_check__SWIG_0_5(swigCPtr, this, key, Value.getCPtr(fallback), fallback), true);
  }

  public Bottle findGroup(String key) {
    return new Bottle(yarpJNI.Bottle_findGroup__SWIG_0_0(swigCPtr, this, key), false);
  }

  public Bottle findGroup(String key, String comment) {
    return new Bottle(yarpJNI.Bottle_findGroup__SWIG_0_1(swigCPtr, this, key, comment), false);
  }

  public Bottle() {
    this(yarpJNI.new_Bottle__SWIG_0(), true);
  }

  public Bottle(String text) {
    this(yarpJNI.new_Bottle__SWIG_1(text), true);
  }

  public Bottle(Bottle bottle) {
    this(yarpJNI.new_Bottle__SWIG_2(Bottle.getCPtr(bottle), bottle), true);
  }

  public void clear() {
    yarpJNI.Bottle_clear(swigCPtr, this);
  }

  public void addInt(int x) {
    yarpJNI.Bottle_addInt(swigCPtr, this, x);
  }

  public void addVocab(int x) {
    yarpJNI.Bottle_addVocab(swigCPtr, this, x);
  }

  public void addDouble(double x) {
    yarpJNI.Bottle_addDouble(swigCPtr, this, x);
  }

  public void addString(String str) {
    yarpJNI.Bottle_addString__SWIG_0(swigCPtr, this, str);
  }

  public void add(Value value) {
    yarpJNI.Bottle_add__SWIG_0(swigCPtr, this, Value.getCPtr(value), value);
  }

  public void add(String txt) {
    yarpJNI.Bottle_add__SWIG_1(swigCPtr, this, txt);
  }

  public Bottle addList() {
    return new Bottle(yarpJNI.Bottle_addList(swigCPtr, this), false);
  }

  public Property addDict() {
    return new Property(yarpJNI.Bottle_addDict(swigCPtr, this), false);
  }

  public Value pop() {
    return new Value(yarpJNI.Bottle_pop(swigCPtr, this), true);
  }

  public Value get(int index) {
    return new Value(yarpJNI.Bottle_get(swigCPtr, this, index), false);
  }

  public int size() {
    return yarpJNI.Bottle_size(swigCPtr, this);
  }

  public void fromString(String text) {
    yarpJNI.Bottle_fromString(swigCPtr, this, text);
  }

  public void fromBinary(String buf, int len) {
    yarpJNI.Bottle_fromBinary(swigCPtr, this, buf, len);
  }

  public String toBinary(SWIGTYPE_p_size_t size) {
    return yarpJNI.Bottle_toBinary__SWIG_0(swigCPtr, this, SWIGTYPE_p_size_t.getCPtr(size));
  }

  public String toBinary() {
    return yarpJNI.Bottle_toBinary__SWIG_1(swigCPtr, this);
  }

  public String toString() {
    return yarpJNI.Bottle_toString__SWIG_0(swigCPtr, this);
  }

  public boolean write(ConnectionWriter writer) {
    return yarpJNI.Bottle_write__SWIG_0(swigCPtr, this, ConnectionWriter.getCPtr(writer), writer);
  }

  public boolean read(ConnectionReader reader) {
    return yarpJNI.Bottle_read__SWIG_0(swigCPtr, this, ConnectionReader.getCPtr(reader), reader);
  }

  public boolean write(PortReader reader, boolean textMode) {
    return yarpJNI.Bottle_write__SWIG_1(swigCPtr, this, PortReader.getCPtr(reader), reader, textMode);
  }

  public boolean write(PortReader reader) {
    return yarpJNI.Bottle_write__SWIG_2(swigCPtr, this, PortReader.getCPtr(reader), reader);
  }

  public boolean read(PortWriter writer, boolean textMode) {
    return yarpJNI.Bottle_read__SWIG_1(swigCPtr, this, PortWriter.getCPtr(writer), writer, textMode);
  }

  public boolean read(PortWriter writer) {
    return yarpJNI.Bottle_read__SWIG_2(swigCPtr, this, PortWriter.getCPtr(writer), writer);
  }

  public void onCommencement() {
    yarpJNI.Bottle_onCommencement(swigCPtr, this);
  }

  public Value find(String key) {
    return new Value(yarpJNI.Bottle_find(swigCPtr, this, key), false);
  }

  public boolean isNull() {
    return yarpJNI.Bottle_isNull(swigCPtr, this);
  }

  public void copy(Bottle alt, int first, int len) {
    yarpJNI.Bottle_copy__SWIG_0(swigCPtr, this, Bottle.getCPtr(alt), alt, first, len);
  }

  public void copy(Bottle alt, int first) {
    yarpJNI.Bottle_copy__SWIG_1(swigCPtr, this, Bottle.getCPtr(alt), alt, first);
  }

  public void copy(Bottle alt) {
    yarpJNI.Bottle_copy__SWIG_2(swigCPtr, this, Bottle.getCPtr(alt), alt);
  }

  public static Bottle getNullBottle() {
    return new Bottle(yarpJNI.Bottle_getNullBottle(), false);
  }

  public boolean isEqual(Bottle alt) {
    return yarpJNI.Bottle_isEqual(swigCPtr, this, Bottle.getCPtr(alt), alt);
  }

  public boolean notEqual(Bottle alt) {
    return yarpJNI.Bottle_notEqual(swigCPtr, this, Bottle.getCPtr(alt), alt);
  }

  public void append(Bottle alt) {
    yarpJNI.Bottle_append(swigCPtr, this, Bottle.getCPtr(alt), alt);
  }

  public Bottle tail() {
    return new Bottle(yarpJNI.Bottle_tail(swigCPtr, this), true);
  }

  public void specialize(int subCode) {
    yarpJNI.Bottle_specialize(swigCPtr, this, subCode);
  }

  public int getSpecialization() {
    return yarpJNI.Bottle_getSpecialization(swigCPtr, this);
  }

  public void setNested(boolean nested) {
    yarpJNI.Bottle_setNested(swigCPtr, this, nested);
  }

  public void hasChanged() {
    yarpJNI.Bottle_hasChanged(swigCPtr, this);
  }

  public static String toString(int x) {
    return yarpJNI.Bottle_toString__SWIG_1(x);
  }

  public String toString_c() {
    return yarpJNI.Bottle_toString_c(swigCPtr, this);
  }

}
