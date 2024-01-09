package Attributes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
    @Test
    @Parameters({"whom"})
    public void SendMail(String whom) {
        System.out.println(whom);

    }

    @Test
    @Parameters({"File"})
    public void Attachment( String file) {
        System.out.println(file);

    }

    @Test
    public void Sent() {
        System.out.println("Sending");
    }

    @Parameters({"whom", "File"})
    @Test
    public void Mail(String whom, String file) {
        System.out.println(whom+" "+file);

    }


}

