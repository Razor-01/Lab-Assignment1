public class PythagorianTriples {
    static void pythagoreanTriplets(int limit)
    {
        int x, y, z = 0;
        int n = 2;

        while (z < limit) {
            for (int i = 1; i < n; ++i) {
                x = n * n - i * i;
                y = 2 * n * i;
                z = n * n + i * i;

                if (z > limit)
                    break;

                System.out.println(x + " " + y + " " + z);
            }
            n++;
        }
    }
    public static void start() {
        int limit = 500;
        pythagoreanTriplets(limit);

    }
}
