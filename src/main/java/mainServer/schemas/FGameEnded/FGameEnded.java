// automatically generated by the FlatBuffers compiler, do not modify

package mainServer.schemas.FGameEnded;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FGameEnded extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static FGameEnded getRootAsFGameEnded(ByteBuffer _bb) { return getRootAsFGameEnded(_bb, new FGameEnded()); }
  public static FGameEnded getRootAsFGameEnded(ByteBuffer _bb, FGameEnded obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public FGameEnded __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public boolean ended() { int o = __offset(4); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createFGameEnded(FlatBufferBuilder builder,
      boolean ended) {
    builder.startTable(1);
    FGameEnded.addEnded(builder, ended);
    return FGameEnded.endFGameEnded(builder);
  }

  public static void startFGameEnded(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addEnded(FlatBufferBuilder builder, boolean ended) { builder.addBoolean(0, ended, false); }
  public static int endFGameEnded(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishFGameEndedBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedFGameEndedBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public FGameEnded get(int j) { return get(new FGameEnded(), j); }
    public FGameEnded get(FGameEnded obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
