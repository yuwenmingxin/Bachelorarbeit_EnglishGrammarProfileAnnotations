

/* First created by JCasGen Wed May 26 11:49:05 CEST 2021 */
package org.apache.uima.ruta.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed May 26 14:25:19 CEST 2021
 * XML source: /Users/quante/Documents/BA_Ye_Yao/de.uni-due.ltl.grammarprofile/src/main/resources/ruta/TeachTypeSystem.xml
 * @generated */
public class RutaColoring extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RutaColoring.class);
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
  protected RutaColoring() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public RutaColoring(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RutaColoring(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public RutaColoring(JCas jcas, int begin, int end) {
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
  //* Feature: bgColor

  /** getter for bgColor - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBgColor() {
    if (RutaColoring_Type.featOkTst && ((RutaColoring_Type)jcasType).casFeat_bgColor == null)
      jcasType.jcas.throwFeatMissing("bgColor", "org.apache.uima.ruta.type.RutaColoring");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RutaColoring_Type)jcasType).casFeatCode_bgColor);}
    
  /** setter for bgColor - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBgColor(String v) {
    if (RutaColoring_Type.featOkTst && ((RutaColoring_Type)jcasType).casFeat_bgColor == null)
      jcasType.jcas.throwFeatMissing("bgColor", "org.apache.uima.ruta.type.RutaColoring");
    jcasType.ll_cas.ll_setStringValue(addr, ((RutaColoring_Type)jcasType).casFeatCode_bgColor, v);}    
   
    
  //*--------------*
  //* Feature: targetType

  /** getter for targetType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTargetType() {
    if (RutaColoring_Type.featOkTst && ((RutaColoring_Type)jcasType).casFeat_targetType == null)
      jcasType.jcas.throwFeatMissing("targetType", "org.apache.uima.ruta.type.RutaColoring");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RutaColoring_Type)jcasType).casFeatCode_targetType);}
    
  /** setter for targetType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTargetType(String v) {
    if (RutaColoring_Type.featOkTst && ((RutaColoring_Type)jcasType).casFeat_targetType == null)
      jcasType.jcas.throwFeatMissing("targetType", "org.apache.uima.ruta.type.RutaColoring");
    jcasType.ll_cas.ll_setStringValue(addr, ((RutaColoring_Type)jcasType).casFeatCode_targetType, v);}    
   
    
  //*--------------*
  //* Feature: fgColor

  /** getter for fgColor - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFgColor() {
    if (RutaColoring_Type.featOkTst && ((RutaColoring_Type)jcasType).casFeat_fgColor == null)
      jcasType.jcas.throwFeatMissing("fgColor", "org.apache.uima.ruta.type.RutaColoring");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RutaColoring_Type)jcasType).casFeatCode_fgColor);}
    
  /** setter for fgColor - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFgColor(String v) {
    if (RutaColoring_Type.featOkTst && ((RutaColoring_Type)jcasType).casFeat_fgColor == null)
      jcasType.jcas.throwFeatMissing("fgColor", "org.apache.uima.ruta.type.RutaColoring");
    jcasType.ll_cas.ll_setStringValue(addr, ((RutaColoring_Type)jcasType).casFeatCode_fgColor, v);}    
   
    
  //*--------------*
  //* Feature: selected

  /** getter for selected - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getSelected() {
    if (RutaColoring_Type.featOkTst && ((RutaColoring_Type)jcasType).casFeat_selected == null)
      jcasType.jcas.throwFeatMissing("selected", "org.apache.uima.ruta.type.RutaColoring");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((RutaColoring_Type)jcasType).casFeatCode_selected);}
    
  /** setter for selected - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSelected(boolean v) {
    if (RutaColoring_Type.featOkTst && ((RutaColoring_Type)jcasType).casFeat_selected == null)
      jcasType.jcas.throwFeatMissing("selected", "org.apache.uima.ruta.type.RutaColoring");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((RutaColoring_Type)jcasType).casFeatCode_selected, v);}    
  }

    