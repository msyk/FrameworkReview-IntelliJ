package topse.pattern.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ToolTestRun {
    public static void main(String[] args) {
        commandExecute("pwd");
        commandExecute("java -cp out/production/FrameworkReview topse.pattern.CSVViewer rsrcs/sample.csv");
        String classpath = "out/production/FrameworkReview";
        classpath += ":lib/minimal-json-0.9.6-SNAPSHOT.jar";
        commandExecute("java -cp " + classpath + " topse.pattern.JSONViewer https://server.msyk.net/sample.json");
    }

    private static void commandExecute(String cmd) {
        try {
            Process p = Runtime.getRuntime().exec(cmd);
            p.waitFor();
            InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                } else {
                    System.out.println("Output: " + line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
