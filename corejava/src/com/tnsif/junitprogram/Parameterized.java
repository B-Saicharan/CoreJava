//package com.tnsif.junitprogram;
//
//import static org.junit.Assert.assertTrue;
//
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
//
//public class Parameterized {
//	
//	@ParameterizedTest
//	@ValueSource(strings={"call","bali","kali"})
//	void endswithI(String str) {
//		assertTrue(str.endsWith("i"));
//	}
//
//}

package com.tnsif.junitprogram;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.ValueSources;

import static org.junit.Assert.assertTrue;

public class Parameterized{
	@ParameterizedTest
	@ValueSource(strings={"call","bali","kali"})
	void endswitchI(String str) {
		assertTrue(str.endsWith("i"));
	}
}