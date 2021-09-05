package de.unidue.ltl.grammarprofile.scoring;

import org.dkpro.lab.task.Dimension;
import org.dkpro.tc.api.features.TcFeatureFactory;
import org.dkpro.tc.api.features.TcFeatureSet;
import org.dkpro.tc.core.Constants;
import org.dkpro.tc.features.ngram.WordNGram;
import de.unidue.ltl.grammarprofile.features.GrammarLevelTokenRatio;
import de.unidue.ltl.grammarprofile.features.GrammarSuperCategoryTokenRatio;
import de.unidue.ltl.grammarprofile.features.GrammarSubCategoryTokenOccurrence;
import de.unidue.ltl.grammarprofile.features.GrammarNameTokenOccurrence;

public class FeatureSettings implements Constants {

//1.Ngram feature	
	
	public static Dimension<TcFeatureSet> getFeatureSetNGrams()
	{	
		Dimension<TcFeatureSet> dimFeatureSets = Dimension.create(
				DIM_FEATURE_SET,
				new TcFeatureSet(
						TcFeatureFactory.create(
								WordNGram.class,
								WordNGram.PARAM_NGRAM_MIN_N, 1,
								WordNGram.PARAM_NGRAM_MAX_N, 3,
								WordNGram.PARAM_NGRAM_USE_TOP_K, 10000
								)
						)
				);
		return dimFeatureSets;
	}	

	
//2.LevelTokenRatio feature	
	public static Dimension<TcFeatureSet> getFeatureSetLevelTokenRatio()
	{
		Dimension<TcFeatureSet> dimFeatureSets = Dimension.create(
				DIM_FEATURE_SET,
				new TcFeatureSet(
						TcFeatureFactory.create(
								GrammarLevelTokenRatio.class					
								)
						)
				);
		return dimFeatureSets;
	}
	
	
	
//3.SuperCategoryTokenRatio feature	
	public static Dimension<TcFeatureSet> getFeatureSetSuperCategoryTokenRatio()
		{
			Dimension<TcFeatureSet> dimFeatureSets = Dimension.create(
					DIM_FEATURE_SET,
					new TcFeatureSet(
							TcFeatureFactory.create(
									GrammarSuperCategoryTokenRatio.class					
									)
							)
					);
			return dimFeatureSets;
		}	

	
	
	
//4.SubCategoryTokenOccurrence feature	
     public static Dimension<TcFeatureSet> getFeatureSetSubCategoryTokenOccurrence()
				{
					Dimension<TcFeatureSet> dimFeatureSets = Dimension.create(
							DIM_FEATURE_SET,
							new TcFeatureSet(
									TcFeatureFactory.create(
											GrammarSubCategoryTokenOccurrence.class					
											)
									)
							);
					return dimFeatureSets;
				}	
     
     
     
//5.NameTokenOccurrence feature	
    public static Dimension<TcFeatureSet> getFeatureSetNameTokenOccurrence()
				{
					Dimension<TcFeatureSet> dimFeatureSets = Dimension.create(
							DIM_FEATURE_SET,
							new TcFeatureSet(
									TcFeatureFactory.create(
											GrammarNameTokenOccurrence.class					
											)
									)
							);
					return dimFeatureSets;
				}	
    

    
//6.FullEnglishGrammarProfile feature
     public static Dimension<TcFeatureSet> getFeatureSetFullEnglishGrammarProfile()
	{
		Dimension<TcFeatureSet> dimFeatureSets = Dimension.create(
				DIM_FEATURE_SET,
				new TcFeatureSet(
						TcFeatureFactory.create(GrammarLevelTokenRatio.class),
						TcFeatureFactory.create(GrammarSuperCategoryTokenRatio.class),
						TcFeatureFactory.create(GrammarSubCategoryTokenOccurrence.class),					
						TcFeatureFactory.create(GrammarNameTokenOccurrence.class)
						)
				);
		return dimFeatureSets;
	 }
	
}
