package injectorExtractorBack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HmapBpmnToXmi {
	Map<Integer,String> bpmnToXmi = new HashMap<Integer,String>();
	List<String> processList = new ArrayList<>(Arrays.asList(
            "startEvent",
            "endEvent",
            "task",
            "laneSet",
            "lane",
            "dataObjectReference",
            "dataStoreReference",
            "dataInput",
            "exclusiveGateway",
            "parallelGateway",
            "inclusiveGateway",
            "subProcess",
            "adHocSubProcess",
            "boundaryEvent",
            "businessRuleTask",
            "callActivity",
            "callChoreography",
            "choreographyTask",
            "complexGateway",
            "dataObject",
            "eventBasedGateway",
            "implicitThrowEvent",
            "intermediateCatchEvent",
            "intermediateThrowEvent",
            "manualTask",
            "receiveTask",
            "scriptTask",
            "sendTask",
            "serviceTask",
            "subChoreography",
            "transaction",
            "userTask",
            "extensionValues",
            "ioSpecification",
            "documentation",
            "ioBinding",
            "auditing",
            "monitoring",
            "properties",
            "correlationSubscriptions",
            "textAnnotation"
        ));
	public Map<Integer,String> generateDictionary() {
		int idProcess=1;
		for(String typeProcess: processList) {
			bpmnToXmi.put(idProcess, typeProcess);
			idProcess++;
		}
		return bpmnToXmi;
	}
}
