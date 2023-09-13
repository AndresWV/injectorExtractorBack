package injectorExtractorBack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HmapXmiToBpmn {
	Map<Integer,String> xmiToBpmn = new HashMap<Integer,String>();
	List<String> processList = new ArrayList<>(Arrays.asList(
            "Task",
            "LaneSet",
            "lane",
            "DataObjectReference",
            "DataStoreReference",
            "DataInput",
            "ExclusiveGateway",
            "ParallelGateway",
            "InclusiveGateway",
            "SubProcess",
            "AdHocSubProcess",
            "BoundaryEvent",
            "BusinessRuleTask",
            "CallActivity",
            "CallChoreography",
            "ChoreographyTask",
            "ComplexGateway",
            "DataObject",
            "EventBasedGateway",
            "ImplicitThrowEvent",
            "IntermediateCatchEvent",
            "IntermediateThrowEvent",
            "ManualTask",
            "ReceiveTask",
            "ScriptTask",
            "SendTask",
            "ServiceTask",
            "SubChoreography",
            "Transaction",
            "UserTask",
            "ExtensionValues",
            "IoSpecification",
            "documentation",
            "IoBinding",
            "auditing",
            "monitoring",
            "properties",
            "CorrelationSubscriptions",
            "TextAnnotation"
        ));
	public Map<Integer,String> generateDictionary() {
		int idProcess=1;
		for(String typeProcess: processList) {
			xmiToBpmn.put(idProcess, typeProcess);
			idProcess++;
		}
		return xmiToBpmn;
	}
}
