package org.ikwattro.sandbox;

import org.junit.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.*;

public class SimpleTest extends AbstractControllerTest {

    @Test
    public void testHello() {
        ResponseEntity<String> response = restTemplate.getForEntity(baseUrl(), String.class);
        assertEquals("Hello", response.getBody());
    }

    @Test
    public void testSendRequestWithBody() {
        AnalyzeRequest request = new AnalyzeRequest("some content");
        ResponseEntity<AnalyzeRequest> response = restTemplate.postForEntity(urlFor("api/analyze"), request, AnalyzeRequest.class);
        assertEquals(200, response.getStatusCodeValue());
        assertEquals("some content", response.getBody().getBody());
    }
}
