package de.dabewi;

import java.util.Map;

public class ISOResult {
	
	private Map<String, String> isoMap = new IsoMap().getMap();	
	
	public String getISOResult(String isoCode) {
		return this.isoMap.get(isoCode);
	}

}