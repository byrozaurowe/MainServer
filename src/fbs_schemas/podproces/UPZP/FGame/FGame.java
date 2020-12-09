// automatically generated by the FlatBuffers compiler, do not modify

package UPZP.FGame;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FGame extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static FGame getRootAsFGame(ByteBuffer _bb) { return getRootAsFGame(_bb, new FGame()); }
  public static FGame getRootAsFGame(ByteBuffer _bb, FGame obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public FGame __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int id() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public UPZP.FGame.FTeam teams(int j) { return teams(new UPZP.FGame.FTeam(), j); }
  public UPZP.FGame.FTeam teams(UPZP.FGame.FTeam obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int teamsLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public UPZP.FGame.FTeam.Vector teamsVector() { return teamsVector(new UPZP.FGame.FTeam.Vector()); }
  public UPZP.FGame.FTeam.Vector teamsVector(UPZP.FGame.FTeam.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String city() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer cityAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer cityInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }
  public int host() { int o = __offset(10); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int clientsMax() { int o = __offset(12); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createFGame(FlatBufferBuilder builder,
      int id,
      int teamsOffset,
      int cityOffset,
      int host,
      int clientsMax) {
    builder.startTable(5);
    FGame.addClientsMax(builder, clientsMax);
    FGame.addHost(builder, host);
    FGame.addCity(builder, cityOffset);
    FGame.addTeams(builder, teamsOffset);
    FGame.addId(builder, id);
    return FGame.endFGame(builder);
  }

  public static void startFGame(FlatBufferBuilder builder) { builder.startTable(5); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addInt(0, id, 0); }
  public static void addTeams(FlatBufferBuilder builder, int teamsOffset) { builder.addOffset(1, teamsOffset, 0); }
  public static int createTeamsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startTeamsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addCity(FlatBufferBuilder builder, int cityOffset) { builder.addOffset(2, cityOffset, 0); }
  public static void addHost(FlatBufferBuilder builder, int host) { builder.addInt(3, host, 0); }
  public static void addClientsMax(FlatBufferBuilder builder, int clientsMax) { builder.addInt(4, clientsMax, 0); }
  public static int endFGame(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishFGameBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedFGameBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public FGame get(int j) { return get(new FGame(), j); }
    public FGame get(FGame obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
