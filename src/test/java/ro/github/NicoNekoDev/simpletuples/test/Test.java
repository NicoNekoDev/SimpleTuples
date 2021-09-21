package ro.github.NicoNekoDev.simpletuples.test;

import org.github.NicoNekoDev.simpletuples.optional.OptionalPair;

public class Test {

    public void abc() {
        OptionalPair<String, String> optionalPair = new OptionalPair<>("hello!", null);
        optionalPair.toOptionalTriplet("").getFirstValue();

    }
}
