
/* First created by JCasGen Tue May 18 16:55:04 CEST 2021 */
package de.unidue.ltl.escrito.core.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue May 18 17:56:59 CEST 2021
 * @generated */
public class LearnerAnswerWithReferenceAnswer_Type extends LearnerAnswer_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = LearnerAnswerWithReferenceAnswer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.unidue.ltl.escrito.core.types.LearnerAnswerWithReferenceAnswer");
 
  /** @generated */
  final Feature casFeat_referenceAnswers;
  /** @generated */
  final int     casFeatCode_referenceAnswers;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getReferenceAnswers(int addr) {
        if (featOkTst && casFeat_referenceAnswers == null)
      jcas.throwFeatMissing("referenceAnswers", "de.unidue.ltl.escrito.core.types.LearnerAnswerWithReferenceAnswer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_referenceAnswers);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReferenceAnswers(int addr, int v) {
        if (featOkTst && casFeat_referenceAnswers == null)
      jcas.throwFeatMissing("referenceAnswers", "de.unidue.ltl.escrito.core.types.LearnerAnswerWithReferenceAnswer");
    ll_cas.ll_setRefValue(addr, casFeatCode_referenceAnswers, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getReferenceAnswers(int addr, int i) {
        if (featOkTst && casFeat_referenceAnswers == null)
      jcas.throwFeatMissing("referenceAnswers", "de.unidue.ltl.escrito.core.types.LearnerAnswerWithReferenceAnswer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_referenceAnswers), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_referenceAnswers), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_referenceAnswers), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setReferenceAnswers(int addr, int i, String v) {
        if (featOkTst && casFeat_referenceAnswers == null)
      jcas.throwFeatMissing("referenceAnswers", "de.unidue.ltl.escrito.core.types.LearnerAnswerWithReferenceAnswer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_referenceAnswers), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_referenceAnswers), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_referenceAnswers), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_referenceAnswerIds;
  /** @generated */
  final int     casFeatCode_referenceAnswerIds;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getReferenceAnswerIds(int addr) {
        if (featOkTst && casFeat_referenceAnswerIds == null)
      jcas.throwFeatMissing("referenceAnswerIds", "de.unidue.ltl.escrito.core.types.LearnerAnswerWithReferenceAnswer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_referenceAnswerIds);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReferenceAnswerIds(int addr, int v) {
        if (featOkTst && casFeat_referenceAnswerIds == null)
      jcas.throwFeatMissing("referenceAnswerIds", "de.unidue.ltl.escrito.core.types.LearnerAnswerWithReferenceAnswer");
    ll_cas.ll_setRefValue(addr, casFeatCode_referenceAnswerIds, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getReferenceAnswerIds(int addr, int i) {
        if (featOkTst && casFeat_referenceAnswerIds == null)
      jcas.throwFeatMissing("referenceAnswerIds", "de.unidue.ltl.escrito.core.types.LearnerAnswerWithReferenceAnswer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_referenceAnswerIds), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_referenceAnswerIds), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_referenceAnswerIds), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setReferenceAnswerIds(int addr, int i, String v) {
        if (featOkTst && casFeat_referenceAnswerIds == null)
      jcas.throwFeatMissing("referenceAnswerIds", "de.unidue.ltl.escrito.core.types.LearnerAnswerWithReferenceAnswer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_referenceAnswerIds), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_referenceAnswerIds), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_referenceAnswerIds), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public LearnerAnswerWithReferenceAnswer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_referenceAnswers = jcas.getRequiredFeatureDE(casType, "referenceAnswers", "uima.cas.StringArray", featOkTst);
    casFeatCode_referenceAnswers  = (null == casFeat_referenceAnswers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_referenceAnswers).getCode();

 
    casFeat_referenceAnswerIds = jcas.getRequiredFeatureDE(casType, "referenceAnswerIds", "uima.cas.StringArray", featOkTst);
    casFeatCode_referenceAnswerIds  = (null == casFeat_referenceAnswerIds) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_referenceAnswerIds).getCode();

  }
}



    