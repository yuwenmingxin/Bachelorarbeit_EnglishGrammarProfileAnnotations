
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
public class RutaColoring_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = RutaColoring.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.ruta.type.RutaColoring");
 
  /** @generated */
  final Feature casFeat_bgColor;
  /** @generated */
  final int     casFeatCode_bgColor;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getBgColor(int addr) {
        if (featOkTst && casFeat_bgColor == null)
      jcas.throwFeatMissing("bgColor", "org.apache.uima.ruta.type.RutaColoring");
    return ll_cas.ll_getStringValue(addr, casFeatCode_bgColor);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBgColor(int addr, String v) {
        if (featOkTst && casFeat_bgColor == null)
      jcas.throwFeatMissing("bgColor", "org.apache.uima.ruta.type.RutaColoring");
    ll_cas.ll_setStringValue(addr, casFeatCode_bgColor, v);}
    
  
 
  /** @generated */
  final Feature casFeat_targetType;
  /** @generated */
  final int     casFeatCode_targetType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTargetType(int addr) {
        if (featOkTst && casFeat_targetType == null)
      jcas.throwFeatMissing("targetType", "org.apache.uima.ruta.type.RutaColoring");
    return ll_cas.ll_getStringValue(addr, casFeatCode_targetType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTargetType(int addr, String v) {
        if (featOkTst && casFeat_targetType == null)
      jcas.throwFeatMissing("targetType", "org.apache.uima.ruta.type.RutaColoring");
    ll_cas.ll_setStringValue(addr, casFeatCode_targetType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_fgColor;
  /** @generated */
  final int     casFeatCode_fgColor;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFgColor(int addr) {
        if (featOkTst && casFeat_fgColor == null)
      jcas.throwFeatMissing("fgColor", "org.apache.uima.ruta.type.RutaColoring");
    return ll_cas.ll_getStringValue(addr, casFeatCode_fgColor);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFgColor(int addr, String v) {
        if (featOkTst && casFeat_fgColor == null)
      jcas.throwFeatMissing("fgColor", "org.apache.uima.ruta.type.RutaColoring");
    ll_cas.ll_setStringValue(addr, casFeatCode_fgColor, v);}
    
  
 
  /** @generated */
  final Feature casFeat_selected;
  /** @generated */
  final int     casFeatCode_selected;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getSelected(int addr) {
        if (featOkTst && casFeat_selected == null)
      jcas.throwFeatMissing("selected", "org.apache.uima.ruta.type.RutaColoring");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_selected);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSelected(int addr, boolean v) {
        if (featOkTst && casFeat_selected == null)
      jcas.throwFeatMissing("selected", "org.apache.uima.ruta.type.RutaColoring");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_selected, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public RutaColoring_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_bgColor = jcas.getRequiredFeatureDE(casType, "bgColor", "uima.cas.String", featOkTst);
    casFeatCode_bgColor  = (null == casFeat_bgColor) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_bgColor).getCode();

 
    casFeat_targetType = jcas.getRequiredFeatureDE(casType, "targetType", "uima.cas.String", featOkTst);
    casFeatCode_targetType  = (null == casFeat_targetType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_targetType).getCode();

 
    casFeat_fgColor = jcas.getRequiredFeatureDE(casType, "fgColor", "uima.cas.String", featOkTst);
    casFeatCode_fgColor  = (null == casFeat_fgColor) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fgColor).getCode();

 
    casFeat_selected = jcas.getRequiredFeatureDE(casType, "selected", "uima.cas.Boolean", featOkTst);
    casFeatCode_selected  = (null == casFeat_selected) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_selected).getCode();

  }
}



    