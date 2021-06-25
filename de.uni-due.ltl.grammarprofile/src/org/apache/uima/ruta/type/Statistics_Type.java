
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
public class Statistics_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Statistics.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.ruta.type.Statistics");
 
  /** @generated */
  final Feature casFeat_name;
  /** @generated */
  final int     casFeatCode_name;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getName(int addr) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "org.apache.uima.ruta.type.Statistics");
    return ll_cas.ll_getRefValue(addr, casFeatCode_name);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setName(int addr, int v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "org.apache.uima.ruta.type.Statistics");
    ll_cas.ll_setRefValue(addr, casFeatCode_name, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getName(int addr, int i) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "org.apache.uima.ruta.type.Statistics");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_name), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_name), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_name), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setName(int addr, int i, String v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "org.apache.uima.ruta.type.Statistics");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_name), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_name), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_name), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_total;
  /** @generated */
  final int     casFeatCode_total;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTotal(int addr) {
        if (featOkTst && casFeat_total == null)
      jcas.throwFeatMissing("total", "org.apache.uima.ruta.type.Statistics");
    return ll_cas.ll_getRefValue(addr, casFeatCode_total);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTotal(int addr, int v) {
        if (featOkTst && casFeat_total == null)
      jcas.throwFeatMissing("total", "org.apache.uima.ruta.type.Statistics");
    ll_cas.ll_setRefValue(addr, casFeatCode_total, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public double getTotal(int addr, int i) {
        if (featOkTst && casFeat_total == null)
      jcas.throwFeatMissing("total", "org.apache.uima.ruta.type.Statistics");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_total), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_total), i);
  return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_total), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setTotal(int addr, int i, double v) {
        if (featOkTst && casFeat_total == null)
      jcas.throwFeatMissing("total", "org.apache.uima.ruta.type.Statistics");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_total), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_total), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_total), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_amount;
  /** @generated */
  final int     casFeatCode_amount;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAmount(int addr) {
        if (featOkTst && casFeat_amount == null)
      jcas.throwFeatMissing("amount", "org.apache.uima.ruta.type.Statistics");
    return ll_cas.ll_getRefValue(addr, casFeatCode_amount);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAmount(int addr, int v) {
        if (featOkTst && casFeat_amount == null)
      jcas.throwFeatMissing("amount", "org.apache.uima.ruta.type.Statistics");
    ll_cas.ll_setRefValue(addr, casFeatCode_amount, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getAmount(int addr, int i) {
        if (featOkTst && casFeat_amount == null)
      jcas.throwFeatMissing("amount", "org.apache.uima.ruta.type.Statistics");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_amount), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_amount), i);
  return ll_cas.ll_getIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_amount), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setAmount(int addr, int i, int v) {
        if (featOkTst && casFeat_amount == null)
      jcas.throwFeatMissing("amount", "org.apache.uima.ruta.type.Statistics");
    if (lowLevelTypeChecks)
      ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_amount), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_amount), i);
    ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_amount), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_part;
  /** @generated */
  final int     casFeatCode_part;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPart(int addr) {
        if (featOkTst && casFeat_part == null)
      jcas.throwFeatMissing("part", "org.apache.uima.ruta.type.Statistics");
    return ll_cas.ll_getRefValue(addr, casFeatCode_part);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPart(int addr, int v) {
        if (featOkTst && casFeat_part == null)
      jcas.throwFeatMissing("part", "org.apache.uima.ruta.type.Statistics");
    ll_cas.ll_setRefValue(addr, casFeatCode_part, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public double getPart(int addr, int i) {
        if (featOkTst && casFeat_part == null)
      jcas.throwFeatMissing("part", "org.apache.uima.ruta.type.Statistics");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_part), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_part), i);
  return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_part), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setPart(int addr, int i, double v) {
        if (featOkTst && casFeat_part == null)
      jcas.throwFeatMissing("part", "org.apache.uima.ruta.type.Statistics");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_part), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_part), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_part), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Statistics_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "uima.cas.StringArray", featOkTst);
    casFeatCode_name  = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_name).getCode();

 
    casFeat_total = jcas.getRequiredFeatureDE(casType, "total", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_total  = (null == casFeat_total) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_total).getCode();

 
    casFeat_amount = jcas.getRequiredFeatureDE(casType, "amount", "uima.cas.IntegerArray", featOkTst);
    casFeatCode_amount  = (null == casFeat_amount) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_amount).getCode();

 
    casFeat_part = jcas.getRequiredFeatureDE(casType, "part", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_part  = (null == casFeat_part) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_part).getCode();

  }
}



    