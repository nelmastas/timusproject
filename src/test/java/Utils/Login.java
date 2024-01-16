package Utils;

import com.google.common.io.Files;
import io.restassured.response.ResponseBody;
import java.io.File;
import java.io.IOException;

public class Login {
    public static void ProduceJson(ResponseBody responseBody) throws IOException {
        String responseAsString = responseBody.asPrettyString();
        byte[] responseAsStringByte = responseAsString.getBytes();
        File targetFileForString = new File("src/test/java/File/Login.json");
        Files.write(responseAsStringByte, targetFileForString);
    }
}
