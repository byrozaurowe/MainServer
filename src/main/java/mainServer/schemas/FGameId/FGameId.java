// automatically generated by the FlatBuffers compiler, do not modify

package mainServer.schemas.FGameId;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FGameId extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static FGameId getRootAsFGameId(ByteBuffer _bb) { return getRootAsFGameId(_bb, new FGameId()); }
  public static FGameId getRootAsFGameId(ByteBuffer _bb, FGameId obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public FGameId __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int id() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createFGameId(FlatBufferBuilder builder,
      int id) {
    builder.startTable(1);
    FGameId.addId(builder, id);
    return FGameId.endFGameId(builder);
  }

  public static void startFGameId(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addInt(0, id, 0); }
  public static int endFGameId(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishFGameIdBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedFGameIdBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public FGameId get(int j) { return get(new FGameId(), j); }
    public FGameId get(FGameId obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
