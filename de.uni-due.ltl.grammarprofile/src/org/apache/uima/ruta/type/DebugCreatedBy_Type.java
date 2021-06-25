
/* First created by JCasGen Wed May 26 11:49:05 CEST 2021 */
package org.apache.uima.ruta.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** 
 * Updated by JCasGen Wed May 26 14:25:19 CEST 2021
 * @generated */
public class DebugCreatedBy_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DebugCreatedBy.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.ruta.type.DebugCreatedBy");
 
  /** @generated */
  final Feature casFeat_rule;
  /** @generated */
  final int     casFeatCode_rule;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRule(int addr) {
        if (featOkTst && casFeat_rule == null)
      jcas.throwFeatMissing("rule", "org.apache.uima.ruta.type.DebugCreatedBy");
    return ll_cas.ll_getStringValue(addr, casFeatCode_rule);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRule(int addr, String v) {
        if (featOkTst && casFeat_rule == null)
      jcas.throwFeatMissing("rule", "org.apache.uima.ruta.type.DebugCreatedBy");
    ll_cas.ll_setStringValue(addr, casFeatCode_rule, v);}
    
  
 
  /** @generated */
  final Feature casFeat_annotation;
  /** @generated */
  final int     casFeatCode_annotation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAnnotation(int addr) {
        if (featOkTst && casFeat_annotation == null)
      jcas.throwFeatMissing("annotation", "org.apache.uima.ruta.type.DebugCreatedBy");
    return ll_cas.ll_getRefValue(addr, casFeatCode_annotation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnnotation(int addr, int v) {
        if (featOkTst && casFeat_annotation == null)
      jcas.throwFeatMissing("annotation", "org.apache.uima.ruta.type.DebugCreatedBy");
    ll_cas.ll_setRefValue(addr, casFeatCode_annotation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_script;
  /** @generated */
  final int     casFeatCode_script;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getScript(int addr) {
        if (featOkTst && casFeat_script == null)
      jcas.throwFeatMissing("script", "org.apache.uima.ruta.type.DebugCreatedBy");
    return ll_cas.ll_getStringValue(addr, casFeatCode_script);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScript(int addr, String v) {
        if (featOkTst && casFeat_script == null)
      jcas.throwFeatMissing("script", "org.apache.uima.ruta.type.DebugCreatedBy");
    ll_cas.ll_setStringValue(addr, casFeatCode_script, v);}
    
  
 
  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "org.apache.uima.ruta.type.DebugCreatedBy");
    return ll_cas.ll_getIntValue(addr, casFeatCode_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setId(int addr, int v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "org.apache.uima.ruta.type.DebugCreatedBy");
    ll_cas.ll_setIntValue(addr, casFeatCode_id, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DebugCreatedBy_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_rule = jcas.getRequiredFeatureDE(casType, "rule", "uima.cas.String", featOkTst);
    casFeatCode_rule  = (null == casFeat_rule) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rule).getCode();

 
    casFeat_annotation = jcas.getRequiredFeatureDE(casType, "annotation", "uima.tcas.Annotation", featOkTst);
    casFeatCode_annotation  = (null == casFeat_annotation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_annotation).getCode();

 
    casFeat_script = jcas.getRequiredFeatureDE(casType, "script", "uima.cas.String", featOkTst);
    casFeatCode_script  = (null == casFeat_script) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_script).getCode();

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.Integer", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

  }
}



    