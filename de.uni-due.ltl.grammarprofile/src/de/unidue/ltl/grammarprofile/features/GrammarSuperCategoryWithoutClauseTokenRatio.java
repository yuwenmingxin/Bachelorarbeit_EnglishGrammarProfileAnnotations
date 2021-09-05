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
 * Ratio of a particular SuperCategory to total number of SuperCategories
 * Currently implemented: Noun - ReportedSpeech Ratio
 */

@TypeCapability(inputs = { "de.unidue.ltl.escrito.core.types.GrammarProfile" })
public class GrammarSuperCategoryWithoutClauseTokenRatio
extends FeatureExtractorResource_ImplBase
implements FeatureExtractor
{
	public static final String FN_SuperCategoryNounRatio = "SuperCategoryNounRatio";
	public static final String FN_SuperCategoryPronounRatio = "SuperCategoryPronounRatio";
	public static final String FN_SuperCategoryAdjectiveRatio = "SuperCategoryAdjectiveRatio";
	public static final String FN_SuperCategoryAdverbRatio = "SuperCategoryAdverbRatio";
	public static final String FN_SuperCategoryDeterminerRatio = "SuperCategoryDeterminerRatio";
		
	public static final String FN_SuperCategoryPrepositionRatio = "SuperCategoryPrepositionRatio";
	public static final String FN_SuperCategoryConjunctionRatio = "SuperCategoryConjunctionRatio";
	public static final String FN_SuperCategoryDiscourseMarkerRatio = "SuperCategoryDiscourseMarkerRatio";
	public static final String FN_SuperCategoryFocusRatio = "SuperCategoryFocusRatio";
	public static final String FN_SuperCategoryNegationRatio = "SuperCategoryNegationRatio";
	public static final String FN_SuperCategoryQuestionRatio = "SuperCategoryQuestionRatio";
	
	public static final String FN_SuperCategoryVerbRatio = "SuperCategoryVerbRatio";
	public static final String FN_SuperCategoryModalityRatio = "SuperCategoryModalityRatio";
	public static final String FN_SuperCategoryPresentRatio = "SuperCategoryPresentRatio";
	public static final String FN_SuperCategoryPastRatio = "SuperCategoryPastRatio";
	public static final String FN_SuperCategoryFutureRatio = "SuperCategoryFutureRatio";
	public static final String FN_SuperCategoryPassiveRatio = "SuperCategoryPassiveRatio";
	public static final String FN_SuperCategoryReportedSpeechRatio = "SuperCategoryReportedSpeechRatio";
	
	@Override
	public Set<Feature> extract(JCas jcas, TextClassificationTarget aTarget)
			throws TextClassificationException
	{
		
		//int numberOfTokens = JCasUtil.select(jcas, GrammarProfile.class).size();
		
		//Nouns, Verbs
		int numberOfSuperCategoryNounRatio = 0;
		int numberOfSuperCategoryPronounRatio = 0;
		int numberOfSuperCategoryAdjectiveRatio = 0;
		int numberOfSuperCategoryAdverbRatio = 0;
		int numberOfSuperCategoryDeterminerRatio = 0;
				
		int numberOfSuperCategoryPrepositionRatio = 0;
		int numberOfSuperCategoryConjunctionRatio = 0;
		int numberOfSuperCategoryDiscourseMarkerRatio = 0;
		int numberOfSuperCategoryFocusRatio = 0;
		int numberOfSuperCategoryNegationRatio = 0;
		int numberOfSuperCategoryQuestionRatio = 0;
		
		int numberOfSuperCategoryVerbRatio = 0;
		int numberOfSuperCategoryModalityRatio = 0;
		int numberOfSuperCategoryPresentRatio = 0;
		int numberOfSuperCategoryPastRatio = 0;
		int numberOfSuperCategoryFutureRatio = 0;
		int numberOfSuperCategoryPassiveRatio = 0;
		int numberOfSuperCategoryReportedSpeechRatio = 0;
		
		int numberOfSuperCategories = 0;
		
		Collection<GrammarProfile> gps = JCasUtil.select(jcas, GrammarProfile.class);
		for (GrammarProfile gp : gps){
			System.out.println("Found: " + gp.getCoveredText() + " - " +gp.getSuperCategory() + " - " +gp.getName() + " ("+gp.getLevel()+")");
	
			if (gp.getSuperCategory().equals("Noun")){
				numberOfSuperCategoryNounRatio++;
				numberOfSuperCategories++;
			}
			
			if (gp.getSuperCategory().equals("Pronoun")){
				numberOfSuperCategoryPronounRatio++;
				numberOfSuperCategories++;
			}
			
			if (gp.getSuperCategory().equals("Adjective")){
				numberOfSuperCategoryAdjectiveRatio++;
				numberOfSuperCategories++;
			}
			
			if (gp.getSuperCategory().equals("Adverb")){
				numberOfSuperCategoryAdverbRatio++;
				numberOfSuperCategories++;
			}
			
			if (gp.getSuperCategory().equals("Determiner")){
				numberOfSuperCategoryDeterminerRatio++;
				numberOfSuperCategories++;
			}


			
			
			if (gp.getSuperCategory().equals("Preposition")){
				numberOfSuperCategoryPrepositionRatio++;
				numberOfSuperCategories++;
			}
			
			if (gp.getSuperCategory().equals("Conjunction")){
				numberOfSuperCategoryConjunctionRatio++;
				numberOfSuperCategories++;
			}
			
			if (gp.getSuperCategory().equals("DiscourseMarker")){
				numberOfSuperCategoryDiscourseMarkerRatio++;
				numberOfSuperCategories++;
			}
			
			if (gp.getSuperCategory().equals("Focus")){
				numberOfSuperCategoryFocusRatio++;
				numberOfSuperCategories++;
			}
			
			if (gp.getSuperCategory().equals("Negation")){
				numberOfSuperCategoryNegationRatio++;
				numberOfSuperCategories++;
			}
			
			if (gp.getSuperCategory().equals("Question")){
				numberOfSuperCategoryQuestionRatio++;
				numberOfSuperCategories++;
			}
			
			if (gp.getSuperCategory().equals("Pronoun")){
				numberOfSuperCategoryPronounRatio++;
				numberOfSuperCategories++;
			}
			
	
	
			
			if (gp.getSuperCategory().equals("Verb")){
				numberOfSuperCategoryVerbRatio++;
				numberOfSuperCategories++;
			}
			
			if (gp.getSuperCategory().equals("Modality")){
				numberOfSuperCategoryModalityRatio++;
				numberOfSuperCategories++;
			}
			
			if (gp.getSuperCategory().equals("Present")){
				numberOfSuperCategoryPresentRatio++;
				numberOfSuperCategories++;
			}
			
			if (gp.getSuperCategory().equals("Past")){
				numberOfSuperCategoryPastRatio++;
				numberOfSuperCategories++;
			}
			
			if (gp.getSuperCategory().equals("Future")){
				numberOfSuperCategoryFutureRatio++;
				numberOfSuperCategories++;
			}
			
			if (gp.getSuperCategory().equals("Passive")){
				numberOfSuperCategoryPassiveRatio++;
				numberOfSuperCategories++;
			}
			
			if (gp.getSuperCategory().equals("ReportedSpeech")){
				numberOfSuperCategoryReportedSpeechRatio++;
				numberOfSuperCategories++;
			}
						
		}
		
		
		
		double nounr = (1.0*numberOfSuperCategoryNounRatio)/numberOfSuperCategories;
		double pronounr = (1.0*numberOfSuperCategoryPronounRatio)/numberOfSuperCategories;
		double adjectiver = (1.0*numberOfSuperCategoryAdjectiveRatio)/numberOfSuperCategories;
		double adverbr = (1.0*numberOfSuperCategoryAdverbRatio)/numberOfSuperCategories;
		double determinerr = (1.0*numberOfSuperCategoryDeterminerRatio)/numberOfSuperCategories;

		
		double prepositionr = (1.0*numberOfSuperCategoryPrepositionRatio)/numberOfSuperCategories;
		double conjunctionr = (1.0*numberOfSuperCategoryConjunctionRatio)/numberOfSuperCategories;
		double discoursemarkerr = (1.0*numberOfSuperCategoryDiscourseMarkerRatio)/numberOfSuperCategories;
		double focusr = (1.0*numberOfSuperCategoryFocusRatio)/numberOfSuperCategories;
		double negationr = (1.0*numberOfSuperCategoryNegationRatio)/numberOfSuperCategories;
		double questionr = (1.0*numberOfSuperCategoryQuestionRatio)/numberOfSuperCategories;
		
		double verbr = (1.0*numberOfSuperCategoryVerbRatio)/numberOfSuperCategories;
		double modalityr = (1.0*numberOfSuperCategoryModalityRatio)/numberOfSuperCategories;
		double presentr = (1.0*numberOfSuperCategoryPresentRatio)/numberOfSuperCategories;
		double pastr = (1.0*numberOfSuperCategoryPastRatio)/numberOfSuperCategories;
		double futurer = (1.0*numberOfSuperCategoryFutureRatio)/numberOfSuperCategories;
		double passiver = (1.0*numberOfSuperCategoryPassiveRatio)/numberOfSuperCategories;
		double reportedspeechr = (1.0*numberOfSuperCategoryReportedSpeechRatio)/numberOfSuperCategories;
		
		
		Set<Feature> features = new HashSet<Feature>();
		features.add(new Feature(FN_SuperCategoryNounRatio, nounr, FeatureType.NUMERIC));
		features.add(new Feature(FN_SuperCategoryPronounRatio, pronounr, FeatureType.NUMERIC));
		features.add(new Feature(FN_SuperCategoryAdjectiveRatio, adjectiver, FeatureType.NUMERIC));
		features.add(new Feature(FN_SuperCategoryAdverbRatio, adverbr, FeatureType.NUMERIC));
		features.add(new Feature(FN_SuperCategoryDeterminerRatio, determinerr, FeatureType.NUMERIC));
		
		features.add(new Feature(FN_SuperCategoryPrepositionRatio, prepositionr, FeatureType.NUMERIC));
		features.add(new Feature(FN_SuperCategoryConjunctionRatio, conjunctionr, FeatureType.NUMERIC));
		features.add(new Feature(FN_SuperCategoryDiscourseMarkerRatio, discoursemarkerr, FeatureType.NUMERIC));
		features.add(new Feature(FN_SuperCategoryFocusRatio, focusr, FeatureType.NUMERIC));
		features.add(new Feature(FN_SuperCategoryNegationRatio, negationr, FeatureType.NUMERIC));
		features.add(new Feature(FN_SuperCategoryQuestionRatio, questionr, FeatureType.NUMERIC));
		
		features.add(new Feature(FN_SuperCategoryVerbRatio, verbr, FeatureType.NUMERIC));
		features.add(new Feature(FN_SuperCategoryModalityRatio, modalityr, FeatureType.NUMERIC));
		features.add(new Feature(FN_SuperCategoryPresentRatio, presentr, FeatureType.NUMERIC));
		features.add(new Feature(FN_SuperCategoryPastRatio, pastr, FeatureType.NUMERIC));
		features.add(new Feature(FN_SuperCategoryFutureRatio, futurer, FeatureType.NUMERIC));
		features.add(new Feature(FN_SuperCategoryPassiveRatio, passiver, FeatureType.NUMERIC));
		features.add(new Feature(FN_SuperCategoryReportedSpeechRatio, reportedspeechr, FeatureType.NUMERIC));
		
		return features;
	}

}

