
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
public class DebugBlockApply_Type extends DebugRuleApply_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DebugBlockApply.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.ruta.type.DebugBlockApply");
 
  /** @generated */
  final Feature casFeat_innerApply;
  /** @generated */
  final int     casFeatCode_innerApply;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getInnerApply(int addr) {
        if (featOkTst && casFeat_innerApply == null)
      jcas.throwFeatMissing("innerApply", "org.apache.uima.ruta.type.DebugBlockApply");
    return ll_cas.ll_getRefValue(addr, casFeatCode_innerApply);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setInnerApply(int addr, int v) {
        if (featOkTst && casFeat_innerApply == null)
      jcas.throwFeatMissing("innerApply", "org.apache.uima.ruta.type.DebugBlockApply");
    ll_cas.ll_setRefValue(addr, casFeatCode_innerApply, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getInnerApply(int addr, int i) {
        if (featOkTst && casFeat_innerApply == null)
      jcas.throwFeatMissing("innerApply", "org.apache.uima.ruta.type.DebugBlockApply");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_innerApply), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_innerApply), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_innerApply), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setInnerApply(int addr, int i, int v) {
        if (featOkTst && casFeat_innerApply == null)
      jcas.throwFeatMissing("innerApply", "org.apache.uima.ruta.type.DebugBlockApply");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_innerApply), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_innerApply), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_innerApply), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DebugBlockApply_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_innerApply = jcas.getRequiredFeatureDE(casType, "innerApply", "uima.cas.FSArray", featOkTst);
    casFeatCode_innerApply  = (null == casFeat_innerApply) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_innerApply).getCode();

  }
}



    