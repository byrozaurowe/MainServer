// automatically generated by the FlatBuffers compiler, do not modify

package UPZP.FWaitingRoom;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FClient extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static FClient getRootAsFClient(ByteBuffer _bb) { return getRootAsFClient(_bb, new FClient()); }
  public static FClient getRootAsFClient(ByteBuffer _bb, FClient obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public FClient __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public int id() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public UPZP.FWaitingRoom.FVehicle vehicle() { return vehicle(new UPZP.FWaitingRoom.FVehicle()); }
  public UPZP.FWaitingRoom.FVehicle vehicle(UPZP.FWaitingRoom.FVehicle obj) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createFClient(FlatBufferBuilder builder,
      int nameOffset,
      int id,
      int vehicleOffset) {
    builder.startTable(3);
    FClient.addVehicle(builder, vehicleOffset);
    FClient.addId(builder, id);
    FClient.addName(builder, nameOffset);
    return FClient.endFClient(builder);
  }

  public static void startFClient(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addInt(1, id, 0); }
  public static void addVehicle(FlatBufferBuilder builder, int vehicleOffset) { builder.addOffset(2, vehicleOffset, 0); }
  public static int endFClient(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public FClient get(int j) { return get(new FClient(), j); }
    public FClient get(FClient obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

