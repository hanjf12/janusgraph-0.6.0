// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: janusgraph/schema/v1/schema_manager.proto

package org.janusgraph.graphdb.grpc.schema;

public final class SchemaManager {
  private SchemaManager() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_janusgraph_schema_v1_GetVertexLabelByNameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_janusgraph_schema_v1_GetVertexLabelByNameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_janusgraph_schema_v1_GetVertexLabelByNameResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_janusgraph_schema_v1_GetVertexLabelByNameResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_janusgraph_schema_v1_GetVertexLabelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_janusgraph_schema_v1_GetVertexLabelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_janusgraph_schema_v1_GetVertexLabelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_janusgraph_schema_v1_GetVertexLabelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_janusgraph_schema_v1_GetEdgeLabelByNameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_janusgraph_schema_v1_GetEdgeLabelByNameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_janusgraph_schema_v1_GetEdgeLabelByNameResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_janusgraph_schema_v1_GetEdgeLabelByNameResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_janusgraph_schema_v1_GetEdgeLabelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_janusgraph_schema_v1_GetEdgeLabelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_janusgraph_schema_v1_GetEdgeLabelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_janusgraph_schema_v1_GetEdgeLabelsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)janusgraph/schema/v1/schema_manager.pr" +
      "oto\022\024janusgraph.schema.v1\032%janusgraph/ty" +
      "pes/v1/graph_types.proto\032&janusgraph/typ" +
      "es/v1/schema_types.proto\"d\n\033GetVertexLab" +
      "elByNameRequest\0227\n\007context\030\001 \001(\0132&.janus" +
      "graph.types.v1.JanusGraphContext\022\014\n\004name" +
      "\030\002 \001(\t\"V\n\034GetVertexLabelByNameResponse\0226" +
      "\n\014vertex_label\030\001 \001(\0132 .janusgraph.types." +
      "v1.VertexLabel\"Q\n\026GetVertexLabelsRequest" +
      "\0227\n\007context\030\001 \001(\0132&.janusgraph.types.v1." +
      "JanusGraphContext\"R\n\027GetVertexLabelsResp" +
      "onse\0227\n\rvertex_labels\030\001 \003(\0132 .janusgraph" +
      ".types.v1.VertexLabel\"b\n\031GetEdgeLabelByN" +
      "ameRequest\0227\n\007context\030\001 \001(\0132&.janusgraph" +
      ".types.v1.JanusGraphContext\022\014\n\004name\030\002 \001(" +
      "\t\"P\n\032GetEdgeLabelByNameResponse\0222\n\nedge_" +
      "label\030\001 \001(\0132\036.janusgraph.types.v1.EdgeLa" +
      "bel\"O\n\024GetEdgeLabelsRequest\0227\n\007context\030\001" +
      " \001(\0132&.janusgraph.types.v1.JanusGraphCon" +
      "text\"L\n\025GetEdgeLabelsResponse\0223\n\013edge_la" +
      "bels\030\001 \003(\0132\036.janusgraph.types.v1.EdgeLab" +
      "el2\350\003\n\024SchemaManagerService\022}\n\024GetVertex" +
      "LabelByName\0221.janusgraph.schema.v1.GetVe" +
      "rtexLabelByNameRequest\0322.janusgraph.sche" +
      "ma.v1.GetVertexLabelByNameResponse\022n\n\017Ge" +
      "tVertexLabels\022,.janusgraph.schema.v1.Get" +
      "VertexLabelsRequest\032-.janusgraph.schema." +
      "v1.GetVertexLabelsResponse\022w\n\022GetEdgeLab" +
      "elByName\022/.janusgraph.schema.v1.GetEdgeL" +
      "abelByNameRequest\0320.janusgraph.schema.v1" +
      ".GetEdgeLabelByNameResponse\022h\n\rGetEdgeLa" +
      "bels\022*.janusgraph.schema.v1.GetEdgeLabel" +
      "sRequest\032+.janusgraph.schema.v1.GetEdgeL" +
      "abelsResponseB&\n\"org.janusgraph.graphdb." +
      "grpc.schemaP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.janusgraph.graphdb.grpc.types.GraphTypes.getDescriptor(),
          org.janusgraph.graphdb.grpc.types.SchemaTypes.getDescriptor(),
        });
    internal_static_janusgraph_schema_v1_GetVertexLabelByNameRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_janusgraph_schema_v1_GetVertexLabelByNameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_janusgraph_schema_v1_GetVertexLabelByNameRequest_descriptor,
        new java.lang.String[] { "Context", "Name", });
    internal_static_janusgraph_schema_v1_GetVertexLabelByNameResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_janusgraph_schema_v1_GetVertexLabelByNameResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_janusgraph_schema_v1_GetVertexLabelByNameResponse_descriptor,
        new java.lang.String[] { "VertexLabel", });
    internal_static_janusgraph_schema_v1_GetVertexLabelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_janusgraph_schema_v1_GetVertexLabelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_janusgraph_schema_v1_GetVertexLabelsRequest_descriptor,
        new java.lang.String[] { "Context", });
    internal_static_janusgraph_schema_v1_GetVertexLabelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_janusgraph_schema_v1_GetVertexLabelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_janusgraph_schema_v1_GetVertexLabelsResponse_descriptor,
        new java.lang.String[] { "VertexLabels", });
    internal_static_janusgraph_schema_v1_GetEdgeLabelByNameRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_janusgraph_schema_v1_GetEdgeLabelByNameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_janusgraph_schema_v1_GetEdgeLabelByNameRequest_descriptor,
        new java.lang.String[] { "Context", "Name", });
    internal_static_janusgraph_schema_v1_GetEdgeLabelByNameResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_janusgraph_schema_v1_GetEdgeLabelByNameResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_janusgraph_schema_v1_GetEdgeLabelByNameResponse_descriptor,
        new java.lang.String[] { "EdgeLabel", });
    internal_static_janusgraph_schema_v1_GetEdgeLabelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_janusgraph_schema_v1_GetEdgeLabelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_janusgraph_schema_v1_GetEdgeLabelsRequest_descriptor,
        new java.lang.String[] { "Context", });
    internal_static_janusgraph_schema_v1_GetEdgeLabelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_janusgraph_schema_v1_GetEdgeLabelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_janusgraph_schema_v1_GetEdgeLabelsResponse_descriptor,
        new java.lang.String[] { "EdgeLabels", });
    org.janusgraph.graphdb.grpc.types.GraphTypes.getDescriptor();
    org.janusgraph.graphdb.grpc.types.SchemaTypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}