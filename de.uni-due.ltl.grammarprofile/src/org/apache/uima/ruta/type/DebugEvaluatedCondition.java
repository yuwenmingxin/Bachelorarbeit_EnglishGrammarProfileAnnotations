

/* First created by JCasGen Wed May 26 11:49:05 CEST 2021 */
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
public class DebugEvaluatedCondition extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DebugEvaluatedCondition.class);
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
  protected DebugEvaluatedCondition() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DebugEvaluatedCondition(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DebugEvaluatedCondition(JCas jcas) {
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
    if (DebugEvaluatedCondition_Type.featOkTst && ((DebugEvaluatedCondition_Type)jcasType).casFeat_element == null)
      jcasType.jcas.throwFeatMissing("element", "org.apache.uima.ruta.type.DebugEvaluatedCondition");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DebugEvaluatedCondition_Type)jcasType).casFeatCode_element);}
    
  /** setter for element - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElement(String v) {
    if (DebugEvaluatedCondition_Type.featOkTst && ((DebugEvaluatedCondition_Type)jcasType).casFeat_element == null)
      jcasType.jcas.throwFeatMissing("element", "org.apache.uima.ruta.type.DebugEvaluatedCondition");
    jcasType.ll_cas.ll_setStringValue(addr, ((DebugEvaluatedCondition_Type)jcasType).casFeatCode_element, v);}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getValue() {
    if (DebugEvaluatedCondition_Type.featOkTst && ((DebugEvaluatedCondition_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.apache.uima.ruta.type.DebugEvaluatedCondition");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((DebugEvaluatedCondition_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(boolean v) {
    if (DebugEvaluatedCondition_Type.featOkTst && ((DebugEvaluatedCondition_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.apache.uima.ruta.type.DebugEvaluatedCondition");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((DebugEvaluatedCondition_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: conditions

  /** getter for conditions - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getConditions() {
    if (DebugEvaluatedCondition_Type.featOkTst && ((DebugEvaluatedCondition_Type)jcasType).casFeat_conditions == null)
      jcasType.jcas.throwFeatMissing("conditions", "org.apache.uima.ruta.type.DebugEvaluatedCondition");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DebugEvaluatedCondition_Type)jcasType).casFeatCode_conditions)));}
    
  /** setter for conditions - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConditions(FSArray v) {
    if (DebugEvaluatedCondition_Type.featOkTst && ((DebugEvaluatedCondition_Type)jcasType).casFeat_conditions == null)
      jcasType.jcas.throwFeatMissing("conditions", "org.apache.uima.ruta.type.DebugEvaluatedCondition");
    jcasType.ll_cas.ll_setRefValue(addr, ((DebugEvaluatedCondition_Type)jcasType).casFeatCode_conditions, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for conditions - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public DebugEvaluatedCondition getConditions(int i) {
    if (DebugEvaluatedCondition_Type.featOkTst && ((DebugEvaluatedCondition_Type)jcasType).casFeat_conditions == null)
      jcasType.jcas.throwFeatMissing("conditions", "org.apache.uima.ruta.type.DebugEvaluatedCondition");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugEvaluatedCondition_Type)jcasType).casFeatCode_conditions), i);
    return (DebugEvaluatedCondition)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugEvaluatedCondition_Type)jcasType).casFeatCode_conditions), i)));}

  /** indexed setter for conditions - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setConditions(int i, DebugEvaluatedCondition v) { 
    if (DebugEvaluatedCondition_Type.featOkTst && ((DebugEvaluatedCondition_Type)jcasType).casFeat_conditions == null)
      jcasType.jcas.throwFeatMissing("conditions", "org.apache.uima.ruta.type.DebugEvaluatedCondition");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugEvaluatedCondition_Type)jcasType).casFeatCode_conditions), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugEvaluatedCondition_Type)jcasType).casFeatCode_conditions), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    