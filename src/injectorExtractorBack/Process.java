package injectorExtractorBack;

import java.util.ArrayList;

public class Process {
	private int type;
	private String name;
	public Process(int type, String name) {
		super();
		this.type = type;
		this.name = name;
	}
	public void  ViewProcessList(ArrayList<Process> processList) {
		for(Process process: processList) {
			System.out.println("type process: "+process.name+" | "+"código: "+process.type);
		}
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
