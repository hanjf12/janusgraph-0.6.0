// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: janusgraph/schema/v1/schema_manager.proto

package org.janusgraph.graphdb.grpc.schema;

public interface GetEdgeLabelByNameResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:janusgraph.schema.v1.GetEdgeLabelByNameResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.janusgraph.types.v1.EdgeLabel edge_label = 1;</code>
   * @return Whether the edgeLabel field is set.
   */
  boolean hasEdgeLabel();
  /**
   * <code>.janusgraph.types.v1.EdgeLabel edge_label = 1;</code>
   * @return The edgeLabel.
   */
  org.janusgraph.graphdb.grpc.types.EdgeLabel getEdgeLabel();
  /**
   * <code>.janusgraph.types.v1.EdgeLabel edge_label = 1;</code>
   */
  org.janusgraph.graphdb.grpc.types.EdgeLabelOrBuilder getEdgeLabelOrBuilder();
}
