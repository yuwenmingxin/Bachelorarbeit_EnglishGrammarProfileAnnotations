

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
public class RutaAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RutaAnnotation.class);
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
  protected RutaAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public RutaAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RutaAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public RutaAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: score

  /** getter for score - gets 
   * @generated
   * @return value of the feature 
   */
  public double getScore() {
    if (RutaAnnotation_Type.featOkTst && ((RutaAnnotation_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.apache.uima.ruta.type.RutaAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((RutaAnnotation_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    if (RutaAnnotation_Type.featOkTst && ((RutaAnnotation_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.apache.uima.ruta.type.RutaAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((RutaAnnotation_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: annotation

  /** getter for annotation - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getAnnotation() {
    if (RutaAnnotation_Type.featOkTst && ((RutaAnnotation_Type)jcasType).casFeat_annotation == null)
      jcasType.jcas.throwFeatMissing("annotation", "org.apache.uima.ruta.type.RutaAnnotation");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((RutaAnnotation_Type)jcasType).casFeatCode_annotation)));}
    
  /** setter for annotation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnnotation(Annotation v) {
    if (RutaAnnotation_Type.featOkTst && ((RutaAnnotation_Type)jcasType).casFeat_annotation == null)
      jcasType.jcas.throwFeatMissing("annotation", "org.apache.uima.ruta.type.RutaAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((RutaAnnotation_Type)jcasType).casFeatCode_annotation, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    