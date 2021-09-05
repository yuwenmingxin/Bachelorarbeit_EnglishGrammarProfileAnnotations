package de.unidue.ltl.grammarprofile.scoring;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngineDescription;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.collection.CollectionReaderDescription;
import org.apache.uima.fit.component.NoOpAnnotator;
import org.apache.uima.fit.factory.CollectionReaderFactory;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.InvalidXMLException;
import org.dkpro.lab.task.Dimension;
import org.dkpro.lab.task.ParameterSpace;

import de.tudarmstadt.ukp.dkpro.core.corenlp.CoreNlpDependencyParser;
import de.tudarmstadt.ukp.dkpro.core.corenlp.CoreNlpLemmatizer;
import de.tudarmstadt.ukp.dkpro.core.corenlp.CoreNlpParser;
import de.tudarmstadt.ukp.dkpro.core.corenlp.CoreNlpPosTagger;
import de.tudarmstadt.ukp.dkpro.core.corenlp.CoreNlpSegmenter;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpChunker;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpSegmenter;
import de.unidue.ltl.escrito.examples.basics.Experiments_ImplBase;
import de.unidue.ltl.escrito.io.essay.AsapEssayReader;
import de.unidue.ltl.escrito.io.essay.AsapEssayReader.RatingBias;
import de.unidue.ltl.grammarprofile.Analyzer;
import de.unidue.ltl.grammarprofile.io.MewsReader;

public class BaselineExperiments extends Experiments_ImplBase{

	public static void main(String[] args) throws Exception {

		System.setProperty("DKPRO_HOME", "E:/2.IT/Tools/Java/Eclipse/eclipse-workspace/DKPRO_HOME");
		String[] dataFolders = { 
				//"Prompts/AD", 
				//"Prompts/CH", 
				//"Prompts/TE", 
				//"Prompts/VO",
								 "Deutschland/T1/AD", 
								 "Deutschland/T1/CH",
								 "Deutschland/T1/TE",
								 "Deutschland/T1/VO",
								 "Deutschland/T2/AD",
								 "Deutschland/T2/CH",
								 "Deutschland/T2/TE",
								 "Deutschland/T2/VO",
								 //"Deutschland/T1T2/AD",
								 //"Deutschland/T1T2/CH",
								 //"Deutschland/T1T2/TE",
								 //"Deutschland/T1T2/VO",
								 //"Schweiz/T1T2/AD",
								 //"Schweiz/T1T2/CH",
								 //"Schweiz/T1T2/TE",
								 //"Schweiz/T1T2/VO",
								 "Schweiz/T1/AD", 
								 "Schweiz/T1/CH",
								 "Schweiz/T1/TE",
								 "Schweiz/T1/VO", 
								 "Schweiz/T2/AD",
								 "Schweiz/T2/CH",
								 "Schweiz/T2/TE",
								 "Schweiz/T2/VO",
		};


		// TODO: Pfad anpassen
		String essayPathASAPTrain = "E:/2.IT/Tools/Java/Eclipse/eclipse-workspace/asap_essays Kopie/training_set_rel3.tsv";
		String essayPathASAPTest = "E:/2.IT/Tools/Java/Eclipse/eclipse-workspace/asap_essays Kopie/test_set_rel3.tsv";

		runBasicAsapExperiment(essayPathASAPTrain, essayPathASAPTest);

//		for (String folder : dataFolders){
			// TODO: Pfad anpassen
//			String essayPath = "E:/2.IT/Tools/Java/Eclipse/eclipse-workspace/MEWS_Essays/Essays_all/";
//			String scoreFile = "E:/2.IT/Tools/Java/Eclipse/eclipse-workspace/MEWS_Essays/MEWSdocs/MEWS_FINAL_Deliverable_ScoreFile_120817.tsv";
//			runBasicMewsExperiment(essayPath+folder, scoreFile, "MEWS_"+folder.replace("/", "_"));
//		}
	}

	private static void runBasicAsapExperiment(String trainData, String testData) throws Exception {
		CollectionReaderDescription trainReader = CollectionReaderFactory.createReaderDescription(AsapEssayReader.class,
				AsapEssayReader.PARAM_QUESTION_ID, 1, AsapEssayReader.PARAM_TARGET_LABEL, "score",
				AsapEssayReader.PARAM_RATING_BIAS, RatingBias.low, AsapEssayReader.PARAM_DO_SPARSECLASSMERGING, false,
				AsapEssayReader.PARAM_DO_NORMALIZATION, false, AsapEssayReader.PARAM_INPUT_FILE, trainData);
		CollectionReaderDescription testReader = CollectionReaderFactory.createReaderDescription(AsapEssayReader.class,
				AsapEssayReader.PARAM_QUESTION_ID, 1, AsapEssayReader.PARAM_TARGET_LABEL, "score",
				AsapEssayReader.PARAM_RATING_BIAS, RatingBias.low, AsapEssayReader.PARAM_DO_SPARSECLASSMERGING, false,
				AsapEssayReader.PARAM_DO_NORMALIZATION, false, AsapEssayReader.PARAM_INPUT_FILE, testData);
		runBaselineExperiment("ASAP1", trainReader, testReader, "en");
	}


