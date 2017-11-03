package net.guatejug.restclient.client;


import net.guatejug.restclient.main.MainController;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MainControllerUnitTest {

    private MainController mainController;

    @Test
    public void testEscribirCosa() {
        assertThat(mainController.escribirCosa(), is("algunaCosa") );
    }
}
