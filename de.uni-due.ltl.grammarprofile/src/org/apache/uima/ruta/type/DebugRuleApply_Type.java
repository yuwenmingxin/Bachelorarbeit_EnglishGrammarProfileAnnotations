
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
public class DebugRuleApply_Type extends DebugScriptApply_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DebugRuleApply.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.ruta.type.DebugRuleApply");
 
  /** @generated */
  final Feature casFeat_applied;
  /** @generated */
  final int     casFeatCode_applied;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getApplied(int addr) {
        if (featOkTst && casFeat_applied == null)
      jcas.throwFeatMissing("applied", "org.apache.uima.ruta.type.DebugRuleApply");
    return ll_cas.ll_getIntValue(addr, casFeatCode_applied);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setApplied(int addr, int v) {
        if (featOkTst && casFeat_applied == null)
      jcas.throwFeatMissing("applied", "org.apache.uima.ruta.type.DebugRuleApply");
    ll_cas.ll_setIntValue(addr, casFeatCode_applied, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tried;
  /** @generated */
  final int     casFeatCode_tried;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTried(int addr) {
        if (featOkTst && casFeat_tried == null)
      jcas.throwFeatMissing("tried", "org.apache.uima.ruta.type.DebugRuleApply");
    return ll_cas.ll_getIntValue(addr, casFeatCode_tried);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTried(int addr, int v) {
        if (featOkTst && casFeat_tried == null)
      jcas.throwFeatMissing("tried", "org.apache.uima.ruta.type.DebugRuleApply");
    ll_cas.ll_setIntValue(addr, casFeatCode_tried, v);}
    
  
 
  /** @generated */
  final Feature casFeat_rules;
  /** @generated */
  final int     casFeatCode_rules;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRules(int addr) {
        if (featOkTst && casFeat_rules == null)
      jcas.throwFeatMissing("rules", "org.apache.uima.ruta.type.DebugRuleApply");
    return ll_cas.ll_getRefValue(addr, casFeatCode_rules);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRules(int addr, int v) {
        if (featOkTst && casFeat_rules == null)
      jcas.throwFeatMissing("rules", "org.apache.uima.ruta.type.DebugRuleApply");
    ll_cas.ll_setRefValue(addr, casFeatCode_rules, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getRules(int addr, int i) {
        if (featOkTst && casFeat_rules == null)
      jcas.throwFeatMissing("rules", "org.apache.uima.ruta.type.DebugRuleApply");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_rules), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_rules), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_rules), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setRules(int addr, int i, int v) {
        if (featOkTst && casFeat_rules == null)
      jcas.throwFeatMissing("rules", "org.apache.uima.ruta.type.DebugRuleApply");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_rules), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_rules), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_rules), i, v);
  }
 
 
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
      jcas.throwFeatMissing("id", "org.apache.uima.ruta.type.DebugRuleApply");
    return ll_cas.ll_getIntValue(addr, casFeatCode_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setId(int addr, int v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "org.apache.uima.ruta.type.DebugRuleApply");
    ll_cas.ll_setIntValue(addr, casFeatCode_id, v);}
    
  
 
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
      jcas.throwFeatMissing("script", "org.apache.uima.ruta.type.DebugRuleApply");
    return ll_cas.ll_getStringValue(addr, casFeatCode_script);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScript(int addr, String v) {
        if (featOkTst && casFeat_script == null)
      jcas.throwFeatMissing("script", "org.apache.uima.ruta.type.DebugRuleApply");
    ll_cas.ll_setStringValue(addr, casFeatCode_script, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DebugRuleApply_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_applied = jcas.getRequiredFeatureDE(casType, "applied", "uima.cas.Integer", featOkTst);
    casFeatCode_applied  = (null == casFeat_applied) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_applied).getCode();

 
    casFeat_tried = jcas.getRequiredFeatureDE(casType, "tried", "uima.cas.Integer", featOkTst);
    casFeatCode_tried  = (null == casFeat_tried) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tried).getCode();

 
    casFeat_rules = jcas.getRequiredFeatureDE(casType, "rules", "uima.cas.FSArray", featOkTst);
    casFeatCode_rules  = (null == casFeat_rules) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rules).getCode();

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.Integer", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_script = jcas.getRequiredFeatureDE(casType, "script", "uima.cas.String", featOkTst);
    casFeatCode_script  = (null == casFeat_script) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_script).getCode();

  }
}



    