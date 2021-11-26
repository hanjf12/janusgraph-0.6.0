// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: janusgraph/types/v1/schema_types.proto

package org.janusgraph.graphdb.grpc.types;

/**
 * Protobuf type {@code janusgraph.types.v1.VertexLabel}
 */
public final class VertexLabel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:janusgraph.types.v1.VertexLabel)
    VertexLabelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VertexLabel.newBuilder() to construct.
  private VertexLabel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VertexLabel() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VertexLabel();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VertexLabel(
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
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (id_ != null) {
              subBuilder = id_.toBuilder();
            }
            id_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(id_);
              id_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 24: {

            readOnly_ = input.readBool();
            break;
          }
          case 32: {

            partitioned_ = input.readBool();
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
    return org.janusgraph.graphdb.grpc.types.SchemaTypes.internal_static_janusgraph_types_v1_VertexLabel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.janusgraph.graphdb.grpc.types.SchemaTypes.internal_static_janusgraph_types_v1_VertexLabel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.janusgraph.graphdb.grpc.types.VertexLabel.class, org.janusgraph.graphdb.grpc.types.VertexLabel.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private com.google.protobuf.Int64Value id_;
  /**
   * <pre>
   * The Internal id.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 1;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return id_ != null;
  }
  /**
   * <pre>
   * The Internal id.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getId() {
    return id_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : id_;
  }
  /**
   * <pre>
   * The Internal id.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder() {
    return getId();
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The VertexLabel Name.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The VertexLabel Name.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int READ_ONLY_FIELD_NUMBER = 3;
  private boolean readOnly_;
  /**
   * <pre>
   * Marking as readOnly, default not readOnly.
   * </pre>
   *
   * <code>bool read_only = 3;</code>
   * @return The readOnly.
   */
  @java.lang.Override
  public boolean getReadOnly() {
    return readOnly_;
  }

  public static final int PARTITIONED_FIELD_NUMBER = 4;
  private boolean partitioned_;
  /**
   * <pre>
   * Marking as partitioned, default not partitioned.
   * </pre>
   *
   * <code>bool partitioned = 4;</code>
   * @return The partitioned.
   */
  @java.lang.Override
  public boolean getPartitioned() {
    return partitioned_;
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
    if (id_ != null) {
      output.writeMessage(1, getId());
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (readOnly_ != false) {
      output.writeBool(3, readOnly_);
    }
    if (partitioned_ != false) {
      output.writeBool(4, partitioned_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getId());
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (readOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, readOnly_);
    }
    if (partitioned_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, partitioned_);
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
    if (!(obj instanceof org.janusgraph.graphdb.grpc.types.VertexLabel)) {
      return super.equals(obj);
    }
    org.janusgraph.graphdb.grpc.types.VertexLabel other = (org.janusgraph.graphdb.grpc.types.VertexLabel) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (!getName()
        .equals(other.getName())) return false;
    if (getReadOnly()
        != other.getReadOnly()) return false;
    if (getPartitioned()
        != other.getPartitioned()) return false;
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
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
    }
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + READ_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReadOnly());
    hash = (37 * hash) + PARTITIONED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPartitioned());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.janusgraph.graphdb.grpc.types.VertexLabel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.janusgraph.graphdb.grpc.types.VertexLabel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.janusgraph.graphdb.grpc.types.VertexLabel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.janusgraph.graphdb.grpc.types.VertexLabel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.janusgraph.graphdb.grpc.types.VertexLabel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.janusgraph.graphdb.grpc.types.VertexLabel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.janusgraph.graphdb.grpc.types.VertexLabel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.janusgraph.graphdb.grpc.types.VertexLabel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.janusgraph.graphdb.grpc.types.VertexLabel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.janusgraph.graphdb.grpc.types.VertexLabel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.janusgraph.graphdb.grpc.types.VertexLabel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.janusgraph.graphdb.grpc.types.VertexLabel parseFrom(
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
  public static Builder newBuilder(org.janusgraph.graphdb.grpc.types.VertexLabel prototype) {
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
   * Protobuf type {@code janusgraph.types.v1.VertexLabel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:janusgraph.types.v1.VertexLabel)
      org.janusgraph.graphdb.grpc.types.VertexLabelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.janusgraph.graphdb.grpc.types.SchemaTypes.internal_static_janusgraph_types_v1_VertexLabel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.janusgraph.graphdb.grpc.types.SchemaTypes.internal_static_janusgraph_types_v1_VertexLabel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.janusgraph.graphdb.grpc.types.VertexLabel.class, org.janusgraph.graphdb.grpc.types.VertexLabel.Builder.class);
    }

    // Construct using org.janusgraph.graphdb.grpc.types.VertexLabel.newBuilder()
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
      if (idBuilder_ == null) {
        id_ = null;
      } else {
        id_ = null;
        idBuilder_ = null;
      }
      name_ = "";

      readOnly_ = false;

      partitioned_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.janusgraph.graphdb.grpc.types.SchemaTypes.internal_static_janusgraph_types_v1_VertexLabel_descriptor;
    }

    @java.lang.Override
    public org.janusgraph.graphdb.grpc.types.VertexLabel getDefaultInstanceForType() {
      return org.janusgraph.graphdb.grpc.types.VertexLabel.getDefaultInstance();
    }

    @java.lang.Override
    public org.janusgraph.graphdb.grpc.types.VertexLabel build() {
      org.janusgraph.graphdb.grpc.types.VertexLabel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.janusgraph.graphdb.grpc.types.VertexLabel buildPartial() {
      org.janusgraph.graphdb.grpc.types.VertexLabel result = new org.janusgraph.graphdb.grpc.types.VertexLabel(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      result.name_ = name_;
      result.readOnly_ = readOnly_;
      result.partitioned_ = partitioned_;
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
      if (other instanceof org.janusgraph.graphdb.grpc.types.VertexLabel) {
        return mergeFrom((org.janusgraph.graphdb.grpc.types.VertexLabel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.janusgraph.graphdb.grpc.types.VertexLabel other) {
      if (other == org.janusgraph.graphdb.grpc.types.VertexLabel.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getReadOnly() != false) {
        setReadOnly(other.getReadOnly());
      }
      if (other.getPartitioned() != false) {
        setPartitioned(other.getPartitioned());
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
      org.janusgraph.graphdb.grpc.types.VertexLabel parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.janusgraph.graphdb.grpc.types.VertexLabel) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Int64Value id_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> idBuilder_;
    /**
     * <pre>
     * The Internal id.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value id = 1;</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return idBuilder_ != null || id_ != null;
    }
    /**
     * <pre>
     * The Internal id.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value id = 1;</code>
     * @return The id.
     */
    public com.google.protobuf.Int64Value getId() {
      if (idBuilder_ == null) {
        return id_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : id_;
      } else {
        return idBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The Internal id.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value id = 1;</code>
     */
    public Builder setId(com.google.protobuf.Int64Value value) {
      if (idBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        id_ = value;
        onChanged();
      } else {
        idBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Internal id.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value id = 1;</code>
     */
    public Builder setId(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (idBuilder_ == null) {
        id_ = builderForValue.build();
        onChanged();
      } else {
        idBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The Internal id.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value id = 1;</code>
     */
    public Builder mergeId(com.google.protobuf.Int64Value value) {
      if (idBuilder_ == null) {
        if (id_ != null) {
          id_ =
            com.google.protobuf.Int64Value.newBuilder(id_).mergeFrom(value).buildPartial();
        } else {
          id_ = value;
        }
        onChanged();
      } else {
        idBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Internal id.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value id = 1;</code>
     */
    public Builder clearId() {
      if (idBuilder_ == null) {
        id_ = null;
        onChanged();
      } else {
        id_ = null;
        idBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The Internal id.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value id = 1;</code>
     */
    public com.google.protobuf.Int64Value.Builder getIdBuilder() {
      
      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The Internal id.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value id = 1;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder() {
      if (idBuilder_ != null) {
        return idBuilder_.getMessageOrBuilder();
      } else {
        return id_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : id_;
      }
    }
    /**
     * <pre>
     * The Internal id.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getId(),
                getParentForChildren(),
                isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The VertexLabel Name.
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The VertexLabel Name.
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The VertexLabel Name.
     * </pre>
     *
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The VertexLabel Name.
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The VertexLabel Name.
     * </pre>
     *
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private boolean readOnly_ ;
    /**
     * <pre>
     * Marking as readOnly, default not readOnly.
     * </pre>
     *
     * <code>bool read_only = 3;</code>
     * @return The readOnly.
     */
    @java.lang.Override
    public boolean getReadOnly() {
      return readOnly_;
    }
    /**
     * <pre>
     * Marking as readOnly, default not readOnly.
     * </pre>
     *
     * <code>bool read_only = 3;</code>
     * @param value The readOnly to set.
     * @return This builder for chaining.
     */
    public Builder setReadOnly(boolean value) {
      
      readOnly_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Marking as readOnly, default not readOnly.
     * </pre>
     *
     * <code>bool read_only = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearReadOnly() {
      
      readOnly_ = false;
      onChanged();
      return this;
    }

    private boolean partitioned_ ;
    /**
     * <pre>
     * Marking as partitioned, default not partitioned.
     * </pre>
     *
     * <code>bool partitioned = 4;</code>
     * @return The partitioned.
     */
    @java.lang.Override
    public boolean getPartitioned() {
      return partitioned_;
    }
    /**
     * <pre>
     * Marking as partitioned, default not partitioned.
     * </pre>
     *
     * <code>bool partitioned = 4;</code>
     * @param value The partitioned to set.
     * @return This builder for chaining.
     */
    public Builder setPartitioned(boolean value) {
      
      partitioned_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Marking as partitioned, default not partitioned.
     * </pre>
     *
     * <code>bool partitioned = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPartitioned() {
      
      partitioned_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:janusgraph.types.v1.VertexLabel)
  }

  // @@protoc_insertion_point(class_scope:janusgraph.types.v1.VertexLabel)
  private static final org.janusgraph.graphdb.grpc.types.VertexLabel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.janusgraph.graphdb.grpc.types.VertexLabel();
  }

  public static org.janusgraph.graphdb.grpc.types.VertexLabel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VertexLabel>
      PARSER = new com.google.protobuf.AbstractParser<VertexLabel>() {
    @java.lang.Override
    public VertexLabel parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VertexLabel(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VertexLabel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VertexLabel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.janusgraph.graphdb.grpc.types.VertexLabel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

