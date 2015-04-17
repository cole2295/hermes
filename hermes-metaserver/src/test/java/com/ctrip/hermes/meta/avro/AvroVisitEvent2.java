/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.hermes.meta.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AvroVisitEvent2 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroVisitEvent2\",\"namespace\":\"com.ctrip.hermes.meta.avro\",\"fields\":[{\"name\":\"ip\",\"type\":\"string\"},{\"name\":\"url\",\"type\":\"string\"},{\"name\":\"tz\",\"type\":\"long\",\"java-class\":\"java.util.Date\"},{\"name\":\"who\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence ip;
  @Deprecated public java.lang.CharSequence url;
  @Deprecated public long tz;
  @Deprecated public java.lang.CharSequence who;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public AvroVisitEvent2() {}

  /**
   * All-args constructor.
   */
  public AvroVisitEvent2(java.lang.CharSequence ip, java.lang.CharSequence url, java.lang.Long tz, java.lang.CharSequence who) {
    this.ip = ip;
    this.url = url;
    this.tz = tz;
    this.who = who;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ip;
    case 1: return url;
    case 2: return tz;
    case 3: return who;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ip = (java.lang.CharSequence)value$; break;
    case 1: url = (java.lang.CharSequence)value$; break;
    case 2: tz = (java.lang.Long)value$; break;
    case 3: who = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'ip' field.
   */
  public java.lang.CharSequence getIp() {
    return ip;
  }

  /**
   * Sets the value of the 'ip' field.
   * @param value the value to set.
   */
  public void setIp(java.lang.CharSequence value) {
    this.ip = value;
  }

  /**
   * Gets the value of the 'url' field.
   */
  public java.lang.CharSequence getUrl() {
    return url;
  }

  /**
   * Sets the value of the 'url' field.
   * @param value the value to set.
   */
  public void setUrl(java.lang.CharSequence value) {
    this.url = value;
  }

  /**
   * Gets the value of the 'tz' field.
   */
  public java.lang.Long getTz() {
    return tz;
  }

  /**
   * Sets the value of the 'tz' field.
   * @param value the value to set.
   */
  public void setTz(java.lang.Long value) {
    this.tz = value;
  }

  /**
   * Gets the value of the 'who' field.
   */
  public java.lang.CharSequence getWho() {
    return who;
  }

  /**
   * Sets the value of the 'who' field.
   * @param value the value to set.
   */
  public void setWho(java.lang.CharSequence value) {
    this.who = value;
  }

  /** Creates a new AvroVisitEvent2 RecordBuilder */
  public static com.ctrip.hermes.meta.avro.AvroVisitEvent2.Builder newBuilder() {
    return new com.ctrip.hermes.meta.avro.AvroVisitEvent2.Builder();
  }
  
  /** Creates a new AvroVisitEvent2 RecordBuilder by copying an existing Builder */
  public static com.ctrip.hermes.meta.avro.AvroVisitEvent2.Builder newBuilder(com.ctrip.hermes.meta.avro.AvroVisitEvent2.Builder other) {
    return new com.ctrip.hermes.meta.avro.AvroVisitEvent2.Builder(other);
  }
  
  /** Creates a new AvroVisitEvent2 RecordBuilder by copying an existing AvroVisitEvent2 instance */
  public static com.ctrip.hermes.meta.avro.AvroVisitEvent2.Builder newBuilder(com.ctrip.hermes.meta.avro.AvroVisitEvent2 other) {
    return new com.ctrip.hermes.meta.avro.AvroVisitEvent2.Builder(other);
  }
  
  /**
   * RecordBuilder for AvroVisitEvent2 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroVisitEvent2>
    implements org.apache.avro.data.RecordBuilder<AvroVisitEvent2> {

    private java.lang.CharSequence ip;
    private java.lang.CharSequence url;
    private long tz;
    private java.lang.CharSequence who;

    /** Creates a new Builder */
    private Builder() {
      super(com.ctrip.hermes.meta.avro.AvroVisitEvent2.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.ctrip.hermes.meta.avro.AvroVisitEvent2.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ip)) {
        this.ip = data().deepCopy(fields()[0].schema(), other.ip);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.url)) {
        this.url = data().deepCopy(fields()[1].schema(), other.url);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tz)) {
        this.tz = data().deepCopy(fields()[2].schema(), other.tz);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.who)) {
        this.who = data().deepCopy(fields()[3].schema(), other.who);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing AvroVisitEvent2 instance */
    private Builder(com.ctrip.hermes.meta.avro.AvroVisitEvent2 other) {
            super(com.ctrip.hermes.meta.avro.AvroVisitEvent2.SCHEMA$);
      if (isValidValue(fields()[0], other.ip)) {
        this.ip = data().deepCopy(fields()[0].schema(), other.ip);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.url)) {
        this.url = data().deepCopy(fields()[1].schema(), other.url);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tz)) {
        this.tz = data().deepCopy(fields()[2].schema(), other.tz);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.who)) {
        this.who = data().deepCopy(fields()[3].schema(), other.who);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'ip' field */
    public java.lang.CharSequence getIp() {
      return ip;
    }
    
    /** Sets the value of the 'ip' field */
    public com.ctrip.hermes.meta.avro.AvroVisitEvent2.Builder setIp(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.ip = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'ip' field has been set */
    public boolean hasIp() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'ip' field */
    public com.ctrip.hermes.meta.avro.AvroVisitEvent2.Builder clearIp() {
      ip = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'url' field */
    public java.lang.CharSequence getUrl() {
      return url;
    }
    
    /** Sets the value of the 'url' field */
    public com.ctrip.hermes.meta.avro.AvroVisitEvent2.Builder setUrl(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.url = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'url' field has been set */
    public boolean hasUrl() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'url' field */
    public com.ctrip.hermes.meta.avro.AvroVisitEvent2.Builder clearUrl() {
      url = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'tz' field */
    public java.lang.Long getTz() {
      return tz;
    }
    
    /** Sets the value of the 'tz' field */
    public com.ctrip.hermes.meta.avro.AvroVisitEvent2.Builder setTz(long value) {
      validate(fields()[2], value);
      this.tz = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'tz' field has been set */
    public boolean hasTz() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'tz' field */
    public com.ctrip.hermes.meta.avro.AvroVisitEvent2.Builder clearTz() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'who' field */
    public java.lang.CharSequence getWho() {
      return who;
    }
    
    /** Sets the value of the 'who' field */
    public com.ctrip.hermes.meta.avro.AvroVisitEvent2.Builder setWho(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.who = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'who' field has been set */
    public boolean hasWho() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'who' field */
    public com.ctrip.hermes.meta.avro.AvroVisitEvent2.Builder clearWho() {
      who = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public AvroVisitEvent2 build() {
      try {
        AvroVisitEvent2 record = new AvroVisitEvent2();
        record.ip = fieldSetFlags()[0] ? this.ip : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.url = fieldSetFlags()[1] ? this.url : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.tz = fieldSetFlags()[2] ? this.tz : (java.lang.Long) defaultValue(fields()[2]);
        record.who = fieldSetFlags()[3] ? this.who : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
