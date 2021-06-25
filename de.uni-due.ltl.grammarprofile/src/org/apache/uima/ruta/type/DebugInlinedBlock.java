

/* First created by JCasGen Wed May 26 14:13:51 CEST 2021 */
package org.apache.uima.ruta.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Wed May 26 14:25:19 CEST 2021
 * XML source: /Users/quante/Documents/BA_Ye_Yao/de.uni-due.ltl.grammarprofile/src/main/resources/ruta/TeachTypeSystem.xml
 * @generated */
public class DebugInlinedBlock extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DebugInlinedBlock.class);
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
  protected DebugInlinedBlock() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DebugInlinedBlock(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DebugInlinedBlock(JCas jcas) {
    super(jcas);
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
  //* Feature: element

  /** getter for element - gets 
   * @generated
   * @return value of the feature 
   */
  public String getElement() {
    if (DebugInlinedBlock_Type.featOkTst && ((DebugInlinedBlock_Type)jcasType).casFeat_element == null)
      jcasType.jcas.throwFeatMissing("element", "org.apache.uima.ruta.type.DebugInlinedBlock");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DebugInlinedBlock_Type)jcasType).casFeatCode_element);}
    
  /** setter for element - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElement(String v) {
    if (DebugInlinedBlock_Type.featOkTst && ((DebugInlinedBlock_Type)jcasType).casFeat_element == null)
      jcasType.jcas.throwFeatMissing("element", "org.apache.uima.ruta.type.DebugInlinedBlock");
    jcasType.ll_cas.ll_setStringValue(addr, ((DebugInlinedBlock_Type)jcasType).casFeatCode_element, v);}    
   
    
  //*--------------*
  //* Feature: asCondition

  /** getter for asCondition - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getAsCondition() {
    if (DebugInlinedBlock_Type.featOkTst && ((DebugInlinedBlock_Type)jcasType).casFeat_asCondition == null)
      jcasType.jcas.throwFeatMissing("asCondition", "org.apache.uima.ruta.type.DebugInlinedBlock");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((DebugInlinedBlock_Type)jcasType).casFeatCode_asCondition);}
    
  /** setter for asCondition - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAsCondition(boolean v) {
    if (DebugInlinedBlock_Type.featOkTst && ((DebugInlinedBlock_Type)jcasType).casFeat_asCondition == null)
      jcasType.jcas.throwFeatMissing("asCondition", "org.apache.uima.ruta.type.DebugInlinedBlock");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((DebugInlinedBlock_Type)jcasType).casFeatCode_asCondition, v);}    
   
    
  //*--------------*
  //* Feature: matched

  /** getter for matched - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getMatched() {
    if (DebugInlinedBlock_Type.featOkTst && ((DebugInlinedBlock_Type)jcasType).casFeat_matched == null)
      jcasType.jcas.throwFeatMissing("matched", "org.apache.uima.ruta.type.DebugInlinedBlock");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((DebugInlinedBlock_Type)jcasType).casFeatCode_matched);}
    
  /** setter for matched - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMatched(boolean v) {
    if (DebugInlinedBlock_Type.featOkTst && ((DebugInlinedBlock_Type)jcasType).casFeat_matched == null)
      jcasType.jcas.throwFeatMissing("matched", "org.apache.uima.ruta.type.DebugInlinedBlock");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((DebugInlinedBlock_Type)jcasType).casFeatCode_matched, v);}    
   
    
  //*--------------*
  //* Feature: inlinedRules

  /** getter for inlinedRules - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getInlinedRules() {
    if (DebugInlinedBlock_Type.featOkTst && ((DebugInlinedBlock_Type)jcasType).casFeat_inlinedRules == null)
      jcasType.jcas.throwFeatMissing("inlinedRules", "org.apache.uima.ruta.type.DebugInlinedBlock");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DebugInlinedBlock_Type)jcasType).casFeatCode_inlinedRules)));}
    
  /** setter for inlinedRules - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setInlinedRules(FSArray v) {
    if (DebugInlinedBlock_Type.featOkTst && ((DebugInlinedBlock_Type)jcasType).casFeat_inlinedRules == null)
      jcasType.jcas.throwFeatMissing("inlinedRules", "org.apache.uima.ruta.type.DebugInlinedBlock");
    jcasType.ll_cas.ll_setRefValue(addr, ((DebugInlinedBlock_Type)jcasType).casFeatCode_inlinedRules, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for inlinedRules - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public DebugScriptApply getInlinedRules(int i) {
    if (DebugInlinedBlock_Type.featOkTst && ((DebugInlinedBlock_Type)jcasType).casFeat_inlinedRules == null)
      jcasType.jcas.throwFeatMissing("inlinedRules", "org.apache.uima.ruta.type.DebugInlinedBlock");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugInlinedBlock_Type)jcasType).casFeatCode_inlinedRules), i);
    return (DebugScriptApply)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugInlinedBlock_Type)jcasType).casFeatCode_inlinedRules), i)));}

  /** indexed setter for inlinedRules - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setInlinedRules(int i, DebugScriptApply v) { 
    if (DebugInlinedBlock_Type.featOkTst && ((DebugInlinedBlock_Type)jcasType).casFeat_inlinedRules == null)
      jcasType.jcas.throwFeatMissing("inlinedRules", "org.apache.uima.ruta.type.DebugInlinedBlock");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugInlinedBlock_Type)jcasType).casFeatCode_inlinedRules), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugInlinedBlock_Type)jcasType).casFeatCode_inlinedRules), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    