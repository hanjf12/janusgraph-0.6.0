package org.janusgraph.graphdb;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public abstract class GroovySpeedTestSupport
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
;
public static final int VERTEX_COUNT = new java.lang.Integer((int)0);
public static final int EDGE_COUNT = new java.lang.Integer((int)0);
public static final int DEFAULT_TX_COUNT = (int) 3;
public static final int DEFAULT_VERTICES_PER_TX = (int) 100;
public static final int DEFAULT_ITERATIONS = new java.lang.Integer((int)0);
public static final java.lang.String RELATION_FILE = "../janusgraph-test/data/v10k.graphml.gz";
protected java.util.Random random;
protected org.janusgraph.graphdb.SpeedTestSchema schema;
protected org.janusgraph.core.JanusGraph graph;
protected org.janusgraph.diskstorage.configuration.WriteConfiguration conf;
public GroovySpeedTestSupport
(org.janusgraph.diskstorage.configuration.WriteConfiguration conf) {}
protected  void sequentialUidTask(java.lang.Object closure) { }
protected  void chunkedSequentialUidTask(int chunksize, java.lang.Object closure) { }
protected  void chunkedSequentialUidTask(java.lang.Object closure) { }
@groovy.transform.Generated() @groovy.transform.Internal() public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setMetaClass(groovy.lang.MetaClass mc) { }
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object getProperty(java.lang.String property) { return null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setProperty(java.lang.String property, java.lang.Object value) { }
@org.junit.jupiter.api.BeforeEach() public  void open() { }
@org.junit.jupiter.api.AfterEach() public  void rollback() { }
public  void close() { }
protected abstract  org.janusgraph.graphdb.database.StandardJanusGraph getGraph()throws org.janusgraph.diskstorage.BackendException;
protected abstract  org.janusgraph.graphdb.SpeedTestSchema getSchema();
protected  void sequentialUidTask(int verticesPerTx, java.lang.Object closure) { }
protected  void chunkedSequentialUidTask(int chunksize, int verticesPerTx, java.lang.Object closure) { }
protected  void supernodeTask(java.lang.Object closure) { }
protected  void standardIndexEdgeTask(java.lang.Object closure) { }
protected  void standardIndexVertexTask(java.lang.Object closure) { }
protected  void initializeGraph(org.janusgraph.core.JanusGraph g)throws org.janusgraph.diskstorage.BackendException { }
}
