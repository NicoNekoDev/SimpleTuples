package ro.github.NicoNekoDev.simpletuples.test;

import org.github.NicoNekoDev.simpletuples.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    public void test() {
        Unit<Integer> unit = Tuples.of(1);
        assertEquals(unit.getFirstValue(), 1);

        Pair<Integer, Integer> pair = unit.toPair(2);
        assertEquals(pair.getSecondValue(), 2);

        Triplet<Integer, Integer, Integer> triplet = pair.toTriplet(3);
        assertEquals(triplet.getThirdValue(), 3);

        Quartet<Integer, Integer, Integer, Integer> quartet = triplet.toQuartet(4);
        assertEquals(quartet.getForthValue(), 4);

        Quintet<Integer, Integer, Integer, Integer, Integer> quintet = quartet.toQuintet(5);
        assertEquals(quintet.getFifthValue(), 5);

        Sextet<Integer, Integer, Integer, Integer, Integer, Integer> sextet = quintet.toSextet(6);
        assertEquals(sextet.getSixthValue(), 6);

        Septet<Integer, Integer, Integer, Integer, Integer, Integer, Integer> septet = sextet.toSeptet(7);
        assertEquals(septet.getSeventhValue(), 7);

        Octet<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> octet = septet.toOctet(8);
        assertEquals(octet.getEightValue(), 8);

        Ennead<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> ennead = octet.toEnnead(9);
        assertEquals(ennead.getNinthValue(), 9);

        Decade<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> decade = ennead.toDecade(10);
        assertEquals(decade.getFirstValue(), 1);
        assertEquals(decade.getSecondValue(), 2);
        assertEquals(decade.getThirdValue(), 3);
        assertEquals(decade.getForthValue(), 4);
        assertEquals(decade.getFifthValue(), 5);
        assertEquals(decade.getSixthValue(), 6);
        assertEquals(decade.getSeventhValue(), 7);
        assertEquals(decade.getEightValue(), 8);
        assertEquals(decade.getNinthValue(), 9);
        assertEquals(decade.getTenthValue(), 10);
    }
}
