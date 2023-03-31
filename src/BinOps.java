public class BinOps {
    public String sum(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        return Integer.toString(intA + intB);
    }

    public String mult(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        return Integer.toString(intA * intB);
    }
}