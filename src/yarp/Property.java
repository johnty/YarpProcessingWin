/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class Property extends Searchable {
  private long swigCPtr;

  protected Property(long cPtr, boolean cMemoryOwn) {
    super(yarpJNI.Property_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Property obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_Property(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean check(String key) {
    return yarpJNI.Property_check__SWIG_0_0(swigCPtr, this, key);
  }

  public boolean check(String key, String comment) {
    return yarpJNI.Property_check__SWIG_0_1(swigCPtr, this, key, comment);
  }

  public boolean check(String key, SWIGTYPE_p_p_yarp__os__Value result, String comment) {
    return yarpJNI.Property_check__SWIG_0_2(swigCPtr, this, key, SWIGTYPE_p_p_yarp__os__Value.getCPtr(result), comment);
  }

  public boolean check(String key, SWIGTYPE_p_p_yarp__os__Value result) {
    return yarpJNI.Property_check__SWIG_0_3(swigCPtr, this, key, SWIGTYPE_p_p_yarp__os__Value.getCPtr(result));
  }

  public Value check(String key, Value fallback, String comment) {
    return new Value(yarpJNI.Property_check__SWIG_0_4(swigCPtr, this, key, Value.getCPtr(fallback), fallback, comment), true);
  }

  public Value check(String key, Value fallback) {
    return new Value(yarpJNI.Property_check__SWIG_0_5(swigCPtr, this, key, Value.getCPtr(fallback), fallback), true);
  }

  public Bottle findGroup(String key) {
    return new Bottle(yarpJNI.Property_findGroup__SWIG_0_0(swigCPtr, this, key), false);
  }

  public Bottle findGroup(String key, String comment) {
    return new Bottle(yarpJNI.Property_findGroup__SWIG_0_1(swigCPtr, this, key, comment), false);
  }

  public Property(int hash_size) {
    this(yarpJNI.new_Property__SWIG_0(hash_size), true);
  }

  public Property() {
    this(yarpJNI.new_Property__SWIG_1(), true);
  }

  public Property(String str) {
    this(yarpJNI.new_Property__SWIG_2(str), true);
  }

  public Property(Property prop) {
    this(yarpJNI.new_Property__SWIG_3(Property.getCPtr(prop), prop), true);
  }

  public void put(String key, String value) {
    yarpJNI.Property_put__SWIG_0(swigCPtr, this, key, value);
  }

  public void put(String key, Value value) {
    yarpJNI.Property_put__SWIG_1(swigCPtr, this, key, Value.getCPtr(value), value);
  }

  public void put(String key, int v) {
    yarpJNI.Property_put__SWIG_3(swigCPtr, this, key, v);
  }

  public void put(String key, double v) {
    yarpJNI.Property_put__SWIG_4(swigCPtr, this, key, v);
  }

  public Property addGroup(String key) {
    return new Property(yarpJNI.Property_addGroup(swigCPtr, this, key), false);
  }

  public void unput(String key) {
    yarpJNI.Property_unput(swigCPtr, this, key);
  }

  public Value find(String key) {
    return new Value(yarpJNI.Property_find(swigCPtr, this, key), false);
  }

  public void clear() {
    yarpJNI.Property_clear(swigCPtr, this);
  }

  public void fromString(String txt, boolean wipe) {
    yarpJNI.Property_fromString__SWIG_0(swigCPtr, this, txt, wipe);
  }

  public void fromString(String txt) {
    yarpJNI.Property_fromString__SWIG_1(swigCPtr, this, txt);
  }

  public void fromCommand(int argc, SWIGTYPE_p_p_char argv, boolean skipFirst, boolean wipe) {
    yarpJNI.Property_fromCommand__SWIG_0(swigCPtr, this, argc, SWIGTYPE_p_p_char.getCPtr(argv), skipFirst, wipe);
  }

  public void fromCommand(int argc, SWIGTYPE_p_p_char argv, boolean skipFirst) {
    yarpJNI.Property_fromCommand__SWIG_1(swigCPtr, this, argc, SWIGTYPE_p_p_char.getCPtr(argv), skipFirst);
  }

  public void fromCommand(int argc, SWIGTYPE_p_p_char argv) {
    yarpJNI.Property_fromCommand__SWIG_2(swigCPtr, this, argc, SWIGTYPE_p_p_char.getCPtr(argv));
  }

  public boolean fromConfigFile(String fname, boolean wipe) {
    return yarpJNI.Property_fromConfigFile__SWIG_0(swigCPtr, this, fname, wipe);
  }

  public boolean fromConfigFile(String fname) {
    return yarpJNI.Property_fromConfigFile__SWIG_1(swigCPtr, this, fname);
  }

  public boolean fromConfigFile(String fname, Searchable env, boolean wipe) {
    return yarpJNI.Property_fromConfigFile__SWIG_2(swigCPtr, this, fname, Searchable.getCPtr(env), env, wipe);
  }

  public boolean fromConfigFile(String fname, Searchable env) {
    return yarpJNI.Property_fromConfigFile__SWIG_3(swigCPtr, this, fname, Searchable.getCPtr(env), env);
  }

  public void fromConfig(String txt, boolean wipe) {
    yarpJNI.Property_fromConfig__SWIG_0(swigCPtr, this, txt, wipe);
  }

  public void fromConfig(String txt) {
    yarpJNI.Property_fromConfig__SWIG_1(swigCPtr, this, txt);
  }

  public void fromConfig(String txt, Searchable env, boolean wipe) {
    yarpJNI.Property_fromConfig__SWIG_2(swigCPtr, this, txt, Searchable.getCPtr(env), env, wipe);
  }

  public void fromConfig(String txt, Searchable env) {
    yarpJNI.Property_fromConfig__SWIG_3(swigCPtr, this, txt, Searchable.getCPtr(env), env);
  }

  public void fromQuery(String url, boolean wipe) {
    yarpJNI.Property_fromQuery__SWIG_0(swigCPtr, this, url, wipe);
  }

  public void fromQuery(String url) {
    yarpJNI.Property_fromQuery__SWIG_1(swigCPtr, this, url);
  }

  public String toString() {
    return yarpJNI.Property_toString(swigCPtr, this);
  }

  public boolean read(ConnectionReader connection) {
    return yarpJNI.Property_read(swigCPtr, this, ConnectionReader.getCPtr(connection), connection);
  }

  public boolean write(ConnectionWriter connection) {
    return yarpJNI.Property_write(swigCPtr, this, ConnectionWriter.getCPtr(connection), connection);
  }

  public String toString_c() {
    return yarpJNI.Property_toString_c(swigCPtr, this);
  }

}
