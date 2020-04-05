public class MainEquation {
    public static void main(String[] args) {
        Equation ob = new Equation(2, 2, -6);
        ob.root(ob);
        ob.extremum(ob);
        ob.gap(ob);
        Equation mas[] = Equation.createMas(2);
        Equation.showMas(mas);
        Equation.masSort(mas);
    }
}