	private static void runBasicMewsExperiment(String trainData, String scoreFile, String experimentName) throws Exception {

		CollectionReaderDescription readerTrain = CollectionReaderFactory.createReaderDescription(
				MewsReader.class,
				MewsReader.PARAM_INPUT_FILE, trainData,
				MewsReader.PARAM_SCORE_FILE, scoreFile);
		//		CollectionReaderDescription reader = CollectionReaderFactory.createReaderDescription(BinaryCasReader.class,
		//				BinaryCasReader.PARAM_SOURCE_LOCATION,
		//				"/Users/jeane/Documents/DkproHome/datasets/MEWS_Essays/bincas/bincas/" + folderName,
		//				BinaryCasReader.PARAM_LANGUAGE, "", BinaryCasReader.PARAM_PATTERNS, "*.bin");
		runBaselineExperiment("MEWS_" + experimentName, readerTrain, readerTrain, "en");
	}


	private static void runBaselineExperiment(String experimentName, CollectionReaderDescription readerTrain,
			CollectionReaderDescription readerTest, String languageCode) throws Exception {
		Map<String, Object> dimReaders = new HashMap<String, Object>();
		dimReaders.put(DIM_READER_TRAIN, readerTrain);
		dimReaders.put(DIM_READER_TEST, readerTest);

		Dimension<String> learningDims = Dimension.create(DIM_LEARNING_MODE, LM_SINGLE_LABEL);
		Dimension<Map<String, Object>> learningsArgsDims = getStandardWekaClassificationArgsDim();

		ParameterSpace pSpace = null;
		pSpace = new ParameterSpace(Dimension.createBundle("readers", dimReaders), learningDims,
				Dimension.create(DIM_FEATURE_MODE, FM_UNIT), 
				FeatureSettings.getFeatureSetNGrams(),
				FeatureSettings.getFeatureSetLevelTokenRatio(),
				FeatureSettings.getFeatureSetSuperCategoryTokenRatio(),
				FeatureSettings.getFeatureSetSubCategoryTokenOccurrence(),
				FeatureSettings.getFeatureSetNameTokenOccurrence(),
				FeatureSettings.getFeatureSetFullEnglishGrammarProfile(),

				learningsArgsDims);

		runCrossValidation(pSpace, experimentName, getPreprocessing("en"), 10);
	}

	/*
	 * private static AnalysisEngineDescription getPreprocessing() throws
	 * ResourceInitializationException { AnalysisEngineDescription seg =
	 * createEngineDescription(CoreNlpSegmenter.class,
	 * CoreNlpSegmenter.PARAM_LANGUAGE, "en"); return seg;
	 * 
	 * }
	 */
	
	public static AnalysisEngineDescription getPreprocessing(String languageCode) throws ResourceInitializationException {
	 	
		AnalysisEngineDescription seg = createEngineDescription(CoreNlpSegmenter.class,
				CoreNlpSegmenter.PARAM_LANGUAGE, "en");
		AnalysisEngineDescription posTagger = createEngineDescription(CoreNlpPosTagger.class,
				CoreNlpPosTagger.PARAM_LANGUAGE, "en");
		AnalysisEngineDescription lemmatizer = createEngineDescription(CoreNlpLemmatizer.class);
		AnalysisEngineDescription chunker = createEngineDescription(OpenNlpChunker.class,
				OpenNlpChunker.PARAM_LANGUAGE, "en");
		AnalysisEngineDescription englishGrammarProfileAnnotations = null;
		try {
			englishGrammarProfileAnnotations = createEngineDescription("MainEngine");
		} catch (InvalidXMLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		AnalysisEngineDescription analyzer = createEngineDescription(Analyzer.class);

        if (languageCode.equals("en")){

            return createEngineDescription(

            		seg, 
    				posTagger, 
    				lemmatizer,
    				chunker,
    				englishGrammarProfileAnnotations,
    				analyzer

                    );

        } else if (languageCode.equals("de")){

            return createEngineDescription(

                    createEngineDescription(

                            OpenNlpSegmenter.class

                            ),

                    posTagger,

                    lemmatizer,

                    createEngineDescription(NoOpAnnotator.class)

                    );

        } else {

            System.err.println("Unknown language code "+languageCode+". We currently support: en, de");

            System.exit(-1);

        }

        return null;

    }
	
/*	 public static AnalysisEngineDescription getPreprocessing(String languageCode) throws ResourceInitializationException {
		 	
		 	AnalysisEngineDescription seg = createEngineDescription(CoreNlpSegmenter.class,CoreNlpSegmenter.PARAM_LANGUAGE, "en");
	        AnalysisEngineDescription tagger       = createEngineDescription(CoreNlpPosTagger.class,CoreNlpPosTagger.PARAM_LANGUAGE, "en");

	        AnalysisEngineDescription lemmatizer   = createEngineDescription(CoreNlpLemmatizer.class);


	        if (languageCode.equals("en")){

	            return createEngineDescription(

	                    seg,

	                    tagger,

	                    lemmatizer//,

	                    );

	        } else if (languageCode.equals("de")){

	            return createEngineDescription(

	                    createEngineDescription(

	                            OpenNlpSegmenter.class

	                            ),

	                    tagger,

	                    lemmatizer,

	                    createEngineDescription(NoOpAnnotator.class)

	                    );

	        } else {

	            System.err.println("Unknown language code "+languageCode+". We currently support: en, de");

	            System.exit(-1);

	        }

	        return null;

	    }
*/





}
