package kr.co.jhta.di.service.step6;

import kr.co.jhta.di.service.Output;

public class Reporter {
	private Output output;
	
	public void setOutput(Output output) {
		this.output = output;
	}
	
	public Reporter() {}
	
	public void report(String title, String text) {
		output.write(title);
		output.write(text);
	}
	
	
}
