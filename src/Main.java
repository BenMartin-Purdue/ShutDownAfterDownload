import java.io.*;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File[] roots = File.listRoots();

        /* For each filesystem root, print some info */
        for (File root : roots) {
            System.out.println(String.format("Total space: %.2f GB",
                    (double)root.getTotalSpace() /1073741824));
            System.out.println(String.format("Free space: %.2f GB",
                    (double)root.getFreeSpace() /1073741824));

            /* free drive space */
                for(int x=0; x==0; x++) {

                    long Check1 = root.getFreeSpace();
                    System.out.println(String.format(" %.2f GB", (double) Check1 / 1073741824));

                    try {
                        TimeUnit.SECONDS.sleep(180);
                    } catch (InterruptedException e) {
                        System.out.println("excpetion");
                    }

                    for (int y = 0; y == 0; y++) {
                        long Check2 = root.getFreeSpace();
                        System.out.println(String.format(" %.2f GB", (double) Check2 / 1073741824));

                        String Check1String = String.format("%.2f", (double) Check1 / 1073741824);
                        double DoubleCheck1 = Double.valueOf(Check1String);

                        String Check2String = String.format("%.2f", (double) Check2 / 1073741824);
                        double DoubleCheck2 = Double.valueOf(Check2String);


                        if (DoubleCheck2 == DoubleCheck1) {
                            /* shuts down pc */
    				        Runtime runtime = Runtime.getRuntime();
    				        Process proc = runtime.exec("shutdown -s -t 0");
    				        System.exit(0);
                            System.out.println("pc shuts down");
                            break;
                        }
                        else {
                            System.out.println("Downloading...");
                        }
                    }

            System.out.println("Free space (bytes): " + root.getFreeSpace());
        }
    }
}