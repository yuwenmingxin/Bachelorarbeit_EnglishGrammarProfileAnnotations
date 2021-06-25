

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
public class DebugRuleApply extends DebugScriptApply {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DebugRuleApply.class);
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
  protected DebugRuleApply() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DebugRuleApply(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DebugRuleApply(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DebugRuleApply(JCas jcas, int begin, int end) {
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
  //* Feature: applied

  /** getter for applied - gets 
   * @generated
   * @return value of the feature 
   */
  public int getApplied() {
    if (DebugRuleApply_Type.featOkTst && ((DebugRuleApply_Type)jcasType).casFeat_applied == null)
      jcasType.jcas.throwFeatMissing("applied", "org.apache.uima.ruta.type.DebugRuleApply");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DebugRuleApply_Type)jcasType).casFeatCode_applied);}
    
  /** setter for applied - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setApplied(int v) {
    if (DebugRuleApply_Type.featOkTst && ((DebugRuleApply_Type)jcasType).casFeat_applied == null)
      jcasType.jcas.throwFeatMissing("applied", "org.apache.uima.ruta.type.DebugRuleApply");
    jcasType.ll_cas.ll_setIntValue(addr, ((DebugRuleApply_Type)jcasType).casFeatCode_applied, v);}    
   
    
  //*--------------*
  //* Feature: tried

  /** getter for tried - gets 
   * @generated
   * @return value of the feature 
   */
  public int getTried() {
    if (DebugRuleApply_Type.featOkTst && ((DebugRuleApply_Type)jcasType).casFeat_tried == null)
      jcasType.jcas.throwFeatMissing("tried", "org.apache.uima.ruta.type.DebugRuleApply");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DebugRuleApply_Type)jcasType).casFeatCode_tried);}
    
  /** setter for tried - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTried(int v) {
    if (DebugRuleApply_Type.featOkTst && ((DebugRuleApply_Type)jcasType).casFeat_tried == null)
      jcasType.jcas.throwFeatMissing("tried", "org.apache.uima.ruta.type.DebugRuleApply");
    jcasType.ll_cas.ll_setIntValue(addr, ((DebugRuleApply_Type)jcasType).casFeatCode_tried, v);}    
   
    
  //*--------------*
  //* Feature: rules

  /** getter for rules - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getRules() {
    if (DebugRuleApply_Type.featOkTst && ((DebugRuleApply_Type)jcasType).casFeat_rules == null)
      jcasType.jcas.throwFeatMissing("rules", "org.apache.uima.ruta.type.DebugRuleApply");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleApply_Type)jcasType).casFeatCode_rules)));}
    
  /** setter for rules - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRules(FSArray v) {
    if (DebugRuleApply_Type.featOkTst && ((DebugRuleApply_Type)jcasType).casFeat_rules == null)
      jcasType.jcas.throwFeatMissing("rules", "org.apache.uima.ruta.type.DebugRuleApply");
    jcasType.ll_cas.ll_setRefValue(addr, ((DebugRuleApply_Type)jcasType).casFeatCode_rules, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for rules - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public DebugRuleMatch getRules(int i) {
    if (DebugRuleApply_Type.featOkTst && ((DebugRuleApply_Type)jcasType).casFeat_rules == null)
      jcasType.jcas.throwFeatMissing("rules", "org.apache.uima.ruta.type.DebugRuleApply");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleApply_Type)jcasType).casFeatCode_rules), i);
    return (DebugRuleMatch)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleApply_Type)jcasType).casFeatCode_rules), i)));}

  /** indexed setter for rules - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setRules(int i, DebugRuleMatch v) { 
    if (DebugRuleApply_Type.featOkTst && ((DebugRuleApply_Type)jcasType).casFeat_rules == null)
      jcasType.jcas.throwFeatMissing("rules", "org.apache.uima.ruta.type.DebugRuleApply");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleApply_Type)jcasType).casFeatCode_rules), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleApply_Type)jcasType).casFeatCode_rules), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets 
   * @generated
   * @return value of the feature 
   */
  public int getId() {
    if (DebugRuleApply_Type.featOkTst && ((DebugRuleApply_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.uima.ruta.type.DebugRuleApply");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DebugRuleApply_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(int v) {
    if (DebugRuleApply_Type.featOkTst && ((DebugRuleApply_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.uima.ruta.type.DebugRuleApply");
    jcasType.ll_cas.ll_setIntValue(addr, ((DebugRuleApply_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: script

  /** getter for script - gets 
   * @generated
   * @return value of the feature 
   */
  public String getScript() {
    if (DebugRuleApply_Type.featOkTst && ((DebugRuleApply_Type)jcasType).casFeat_script == null)
      jcasType.jcas.throwFeatMissing("script", "org.apache.uima.ruta.type.DebugRuleApply");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DebugRuleApply_Type)jcasType).casFeatCode_script);}
    
  /** setter for script - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScript(String v) {
    if (DebugRuleApply_Type.featOkTst && ((DebugRuleApply_Type)jcasType).casFeat_script == null)
      jcasType.jcas.throwFeatMissing("script", "org.apache.uima.ruta.type.DebugRuleApply");
    jcasType.ll_cas.ll_setStringValue(addr, ((DebugRuleApply_Type)jcasType).casFeatCode_script, v);}    
  }

    