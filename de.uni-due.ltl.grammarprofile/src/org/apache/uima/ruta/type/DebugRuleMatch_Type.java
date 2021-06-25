
/* First created by JCasGen Wed May 26 11:49:05 CEST 2021 */
package org.apache.uima.ruta.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Wed May 26 14:25:19 CEST 2021
 * @generated */
public class DebugRuleMatch_Type extends ProfiledAnnotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DebugRuleMatch.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.ruta.type.DebugRuleMatch");
 
  /** @generated */
  final Feature casFeat_elements;
  /** @generated */
  final int     casFeatCode_elements;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getElements(int addr) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "org.apache.uima.ruta.type.DebugRuleMatch");
    return ll_cas.ll_getRefValue(addr, casFeatCode_elements);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setElements(int addr, int v) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "org.apache.uima.ruta.type.DebugRuleMatch");
    ll_cas.ll_setRefValue(addr, casFeatCode_elements, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getElements(int addr, int i) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "org.apache.uima.ruta.type.DebugRuleMatch");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setElements(int addr, int i, int v) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "org.apache.uima.ruta.type.DebugRuleMatch");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_matched;
  /** @generated */
  final int     casFeatCode_matched;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getMatched(int addr) {
        if (featOkTst && casFeat_matched == null)
      jcas.throwFeatMissing("matched", "org.apache.uima.ruta.type.DebugRuleMatch");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_matched);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMatched(int addr, boolean v) {
        if (featOkTst && casFeat_matched == null)
      jcas.throwFeatMissing("matched", "org.apache.uima.ruta.type.DebugRuleMatch");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_matched, v);}
    
  
 
  /** @generated */
  final Feature casFeat_delegates;
  /** @generated */
  final int     casFeatCode_delegates;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDelegates(int addr) {
        if (featOkTst && casFeat_delegates == null)
      jcas.throwFeatMissing("delegates", "org.apache.uima.ruta.type.DebugRuleMatch");
    return ll_cas.ll_getRefValue(addr, casFeatCode_delegates);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDelegates(int addr, int v) {
        if (featOkTst && casFeat_delegates == null)
      jcas.throwFeatMissing("delegates", "org.apache.uima.ruta.type.DebugRuleMatch");
    ll_cas.ll_setRefValue(addr, casFeatCode_delegates, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getDelegates(int addr, int i) {
        if (featOkTst && casFeat_delegates == null)
      jcas.throwFeatMissing("delegates", "org.apache.uima.ruta.type.DebugRuleMatch");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_delegates), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_delegates), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_delegates), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setDelegates(int addr, int i, int v) {
        if (featOkTst && casFeat_delegates == null)
      jcas.throwFeatMissing("delegates", "org.apache.uima.ruta.type.DebugRuleMatch");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_delegates), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_delegates), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_delegates), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DebugRuleMatch_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_elements = jcas.getRequiredFeatureDE(casType, "elements", "uima.cas.FSArray", featOkTst);
    casFeatCode_elements  = (null == casFeat_elements) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_elements).getCode();

 
    casFeat_matched = jcas.getRequiredFeatureDE(casType, "matched", "uima.cas.Boolean", featOkTst);
    casFeatCode_matched  = (null == casFeat_matched) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_matched).getCode();

 
    casFeat_delegates = jcas.getRequiredFeatureDE(casType, "delegates", "uima.cas.FSArray", featOkTst);
    casFeatCode_delegates  = (null == casFeat_delegates) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_delegates).getCode();

  }
}



    