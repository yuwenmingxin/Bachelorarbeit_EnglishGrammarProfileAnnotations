
/* First created by JCasGen Wed May 26 11:49:05 CEST 2021 */
package org.apache.uima.ruta.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** 
 * Updated by JCasGen Wed May 26 14:25:19 CEST 2021
 * @generated */
public class TruePositive_Type extends EvalAnnotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TruePositive.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.ruta.type.TruePositive");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TruePositive_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    