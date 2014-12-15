/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.dihaitech.tserver.managercenter;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2014-12-15")
public class ManagerInfo implements org.apache.thrift.TBase<ManagerInfo, ManagerInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ManagerInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ManagerInfo");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TEL_FIELD_DESC = new org.apache.thrift.protocol.TField("tel", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField MOBILE_FIELD_DESC = new org.apache.thrift.protocol.TField("mobile", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField SEX_FIELD_DESC = new org.apache.thrift.protocol.TField("sex", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("address", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField QQ_FIELD_DESC = new org.apache.thrift.protocol.TField("qq", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField UPDATETIME_FIELD_DESC = new org.apache.thrift.protocol.TField("updatetime", org.apache.thrift.protocol.TType.STRING, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ManagerInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ManagerInfoTupleSchemeFactory());
  }

  public int id; // required
  public String email; // required
  public String tel; // required
  public String mobile; // required
  public int sex; // required
  public String address; // required
  public String qq; // required
  public String updatetime; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    EMAIL((short)2, "email"),
    TEL((short)3, "tel"),
    MOBILE((short)4, "mobile"),
    SEX((short)5, "sex"),
    ADDRESS((short)6, "address"),
    QQ((short)7, "qq"),
    UPDATETIME((short)8, "updatetime");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // EMAIL
          return EMAIL;
        case 3: // TEL
          return TEL;
        case 4: // MOBILE
          return MOBILE;
        case 5: // SEX
          return SEX;
        case 6: // ADDRESS
          return ADDRESS;
        case 7: // QQ
          return QQ;
        case 8: // UPDATETIME
          return UPDATETIME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __SEX_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EMAIL, new org.apache.thrift.meta_data.FieldMetaData("email", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TEL, new org.apache.thrift.meta_data.FieldMetaData("tel", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MOBILE, new org.apache.thrift.meta_data.FieldMetaData("mobile", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEX, new org.apache.thrift.meta_data.FieldMetaData("sex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("address", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.QQ, new org.apache.thrift.meta_data.FieldMetaData("qq", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UPDATETIME, new org.apache.thrift.meta_data.FieldMetaData("updatetime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ManagerInfo.class, metaDataMap);
  }

  public ManagerInfo() {
  }

  public ManagerInfo(
    int id,
    String email,
    String tel,
    String mobile,
    int sex,
    String address,
    String qq,
    String updatetime)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.email = email;
    this.tel = tel;
    this.mobile = mobile;
    this.sex = sex;
    setSexIsSet(true);
    this.address = address;
    this.qq = qq;
    this.updatetime = updatetime;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ManagerInfo(ManagerInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetEmail()) {
      this.email = other.email;
    }
    if (other.isSetTel()) {
      this.tel = other.tel;
    }
    if (other.isSetMobile()) {
      this.mobile = other.mobile;
    }
    this.sex = other.sex;
    if (other.isSetAddress()) {
      this.address = other.address;
    }
    if (other.isSetQq()) {
      this.qq = other.qq;
    }
    if (other.isSetUpdatetime()) {
      this.updatetime = other.updatetime;
    }
  }

  public ManagerInfo deepCopy() {
    return new ManagerInfo(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.email = null;
    this.tel = null;
    this.mobile = null;
    setSexIsSet(false);
    this.sex = 0;
    this.address = null;
    this.qq = null;
    this.updatetime = null;
  }

  public int getId() {
    return this.id;
  }

  public ManagerInfo setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public String getEmail() {
    return this.email;
  }

  public ManagerInfo setEmail(String email) {
    this.email = email;
    return this;
  }

  public void unsetEmail() {
    this.email = null;
  }

  /** Returns true if field email is set (has been assigned a value) and false otherwise */
  public boolean isSetEmail() {
    return this.email != null;
  }

  public void setEmailIsSet(boolean value) {
    if (!value) {
      this.email = null;
    }
  }

  public String getTel() {
    return this.tel;
  }

  public ManagerInfo setTel(String tel) {
    this.tel = tel;
    return this;
  }

  public void unsetTel() {
    this.tel = null;
  }

  /** Returns true if field tel is set (has been assigned a value) and false otherwise */
  public boolean isSetTel() {
    return this.tel != null;
  }

  public void setTelIsSet(boolean value) {
    if (!value) {
      this.tel = null;
    }
  }

  public String getMobile() {
    return this.mobile;
  }

  public ManagerInfo setMobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  public void unsetMobile() {
    this.mobile = null;
  }

  /** Returns true if field mobile is set (has been assigned a value) and false otherwise */
  public boolean isSetMobile() {
    return this.mobile != null;
  }

  public void setMobileIsSet(boolean value) {
    if (!value) {
      this.mobile = null;
    }
  }

  public int getSex() {
    return this.sex;
  }

  public ManagerInfo setSex(int sex) {
    this.sex = sex;
    setSexIsSet(true);
    return this;
  }

  public void unsetSex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SEX_ISSET_ID);
  }

  /** Returns true if field sex is set (has been assigned a value) and false otherwise */
  public boolean isSetSex() {
    return EncodingUtils.testBit(__isset_bitfield, __SEX_ISSET_ID);
  }

  public void setSexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SEX_ISSET_ID, value);
  }

  public String getAddress() {
    return this.address;
  }

  public ManagerInfo setAddress(String address) {
    this.address = address;
    return this;
  }

  public void unsetAddress() {
    this.address = null;
  }

  /** Returns true if field address is set (has been assigned a value) and false otherwise */
  public boolean isSetAddress() {
    return this.address != null;
  }

  public void setAddressIsSet(boolean value) {
    if (!value) {
      this.address = null;
    }
  }

  public String getQq() {
    return this.qq;
  }

  public ManagerInfo setQq(String qq) {
    this.qq = qq;
    return this;
  }

  public void unsetQq() {
    this.qq = null;
  }

  /** Returns true if field qq is set (has been assigned a value) and false otherwise */
  public boolean isSetQq() {
    return this.qq != null;
  }

  public void setQqIsSet(boolean value) {
    if (!value) {
      this.qq = null;
    }
  }

  public String getUpdatetime() {
    return this.updatetime;
  }

  public ManagerInfo setUpdatetime(String updatetime) {
    this.updatetime = updatetime;
    return this;
  }

  public void unsetUpdatetime() {
    this.updatetime = null;
  }

  /** Returns true if field updatetime is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdatetime() {
    return this.updatetime != null;
  }

  public void setUpdatetimeIsSet(boolean value) {
    if (!value) {
      this.updatetime = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case EMAIL:
      if (value == null) {
        unsetEmail();
      } else {
        setEmail((String)value);
      }
      break;

    case TEL:
      if (value == null) {
        unsetTel();
      } else {
        setTel((String)value);
      }
      break;

    case MOBILE:
      if (value == null) {
        unsetMobile();
      } else {
        setMobile((String)value);
      }
      break;

    case SEX:
      if (value == null) {
        unsetSex();
      } else {
        setSex((Integer)value);
      }
      break;

    case ADDRESS:
      if (value == null) {
        unsetAddress();
      } else {
        setAddress((String)value);
      }
      break;

    case QQ:
      if (value == null) {
        unsetQq();
      } else {
        setQq((String)value);
      }
      break;

    case UPDATETIME:
      if (value == null) {
        unsetUpdatetime();
      } else {
        setUpdatetime((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return Integer.valueOf(getId());

    case EMAIL:
      return getEmail();

    case TEL:
      return getTel();

    case MOBILE:
      return getMobile();

    case SEX:
      return Integer.valueOf(getSex());

    case ADDRESS:
      return getAddress();

    case QQ:
      return getQq();

    case UPDATETIME:
      return getUpdatetime();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case EMAIL:
      return isSetEmail();
    case TEL:
      return isSetTel();
    case MOBILE:
      return isSetMobile();
    case SEX:
      return isSetSex();
    case ADDRESS:
      return isSetAddress();
    case QQ:
      return isSetQq();
    case UPDATETIME:
      return isSetUpdatetime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ManagerInfo)
      return this.equals((ManagerInfo)that);
    return false;
  }

  public boolean equals(ManagerInfo that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_email = true && this.isSetEmail();
    boolean that_present_email = true && that.isSetEmail();
    if (this_present_email || that_present_email) {
      if (!(this_present_email && that_present_email))
        return false;
      if (!this.email.equals(that.email))
        return false;
    }

    boolean this_present_tel = true && this.isSetTel();
    boolean that_present_tel = true && that.isSetTel();
    if (this_present_tel || that_present_tel) {
      if (!(this_present_tel && that_present_tel))
        return false;
      if (!this.tel.equals(that.tel))
        return false;
    }

    boolean this_present_mobile = true && this.isSetMobile();
    boolean that_present_mobile = true && that.isSetMobile();
    if (this_present_mobile || that_present_mobile) {
      if (!(this_present_mobile && that_present_mobile))
        return false;
      if (!this.mobile.equals(that.mobile))
        return false;
    }

    boolean this_present_sex = true;
    boolean that_present_sex = true;
    if (this_present_sex || that_present_sex) {
      if (!(this_present_sex && that_present_sex))
        return false;
      if (this.sex != that.sex)
        return false;
    }

    boolean this_present_address = true && this.isSetAddress();
    boolean that_present_address = true && that.isSetAddress();
    if (this_present_address || that_present_address) {
      if (!(this_present_address && that_present_address))
        return false;
      if (!this.address.equals(that.address))
        return false;
    }

    boolean this_present_qq = true && this.isSetQq();
    boolean that_present_qq = true && that.isSetQq();
    if (this_present_qq || that_present_qq) {
      if (!(this_present_qq && that_present_qq))
        return false;
      if (!this.qq.equals(that.qq))
        return false;
    }

    boolean this_present_updatetime = true && this.isSetUpdatetime();
    boolean that_present_updatetime = true && that.isSetUpdatetime();
    if (this_present_updatetime || that_present_updatetime) {
      if (!(this_present_updatetime && that_present_updatetime))
        return false;
      if (!this.updatetime.equals(that.updatetime))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true;
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_email = true && (isSetEmail());
    list.add(present_email);
    if (present_email)
      list.add(email);

    boolean present_tel = true && (isSetTel());
    list.add(present_tel);
    if (present_tel)
      list.add(tel);

    boolean present_mobile = true && (isSetMobile());
    list.add(present_mobile);
    if (present_mobile)
      list.add(mobile);

    boolean present_sex = true;
    list.add(present_sex);
    if (present_sex)
      list.add(sex);

    boolean present_address = true && (isSetAddress());
    list.add(present_address);
    if (present_address)
      list.add(address);

    boolean present_qq = true && (isSetQq());
    list.add(present_qq);
    if (present_qq)
      list.add(qq);

    boolean present_updatetime = true && (isSetUpdatetime());
    list.add(present_updatetime);
    if (present_updatetime)
      list.add(updatetime);

    return list.hashCode();
  }

  @Override
  public int compareTo(ManagerInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEmail()).compareTo(other.isSetEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.email, other.email);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTel()).compareTo(other.isSetTel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tel, other.tel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMobile()).compareTo(other.isSetMobile());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMobile()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mobile, other.mobile);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSex()).compareTo(other.isSetSex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sex, other.sex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAddress()).compareTo(other.isSetAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.address, other.address);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQq()).compareTo(other.isSetQq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQq()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.qq, other.qq);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdatetime()).compareTo(other.isSetUpdatetime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdatetime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updatetime, other.updatetime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ManagerInfo(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("email:");
    if (this.email == null) {
      sb.append("null");
    } else {
      sb.append(this.email);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tel:");
    if (this.tel == null) {
      sb.append("null");
    } else {
      sb.append(this.tel);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mobile:");
    if (this.mobile == null) {
      sb.append("null");
    } else {
      sb.append(this.mobile);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sex:");
    sb.append(this.sex);
    first = false;
    if (!first) sb.append(", ");
    sb.append("address:");
    if (this.address == null) {
      sb.append("null");
    } else {
      sb.append(this.address);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("qq:");
    if (this.qq == null) {
      sb.append("null");
    } else {
      sb.append(this.qq);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("updatetime:");
    if (this.updatetime == null) {
      sb.append("null");
    } else {
      sb.append(this.updatetime);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ManagerInfoStandardSchemeFactory implements SchemeFactory {
    public ManagerInfoStandardScheme getScheme() {
      return new ManagerInfoStandardScheme();
    }
  }

  private static class ManagerInfoStandardScheme extends StandardScheme<ManagerInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ManagerInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EMAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.email = iprot.readString();
              struct.setEmailIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tel = iprot.readString();
              struct.setTelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MOBILE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mobile = iprot.readString();
              struct.setMobileIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sex = iprot.readI32();
              struct.setSexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.address = iprot.readString();
              struct.setAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // QQ
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.qq = iprot.readString();
              struct.setQqIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // UPDATETIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.updatetime = iprot.readString();
              struct.setUpdatetimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ManagerInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      if (struct.email != null) {
        oprot.writeFieldBegin(EMAIL_FIELD_DESC);
        oprot.writeString(struct.email);
        oprot.writeFieldEnd();
      }
      if (struct.tel != null) {
        oprot.writeFieldBegin(TEL_FIELD_DESC);
        oprot.writeString(struct.tel);
        oprot.writeFieldEnd();
      }
      if (struct.mobile != null) {
        oprot.writeFieldBegin(MOBILE_FIELD_DESC);
        oprot.writeString(struct.mobile);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SEX_FIELD_DESC);
      oprot.writeI32(struct.sex);
      oprot.writeFieldEnd();
      if (struct.address != null) {
        oprot.writeFieldBegin(ADDRESS_FIELD_DESC);
        oprot.writeString(struct.address);
        oprot.writeFieldEnd();
      }
      if (struct.qq != null) {
        oprot.writeFieldBegin(QQ_FIELD_DESC);
        oprot.writeString(struct.qq);
        oprot.writeFieldEnd();
      }
      if (struct.updatetime != null) {
        oprot.writeFieldBegin(UPDATETIME_FIELD_DESC);
        oprot.writeString(struct.updatetime);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ManagerInfoTupleSchemeFactory implements SchemeFactory {
    public ManagerInfoTupleScheme getScheme() {
      return new ManagerInfoTupleScheme();
    }
  }

  private static class ManagerInfoTupleScheme extends TupleScheme<ManagerInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ManagerInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetEmail()) {
        optionals.set(1);
      }
      if (struct.isSetTel()) {
        optionals.set(2);
      }
      if (struct.isSetMobile()) {
        optionals.set(3);
      }
      if (struct.isSetSex()) {
        optionals.set(4);
      }
      if (struct.isSetAddress()) {
        optionals.set(5);
      }
      if (struct.isSetQq()) {
        optionals.set(6);
      }
      if (struct.isSetUpdatetime()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetEmail()) {
        oprot.writeString(struct.email);
      }
      if (struct.isSetTel()) {
        oprot.writeString(struct.tel);
      }
      if (struct.isSetMobile()) {
        oprot.writeString(struct.mobile);
      }
      if (struct.isSetSex()) {
        oprot.writeI32(struct.sex);
      }
      if (struct.isSetAddress()) {
        oprot.writeString(struct.address);
      }
      if (struct.isSetQq()) {
        oprot.writeString(struct.qq);
      }
      if (struct.isSetUpdatetime()) {
        oprot.writeString(struct.updatetime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ManagerInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.email = iprot.readString();
        struct.setEmailIsSet(true);
      }
      if (incoming.get(2)) {
        struct.tel = iprot.readString();
        struct.setTelIsSet(true);
      }
      if (incoming.get(3)) {
        struct.mobile = iprot.readString();
        struct.setMobileIsSet(true);
      }
      if (incoming.get(4)) {
        struct.sex = iprot.readI32();
        struct.setSexIsSet(true);
      }
      if (incoming.get(5)) {
        struct.address = iprot.readString();
        struct.setAddressIsSet(true);
      }
      if (incoming.get(6)) {
        struct.qq = iprot.readString();
        struct.setQqIsSet(true);
      }
      if (incoming.get(7)) {
        struct.updatetime = iprot.readString();
        struct.setUpdatetimeIsSet(true);
      }
    }
  }

}

