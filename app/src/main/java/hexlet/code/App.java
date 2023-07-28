package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.io.File;
import java.math.BigInteger;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

@Command(
        version = "Help demo v0.1",
        name = "gendiff",
        description = "Compares two configuration files and shows a difference."
)

public class App implements Runnable {
    @Parameters(index = "0", description = "path to first file", paramLabel = "filepath1")
    private File file1;

    @Parameters(index = "1", description = "path to second file", paramLabel = "filepath2")
    private File file2;

    @Option(names = { "-f", "--format"}, description = "output format [default: stylish]", paramLabel = "format")
    File file;

    @Option(names = {"-V", "--version"}, description = "Print version information and exit.", versionHelp = true)
    boolean versionHelpRequested;

    @Option(names = {"-h", "--help"}, description = "Show this help message and exit.", usageHelp = true)
    boolean usageHelpRequested;

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
//        System.out.println("Hello world!");
    }


}


