// automatically generated by the FlatBuffers compiler, do not modify

package UPZP.FWaitingRoomsList;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FWaitingRoomsList extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static FWaitingRoomsList getRootAsFWaitingRoomsList(ByteBuffer _bb) { return getRootAsFWaitingRoomsList(_bb, new FWaitingRoomsList()); }
  public static FWaitingRoomsList getRootAsFWaitingRoomsList(ByteBuffer _bb, FWaitingRoomsList obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public FWaitingRoomsList __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public UPZP.FWaitingRoomsList.FWaitingRoom waitingRoom(int j) { return waitingRoom(new UPZP.FWaitingRoomsList.FWaitingRoom(), j); }
  public UPZP.FWaitingRoomsList.FWaitingRoom waitingRoom(UPZP.FWaitingRoomsList.FWaitingRoom obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int waitingRoomLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public UPZP.FWaitingRoomsList.FWaitingRoom.Vector waitingRoomVector() { return waitingRoomVector(new UPZP.FWaitingRoomsList.FWaitingRoom.Vector()); }
  public UPZP.FWaitingRoomsList.FWaitingRoom.Vector waitingRoomVector(UPZP.FWaitingRoomsList.FWaitingRoom.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createFWaitingRoomsList(FlatBufferBuilder builder,
      int waitingRoomOffset) {
    builder.startTable(1);
    FWaitingRoomsList.addWaitingRoom(builder, waitingRoomOffset);
    return FWaitingRoomsList.endFWaitingRoomsList(builder);
  }

  public static void startFWaitingRoomsList(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addWaitingRoom(FlatBufferBuilder builder, int waitingRoomOffset) { builder.addOffset(0, waitingRoomOffset, 0); }
  public static int createWaitingRoomVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startWaitingRoomVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endFWaitingRoomsList(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishFWaitingRoomsListBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedFWaitingRoomsListBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public FWaitingRoomsList get(int j) { return get(new FWaitingRoomsList(), j); }
    public FWaitingRoomsList get(FWaitingRoomsList obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

