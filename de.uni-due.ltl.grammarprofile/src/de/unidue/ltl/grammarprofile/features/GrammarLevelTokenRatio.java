package de.unidue.ltl.grammarprofile.features;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.uima.fit.descriptor.TypeCapability;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;
import org.dkpro.tc.api.exception.TextClassificationException;
import org.dkpro.tc.api.features.Feature;
import org.dkpro.tc.api.features.FeatureExtractor;
import org.dkpro.tc.api.features.FeatureExtractorResource_ImplBase;
import org.dkpro.tc.api.features.FeatureType;
import org.dkpro.tc.api.type.TextClassificationTarget;

import de.unidue.ltl.escrito.core.types.GrammarProfile;
/*
 * Ratio of a particular Level to total number of levels
 * Currently implemented: A1 - C1 Ratio
 */

@TypeCapability(inputs = { "de.unidue.ltl.escrito.core.types.GrammarProfile" })
public class GrammarLevelTokenRatio
extends FeatureExtractorResource_ImplBase
implements FeatureExtractor
{
	public static final String FN_LevelA1Ratio = "LevelA1Ratio";
	public static final String FN_LevelA2Ratio = "LevelA2Ratio";
	public static final String FN_LevelB1Ratio = "LevelB1Ratio";
	public static final String FN_LevelB2Ratio = "LevelB2Ratio";
	public static final String FN_LevelC1Ratio = "LevelC1Ratio";
	public static final String FN_LevelC2Ratio = "LevelC2Ratio";
	

	@Override
	public Set<Feature> extract(JCas jcas, TextClassificationTarget aTarget)
			throws TextClassificationException
	{
		
		//int numberOfTokens = JCasUtil.select(jcas, GrammarProfile.class).size();
		
		//Nouns, Verbs
		int numberOfLevelA1 = 0;
		int numberOfLevelA2 = 0;
		int numberOfLevelB1 = 0;
		int numberOfLevelB2 = 0;
		int numberOfLevelC1 = 0;
		int numberOfLevelC2 = 0;
		int numberOflevels = 0;
		
		Collection<GrammarProfile> gps = JCasUtil.select(jcas, GrammarProfile.class);
		for (GrammarProfile gp : gps){
			System.out.println("Found: " + gp.getCoveredText() + " - " +gp.getSubCategory()+ " - " +gp.getSuperCategory() + " - " +gp.getName() + " ("+gp.getLevel()+")");
	
			if (gp.getLevel().equals("A1")){
				numberOfLevelA1++;
				numberOflevels++;
			}
			
			if (gp.getLevel().equals("A2")){
				numberOfLevelA2++;
				numberOflevels++;
			}
			
			if (gp.getLevel().equals("B1")){
				numberOfLevelB1++;
				numberOflevels++;
			}
			
			if (gp.getLevel().equals("B2")){
				numberOfLevelB2++;
				numberOflevels++;
			}
			
			if (gp.getLevel().equals("C1")){
				numberOfLevelC1++;
				numberOflevels++;
			}
			
			if (gp.getLevel().equals("C2")){
				numberOfLevelC2++;
				numberOflevels++;
			}	
		}
		
		double a1r = (1.0*numberOfLevelA1)/numberOflevels;
		double a2r = (1.0*numberOfLevelA2)/numberOflevels;
		double b1r = (1.0*numberOfLevelB1)/numberOflevels;
		double b2r = (1.0*numberOfLevelB2)/numberOflevels;
		double c1r = (1.0*numberOfLevelC1)/numberOflevels;
		double c2r = (1.0*numberOfLevelC2)/numberOflevels;
		
		Set<Feature> features = new HashSet<Feature>();
		features.add(new Feature(FN_LevelA1Ratio, a1r, FeatureType.NUMERIC));
		features.add(new Feature(FN_LevelA2Ratio, a2r, FeatureType.NUMERIC));
		features.add(new Feature(FN_LevelB1Ratio, b1r, FeatureType.NUMERIC));
		features.add(new Feature(FN_LevelB2Ratio, b2r, FeatureType.NUMERIC));
		features.add(new Feature(FN_LevelC1Ratio, c1r, FeatureType.NUMERIC));
		features.add(new Feature(FN_LevelC2Ratio, c2r, FeatureType.NUMERIC));
		return features;
	}

}

