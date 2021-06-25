

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
public class EvalAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EvalAnnotation.class);
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
  protected EvalAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public EvalAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public EvalAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public EvalAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: original

  /** getter for original - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getOriginal() {
    if (EvalAnnotation_Type.featOkTst && ((EvalAnnotation_Type)jcasType).casFeat_original == null)
      jcasType.jcas.throwFeatMissing("original", "org.apache.uima.ruta.type.EvalAnnotation");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EvalAnnotation_Type)jcasType).casFeatCode_original)));}
    
  /** setter for original - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOriginal(Annotation v) {
    if (EvalAnnotation_Type.featOkTst && ((EvalAnnotation_Type)jcasType).casFeat_original == null)
      jcasType.jcas.throwFeatMissing("original", "org.apache.uima.ruta.type.EvalAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((EvalAnnotation_Type)jcasType).casFeatCode_original, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    