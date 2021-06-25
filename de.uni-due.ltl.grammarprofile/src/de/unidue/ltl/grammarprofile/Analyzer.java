package de.unidue.ltl.grammarprofile;

import java.util.Collection;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.text.AnnotationFS;
import org.apache.uima.fit.component.JCasAnnotator_ImplBase;
import org.apache.uima.fit.util.CasUtil;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.GrammarAnomaly;
import de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.PennTree;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.chunk.Chunk;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.dependency.Dependency;
import de.unidue.ltl.escrito.core.types.GrammarProfile;

public class Analyzer extends JCasAnnotator_ImplBase {


	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		DocumentMetaData meta = JCasUtil.selectSingle(aJCas, DocumentMetaData.class);
		String id = meta.getDocumentId();
		System.out.println("Printing essay: "+id);

//		Collection<Sentence> sentences = JCasUtil.select(aJCas, Sentence.class);
//		for (Sentence sentence : sentences){
//			System.out.println("Sentence: X"+sentence.getCoveredText()+"X"+sentence.getCoveredText().length());
//		}

//		Collection<Token> tokens = JCasUtil.select(aJCas, Token.class);
//		for (Token token : tokens){
//			System.out.println(token.getCoveredText() +  " "+ token.getPos().getPosValue() + " "+ token.getLemma().getValue());
//		}
//		Collection<Chunk> chunks = JCasUtil.select(aJCas, Chunk.class);
//		for (Chunk chunk : chunks){
//			System.out.println(chunk.getCoveredText() + " "+ chunk.getChunkValue());
//		}
//		Collection<PennTree> pennTrees = JCasUtil.select(aJCas, PennTree.class);
//		if (pennTrees.isEmpty()){
//			System.err.println("No Trees found!");
//			System.exit(-1);
//		}
//		for (PennTree penntree : pennTrees){
//			System.out.println("TREE: "+penntree.toString());
//		}
//		Collection<Dependency> dependencies = JCasUtil.select(aJCas, Dependency.class);
//		for (Dependency dep : dependencies){
//			System.out.println(dep.getGovernor().getCoveredText() + " " + dep.getDependencyType().toString() + " " + dep.getDependent().getCoveredText());
//		}

		//		for (GrammarAnomaly ga : JCasUtil.select(aJCas, GrammarAnomaly.class)){
		//			System.out.println(ga.getCoveredText()+ ": "+ ga.getCategory()+ " - "+ga.getDescription());
		//		}
//
		Collection<GrammarProfile> gps = JCasUtil.select(aJCas, GrammarProfile.class);
		for (GrammarProfile gp : gps){
			System.out.println("Found: " + gp.getCoveredText() + " - " +gp.getName() + " ("+gp.getLevel()+")");
		}

		//for (Annotation found : JCasUtil.select(aJCas, Amplifier.class)){
		//	System.out.println("Found: " + found.getCoveredText() + " (" + found.getType().getShortName() + ")");
		//}
		
	}


}
