import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class TestGlob {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("/data/data/com.termux/files/home/maven-ear-example");
        final List<Path> filePaths = new ArrayList<>();
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*rest*/*.java");
        SimpleFileVisitor<Path> visitor = new SimpleFileVisitor<Path>() {

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (matcher.matches(file)) {
                    filePaths.add(file);
                }
                return FileVisitResult.CONTINUE;
            }
        };

        Files.walkFileTree(path, visitor);
        System.out.println("paths:::" + filePaths);
    }
}
