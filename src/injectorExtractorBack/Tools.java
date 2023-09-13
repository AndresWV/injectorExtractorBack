package injectorExtractorBack;

import java.io.BufferedWriter;
import java.util.ArrayList;

public interface Tools {
	private void generateTags(BufferedWriter xmlFile, int typeProcess, Process process) {
	}
	private void basicStruct(BufferedWriter bpmnFile, ArrayList<Process> processList) {}
	public default void createOutputFile(String nameFile, ArrayList<Process> proccesList, String output) {}
}
