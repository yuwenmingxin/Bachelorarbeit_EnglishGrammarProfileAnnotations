

/* First created by JCasGen Wed May 26 11:49:05 CEST 2021 */
package org.apache.uima.ruta.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Wed May 26 14:25:19 CEST 2021
 * XML source: /Users/quante/Documents/BA_Ye_Yao/de.uni-due.ltl.grammarprofile/src/main/resources/ruta/TeachTypeSystem.xml
 * @generated */
public class DebugBlockApply extends DebugRuleApply {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DebugBlockApply.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected DebugBlockApply() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DebugBlockApply(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DebugBlockApply(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DebugBlockApply(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: innerApply

  /** getter for innerApply - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getInnerApply() {
    if (DebugBlockApply_Type.featOkTst && ((DebugBlockApply_Type)jcasType).casFeat_innerApply == null)
      jcasType.jcas.throwFeatMissing("innerApply", "org.apache.uima.ruta.type.DebugBlockApply");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DebugBlockApply_Type)jcasType).casFeatCode_innerApply)));}
    
  /** setter for innerApply - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setInnerApply(FSArray v) {
    if (DebugBlockApply_Type.featOkTst && ((DebugBlockApply_Type)jcasType).casFeat_innerApply == null)
      jcasType.jcas.throwFeatMissing("innerApply", "org.apache.uima.ruta.type.DebugBlockApply");
    jcasType.ll_cas.ll_setRefValue(addr, ((DebugBlockApply_Type)jcasType).casFeatCode_innerApply, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for innerApply - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public DebugScriptApply getInnerApply(int i) {
    if (DebugBlockApply_Type.featOkTst && ((DebugBlockApply_Type)jcasType).casFeat_innerApply == null)
      jcasType.jcas.throwFeatMissing("innerApply", "org.apache.uima.ruta.type.DebugBlockApply");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugBlockApply_Type)jcasType).casFeatCode_innerApply), i);
    return (DebugScriptApply)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugBlockApply_Type)jcasType).casFeatCode_innerApply), i)));}

  /** indexed setter for innerApply - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setInnerApply(int i, DebugScriptApply v) { 
    if (DebugBlockApply_Type.featOkTst && ((DebugBlockApply_Type)jcasType).casFeat_innerApply == null)
      jcasType.jcas.throwFeatMissing("innerApply", "org.apache.uima.ruta.type.DebugBlockApply");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugBlockApply_Type)jcasType).casFeatCode_innerApply), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugBlockApply_Type)jcasType).casFeatCode_innerApply), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    