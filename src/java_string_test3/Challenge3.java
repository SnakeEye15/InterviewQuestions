package java_string_test3;

public class Challenge3 {
    public static void main(String[] args) {
        int iterations = 1000;

        // Test String concatenation
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String: " + (endTime - startTime) + "ms");

        // Test StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (endTime - startTime) + "ms");

        // Test StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (endTime - startTime) + "ms");
    }
}
