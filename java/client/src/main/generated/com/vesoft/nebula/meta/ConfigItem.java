/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class ConfigItem implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ConfigItem");
  private static final TField MODULE_FIELD_DESC = new TField("module", TType.I32, (short)1);
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)2);
  private static final TField MODE_FIELD_DESC = new TField("mode", TType.I32, (short)3);
  private static final TField VALUE_FIELD_DESC = new TField("value", TType.STRUCT, (short)4);

  /**
   * 
   * @see ConfigModule
   */
  public int module;
  public byte[] name;
  /**
   * 
   * @see ConfigMode
   */
  public int mode;
  public com.vesoft.nebula.Value value;
  public static final int MODULE = 1;
  public static final int NAME = 2;
  public static final int MODE = 3;
  public static final int VALUE = 4;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __MODULE_ISSET_ID = 0;
  private static final int __MODE_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(MODULE, new FieldMetaData("module", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(NAME, new FieldMetaData("name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(MODE, new FieldMetaData("mode", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(VALUE, new FieldMetaData("value", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.vesoft.nebula.Value.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(ConfigItem.class, metaDataMap);
  }

  public ConfigItem() {
  }

  public ConfigItem(
    int module,
    byte[] name,
    int mode,
    com.vesoft.nebula.Value value)
  {
    this();
    this.module = module;
    setModuleIsSet(true);
    this.name = name;
    this.mode = mode;
    setModeIsSet(true);
    this.value = value;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ConfigItem(ConfigItem other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.module = TBaseHelper.deepCopy(other.module);
    if (other.isSetName()) {
      this.name = TBaseHelper.deepCopy(other.name);
    }
    this.mode = TBaseHelper.deepCopy(other.mode);
    if (other.isSetValue()) {
      this.value = TBaseHelper.deepCopy(other.value);
    }
  }

  public ConfigItem deepCopy() {
    return new ConfigItem(this);
  }

  @Deprecated
  public ConfigItem clone() {
    return new ConfigItem(this);
  }

  /**
   * 
   * @see ConfigModule
   */
  public int  getModule() {
    return this.module;
  }

  /**
   * 
   * @see ConfigModule
   */
  public ConfigItem setModule(int module) {
    this.module = module;
    setModuleIsSet(true);
    return this;
  }

  public void unsetModule() {
    __isset_bit_vector.clear(__MODULE_ISSET_ID);
  }

  // Returns true if field module is set (has been assigned a value) and false otherwise
  public boolean isSetModule() {
    return __isset_bit_vector.get(__MODULE_ISSET_ID);
  }

  public void setModuleIsSet(boolean value) {
    __isset_bit_vector.set(__MODULE_ISSET_ID, value);
  }

  public byte[]  getName() {
    return this.name;
  }

  public ConfigItem setName(byte[] name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  // Returns true if field name is set (has been assigned a value) and false otherwise
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  /**
   * 
   * @see ConfigMode
   */
  public int  getMode() {
    return this.mode;
  }

  /**
   * 
   * @see ConfigMode
   */
  public ConfigItem setMode(int mode) {
    this.mode = mode;
    setModeIsSet(true);
    return this;
  }

  public void unsetMode() {
    __isset_bit_vector.clear(__MODE_ISSET_ID);
  }

  // Returns true if field mode is set (has been assigned a value) and false otherwise
  public boolean isSetMode() {
    return __isset_bit_vector.get(__MODE_ISSET_ID);
  }

  public void setModeIsSet(boolean value) {
    __isset_bit_vector.set(__MODE_ISSET_ID, value);
  }

  public com.vesoft.nebula.Value  getValue() {
    return this.value;
  }

  public ConfigItem setValue(com.vesoft.nebula.Value value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  // Returns true if field value is set (has been assigned a value) and false otherwise
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case MODULE:
      if (value == null) {
        unsetModule();
      } else {
        setModule((Integer)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((byte[])value);
      }
      break;

    case MODE:
      if (value == null) {
        unsetMode();
      } else {
        setMode((Integer)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((com.vesoft.nebula.Value)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case MODULE:
      return getModule();

    case NAME:
      return getName();

    case MODE:
      return getMode();

    case VALUE:
      return getValue();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case MODULE:
      return isSetModule();
    case NAME:
      return isSetName();
    case MODE:
      return isSetMode();
    case VALUE:
      return isSetValue();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ConfigItem)
      return this.equals((ConfigItem)that);
    return false;
  }

  public boolean equals(ConfigItem that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_module = true;
    boolean that_present_module = true;
    if (this_present_module || that_present_module) {
      if (!(this_present_module && that_present_module))
        return false;
      if (!TBaseHelper.equalsNobinary(this.module, that.module))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!TBaseHelper.equalsSlow(this.name, that.name))
        return false;
    }

    boolean this_present_mode = true;
    boolean that_present_mode = true;
    if (this_present_mode || that_present_mode) {
      if (!(this_present_mode && that_present_mode))
        return false;
      if (!TBaseHelper.equalsNobinary(this.mode, that.mode))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!TBaseHelper.equalsNobinary(this.value, that.value))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_module = true;
    builder.append(present_module);
    if (present_module)
      builder.append(module);

    boolean present_name = true && (isSetName());
    builder.append(present_name);
    if (present_name)
      builder.append(name);

    boolean present_mode = true;
    builder.append(present_mode);
    if (present_mode)
      builder.append(mode);

    boolean present_value = true && (isSetValue());
    builder.append(present_value);
    if (present_value)
      builder.append(value);

    return builder.toHashCode();
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case MODULE:
          if (field.type == TType.I32) {
            this.module = iprot.readI32();
            setModuleIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case NAME:
          if (field.type == TType.STRING) {
            this.name = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case MODE:
          if (field.type == TType.I32) {
            this.mode = iprot.readI32();
            setModeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case VALUE:
          if (field.type == TType.STRUCT) {
            this.value = new com.vesoft.nebula.Value();
            this.value.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
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
    oprot.writeFieldBegin(MODULE_FIELD_DESC);
    oprot.writeI32(this.module);
    oprot.writeFieldEnd();
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeBinary(this.name);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(MODE_FIELD_DESC);
    oprot.writeI32(this.mode);
    oprot.writeFieldEnd();
    if (this.value != null) {
      oprot.writeFieldBegin(VALUE_FIELD_DESC);
      this.value.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("ConfigItem");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("module");
    sb.append(space);
    sb.append(":").append(space);
    String module_name = ConfigModule.VALUES_TO_NAMES.get(this. getModule());
    if (module_name != null) {
      sb.append(module_name);
      sb.append(" (");
    }
    sb.append(this. getModule());
    if (module_name != null) {
      sb.append(")");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("name");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getName() == null) {
      sb.append("null");
    } else {
        int __name_size = Math.min(this. getName().length, 128);
        for (int i = 0; i < __name_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getName()[i]).length() > 1 ? Integer.toHexString(this. getName()[i]).substring(Integer.toHexString(this. getName()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getName()[i]).toUpperCase());
        }
        if (this. getName().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("mode");
    sb.append(space);
    sb.append(":").append(space);
    String mode_name = ConfigMode.VALUES_TO_NAMES.get(this. getMode());
    if (mode_name != null) {
      sb.append(mode_name);
      sb.append(" (");
    }
    sb.append(this. getMode());
    if (mode_name != null) {
      sb.append(")");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("value");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getValue() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getValue(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetModule() && !ConfigModule.VALID_VALUES.contains(module)){
      throw new TProtocolException("The field 'module' has been assigned the invalid value " + module);
    }
    if (isSetMode() && !ConfigMode.VALID_VALUES.contains(mode)){
      throw new TProtocolException("The field 'mode' has been assigned the invalid value " + mode);
    }
  }

}

