package de.unidue.ltl.grammarprofile;

import java.util.Collection;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.component.JCasAnnotator_ImplBase;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.unidue.ltl.escrito.core.types.GrammarProfile;

public class Pattern1_VeryPlusAdj extends JCasAnnotator_ImplBase{

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		Collection<Token> tokens = JCasUtil.select(aJCas, Token.class);
		boolean lastTokenVery = false;
		int lastBegin = -1;
		for (Token t : tokens){
			String pos = t.getPosValue();
			if (pos.equals("JJ") && lastTokenVery){
				GrammarProfile gp = new GrammarProfile(aJCas);
				gp.setName("veryPlusAdj");
				gp.setBegin(lastBegin);
				gp.setEnd(t.getEnd());
				gp.setLevel("A1");
				gp.addToIndexes();
			}
			if (t.getCoveredText().equals("very")){
				lastTokenVery = true;
				lastBegin = t.getBegin();
			//	System.out.println(t.getCoveredText() + ": "+pos);
			} else{
				lastTokenVery = false;
			}
		}
	}

}
