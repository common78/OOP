public class Dih4 {
    public static final int IDENTITY = 0;
    public static final int ROTATE_90_ANTICLOCKWISE = 1;
    public static final int ROTATE_180 = 2;
    public static final int ROTATE_90_CLOCKWISE = 3;
    public static final int REFLECT_VERTICAL = 4;
    public static final int REFLECT_FORWARD_DIAGONAL = 5;
    public static final int REFLECT_HORIZONTAL = 6;
    public static final int REFLECT_REVERSE_DIAGONAL = 7;

    private int transformation;

    public Dih4(int transformation) {
        this.transformation = transformation;
    }

    public Dih4 then(Dih4 other) {
        int composedTransformation = (this.transformation + other.transformation) % 8;
        return new Dih4(composedTransformation);
    }

    public Dih4 inv() {
        int inverseTransformation = (8 - this.transformation) % 8;
        return new Dih4(inverseTransformation);
    }

    public boolean is_rotation() {
        return (this.transformation % 2) == 1;
    }

    public boolean is_reflection() {
        return (this.transformation % 2) == 0;
    }

    public static void main(String[] args) {
        Dih4 r = new Dih4(ROTATE_90_CLOCKWISE);
        Dih4 f = new Dih4(REFLECT_VERTICAL);
        Dih4 result = r.then(f);
        System.out.println(result.transformation); // Output: 6 (REFLECT_HORIZONTAL)
        Dih4 inverse = r.inv();
        System.out.println(inverse.transformation); // Output: 1 (ROTATE_90_ANTICLOCKWISE)
        System.out.println(r.is_rotation()); // Output: true
        System.out.println(f.is_rotation()); // Output: false
        System.out.println(f.is_reflection()); // Output: true
    }
}
