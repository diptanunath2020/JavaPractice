import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class ReadFromResources {

    public static void main(String[] args) throws IOException {

        File file = new File(
                ReadFromResources.class.getClassLoader().getResource("QA.properties").getFile()
        );
        String content = new String(Files.readAllBytes(file.toPath()));
        System.out.println(content);

        Stack s=new Stack();


    }
}
