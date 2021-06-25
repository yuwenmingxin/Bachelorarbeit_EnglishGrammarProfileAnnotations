

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
public class DebugRuleMatch extends ProfiledAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DebugRuleMatch.class);
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
  protected DebugRuleMatch() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DebugRuleMatch(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DebugRuleMatch(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DebugRuleMatch(JCas jcas, int begin, int end) {
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
  //* Feature: elements

  /** getter for elements - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getElements() {
    if (DebugRuleMatch_Type.featOkTst && ((DebugRuleMatch_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "org.apache.uima.ruta.type.DebugRuleMatch");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleMatch_Type)jcasType).casFeatCode_elements)));}
    
  /** setter for elements - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElements(FSArray v) {
    if (DebugRuleMatch_Type.featOkTst && ((DebugRuleMatch_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "org.apache.uima.ruta.type.DebugRuleMatch");
    jcasType.ll_cas.ll_setRefValue(addr, ((DebugRuleMatch_Type)jcasType).casFeatCode_elements, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for elements - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public DebugRuleElementMatches getElements(int i) {
    if (DebugRuleMatch_Type.featOkTst && ((DebugRuleMatch_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "org.apache.uima.ruta.type.DebugRuleMatch");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleMatch_Type)jcasType).casFeatCode_elements), i);
    return (DebugRuleElementMatches)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleMatch_Type)jcasType).casFeatCode_elements), i)));}

  /** indexed setter for elements - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setElements(int i, DebugRuleElementMatches v) { 
    if (DebugRuleMatch_Type.featOkTst && ((DebugRuleMatch_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "org.apache.uima.ruta.type.DebugRuleMatch");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleMatch_Type)jcasType).casFeatCode_elements), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleMatch_Type)jcasType).casFeatCode_elements), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: matched

  /** getter for matched - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getMatched() {
    if (DebugRuleMatch_Type.featOkTst && ((DebugRuleMatch_Type)jcasType).casFeat_matched == null)
      jcasType.jcas.throwFeatMissing("matched", "org.apache.uima.ruta.type.DebugRuleMatch");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((DebugRuleMatch_Type)jcasType).casFeatCode_matched);}
    
  /** setter for matched - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMatched(boolean v) {
    if (DebugRuleMatch_Type.featOkTst && ((DebugRuleMatch_Type)jcasType).casFeat_matched == null)
      jcasType.jcas.throwFeatMissing("matched", "org.apache.uima.ruta.type.DebugRuleMatch");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((DebugRuleMatch_Type)jcasType).casFeatCode_matched, v);}    
   
    
  //*--------------*
  //* Feature: delegates

  /** getter for delegates - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getDelegates() {
    if (DebugRuleMatch_Type.featOkTst && ((DebugRuleMatch_Type)jcasType).casFeat_delegates == null)
      jcasType.jcas.throwFeatMissing("delegates", "org.apache.uima.ruta.type.DebugRuleMatch");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleMatch_Type)jcasType).casFeatCode_delegates)));}
    
  /** setter for delegates - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDelegates(FSArray v) {
    if (DebugRuleMatch_Type.featOkTst && ((DebugRuleMatch_Type)jcasType).casFeat_delegates == null)
      jcasType.jcas.throwFeatMissing("delegates", "org.apache.uima.ruta.type.DebugRuleMatch");
    jcasType.ll_cas.ll_setRefValue(addr, ((DebugRuleMatch_Type)jcasType).casFeatCode_delegates, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for delegates - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public DebugScriptApply getDelegates(int i) {
    if (DebugRuleMatch_Type.featOkTst && ((DebugRuleMatch_Type)jcasType).casFeat_delegates == null)
      jcasType.jcas.throwFeatMissing("delegates", "org.apache.uima.ruta.type.DebugRuleMatch");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleMatch_Type)jcasType).casFeatCode_delegates), i);
    return (DebugScriptApply)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleMatch_Type)jcasType).casFeatCode_delegates), i)));}

  /** indexed setter for delegates - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setDelegates(int i, DebugScriptApply v) { 
    if (DebugRuleMatch_Type.featOkTst && ((DebugRuleMatch_Type)jcasType).casFeat_delegates == null)
      jcasType.jcas.throwFeatMissing("delegates", "org.apache.uima.ruta.type.DebugRuleMatch");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleMatch_Type)jcasType).casFeatCode_delegates), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleMatch_Type)jcasType).casFeatCode_delegates), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    