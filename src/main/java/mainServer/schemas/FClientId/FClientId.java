// automatically generated by the FlatBuffers compiler, do not modify

package mainServer.schemas.FClientId;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FClientId extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static FClientId getRootAsFClientId(ByteBuffer _bb) { return getRootAsFClientId(_bb, new FClientId()); }
  public static FClientId getRootAsFClientId(ByteBuffer _bb, FClientId obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public FClientId __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int id() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createFClientId(FlatBufferBuilder builder,
      int id) {
    builder.startTable(1);
    FClientId.addId(builder, id);
    return FClientId.endFClientId(builder);
  }

  public static void startFClientId(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addInt(0, id, 0); }
  public static int endFClientId(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishFClientIdBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedFClientIdBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public FClientId get(int j) { return get(new FClientId(), j); }
    public FClientId get(FClientId obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

