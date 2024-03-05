import org.testng.annotations.Test;
import steps.UserSteps;

public class BasicTest {

    @Test
    void start(){
        var tokenDto = new UserSteps().generateToken();

        System.out.println(tokenDto);

    }
}
