public class MainMultiplicity {
    public static void main(String[] args) {
        Multiplicity multiplicity = new Multiplicity("QWERTY123");
        Multiplicity multiplicity1 = new Multiplicity("QanRTkj32p1Y");
        Multiplicity multiplicity2 = new Multiplicity("asdfg0");
        Multiplicity multiplicity3 = new Multiplicity("stringOne");
        Multiplicity multiplicity4 = new Multiplicity("stringTwo");
        Multiplicity elem[] = new Multiplicity[3];
        elem[0] = new Multiplicity("ABC");
        elem[1] = new Multiplicity("19B");
        elem[2] = new Multiplicity("qwert91");
        Multiplicity.useSymbol(multiplicity2, 'd');
        Multiplicity.intersection(multiplicity, multiplicity1);
        Multiplicity.grouping(multiplicity1, multiplicity2);
        Multiplicity.difference(multiplicity, multiplicity1);
        Multiplicity.addition(multiplicity3, multiplicity4);
        Multiplicity.getNewSymbol(multiplicity3, 'I');
        Multiplicity.oneOfCouple(elem);
    }
}
