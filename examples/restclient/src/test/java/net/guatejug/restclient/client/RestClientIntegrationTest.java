package net.guatejug.restclient.client;


import com.github.tomakehurst.wiremock.junit.WireMockRule;
import net.guatejug.restclient.main.MainController;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.ok;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MainController.class})
public class RestClientIntegrationTest {

    @Rule
    public final WireMockRule wireMockRule = new WireMockRule(56789);

    @Autowired
    MainController mainController;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getCosa() throws Exception {

        stubFor(get(urlPathEqualTo("/cosas/cosa"))
                        .willReturn(ok().withBody("Cosa!")));

        final String responseBody = mainController.escribirCosa();
        assertThat(responseBody, is("Cosa!"));
    }

}
