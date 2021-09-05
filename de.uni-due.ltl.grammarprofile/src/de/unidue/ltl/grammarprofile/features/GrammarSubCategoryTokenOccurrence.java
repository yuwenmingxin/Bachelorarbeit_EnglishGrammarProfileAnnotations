package de.unidue.ltl.grammarprofile.features;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;

import org.dkpro.tc.api.exception.TextClassificationException;
import org.dkpro.tc.api.features.FeatureExtractor;
import org.dkpro.tc.api.features.Feature;
import org.dkpro.tc.api.features.FeatureExtractorResource_ImplBase;
import org.dkpro.tc.api.features.FeatureType;
import org.dkpro.tc.api.type.TextClassificationTarget;

import de.unidue.ltl.escrito.core.types.GrammarProfile;
/**
 * Extracts whether the Grammar SubCategory of the classification unit exists or not.
 */

public class GrammarSubCategoryTokenOccurrence  extends FeatureExtractorResource_ImplBase implements FeatureExtractor
{ 
	 /**
     * Public name of the feature "GrammarSubCategory"
     */
    public String FEATURE_NAME = "GrammarSubCategory";

    @Override
    public Set<Feature> extract(JCas jcas, TextClassificationTarget aTarget)
        throws TextClassificationException
    {
    	Set<Feature> features = new HashSet<Feature>();
        Collection<GrammarProfile> gps = JCasUtil.select(jcas, GrammarProfile.class);
		for (GrammarProfile gp : gps){
			System.out.println("Found: " + gp.getCoveredText() + " - " +gp.getSubCategory()+ " - " +gp.getSuperCategory() + " - " +gp.getName() + " ("+gp.getLevel()+")");
	
			FEATURE_NAME = gp.getSubCategory();
			boolean bool = true;
		    features.add(new Feature(FEATURE_NAME, bool ? 1.0 : 0.0, bool == false, FeatureType.BOOLEAN));
		   
			}
		 return features;
    }
}
