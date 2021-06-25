
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
public class DebugRuleElementMatches_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DebugRuleElementMatches.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.ruta.type.DebugRuleElementMatches");
 
  /** @generated */
  final Feature casFeat_matches;
  /** @generated */
  final int     casFeatCode_matches;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMatches(int addr) {
        if (featOkTst && casFeat_matches == null)
      jcas.throwFeatMissing("matches", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    return ll_cas.ll_getRefValue(addr, casFeatCode_matches);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMatches(int addr, int v) {
        if (featOkTst && casFeat_matches == null)
      jcas.throwFeatMissing("matches", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    ll_cas.ll_setRefValue(addr, casFeatCode_matches, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getMatches(int addr, int i) {
        if (featOkTst && casFeat_matches == null)
      jcas.throwFeatMissing("matches", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matches), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_matches), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matches), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setMatches(int addr, int i, int v) {
        if (featOkTst && casFeat_matches == null)
      jcas.throwFeatMissing("matches", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matches), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_matches), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matches), i, v);
  }
 
 
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
      jcas.throwFeatMissing("element", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    return ll_cas.ll_getStringValue(addr, casFeatCode_element);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setElement(int addr, String v) {
        if (featOkTst && casFeat_element == null)
      jcas.throwFeatMissing("element", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    ll_cas.ll_setStringValue(addr, casFeatCode_element, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ruleAnchor;
  /** @generated */
  final int     casFeatCode_ruleAnchor;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getRuleAnchor(int addr) {
        if (featOkTst && casFeat_ruleAnchor == null)
      jcas.throwFeatMissing("ruleAnchor", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_ruleAnchor);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRuleAnchor(int addr, boolean v) {
        if (featOkTst && casFeat_ruleAnchor == null)
      jcas.throwFeatMissing("ruleAnchor", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_ruleAnchor, v);}
    
  
 
  /** @generated */
  final Feature casFeat_inlinedActionBlocks;
  /** @generated */
  final int     casFeatCode_inlinedActionBlocks;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getInlinedActionBlocks(int addr) {
        if (featOkTst && casFeat_inlinedActionBlocks == null)
      jcas.throwFeatMissing("inlinedActionBlocks", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    return ll_cas.ll_getRefValue(addr, casFeatCode_inlinedActionBlocks);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setInlinedActionBlocks(int addr, int v) {
        if (featOkTst && casFeat_inlinedActionBlocks == null)
      jcas.throwFeatMissing("inlinedActionBlocks", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    ll_cas.ll_setRefValue(addr, casFeatCode_inlinedActionBlocks, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getInlinedActionBlocks(int addr, int i) {
        if (featOkTst && casFeat_inlinedActionBlocks == null)
      jcas.throwFeatMissing("inlinedActionBlocks", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_inlinedActionBlocks), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_inlinedActionBlocks), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_inlinedActionBlocks), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setInlinedActionBlocks(int addr, int i, int v) {
        if (featOkTst && casFeat_inlinedActionBlocks == null)
      jcas.throwFeatMissing("inlinedActionBlocks", "org.apache.uima.ruta.type.DebugRuleElementMatches");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_inlinedActionBlocks), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_inlinedActionBlocks), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_inlinedActionBlocks), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DebugRuleElementMatches_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_matches = jcas.getRequiredFeatureDE(casType, "matches", "uima.cas.FSArray", featOkTst);
    casFeatCode_matches  = (null == casFeat_matches) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_matches).getCode();

 
    casFeat_element = jcas.getRequiredFeatureDE(casType, "element", "uima.cas.String", featOkTst);
    casFeatCode_element  = (null == casFeat_element) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_element).getCode();

 
    casFeat_ruleAnchor = jcas.getRequiredFeatureDE(casType, "ruleAnchor", "uima.cas.Boolean", featOkTst);
    casFeatCode_ruleAnchor  = (null == casFeat_ruleAnchor) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ruleAnchor).getCode();

 
    casFeat_inlinedActionBlocks = jcas.getRequiredFeatureDE(casType, "inlinedActionBlocks", "uima.cas.FSArray", featOkTst);
    casFeatCode_inlinedActionBlocks  = (null == casFeat_inlinedActionBlocks) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_inlinedActionBlocks).getCode();

  }
}



    