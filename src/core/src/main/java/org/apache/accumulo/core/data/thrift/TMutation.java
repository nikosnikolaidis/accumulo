/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.accumulo.core.data.thrift;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

@SuppressWarnings("serial")
public class TMutation implements TBase<TMutation,TMutation._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("TMutation");
  
  private static final TField ROW_FIELD_DESC = new TField("row", TType.STRING, (short) 1);
  private static final TField DATA_FIELD_DESC = new TField("data", TType.STRING, (short) 2);
  private static final TField VALUES_FIELD_DESC = new TField("values", TType.LIST, (short) 3);
  private static final TField ENTRIES_FIELD_DESC = new TField("entries", TType.I32, (short) 4);
  
  public byte[] row;
  public byte[] data;
  public java.util.List<byte[]> values;
  public int entries;
  
  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    ROW((short) 1, "row"), DATA((short) 2, "data"), VALUES((short) 3, "values"), ENTRIES((short) 4, "entries");
    
    private static final java.util.Map<String,_Fields> byName = new java.util.HashMap<String,_Fields>();
    
    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
    
    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch (fieldId) {
        case 1: // ROW
          return ROW;
        case 2: // DATA
          return DATA;
        case 3: // VALUES
          return VALUES;
        case 4: // ENTRIES
          return ENTRIES;
        default:
          return null;
      }
    }
    
    /**
     * Find the _Fields constant that matches fieldId, throwing an exception if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null)
        throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }
    
    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }
    
    private final short _thriftId;
    private final String _fieldName;
    
    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }
    
    public short getThriftFieldId() {
      return _thriftId;
    }
    
    public String getFieldName() {
      return _fieldName;
    }
  }
  
  // isset id assignments
  private static final int __ENTRIES_ISSET_ID = 0;
  private java.util.BitSet __isset_bit_vector = new java.util.BitSet(1);
  
  public static final java.util.Map<_Fields,FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields,FieldMetaData> tmpMap = new java.util.EnumMap<_Fields,FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROW, new FieldMetaData("row", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.DATA, new FieldMetaData("data", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.VALUES, new FieldMetaData("values", TFieldRequirementType.DEFAULT, new ListMetaData(TType.LIST, new FieldValueMetaData(TType.STRING))));
    tmpMap.put(_Fields.ENTRIES, new FieldMetaData("entries", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(TMutation.class, metaDataMap);
  }
  
  public TMutation() {}
  
  public TMutation(byte[] row, byte[] data, java.util.List<byte[]> values, int entries) {
    this();
    this.row = row;
    this.data = data;
    this.values = values;
    this.entries = entries;
    setEntriesIsSet(true);
  }
  
  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMutation(TMutation other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetRow()) {
      this.row = new byte[other.row.length];
      System.arraycopy(other.row, 0, row, 0, other.row.length);
    }
    if (other.isSetData()) {
      this.data = new byte[other.data.length];
      System.arraycopy(other.data, 0, data, 0, other.data.length);
    }
    if (other.isSetValues()) {
      java.util.List<byte[]> __this__values = new java.util.ArrayList<byte[]>();
      for (byte[] other_element : other.values) {
        byte[] temp_binary_element = new byte[other_element.length];
        System.arraycopy(other_element, 0, temp_binary_element, 0, other_element.length);
        __this__values.add(temp_binary_element);
      }
      this.values = __this__values;
    }
    this.entries = other.entries;
  }
  
  public TMutation deepCopy() {
    return new TMutation(this);
  }
  
  @Deprecated
  public TMutation clone() {
    return new TMutation(this);
  }
  
  public byte[] getRow() {
    return this.row;
  }
  
  public TMutation setRow(byte[] row) {
    this.row = row;
    return this;
  }
  
  public void unsetRow() {
    this.row = null;
  }
  
  /** Returns true if field row is set (has been asigned a value) and false otherwise */
  public boolean isSetRow() {
    return this.row != null;
  }
  
  public void setRowIsSet(boolean value) {
    if (!value) {
      this.row = null;
    }
  }
  
  public byte[] getData() {
    return this.data;
  }
  
  public TMutation setData(byte[] data) {
    this.data = data;
    return this;
  }
  
  public void unsetData() {
    this.data = null;
  }
  
  /** Returns true if field data is set (has been asigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }
  
  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }
  
  public int getValuesSize() {
    return (this.values == null) ? 0 : this.values.size();
  }
  
  public java.util.Iterator<byte[]> getValuesIterator() {
    return (this.values == null) ? null : this.values.iterator();
  }
  
  public void addToValues(byte[] elem) {
    if (this.values == null) {
      this.values = new java.util.ArrayList<byte[]>();
    }
    this.values.add(elem);
  }
  
  public java.util.List<byte[]> getValues() {
    return this.values;
  }
  
  public TMutation setValues(java.util.List<byte[]> values) {
    this.values = values;
    return this;
  }
  
  public void unsetValues() {
    this.values = null;
  }
  
  /** Returns true if field values is set (has been asigned a value) and false otherwise */
  public boolean isSetValues() {
    return this.values != null;
  }
  
  public void setValuesIsSet(boolean value) {
    if (!value) {
      this.values = null;
    }
  }
  
  public int getEntries() {
    return this.entries;
  }
  
  public TMutation setEntries(int entries) {
    this.entries = entries;
    setEntriesIsSet(true);
    return this;
  }
  
  public void unsetEntries() {
    __isset_bit_vector.clear(__ENTRIES_ISSET_ID);
  }
  
  /** Returns true if field entries is set (has been asigned a value) and false otherwise */
  public boolean isSetEntries() {
    return __isset_bit_vector.get(__ENTRIES_ISSET_ID);
  }
  
  public void setEntriesIsSet(boolean value) {
    __isset_bit_vector.set(__ENTRIES_ISSET_ID, value);
  }
  
  @SuppressWarnings("unchecked")
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
      case ROW:
        if (value == null) {
          unsetRow();
        } else {
          setRow((byte[]) value);
        }
        break;
      
      case DATA:
        if (value == null) {
          unsetData();
        } else {
          setData((byte[]) value);
        }
        break;
      
      case VALUES:
        if (value == null) {
          unsetValues();
        } else {
          setValues((java.util.List<byte[]>) value);
        }
        break;
      
      case ENTRIES:
        if (value == null) {
          unsetEntries();
        } else {
          setEntries((Integer) value);
        }
        break;
    
    }
  }
  
  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }
  
  public Object getFieldValue(_Fields field) {
    switch (field) {
      case ROW:
        return getRow();
        
      case DATA:
        return getData();
        
      case VALUES:
        return getValues();
        
      case ENTRIES:
        return new Integer(getEntries());
        
    }
    throw new IllegalStateException();
  }
  
  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }
  
  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
      case ROW:
        return isSetRow();
      case DATA:
        return isSetData();
      case VALUES:
        return isSetValues();
      case ENTRIES:
        return isSetEntries();
    }
    throw new IllegalStateException();
  }
  
  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }
  
  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TMutation)
      return this.equals((TMutation) that);
    return false;
  }
  
  public boolean equals(TMutation that) {
    if (that == null)
      return false;
    
    boolean this_present_row = true && this.isSetRow();
    boolean that_present_row = true && that.isSetRow();
    if (this_present_row || that_present_row) {
      if (!(this_present_row && that_present_row))
        return false;
      if (!java.util.Arrays.equals(this.row, that.row))
        return false;
    }
    
    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!java.util.Arrays.equals(this.data, that.data))
        return false;
    }
    
    boolean this_present_values = true && this.isSetValues();
    boolean that_present_values = true && that.isSetValues();
    if (this_present_values || that_present_values) {
      if (!(this_present_values && that_present_values))
        return false;
      if (!this.values.equals(that.values))
        return false;
    }
    
    boolean this_present_entries = true;
    boolean that_present_entries = true;
    if (this_present_entries || that_present_entries) {
      if (!(this_present_entries && that_present_entries))
        return false;
      if (this.entries != that.entries)
        return false;
    }
    
    return true;
  }
  
  @Override
  public int hashCode() {
    return 0;
  }
  
  public int compareTo(TMutation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }
    
    int lastComparison = 0;
    TMutation typedOther = (TMutation) other;
    
    lastComparison = Boolean.valueOf(isSetRow()).compareTo(typedOther.isSetRow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRow()) {
      lastComparison = TBaseHelper.compareTo(this.row, typedOther.row);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(typedOther.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = TBaseHelper.compareTo(this.data, typedOther.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValues()).compareTo(typedOther.isSetValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValues()) {
      lastComparison = TBaseHelper.compareTo(this.values, typedOther.values);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEntries()).compareTo(typedOther.isSetEntries());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntries()) {
      lastComparison = TBaseHelper.compareTo(this.entries, typedOther.entries);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }
  
  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true) {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case 1: // ROW
          if (field.type == TType.STRING) {
            this.row = iprot.readBinary();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // DATA
          if (field.type == TType.STRING) {
            this.data = iprot.readBinary();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // VALUES
          if (field.type == TType.LIST) {
            {
              TList _list0 = iprot.readListBegin();
              this.values = new java.util.ArrayList<byte[]>(_list0.size);
              for (int _i1 = 0; _i1 < _list0.size; ++_i1) {
                byte[] _elem2;
                _elem2 = iprot.readBinary();
                this.values.add(_elem2);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // ENTRIES
          if (field.type == TType.I32) {
            this.entries = iprot.readI32();
            setEntriesIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    
    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }
  
  public void write(TProtocol oprot) throws TException {
    validate();
    
    oprot.writeStructBegin(STRUCT_DESC);
    if (this.row != null) {
      oprot.writeFieldBegin(ROW_FIELD_DESC);
      oprot.writeBinary(this.row);
      oprot.writeFieldEnd();
    }
    if (this.data != null) {
      oprot.writeFieldBegin(DATA_FIELD_DESC);
      oprot.writeBinary(this.data);
      oprot.writeFieldEnd();
    }
    if (this.values != null) {
      oprot.writeFieldBegin(VALUES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.values.size()));
        for (byte[] _iter3 : this.values) {
          oprot.writeBinary(_iter3);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(ENTRIES_FIELD_DESC);
    oprot.writeI32(this.entries);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TMutation(");
    sb.append("row:");
    if (this.row == null) {
      sb.append("null");
    } else {
      int __row_size = Math.min(this.row.length, 128);
      for (int i = 0; i < __row_size; i++) {
        if (i != 0)
          sb.append(" ");
        sb.append(Integer.toHexString(this.row[i]).length() > 1 ? Integer.toHexString(this.row[i]).substring(Integer.toHexString(this.row[i]).length() - 2)
            .toUpperCase() : "0" + Integer.toHexString(this.row[i]).toUpperCase());
      }
      if (this.row.length > 128)
        sb.append(" ...");
    }
    sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      int __data_size = Math.min(this.data.length, 128);
      for (int i = 0; i < __data_size; i++) {
        if (i != 0)
          sb.append(" ");
        sb.append(Integer.toHexString(this.data[i]).length() > 1 ? Integer.toHexString(this.data[i]).substring(Integer.toHexString(this.data[i]).length() - 2)
            .toUpperCase() : "0" + Integer.toHexString(this.data[i]).toUpperCase());
      }
      if (this.data.length > 128)
        sb.append(" ...");
    }
    sb.append(", ");
    sb.append("values:");
    if (this.values == null) {
      sb.append("null");
    } else {
      sb.append(this.values);
    }
    sb.append(", ");
    sb.append("entries:");
    sb.append(this.entries);
    sb.append(")");
    return sb.toString();
  }
  
  public void validate() throws TException {
    // check for required fields
  }
  
}
