package de.unidue.ltl.grammarprofile;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngineDescription;

import java.io.IOException;

import org.apache.uima.UIMAException;
import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.collection.CollectionReaderDescription;
import org.apache.uima.fit.factory.CollectionReaderFactory;
import org.apache.uima.fit.pipeline.SimplePipeline;
import org.apache.uima.resource.ResourceInitializationException;

import de.tudarmstadt.ukp.dkpro.core.corenlp.CoreNlpDependencyParser;
import de.tudarmstadt.ukp.dkpro.core.corenlp.CoreNlpLemmatizer;
import de.tudarmstadt.ukp.dkpro.core.corenlp.CoreNlpParser;
import de.tudarmstadt.ukp.dkpro.core.corenlp.CoreNlpPosTagger;
import de.tudarmstadt.ukp.dkpro.core.corenlp.CoreNlpSegmenter;
import de.tudarmstadt.ukp.dkpro.core.io.bincas.BinaryCasWriter;
import de.tudarmstadt.ukp.dkpro.core.io.xmi.XmiWriter;
import de.tudarmstadt.ukp.dkpro.core.languagetool.LanguageToolChecker;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpChunker;

public class BaseExperiment {

	public static void main(String[] args) throws ResourceInitializationException, UIMAException, IOException{
		preprocess();
	}
	
	private static void preprocess() throws ResourceInitializationException, UIMAException, IOException {
		String scoreFile= "src/main/resources/data/index_small.csv";
		String essayPath = "src/main/resources/data/";
		CollectionReaderDescription reader = CollectionReaderFactory.createReaderDescription(
				Toefl11Reader.class,
				Toefl11Reader.PARAM_INPUT_PATH, essayPath,
				Toefl11Reader.PARAM_SCORE_FILE, scoreFile);

		AnalysisEngineDescription seg = createEngineDescription(CoreNlpSegmenter.class,
				CoreNlpSegmenter.PARAM_LANGUAGE, "en");
		AnalysisEngineDescription checker = createEngineDescription(LanguageToolChecker.class,
				CoreNlpSegmenter.PARAM_LANGUAGE, "en");
		AnalysisEngineDescription posTagger = createEngineDescription(CoreNlpPosTagger.class,
				CoreNlpPosTagger.PARAM_LANGUAGE, "en");
		AnalysisEngineDescription lemmatizer = createEngineDescription(CoreNlpLemmatizer.class);
		AnalysisEngineDescription chunker = createEngineDescription(OpenNlpChunker.class,
				OpenNlpChunker.PARAM_LANGUAGE, "en");
		AnalysisEngineDescription constituentParser = createEngineDescription(CoreNlpParser.class,
				CoreNlpParser.PARAM_LANGUAGE, "en",
				CoreNlpParser.PARAM_WRITE_PENN_TREE,true,
				CoreNlpParser.PARAM_WRITE_POS,false,
				CoreNlpParser.PARAM_PRINT_TAGSET,false,
				CoreNlpParser.PARAM_VARIANT, "pcfg");
		AnalysisEngineDescription dependencyParser = createEngineDescription(CoreNlpDependencyParser.class,
				CoreNlpDependencyParser.PARAM_LANGUAGE, "en",
				CoreNlpDependencyParser.PARAM_PRINT_TAGSET,false);
		//AnalysisEngineDescription pattern1 = createEngineDescription(Pattern1_VeryPlusAdj.class);
		AnalysisEngineDescription patternRecognizer = createEngineDescription(
			    "MainEngine");
		
		AnalysisEngineDescription analyzer = createEngineDescription(Analyzer.class);
		
		AnalysisEngineDescription binCasWriter = createEngineDescription(
				BinaryCasWriter.class, 
				BinaryCasWriter.PARAM_FORMAT, "6+",
				BinaryCasWriter.PARAM_OVERWRITE, true,
				BinaryCasWriter.PARAM_TARGET_LOCATION, "target/bincas"
				);
		AnalysisEngineDescription xmiWriter = createEngineDescription(
				XmiWriter.class, 
				XmiWriter.PARAM_OVERWRITE, true,
				XmiWriter.PARAM_TARGET_LOCATION, "target/cas/test"
				);


		SimplePipeline.runPipeline(reader, 
				seg, 
				checker,
				posTagger, 
				lemmatizer,
				chunker,
			//	dependencyParser,
			//	constituentParser,
			//	pattern1,
				patternRecognizer,
				analyzer,
				xmiWriter,
				binCasWriter
				);
	}
	
	
	
}
