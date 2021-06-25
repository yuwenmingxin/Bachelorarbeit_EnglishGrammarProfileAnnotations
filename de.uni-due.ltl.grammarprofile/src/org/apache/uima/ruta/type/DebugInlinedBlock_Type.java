
/* First created by JCasGen Wed May 26 14:13:51 CEST 2021 */
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
public class DebugInlinedBlock_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DebugInlinedBlock.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.ruta.type.DebugInlinedBlock");
 
  /** @generated */
  final Feature casFeat_element;
  /** @generated */
  final int     casFeatCode_element;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getElement(int addr) {
        if (featOkTst && casFeat_element == null)
      jcas.throwFeatMissing("element", "org.apache.uima.ruta.type.DebugInlinedBlock");
    return ll_cas.ll_getStringValue(addr, casFeatCode_element);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setElement(int addr, String v) {
        if (featOkTst && casFeat_element == null)
      jcas.throwFeatMissing("element", "org.apache.uima.ruta.type.DebugInlinedBlock");
    ll_cas.ll_setStringValue(addr, casFeatCode_element, v);}
    
  
 
  /** @generated */
  final Feature casFeat_asCondition;
  /** @generated */
  final int     casFeatCode_asCondition;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getAsCondition(int addr) {
        if (featOkTst && casFeat_asCondition == null)
      jcas.throwFeatMissing("asCondition", "org.apache.uima.ruta.type.DebugInlinedBlock");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_asCondition);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAsCondition(int addr, boolean v) {
        if (featOkTst && casFeat_asCondition == null)
      jcas.throwFeatMissing("asCondition", "org.apache.uima.ruta.type.DebugInlinedBlock");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_asCondition, v);}
    
  
 
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
      jcas.throwFeatMissing("matched", "org.apache.uima.ruta.type.DebugInlinedBlock");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_matched);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMatched(int addr, boolean v) {
        if (featOkTst && casFeat_matched == null)
      jcas.throwFeatMissing("matched", "org.apache.uima.ruta.type.DebugInlinedBlock");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_matched, v);}
    
  
 
  /** @generated */
  final Feature casFeat_inlinedRules;
  /** @generated */
  final int     casFeatCode_inlinedRules;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getInlinedRules(int addr) {
        if (featOkTst && casFeat_inlinedRules == null)
      jcas.throwFeatMissing("inlinedRules", "org.apache.uima.ruta.type.DebugInlinedBlock");
    return ll_cas.ll_getRefValue(addr, casFeatCode_inlinedRules);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setInlinedRules(int addr, int v) {
        if (featOkTst && casFeat_inlinedRules == null)
      jcas.throwFeatMissing("inlinedRules", "org.apache.uima.ruta.type.DebugInlinedBlock");
    ll_cas.ll_setRefValue(addr, casFeatCode_inlinedRules, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getInlinedRules(int addr, int i) {
        if (featOkTst && casFeat_inlinedRules == null)
      jcas.throwFeatMissing("inlinedRules", "org.apache.uima.ruta.type.DebugInlinedBlock");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_inlinedRules), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_inlinedRules), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_inlinedRules), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setInlinedRules(int addr, int i, int v) {
        if (featOkTst && casFeat_inlinedRules == null)
      jcas.throwFeatMissing("inlinedRules", "org.apache.uima.ruta.type.DebugInlinedBlock");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_inlinedRules), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_inlinedRules), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_inlinedRules), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DebugInlinedBlock_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_element = jcas.getRequiredFeatureDE(casType, "element", "uima.cas.String", featOkTst);
    casFeatCode_element  = (null == casFeat_element) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_element).getCode();

 
    casFeat_asCondition = jcas.getRequiredFeatureDE(casType, "asCondition", "uima.cas.Boolean", featOkTst);
    casFeatCode_asCondition  = (null == casFeat_asCondition) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_asCondition).getCode();

 
    casFeat_matched = jcas.getRequiredFeatureDE(casType, "matched", "uima.cas.Boolean", featOkTst);
    casFeatCode_matched  = (null == casFeat_matched) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_matched).getCode();

 
    casFeat_inlinedRules = jcas.getRequiredFeatureDE(casType, "inlinedRules", "uima.cas.FSArray", featOkTst);
    casFeatCode_inlinedRules  = (null == casFeat_inlinedRules) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_inlinedRules).getCode();

  }
}



    