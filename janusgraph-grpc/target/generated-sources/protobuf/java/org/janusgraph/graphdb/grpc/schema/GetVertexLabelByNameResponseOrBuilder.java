// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: janusgraph/schema/v1/schema_manager.proto

package org.janusgraph.graphdb.grpc.schema;

public interface GetVertexLabelByNameResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:janusgraph.schema.v1.GetVertexLabelByNameResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.janusgraph.types.v1.VertexLabel vertex_label = 1;</code>
   * @return Whether the vertexLabel field is set.
   */
  boolean hasVertexLabel();
  /**
   * <code>.janusgraph.types.v1.VertexLabel vertex_label = 1;</code>
   * @return The vertexLabel.
   */
  org.janusgraph.graphdb.grpc.types.VertexLabel getVertexLabel();
  /**
   * <code>.janusgraph.types.v1.VertexLabel vertex_label = 1;</code>
   */
  org.janusgraph.graphdb.grpc.types.VertexLabelOrBuilder getVertexLabelOrBuilder();
}