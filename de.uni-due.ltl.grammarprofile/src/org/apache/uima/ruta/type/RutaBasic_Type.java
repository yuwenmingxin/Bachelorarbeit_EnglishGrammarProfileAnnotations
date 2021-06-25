
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
public class RutaBasic_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = RutaBasic.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.ruta.type.RutaBasic");
 
  /** @generated */
  final Feature casFeat_replacement;
  /** @generated */
  final int     casFeatCode_replacement;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getReplacement(int addr) {
        if (featOkTst && casFeat_replacement == null)
      jcas.throwFeatMissing("replacement", "org.apache.uima.ruta.type.RutaBasic");
    return ll_cas.ll_getStringValue(addr, casFeatCode_replacement);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReplacement(int addr, String v) {
        if (featOkTst && casFeat_replacement == null)
      jcas.throwFeatMissing("replacement", "org.apache.uima.ruta.type.RutaBasic");
    ll_cas.ll_setStringValue(addr, casFeatCode_replacement, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public RutaBasic_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_replacement = jcas.getRequiredFeatureDE(casType, "replacement", "uima.cas.String", featOkTst);
    casFeatCode_replacement  = (null == casFeat_replacement) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_replacement).getCode();

  }
}



    