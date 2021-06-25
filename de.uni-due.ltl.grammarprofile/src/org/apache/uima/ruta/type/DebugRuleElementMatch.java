

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
public class DebugRuleElementMatch extends ProfiledAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DebugRuleElementMatch.class);
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
  protected DebugRuleElementMatch() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DebugRuleElementMatch(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DebugRuleElementMatch(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DebugRuleElementMatch(JCas jcas, int begin, int end) {
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
  //* Feature: baseCondition

  /** getter for baseCondition - gets 
   * @generated
   * @return value of the feature 
   */
  public DebugEvaluatedCondition getBaseCondition() {
    if (DebugRuleElementMatch_Type.featOkTst && ((DebugRuleElementMatch_Type)jcasType).casFeat_baseCondition == null)
      jcasType.jcas.throwFeatMissing("baseCondition", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    return (DebugEvaluatedCondition)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_baseCondition)));}
    
  /** setter for baseCondition - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBaseCondition(DebugEvaluatedCondition v) {
    if (DebugRuleElementMatch_Type.featOkTst && ((DebugRuleElementMatch_Type)jcasType).casFeat_baseCondition == null)
      jcasType.jcas.throwFeatMissing("baseCondition", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    jcasType.ll_cas.ll_setRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_baseCondition, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: conditions

  /** getter for conditions - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getConditions() {
    if (DebugRuleElementMatch_Type.featOkTst && ((DebugRuleElementMatch_Type)jcasType).casFeat_conditions == null)
      jcasType.jcas.throwFeatMissing("conditions", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_conditions)));}
    
  /** setter for conditions - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConditions(FSArray v) {
    if (DebugRuleElementMatch_Type.featOkTst && ((DebugRuleElementMatch_Type)jcasType).casFeat_conditions == null)
      jcasType.jcas.throwFeatMissing("conditions", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    jcasType.ll_cas.ll_setRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_conditions, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for conditions - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public DebugEvaluatedCondition getConditions(int i) {
    if (DebugRuleElementMatch_Type.featOkTst && ((DebugRuleElementMatch_Type)jcasType).casFeat_conditions == null)
      jcasType.jcas.throwFeatMissing("conditions", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_conditions), i);
    return (DebugEvaluatedCondition)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_conditions), i)));}

  /** indexed setter for conditions - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setConditions(int i, DebugEvaluatedCondition v) { 
    if (DebugRuleElementMatch_Type.featOkTst && ((DebugRuleElementMatch_Type)jcasType).casFeat_conditions == null)
      jcasType.jcas.throwFeatMissing("conditions", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_conditions), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_conditions), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: elements

  /** getter for elements - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getElements() {
    if (DebugRuleElementMatch_Type.featOkTst && ((DebugRuleElementMatch_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_elements)));}
    
  /** setter for elements - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElements(FSArray v) {
    if (DebugRuleElementMatch_Type.featOkTst && ((DebugRuleElementMatch_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    jcasType.ll_cas.ll_setRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_elements, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for elements - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public DebugRuleElementMatches getElements(int i) {
    if (DebugRuleElementMatch_Type.featOkTst && ((DebugRuleElementMatch_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_elements), i);
    return (DebugRuleElementMatches)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_elements), i)));}

  /** indexed setter for elements - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setElements(int i, DebugRuleElementMatches v) { 
    if (DebugRuleElementMatch_Type.featOkTst && ((DebugRuleElementMatch_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_elements), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_elements), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: inlinedConditionBlocks

  /** getter for inlinedConditionBlocks - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getInlinedConditionBlocks() {
    if (DebugRuleElementMatch_Type.featOkTst && ((DebugRuleElementMatch_Type)jcasType).casFeat_inlinedConditionBlocks == null)
      jcasType.jcas.throwFeatMissing("inlinedConditionBlocks", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_inlinedConditionBlocks)));}
    
  /** setter for inlinedConditionBlocks - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setInlinedConditionBlocks(FSArray v) {
    if (DebugRuleElementMatch_Type.featOkTst && ((DebugRuleElementMatch_Type)jcasType).casFeat_inlinedConditionBlocks == null)
      jcasType.jcas.throwFeatMissing("inlinedConditionBlocks", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    jcasType.ll_cas.ll_setRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_inlinedConditionBlocks, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for inlinedConditionBlocks - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public DebugInlinedBlock getInlinedConditionBlocks(int i) {
    if (DebugRuleElementMatch_Type.featOkTst && ((DebugRuleElementMatch_Type)jcasType).casFeat_inlinedConditionBlocks == null)
      jcasType.jcas.throwFeatMissing("inlinedConditionBlocks", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_inlinedConditionBlocks), i);
    return (DebugInlinedBlock)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_inlinedConditionBlocks), i)));}

  /** indexed setter for inlinedConditionBlocks - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setInlinedConditionBlocks(int i, DebugInlinedBlock v) { 
    if (DebugRuleElementMatch_Type.featOkTst && ((DebugRuleElementMatch_Type)jcasType).casFeat_inlinedConditionBlocks == null)
      jcasType.jcas.throwFeatMissing("inlinedConditionBlocks", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_inlinedConditionBlocks), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatch_Type)jcasType).casFeatCode_inlinedConditionBlocks), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    