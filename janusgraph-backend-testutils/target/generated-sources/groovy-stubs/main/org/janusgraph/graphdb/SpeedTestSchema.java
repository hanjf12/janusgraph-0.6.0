package org.janusgraph.graphdb;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class SpeedTestSchema
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
;
public static final int VERTEX_COUNT = new java.lang.Integer((int)0);
public static final int EDGE_COUNT = new java.lang.Integer((int)0);
public static final java.lang.String VERTEX_KEY_PREFIX = "vp_";
public static final java.lang.String EDGE_KEY_PREFIX = "ep_";
public static final java.lang.String LABEL_PREFIX = "el_";
public static final java.lang.String UID_PROP = "uid";
public static long SUPERNODE_UID;
public SpeedTestSchema
() {}
@groovy.transform.Generated() @groovy.transform.Internal() public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setMetaClass(groovy.lang.MetaClass mc) { }
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  java.lang.Object getProperty(java.lang.String property) { return null;}
@groovy.transform.Generated() @groovy.transform.Internal() public  void setProperty(java.lang.String property, java.lang.Object value) { }
public static  org.janusgraph.graphdb.SpeedTestSchema get() { return (org.janusgraph.graphdb.SpeedTestSchema)null;}
public final  java.lang.String getVertexPropertyName(int i) { return (java.lang.String)null;}
public final  java.lang.String getEdgePropertyName(int i) { return (java.lang.String)null;}
public final  java.lang.String getEdgeLabelName(int i) { return (java.lang.String)null;}
public static final  java.lang.String getSortKeyForLabel(java.lang.String l) { return (java.lang.String)null;}
public final  int getVertexPropKeys() { return (int)0;}
public final  int getEdgePropKeys() { return (int)0;}
public final  int getMaxEdgePropVal() { return (int)0;}
public final  int getMaxVertexPropVal() { return (int)0;}
public final  int getEdgeLabels() { return (int)0;}
public static final  long getSupernodeUid() { return (long)0;}
public final  java.lang.String getSupernodeOutLabel() { return (java.lang.String)null;}
public final  long getMaxUid() { return (long)0;}
public final  int getVertexCount() { return (int)0;}
public final  int getEdgeCount() { return (int)0;}
public  void makeTypes(org.janusgraph.core.JanusGraph g) { }
}
