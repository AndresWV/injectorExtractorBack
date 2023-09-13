package injectorExtractorBack;

import java.io.File;
import java.util.ArrayList;

public interface Mapping {
	ArrayList<Process> processList = new ArrayList();
	
	private String extractorLargeName(int pos, String[] splitXmlLine) {
		return "";
	}
	private String nameProcess(String[] xmiLine){
		return "";
	}
	private Process typeProcessXmi(String splitLine){
		return new Process(0,"");
	}
	private void processExtractor(String fileLine, int processCount){}
	private ArrayList listFilesForFolder(final File folder, ArrayList inputFiles){
		return inputFiles;
	}
	private void readFile(String nameBpmnModel, String nameXmi, String output) {}
	public default void mainTools(){}
}
