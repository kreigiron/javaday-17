package net.guatejug.restclient.client;


import net.guatejug.restclient.main.MainController;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;

public class MainControllerUnitTest {

    private MainController mainController;

    private RestClient restClient = Mockito.mock(RestClient.class);

    @Before
    public void setup(){
        Mockito.mock(RestClient.class);
        mainController = new MainController(restClient);
        when(restClient.getCosa()).thenReturn("algunaCosa");
    }

    @Test
    public void testEscribirCosa() {
        assertThat(mainController.escribirCosa(), is("algunaCosa") );
    }
}
