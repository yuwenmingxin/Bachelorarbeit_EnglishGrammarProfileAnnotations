
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
public class DebugRuleElementMatch_Type extends ProfiledAnnotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DebugRuleElementMatch.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.ruta.type.DebugRuleElementMatch");
 
  /** @generated */
  final Feature casFeat_baseCondition;
  /** @generated */
  final int     casFeatCode_baseCondition;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBaseCondition(int addr) {
        if (featOkTst && casFeat_baseCondition == null)
      jcas.throwFeatMissing("baseCondition", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    return ll_cas.ll_getRefValue(addr, casFeatCode_baseCondition);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBaseCondition(int addr, int v) {
        if (featOkTst && casFeat_baseCondition == null)
      jcas.throwFeatMissing("baseCondition", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    ll_cas.ll_setRefValue(addr, casFeatCode_baseCondition, v);}
    
  
 
  /** @generated */
  final Feature casFeat_conditions;
  /** @generated */
  final int     casFeatCode_conditions;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getConditions(int addr) {
        if (featOkTst && casFeat_conditions == null)
      jcas.throwFeatMissing("conditions", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    return ll_cas.ll_getRefValue(addr, casFeatCode_conditions);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConditions(int addr, int v) {
        if (featOkTst && casFeat_conditions == null)
      jcas.throwFeatMissing("conditions", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    ll_cas.ll_setRefValue(addr, casFeatCode_conditions, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getConditions(int addr, int i) {
        if (featOkTst && casFeat_conditions == null)
      jcas.throwFeatMissing("conditions", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_conditions), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_conditions), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_conditions), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setConditions(int addr, int i, int v) {
        if (featOkTst && casFeat_conditions == null)
      jcas.throwFeatMissing("conditions", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_conditions), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_conditions), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_conditions), i, v);
  }
 
 
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
      jcas.throwFeatMissing("elements", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    return ll_cas.ll_getRefValue(addr, casFeatCode_elements);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setElements(int addr, int v) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    ll_cas.ll_setRefValue(addr, casFeatCode_elements, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getElements(int addr, int i) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "org.apache.uima.ruta.type.DebugRuleElementMatch");
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
      jcas.throwFeatMissing("elements", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_inlinedConditionBlocks;
  /** @generated */
  final int     casFeatCode_inlinedConditionBlocks;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getInlinedConditionBlocks(int addr) {
        if (featOkTst && casFeat_inlinedConditionBlocks == null)
      jcas.throwFeatMissing("inlinedConditionBlocks", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    return ll_cas.ll_getRefValue(addr, casFeatCode_inlinedConditionBlocks);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setInlinedConditionBlocks(int addr, int v) {
        if (featOkTst && casFeat_inlinedConditionBlocks == null)
      jcas.throwFeatMissing("inlinedConditionBlocks", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    ll_cas.ll_setRefValue(addr, casFeatCode_inlinedConditionBlocks, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getInlinedConditionBlocks(int addr, int i) {
        if (featOkTst && casFeat_inlinedConditionBlocks == null)
      jcas.throwFeatMissing("inlinedConditionBlocks", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_inlinedConditionBlocks), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_inlinedConditionBlocks), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_inlinedConditionBlocks), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setInlinedConditionBlocks(int addr, int i, int v) {
        if (featOkTst && casFeat_inlinedConditionBlocks == null)
      jcas.throwFeatMissing("inlinedConditionBlocks", "org.apache.uima.ruta.type.DebugRuleElementMatch");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_inlinedConditionBlocks), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_inlinedConditionBlocks), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_inlinedConditionBlocks), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DebugRuleElementMatch_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_baseCondition = jcas.getRequiredFeatureDE(casType, "baseCondition", "org.apache.uima.ruta.type.DebugEvaluatedCondition", featOkTst);
    casFeatCode_baseCondition  = (null == casFeat_baseCondition) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_baseCondition).getCode();

 
    casFeat_conditions = jcas.getRequiredFeatureDE(casType, "conditions", "uima.cas.FSArray", featOkTst);
    casFeatCode_conditions  = (null == casFeat_conditions) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_conditions).getCode();

 
    casFeat_elements = jcas.getRequiredFeatureDE(casType, "elements", "uima.cas.FSArray", featOkTst);
    casFeatCode_elements  = (null == casFeat_elements) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_elements).getCode();

 
    casFeat_inlinedConditionBlocks = jcas.getRequiredFeatureDE(casType, "inlinedConditionBlocks", "uima.cas.FSArray", featOkTst);
    casFeatCode_inlinedConditionBlocks  = (null == casFeat_inlinedConditionBlocks) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_inlinedConditionBlocks).getCode();

  }
}



    