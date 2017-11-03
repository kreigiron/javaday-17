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

    private RestClient restClient;

    @Before
    public void setup(){
        Mockito.mock(RestClient.class);
        mainController = new MainController(restClient);
    }

    @Test
    public void testEscribirCosa() {
        assertThat(mainController.escribirCosa(), is("algunaCosa") );
    }
}
