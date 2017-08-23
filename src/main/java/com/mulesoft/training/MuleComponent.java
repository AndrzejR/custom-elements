package com.mulesoft.training;

import java.util.Map;

public class MuleComponent {

	public Map<String, String> processMap(Map<String, String> input) {
		input.put("processed by", "processMap");
		return input;
	}

	public Map<String, String> processArray() {
		// processArray implementation
		return null;
	}

	public Map<String, String> processString() {
		// processString implementation
		return null;
	}

	public Map<String, String> processString2() {
		// processString2 implementation
		return null;
	}

}
