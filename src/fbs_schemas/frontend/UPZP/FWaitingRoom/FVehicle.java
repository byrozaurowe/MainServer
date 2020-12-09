// automatically generated by the FlatBuffers compiler, do not modify

package UPZP.FWaitingRoom;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FVehicle extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static FVehicle getRootAsFVehicle(ByteBuffer _bb) { return getRootAsFVehicle(_bb, new FVehicle()); }
  public static FVehicle getRootAsFVehicle(ByteBuffer _bb, FVehicle obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public FVehicle __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public byte vehicleType() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public int velocity() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createFVehicle(FlatBufferBuilder builder,
      byte vehicleType,
      int velocity) {
    builder.startTable(2);
    FVehicle.addVelocity(builder, velocity);
    FVehicle.addVehicleType(builder, vehicleType);
    return FVehicle.endFVehicle(builder);
  }

  public static void startFVehicle(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addVehicleType(FlatBufferBuilder builder, byte vehicleType) { builder.addByte(0, vehicleType, 0); }
  public static void addVelocity(FlatBufferBuilder builder, int velocity) { builder.addInt(1, velocity, 0); }
  public static int endFVehicle(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishFVehicleBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedFVehicleBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public FVehicle get(int j) { return get(new FVehicle(), j); }
    public FVehicle get(FVehicle obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

