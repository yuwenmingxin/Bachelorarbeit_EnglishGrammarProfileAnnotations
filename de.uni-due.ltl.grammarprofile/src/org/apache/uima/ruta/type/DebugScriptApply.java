

/* First created by JCasGen Wed May 26 11:49:05 CEST 2021 */
package org.apache.uima.ruta.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed May 26 14:25:19 CEST 2021
 * XML source: /Users/quante/Documents/BA_Ye_Yao/de.uni-due.ltl.grammarprofile/src/main/resources/ruta/TeachTypeSystem.xml
 * @generated */
public class DebugScriptApply extends ProfiledAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DebugScriptApply.class);
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
  protected DebugScriptApply() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DebugScriptApply(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DebugScriptApply(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DebugScriptApply(JCas jcas, int begin, int end) {
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
  //* Feature: element

  /** getter for element - gets 
   * @generated
   * @return value of the feature 
   */
  public String getElement() {
    if (DebugScriptApply_Type.featOkTst && ((DebugScriptApply_Type)jcasType).casFeat_element == null)
      jcasType.jcas.throwFeatMissing("element", "org.apache.uima.ruta.type.DebugScriptApply");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DebugScriptApply_Type)jcasType).casFeatCode_element);}
    
  /** setter for element - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElement(String v) {
    if (DebugScriptApply_Type.featOkTst && ((DebugScriptApply_Type)jcasType).casFeat_element == null)
      jcasType.jcas.throwFeatMissing("element", "org.apache.uima.ruta.type.DebugScriptApply");
    jcasType.ll_cas.ll_setStringValue(addr, ((DebugScriptApply_Type)jcasType).casFeatCode_element, v);}    
   
    
  //*--------------*
  //* Feature: timestamp

  /** getter for timestamp - gets 
   * @generated
   * @return value of the feature 
   */
  public long getTimestamp() {
    if (DebugScriptApply_Type.featOkTst && ((DebugScriptApply_Type)jcasType).casFeat_timestamp == null)
      jcasType.jcas.throwFeatMissing("timestamp", "org.apache.uima.ruta.type.DebugScriptApply");
    return jcasType.ll_cas.ll_getLongValue(addr, ((DebugScriptApply_Type)jcasType).casFeatCode_timestamp);}
    
  /** setter for timestamp - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimestamp(long v) {
    if (DebugScriptApply_Type.featOkTst && ((DebugScriptApply_Type)jcasType).casFeat_timestamp == null)
      jcasType.jcas.throwFeatMissing("timestamp", "org.apache.uima.ruta.type.DebugScriptApply");
    jcasType.ll_cas.ll_setLongValue(addr, ((DebugScriptApply_Type)jcasType).casFeatCode_timestamp, v);}    
  }

    