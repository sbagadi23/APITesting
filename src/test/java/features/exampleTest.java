package features;

import com.intuit.karate.junit5.Karate;

public class exampleTest {
	

	 @Karate.Test
	    Karate testExample() {
	           return Karate.run("SampleDemo").relativeTo(getClass());
	    }

}
