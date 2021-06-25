

/* First created by JCasGen Wed May 26 11:49:05 CEST 2021 */
package org.apache.uima.ruta.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed May 26 14:25:19 CEST 2021
 * XML source: /Users/quante/Documents/BA_Ye_Yao/de.uni-due.ltl.grammarprofile/src/main/resources/ruta/TeachTypeSystem.xml
 * @generated */
public class DebugCreatedBy extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DebugCreatedBy.class);
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
  protected DebugCreatedBy() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DebugCreatedBy(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DebugCreatedBy(JCas jcas) {
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
  //* Feature: rule

  /** getter for rule - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRule() {
    if (DebugCreatedBy_Type.featOkTst && ((DebugCreatedBy_Type)jcasType).casFeat_rule == null)
      jcasType.jcas.throwFeatMissing("rule", "org.apache.uima.ruta.type.DebugCreatedBy");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DebugCreatedBy_Type)jcasType).casFeatCode_rule);}
    
  /** setter for rule - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRule(String v) {
    if (DebugCreatedBy_Type.featOkTst && ((DebugCreatedBy_Type)jcasType).casFeat_rule == null)
      jcasType.jcas.throwFeatMissing("rule", "org.apache.uima.ruta.type.DebugCreatedBy");
    jcasType.ll_cas.ll_setStringValue(addr, ((DebugCreatedBy_Type)jcasType).casFeatCode_rule, v);}    
   
    
  //*--------------*
  //* Feature: annotation

  /** getter for annotation - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getAnnotation() {
    if (DebugCreatedBy_Type.featOkTst && ((DebugCreatedBy_Type)jcasType).casFeat_annotation == null)
      jcasType.jcas.throwFeatMissing("annotation", "org.apache.uima.ruta.type.DebugCreatedBy");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DebugCreatedBy_Type)jcasType).casFeatCode_annotation)));}
    
  /** setter for annotation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnnotation(Annotation v) {
    if (DebugCreatedBy_Type.featOkTst && ((DebugCreatedBy_Type)jcasType).casFeat_annotation == null)
      jcasType.jcas.throwFeatMissing("annotation", "org.apache.uima.ruta.type.DebugCreatedBy");
    jcasType.ll_cas.ll_setRefValue(addr, ((DebugCreatedBy_Type)jcasType).casFeatCode_annotation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: script

  /** getter for script - gets 
   * @generated
   * @return value of the feature 
   */
  public String getScript() {
    if (DebugCreatedBy_Type.featOkTst && ((DebugCreatedBy_Type)jcasType).casFeat_script == null)
      jcasType.jcas.throwFeatMissing("script", "org.apache.uima.ruta.type.DebugCreatedBy");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DebugCreatedBy_Type)jcasType).casFeatCode_script);}
    
  /** setter for script - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScript(String v) {
    if (DebugCreatedBy_Type.featOkTst && ((DebugCreatedBy_Type)jcasType).casFeat_script == null)
      jcasType.jcas.throwFeatMissing("script", "org.apache.uima.ruta.type.DebugCreatedBy");
    jcasType.ll_cas.ll_setStringValue(addr, ((DebugCreatedBy_Type)jcasType).casFeatCode_script, v);}    
   
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets 
   * @generated
   * @return value of the feature 
   */
  public int getId() {
    if (DebugCreatedBy_Type.featOkTst && ((DebugCreatedBy_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.uima.ruta.type.DebugCreatedBy");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DebugCreatedBy_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(int v) {
    if (DebugCreatedBy_Type.featOkTst && ((DebugCreatedBy_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.uima.ruta.type.DebugCreatedBy");
    jcasType.ll_cas.ll_setIntValue(addr, ((DebugCreatedBy_Type)jcasType).casFeatCode_id, v);}    
  }

    