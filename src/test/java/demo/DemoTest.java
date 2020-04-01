package demo;


import java.io.IOException;

import org.junit.jupiter.api.Test;

class DemoTest {

    @Test
    void resourceTest() throws IOException {
        Thread.currentThread().getContextClassLoader().getResources("demo").asIterator().forEachRemaining(url -> {
            System.out.println(url.getFile()); // I'd like to see the target/classes/demo directory here at some point.
        });
    }
}
