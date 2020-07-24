package Launcher;

import Cases.Backend.backend;
import org.testng.annotations.Test;

public class BackEnd {

    @Test
    public void ShouldAssertBreweryData(){
        backend.execute();

    }
}
