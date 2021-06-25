

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
public class DebugRuleElementMatches extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DebugRuleElementMatches.class);
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
  protected DebugRuleElementMatches() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DebugRuleElementMatches(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DebugRuleElementMatches(JCas jcas) {
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
  //* Feature: matches

  /** getter for matches - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getMatches() {
    if (DebugRuleElementMatches_Type.featOkTst && ((DebugRuleElementMatches_Type)jcasType).casFeat_matches == null)
      jcasType.jcas.throwFeatMissing("matches", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatches_Type)jcasType).casFeatCode_matches)));}
    
  /** setter for matches - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMatches(FSArray v) {
    if (DebugRuleElementMatches_Type.featOkTst && ((DebugRuleElementMatches_Type)jcasType).casFeat_matches == null)
      jcasType.jcas.throwFeatMissing("matches", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    jcasType.ll_cas.ll_setRefValue(addr, ((DebugRuleElementMatches_Type)jcasType).casFeatCode_matches, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for matches - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public DebugRuleElementMatch getMatches(int i) {
    if (DebugRuleElementMatches_Type.featOkTst && ((DebugRuleElementMatches_Type)jcasType).casFeat_matches == null)
      jcasType.jcas.throwFeatMissing("matches", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatches_Type)jcasType).casFeatCode_matches), i);
    return (DebugRuleElementMatch)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatches_Type)jcasType).casFeatCode_matches), i)));}

  /** indexed setter for matches - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setMatches(int i, DebugRuleElementMatch v) { 
    if (DebugRuleElementMatches_Type.featOkTst && ((DebugRuleElementMatches_Type)jcasType).casFeat_matches == null)
      jcasType.jcas.throwFeatMissing("matches", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatches_Type)jcasType).casFeatCode_matches), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatches_Type)jcasType).casFeatCode_matches), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: element

  /** getter for element - gets 
   * @generated
   * @return value of the feature 
   */
  public String getElement() {
    if (DebugRuleElementMatches_Type.featOkTst && ((DebugRuleElementMatches_Type)jcasType).casFeat_element == null)
      jcasType.jcas.throwFeatMissing("element", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DebugRuleElementMatches_Type)jcasType).casFeatCode_element);}
    
  /** setter for element - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElement(String v) {
    if (DebugRuleElementMatches_Type.featOkTst && ((DebugRuleElementMatches_Type)jcasType).casFeat_element == null)
      jcasType.jcas.throwFeatMissing("element", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    jcasType.ll_cas.ll_setStringValue(addr, ((DebugRuleElementMatches_Type)jcasType).casFeatCode_element, v);}    
   
    
  //*--------------*
  //* Feature: ruleAnchor

  /** getter for ruleAnchor - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getRuleAnchor() {
    if (DebugRuleElementMatches_Type.featOkTst && ((DebugRuleElementMatches_Type)jcasType).casFeat_ruleAnchor == null)
      jcasType.jcas.throwFeatMissing("ruleAnchor", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((DebugRuleElementMatches_Type)jcasType).casFeatCode_ruleAnchor);}
    
  /** setter for ruleAnchor - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRuleAnchor(boolean v) {
    if (DebugRuleElementMatches_Type.featOkTst && ((DebugRuleElementMatches_Type)jcasType).casFeat_ruleAnchor == null)
      jcasType.jcas.throwFeatMissing("ruleAnchor", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((DebugRuleElementMatches_Type)jcasType).casFeatCode_ruleAnchor, v);}    
   
    
  //*--------------*
  //* Feature: inlinedActionBlocks

  /** getter for inlinedActionBlocks - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getInlinedActionBlocks() {
    if (DebugRuleElementMatches_Type.featOkTst && ((DebugRuleElementMatches_Type)jcasType).casFeat_inlinedActionBlocks == null)
      jcasType.jcas.throwFeatMissing("inlinedActionBlocks", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatches_Type)jcasType).casFeatCode_inlinedActionBlocks)));}
    
  /** setter for inlinedActionBlocks - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setInlinedActionBlocks(FSArray v) {
    if (DebugRuleElementMatches_Type.featOkTst && ((DebugRuleElementMatches_Type)jcasType).casFeat_inlinedActionBlocks == null)
      jcasType.jcas.throwFeatMissing("inlinedActionBlocks", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    jcasType.ll_cas.ll_setRefValue(addr, ((DebugRuleElementMatches_Type)jcasType).casFeatCode_inlinedActionBlocks, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for inlinedActionBlocks - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public DebugInlinedBlock getInlinedActionBlocks(int i) {
    if (DebugRuleElementMatches_Type.featOkTst && ((DebugRuleElementMatches_Type)jcasType).casFeat_inlinedActionBlocks == null)
      jcasType.jcas.throwFeatMissing("inlinedActionBlocks", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatches_Type)jcasType).casFeatCode_inlinedActionBlocks), i);
    return (DebugInlinedBlock)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatches_Type)jcasType).casFeatCode_inlinedActionBlocks), i)));}

  /** indexed setter for inlinedActionBlocks - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setInlinedActionBlocks(int i, DebugInlinedBlock v) { 
    if (DebugRuleElementMatches_Type.featOkTst && ((DebugRuleElementMatches_Type)jcasType).casFeat_inlinedActionBlocks == null)
      jcasType.jcas.throwFeatMissing("inlinedActionBlocks", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatches_Type)jcasType).casFeatCode_inlinedActionBlocks), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DebugRuleElementMatches_Type)jcasType).casFeatCode_inlinedActionBlocks), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    