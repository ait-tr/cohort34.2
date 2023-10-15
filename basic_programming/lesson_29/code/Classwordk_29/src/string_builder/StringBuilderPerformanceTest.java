package string_builder;

/**
 * @author Andrej Reutow
 * created on 15.10.2023
 */
public class StringBuilderPerformanceTest {

    public static void main(String[] args) {
        String param1 = args.length >= 0 ? args[0] : null;
        String param2 = args.length >= 1 ? args[1] : null;
        int counter = Integer.parseInt(param2);

        for (int i = 0; i <= 10; i++) {
            System.out.println("#".repeat(60));
            System.out.println("Start test nr " + i);
            System.out.println("#".repeat(60));
            System.out.println();

            long stringPerformanceTest = stringPerformanceTest(param1, counter);
            long stringBuilderPerformanceTest = stringBuilderPerformanceTest(param1, counter);
            long stringBufferPerformanceTest = stringBufferPerformanceTest(param1, counter);

            System.out.println("FAZIT:");
            System.out.println("stringPerformanceTest\t" + stringPerformanceTest);
            System.out.println("stringBuilderPerformanceTest\t" + stringBuilderPerformanceTest);
            System.out.println("stringBufferPerformanceTest\t" + stringBufferPerformanceTest);

            System.out.println("End test nr " + i);
        }

    }

    public static long stringPerformanceTest(String value, int counter) {
//        System.out.println("Start test for String concatenation");
        String str = "";

        long startTimeStringConcat = System.currentTimeMillis();
        for (int i = 0; i < counter; i++) {
            str += value;
        }

        long endTimeStringConcat = System.currentTimeMillis();

        long result = endTimeStringConcat - startTimeStringConcat;
//        System.out.println("End test for String concatenation. Result in ms:" + result);

        return result;
    }

    public static long stringBuilderPerformanceTest(String value, int counter) {
//        System.out.println("Start test for String concatenation");
        StringBuilder stringBuilder = new StringBuilder();

        long startTimeStringConcat = System.currentTimeMillis();
        for (int i = 0; i < counter; i++) {
            stringBuilder.append(value);
        }

        long endTimeStringConcat = System.currentTimeMillis();

        long result = endTimeStringConcat - startTimeStringConcat;
//        System.out.println("End test for String concatenation. Result in ms:" + result);

        return result;
    }

    public static long stringBufferPerformanceTest(String value, int counter) {
//        System.out.println("Start test for String concatenation");
        StringBuffer stringBuilder = new StringBuffer();

        long startTimeStringConcat = System.currentTimeMillis();
        for (int i = 0; i < counter; i++) {
            stringBuilder.append(value);
        }

        long endTimeStringConcat = System.currentTimeMillis();

        long result = endTimeStringConcat - startTimeStringConcat;
//        System.out.println("End test for String concatenation. Result in ms:" + result);

        return result;
    }
}
