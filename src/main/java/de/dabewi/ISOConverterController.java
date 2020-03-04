package de.dabewi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ISOConverterController {
		
	@GetMapping("/iso")
	public String helloWorld(
			@RequestParam final String isoCode) {
		
		ISOResult result = new ISOResult();
		
		return result.getISOResult(isoCode);
	}
}
