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
public class ChangePasswordReq implements TBase, java.io.Serializable, Cloneable, Comparable<ChangePasswordReq> {
  private static final TStruct STRUCT_DESC = new TStruct("ChangePasswordReq");
  private static final TField ACCOUNT_FIELD_DESC = new TField("account", TType.STRING, (short)1);
  private static final TField NEW_ENCODED_PWD_FIELD_DESC = new TField("new_encoded_pwd", TType.STRING, (short)2);
  private static final TField OLD_ENCODED_PWD_FIELD_DESC = new TField("old_encoded_pwd", TType.STRING, (short)3);

  public byte[] account;
  public byte[] new_encoded_pwd;
  public byte[] old_encoded_pwd;
  public static final int ACCOUNT = 1;
  public static final int NEW_ENCODED_PWD = 2;
  public static final int OLD_ENCODED_PWD = 3;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(ACCOUNT, new FieldMetaData("account", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(NEW_ENCODED_PWD, new FieldMetaData("new_encoded_pwd", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(OLD_ENCODED_PWD, new FieldMetaData("old_encoded_pwd", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(ChangePasswordReq.class, metaDataMap);
  }

  public ChangePasswordReq() {
  }

  public ChangePasswordReq(
    byte[] account,
    byte[] new_encoded_pwd,
    byte[] old_encoded_pwd)
  {
    this();
    this.account = account;
    this.new_encoded_pwd = new_encoded_pwd;
    this.old_encoded_pwd = old_encoded_pwd;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ChangePasswordReq(ChangePasswordReq other) {
    if (other.isSetAccount()) {
      this.account = TBaseHelper.deepCopy(other.account);
    }
    if (other.isSetNew_encoded_pwd()) {
      this.new_encoded_pwd = TBaseHelper.deepCopy(other.new_encoded_pwd);
    }
    if (other.isSetOld_encoded_pwd()) {
      this.old_encoded_pwd = TBaseHelper.deepCopy(other.old_encoded_pwd);
    }
  }

  public ChangePasswordReq deepCopy() {
    return new ChangePasswordReq(this);
  }

  @Deprecated
  public ChangePasswordReq clone() {
    return new ChangePasswordReq(this);
  }

  public byte[]  getAccount() {
    return this.account;
  }

  public ChangePasswordReq setAccount(byte[] account) {
    this.account = account;
    return this;
  }

  public void unsetAccount() {
    this.account = null;
  }

  // Returns true if field account is set (has been assigned a value) and false otherwise
  public boolean isSetAccount() {
    return this.account != null;
  }

  public void setAccountIsSet(boolean value) {
    if (!value) {
      this.account = null;
    }
  }

  public byte[]  getNew_encoded_pwd() {
    return this.new_encoded_pwd;
  }

  public ChangePasswordReq setNew_encoded_pwd(byte[] new_encoded_pwd) {
    this.new_encoded_pwd = new_encoded_pwd;
    return this;
  }

  public void unsetNew_encoded_pwd() {
    this.new_encoded_pwd = null;
  }

  // Returns true if field new_encoded_pwd is set (has been assigned a value) and false otherwise
  public boolean isSetNew_encoded_pwd() {
    return this.new_encoded_pwd != null;
  }

  public void setNew_encoded_pwdIsSet(boolean value) {
    if (!value) {
      this.new_encoded_pwd = null;
    }
  }

  public byte[]  getOld_encoded_pwd() {
    return this.old_encoded_pwd;
  }

  public ChangePasswordReq setOld_encoded_pwd(byte[] old_encoded_pwd) {
    this.old_encoded_pwd = old_encoded_pwd;
    return this;
  }

  public void unsetOld_encoded_pwd() {
    this.old_encoded_pwd = null;
  }

  // Returns true if field old_encoded_pwd is set (has been assigned a value) and false otherwise
  public boolean isSetOld_encoded_pwd() {
    return this.old_encoded_pwd != null;
  }

  public void setOld_encoded_pwdIsSet(boolean value) {
    if (!value) {
      this.old_encoded_pwd = null;
    }
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case ACCOUNT:
      if (value == null) {
        unsetAccount();
      } else {
        setAccount((byte[])value);
      }
      break;

    case NEW_ENCODED_PWD:
      if (value == null) {
        unsetNew_encoded_pwd();
      } else {
        setNew_encoded_pwd((byte[])value);
      }
      break;

    case OLD_ENCODED_PWD:
      if (value == null) {
        unsetOld_encoded_pwd();
      } else {
        setOld_encoded_pwd((byte[])value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case ACCOUNT:
      return getAccount();

    case NEW_ENCODED_PWD:
      return getNew_encoded_pwd();

    case OLD_ENCODED_PWD:
      return getOld_encoded_pwd();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case ACCOUNT:
      return isSetAccount();
    case NEW_ENCODED_PWD:
      return isSetNew_encoded_pwd();
    case OLD_ENCODED_PWD:
      return isSetOld_encoded_pwd();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ChangePasswordReq)
      return this.equals((ChangePasswordReq)that);
    return false;
  }

  public boolean equals(ChangePasswordReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_account = true && this.isSetAccount();
    boolean that_present_account = true && that.isSetAccount();
    if (this_present_account || that_present_account) {
      if (!(this_present_account && that_present_account))
        return false;
      if (!TBaseHelper.equalsSlow(this.account, that.account))
        return false;
    }

    boolean this_present_new_encoded_pwd = true && this.isSetNew_encoded_pwd();
    boolean that_present_new_encoded_pwd = true && that.isSetNew_encoded_pwd();
    if (this_present_new_encoded_pwd || that_present_new_encoded_pwd) {
      if (!(this_present_new_encoded_pwd && that_present_new_encoded_pwd))
        return false;
      if (!TBaseHelper.equalsSlow(this.new_encoded_pwd, that.new_encoded_pwd))
        return false;
    }

    boolean this_present_old_encoded_pwd = true && this.isSetOld_encoded_pwd();
    boolean that_present_old_encoded_pwd = true && that.isSetOld_encoded_pwd();
    if (this_present_old_encoded_pwd || that_present_old_encoded_pwd) {
      if (!(this_present_old_encoded_pwd && that_present_old_encoded_pwd))
        return false;
      if (!TBaseHelper.equalsSlow(this.old_encoded_pwd, that.old_encoded_pwd))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_account = true && (isSetAccount());
    builder.append(present_account);
    if (present_account)
      builder.append(account);

    boolean present_new_encoded_pwd = true && (isSetNew_encoded_pwd());
    builder.append(present_new_encoded_pwd);
    if (present_new_encoded_pwd)
      builder.append(new_encoded_pwd);

    boolean present_old_encoded_pwd = true && (isSetOld_encoded_pwd());
    builder.append(present_old_encoded_pwd);
    if (present_old_encoded_pwd)
      builder.append(old_encoded_pwd);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(ChangePasswordReq other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAccount()).compareTo(other.isSetAccount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(account, other.account);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetNew_encoded_pwd()).compareTo(other.isSetNew_encoded_pwd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(new_encoded_pwd, other.new_encoded_pwd);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetOld_encoded_pwd()).compareTo(other.isSetOld_encoded_pwd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(old_encoded_pwd, other.old_encoded_pwd);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
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
        case ACCOUNT:
          if (field.type == TType.STRING) {
            this.account = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case NEW_ENCODED_PWD:
          if (field.type == TType.STRING) {
            this.new_encoded_pwd = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case OLD_ENCODED_PWD:
          if (field.type == TType.STRING) {
            this.old_encoded_pwd = iprot.readBinary();
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
    if (this.account != null) {
      oprot.writeFieldBegin(ACCOUNT_FIELD_DESC);
      oprot.writeBinary(this.account);
      oprot.writeFieldEnd();
    }
    if (this.new_encoded_pwd != null) {
      oprot.writeFieldBegin(NEW_ENCODED_PWD_FIELD_DESC);
      oprot.writeBinary(this.new_encoded_pwd);
      oprot.writeFieldEnd();
    }
    if (this.old_encoded_pwd != null) {
      oprot.writeFieldBegin(OLD_ENCODED_PWD_FIELD_DESC);
      oprot.writeBinary(this.old_encoded_pwd);
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
    StringBuilder sb = new StringBuilder("ChangePasswordReq");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("account");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getAccount() == null) {
      sb.append("null");
    } else {
        int __account_size = Math.min(this. getAccount().length, 128);
        for (int i = 0; i < __account_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getAccount()[i]).length() > 1 ? Integer.toHexString(this. getAccount()[i]).substring(Integer.toHexString(this. getAccount()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getAccount()[i]).toUpperCase());
        }
        if (this. getAccount().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("new_encoded_pwd");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getNew_encoded_pwd() == null) {
      sb.append("null");
    } else {
        int __new_encoded_pwd_size = Math.min(this. getNew_encoded_pwd().length, 128);
        for (int i = 0; i < __new_encoded_pwd_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getNew_encoded_pwd()[i]).length() > 1 ? Integer.toHexString(this. getNew_encoded_pwd()[i]).substring(Integer.toHexString(this. getNew_encoded_pwd()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getNew_encoded_pwd()[i]).toUpperCase());
        }
        if (this. getNew_encoded_pwd().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("old_encoded_pwd");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getOld_encoded_pwd() == null) {
      sb.append("null");
    } else {
        int __old_encoded_pwd_size = Math.min(this. getOld_encoded_pwd().length, 128);
        for (int i = 0; i < __old_encoded_pwd_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getOld_encoded_pwd()[i]).length() > 1 ? Integer.toHexString(this. getOld_encoded_pwd()[i]).substring(Integer.toHexString(this. getOld_encoded_pwd()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getOld_encoded_pwd()[i]).toUpperCase());
        }
        if (this. getOld_encoded_pwd().length > 128) sb.append(" ...");
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

