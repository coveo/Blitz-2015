/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.coveo.blitz.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum OrderingType implements org.apache.thrift.TEnum {
  ASCENDING(1),
  DESCENDING(2);

  private final int value;

  private OrderingType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static OrderingType findByValue(int value) { 
    switch (value) {
      case 1:
        return ASCENDING;
      case 2:
        return DESCENDING;
      default:
        return null;
    }
  }
}
