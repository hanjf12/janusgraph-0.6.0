package org.janusgraph.graphdb;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;
import static org.junit.Assert.*;

@org.junit.FixMethodOrder(value=org.junit.runners.MethodSorters.NAME_ASCENDING) @com.carrotsearch.junitbenchmarks.BenchmarkOptions(warmupRounds=1, benchmarkRounds=1) @org.junit.jupiter.api.Tag(value=org.janusgraph.TestCategory.PERFORMANCE_TESTS) public abstract class JanusGraphSpeedTest
  extends org.janusgraph.graphdb.GroovySpeedTestSupport {
;
@org.junit.Rule() public org.junit.rules.TestRule benchmark;
public JanusGraphSpeedTest
(org.janusgraph.diskstorage.configuration.WriteConfiguration conf) {
super ((org.janusgraph.diskstorage.configuration.WriteConfiguration)null);
}
@groovy.transform.Generated() @groovy.transform.Internal() public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setMetaClass(groovy.lang.MetaClass mc) { }
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object getProperty(java.lang.String property) { return null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setProperty(java.lang.String property, java.lang.Object value) { }
@org.junit.Test() public  void testVertexUidLookup()throws java.lang.Exception { }
@org.junit.Test() public  void testVertexCentricIndexQuery() { }
@org.junit.Test() public  void testLabeledEdgeTraversal() { }
@org.junit.Test() public  void testEdgeTraversalUsingVertexCentricIndex() { }
@org.junit.Test() public  void testLimitedGlobalEdgePropertyQuery() { }
@org.junit.Test() public  void testLimitedGlobalVertexPropertyQuery() { }
@org.junit.Test() public  void testGlobalVertexPropertyQuery() { }
@org.junit.Test() public  void testGlobalEdgePropertyQuery() { }
@org.junit.Test() public  void testMultiVertexQuery() { }
@org.junit.Test() public  void testPathologicalMultiVertexQuery() { }
@org.junit.Test() public  void testSingleVertexQuery() { }
@org.junit.Test() public  void testSingleVertexMultiProperty() { }
@org.junit.Test() public  void testSingleVertexProperty() { }
@org.junit.Test() public  void testZVertexPropertyModification() { }
@org.junit.Test() public  void testZEdgeAddition() { }
@org.junit.Test() public static  void testNoop() { }
}
