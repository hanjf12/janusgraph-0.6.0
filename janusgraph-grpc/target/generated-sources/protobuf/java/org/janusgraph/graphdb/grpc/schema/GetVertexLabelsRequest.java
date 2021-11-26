// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: janusgraph/schema/v1/schema_manager.proto

package org.janusgraph.graphdb.grpc.schema;

/**
 * Protobuf type {@code janusgraph.schema.v1.GetVertexLabelsRequest}
 */
public final class GetVertexLabelsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:janusgraph.schema.v1.GetVertexLabelsRequest)
    GetVertexLabelsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetVertexLabelsRequest.newBuilder() to construct.
  private GetVertexLabelsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetVertexLabelsRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetVertexLabelsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetVertexLabelsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            org.janusgraph.graphdb.grpc.types.JanusGraphContext.Builder subBuilder = null;
            if (context_ != null) {
              subBuilder = context_.toBuilder();
            }
            context_ = input.readMessage(org.janusgraph.graphdb.grpc.types.JanusGraphContext.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(context_);
              context_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.janusgraph.graphdb.grpc.schema.SchemaManager.internal_static_janusgraph_schema_v1_GetVertexLabelsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.janusgraph.graphdb.grpc.schema.SchemaManager.internal_static_janusgraph_schema_v1_GetVertexLabelsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest.class, org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest.Builder.class);
  }

  public static final int CONTEXT_FIELD_NUMBER = 1;
  private org.janusgraph.graphdb.grpc.types.JanusGraphContext context_;
  /**
   * <code>.janusgraph.types.v1.JanusGraphContext context = 1;</code>
   * @return Whether the context field is set.
   */
  @java.lang.Override
  public boolean hasContext() {
    return context_ != null;
  }
  /**
   * <code>.janusgraph.types.v1.JanusGraphContext context = 1;</code>
   * @return The context.
   */
  @java.lang.Override
  public org.janusgraph.graphdb.grpc.types.JanusGraphContext getContext() {
    return context_ == null ? org.janusgraph.graphdb.grpc.types.JanusGraphContext.getDefaultInstance() : context_;
  }
  /**
   * <code>.janusgraph.types.v1.JanusGraphContext context = 1;</code>
   */
  @java.lang.Override
  public org.janusgraph.graphdb.grpc.types.JanusGraphContextOrBuilder getContextOrBuilder() {
    return getContext();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (context_ != null) {
      output.writeMessage(1, getContext());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (context_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getContext());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest)) {
      return super.equals(obj);
    }
    org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest other = (org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest) obj;

    if (hasContext() != other.hasContext()) return false;
    if (hasContext()) {
      if (!getContext()
          .equals(other.getContext())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasContext()) {
      hash = (37 * hash) + CONTEXT_FIELD_NUMBER;
      hash = (53 * hash) + getContext().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code janusgraph.schema.v1.GetVertexLabelsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:janusgraph.schema.v1.GetVertexLabelsRequest)
      org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.janusgraph.graphdb.grpc.schema.SchemaManager.internal_static_janusgraph_schema_v1_GetVertexLabelsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.janusgraph.graphdb.grpc.schema.SchemaManager.internal_static_janusgraph_schema_v1_GetVertexLabelsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest.class, org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest.Builder.class);
    }

    // Construct using org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (contextBuilder_ == null) {
        context_ = null;
      } else {
        context_ = null;
        contextBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.janusgraph.graphdb.grpc.schema.SchemaManager.internal_static_janusgraph_schema_v1_GetVertexLabelsRequest_descriptor;
    }

    @java.lang.Override
    public org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest getDefaultInstanceForType() {
      return org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest build() {
      org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest buildPartial() {
      org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest result = new org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest(this);
      if (contextBuilder_ == null) {
        result.context_ = context_;
      } else {
        result.context_ = contextBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest) {
        return mergeFrom((org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest other) {
      if (other == org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest.getDefaultInstance()) return this;
      if (other.hasContext()) {
        mergeContext(other.getContext());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.janusgraph.graphdb.grpc.types.JanusGraphContext context_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.janusgraph.graphdb.grpc.types.JanusGraphContext, org.janusgraph.graphdb.grpc.types.JanusGraphContext.Builder, org.janusgraph.graphdb.grpc.types.JanusGraphContextOrBuilder> contextBuilder_;
    /**
     * <code>.janusgraph.types.v1.JanusGraphContext context = 1;</code>
     * @return Whether the context field is set.
     */
    public boolean hasContext() {
      return contextBuilder_ != null || context_ != null;
    }
    /**
     * <code>.janusgraph.types.v1.JanusGraphContext context = 1;</code>
     * @return The context.
     */
    public org.janusgraph.graphdb.grpc.types.JanusGraphContext getContext() {
      if (contextBuilder_ == null) {
        return context_ == null ? org.janusgraph.graphdb.grpc.types.JanusGraphContext.getDefaultInstance() : context_;
      } else {
        return contextBuilder_.getMessage();
      }
    }
    /**
     * <code>.janusgraph.types.v1.JanusGraphContext context = 1;</code>
     */
    public Builder setContext(org.janusgraph.graphdb.grpc.types.JanusGraphContext value) {
      if (contextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        context_ = value;
        onChanged();
      } else {
        contextBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.janusgraph.types.v1.JanusGraphContext context = 1;</code>
     */
    public Builder setContext(
        org.janusgraph.graphdb.grpc.types.JanusGraphContext.Builder builderForValue) {
      if (contextBuilder_ == null) {
        context_ = builderForValue.build();
        onChanged();
      } else {
        contextBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.janusgraph.types.v1.JanusGraphContext context = 1;</code>
     */
    public Builder mergeContext(org.janusgraph.graphdb.grpc.types.JanusGraphContext value) {
      if (contextBuilder_ == null) {
        if (context_ != null) {
          context_ =
            org.janusgraph.graphdb.grpc.types.JanusGraphContext.newBuilder(context_).mergeFrom(value).buildPartial();
        } else {
          context_ = value;
        }
        onChanged();
      } else {
        contextBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.janusgraph.types.v1.JanusGraphContext context = 1;</code>
     */
    public Builder clearContext() {
      if (contextBuilder_ == null) {
        context_ = null;
        onChanged();
      } else {
        context_ = null;
        contextBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.janusgraph.types.v1.JanusGraphContext context = 1;</code>
     */
    public org.janusgraph.graphdb.grpc.types.JanusGraphContext.Builder getContextBuilder() {
      
      onChanged();
      return getContextFieldBuilder().getBuilder();
    }
    /**
     * <code>.janusgraph.types.v1.JanusGraphContext context = 1;</code>
     */
    public org.janusgraph.graphdb.grpc.types.JanusGraphContextOrBuilder getContextOrBuilder() {
      if (contextBuilder_ != null) {
        return contextBuilder_.getMessageOrBuilder();
      } else {
        return context_ == null ?
            org.janusgraph.graphdb.grpc.types.JanusGraphContext.getDefaultInstance() : context_;
      }
    }
    /**
     * <code>.janusgraph.types.v1.JanusGraphContext context = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.janusgraph.graphdb.grpc.types.JanusGraphContext, org.janusgraph.graphdb.grpc.types.JanusGraphContext.Builder, org.janusgraph.graphdb.grpc.types.JanusGraphContextOrBuilder> 
        getContextFieldBuilder() {
      if (contextBuilder_ == null) {
        contextBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.janusgraph.graphdb.grpc.types.JanusGraphContext, org.janusgraph.graphdb.grpc.types.JanusGraphContext.Builder, org.janusgraph.graphdb.grpc.types.JanusGraphContextOrBuilder>(
                getContext(),
                getParentForChildren(),
                isClean());
        context_ = null;
      }
      return contextBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:janusgraph.schema.v1.GetVertexLabelsRequest)
  }

  // @@protoc_insertion_point(class_scope:janusgraph.schema.v1.GetVertexLabelsRequest)
  private static final org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest();
  }

  public static org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetVertexLabelsRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetVertexLabelsRequest>() {
    @java.lang.Override
    public GetVertexLabelsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetVertexLabelsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetVertexLabelsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetVertexLabelsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.janusgraph.graphdb.grpc.schema.GetVertexLabelsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

