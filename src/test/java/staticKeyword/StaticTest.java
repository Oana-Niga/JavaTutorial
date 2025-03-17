package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void metodaTest() {

        Elev elev1 = new Elev("Ionescu","Radu", 15,"7B" );
        elev1.infoElevi();
        System.out.println();

        Elev elev2 = new Elev("Popescu","Carmen", 16,"8B");
        elev2.infoElevi();
        System.out.println();

        Elev elev3 = new Elev("Marinescu","Ionut", 14,"6B");
        elev3.infoElevi();

    }
}

