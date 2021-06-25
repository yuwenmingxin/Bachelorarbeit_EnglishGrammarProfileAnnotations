
/* First created by JCasGen Wed May 26 11:49:05 CEST 2021 */
package org.apache.uima.ruta.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed May 26 14:25:19 CEST 2021
 * @generated */
public class EvalAnnotation_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EvalAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.ruta.type.EvalAnnotation");
 
  /** @generated */
  final Feature casFeat_original;
  /** @generated */
  final int     casFeatCode_original;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getOriginal(int addr) {
        if (featOkTst && casFeat_original == null)
      jcas.throwFeatMissing("original", "org.apache.uima.ruta.type.EvalAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_original);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOriginal(int addr, int v) {
        if (featOkTst && casFeat_original == null)
      jcas.throwFeatMissing("original", "org.apache.uima.ruta.type.EvalAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_original, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public EvalAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_original = jcas.getRequiredFeatureDE(casType, "original", "uima.tcas.Annotation", featOkTst);
    casFeatCode_original  = (null == casFeat_original) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_original).getCode();

  }
}



    