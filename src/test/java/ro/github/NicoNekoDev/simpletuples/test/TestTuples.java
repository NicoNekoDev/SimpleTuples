package ro.github.NicoNekoDev.simpletuples.test;

import io.github.NicoNekoDev.SimpleTuples.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTuples {

    @Test
    public void testTypes() {
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

    @Test
    public void testFunctions() {
        assertEquals("a", Unit.of("A").apply(String::toLowerCase));
        assertEquals("ab", Pair.of("A", "B").apply((a, b) ->
                a.toLowerCase() + b.toLowerCase()));
        assertEquals("abc", Triplet.of("A", "B", "C").apply((a, b, c) ->
                a.toLowerCase() + b.toLowerCase() + c.toLowerCase()));
        assertEquals("abcd", Quartet.of("A", "B", "C", "D").apply((a, b, c, d) ->
                a.toLowerCase() + b.toLowerCase() + c.toLowerCase() + d.toLowerCase()));
        assertEquals("abcde", Quintet.of("A", "B", "C", "D", "E").apply((a, b, c, d, e) ->
                a.toLowerCase() + b.toLowerCase() + c.toLowerCase() + d.toLowerCase() + e.toLowerCase()));
        assertEquals("abcdef", Sextet.of("A", "B", "C", "D", "E", "F").apply((a, b, c, d, e, f) ->
                a.toLowerCase() + b.toLowerCase() + c.toLowerCase() + d.toLowerCase() + e.toLowerCase() + f.toLowerCase()));
        assertEquals("abcdefg", Septet.of("A", "B", "C", "D", "E", "F", "G").apply((a, b, c, d, e, f, g) ->
                a.toLowerCase() + b.toLowerCase() + c.toLowerCase() + d.toLowerCase() + e.toLowerCase() + f.toLowerCase() + g.toLowerCase()));
        assertEquals("abcdefgh", Octet.of("A", "B", "C", "D", "E", "F", "G", "H").apply((a, b, c, d, e, f, g, h) ->
                a.toLowerCase() + b.toLowerCase() + c.toLowerCase() + d.toLowerCase() + e.toLowerCase() + f.toLowerCase() + g.toLowerCase() + h.toLowerCase()));
        assertEquals("abcdefghi", Ennead.of("A", "B", "C", "D", "E", "F", "G", "H", "I").apply((a, b, c, d, e, f, g, h, i) ->
                a.toLowerCase() + b.toLowerCase() + c.toLowerCase() + d.toLowerCase() + e.toLowerCase() + f.toLowerCase() + g.toLowerCase() + h.toLowerCase() + i.toLowerCase()));
        assertEquals("abcdefghij", Decade.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J").apply((a, b, c, d, e, f, g, h, i, j) ->
                a.toLowerCase() + b.toLowerCase() + c.toLowerCase() + d.toLowerCase() + e.toLowerCase() + f.toLowerCase() + g.toLowerCase() + h.toLowerCase() + i.toLowerCase() + j.toLowerCase()));
    }

    @Test
    public void testConsumers() {
        Unit<Product> unit = Unit.of(new Product(0));
        unit.accept((product) -> product.setPrice(1));
        assertEquals(1, unit.apply(Product::getPrice));

        Pair<Product, Integer> pair = unit.toPair(2);
        pair.accept((product, price1) -> product.setPrice(price1));
        assertEquals(2, (int) pair.apply((product, price) -> product.getPrice()));

        Triplet<Product, Integer, Integer> triplet = pair.toTriplet(1);
        triplet.accept((product, price1, price2) -> product.setPrice(price1 + price2));
        assertEquals(3, (int) triplet.apply((product, price1, price2) -> product.getPrice()));

        Quartet<Product, Integer, Integer, Integer> quartet = triplet.toQuartet(1);
        quartet.accept((product, price1, price2, price3) -> product.setPrice(price1 + price2 + price3));
        assertEquals(4, (int) quartet.apply((product, price1, price2, price3) -> product.getPrice()));
    }

    @Test
    public void testOptionals() {
        OptionalPair<Integer, Integer> optionalPair = OptionalPair.ofNullable(1, 2);
        assertTrue(optionalPair.getFirstValue().isPresent());
        assertTrue(optionalPair.getSecondValue().isPresent());

        OptionalTriplet<Integer, Integer, Integer> optionalTriplet = OptionalTriplet.ofNullable(null, 2, null);
        assertFalse(optionalTriplet.getFirstValue().isPresent());
        assertTrue(optionalTriplet.getSecondValue().isPresent());
        assertFalse(optionalTriplet.getThirdValue().isPresent());
    }
}
