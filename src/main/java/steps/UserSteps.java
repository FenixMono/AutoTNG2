package steps;

import config.configuration.AccountConfig;
import dto.request.GenerateTokenRequestDTO;
import dto.response.GenerateTokenResponseDTO;

import static config.specification.ResponseSpec.ok;
import static org.aeonbits.owner.ConfigFactory.create;
import static org.aeonbits.owner.ConfigFactory.getProperties;
import static config.base.Requests.post;

public class UserSteps {

    private final AccountConfig config = create(AccountConfig.class, getProperties());

    public GenerateTokenRequestDTO user() {
        return GenerateTokenRequestDTO.builder()
                .userName("usertest94")
                .password("Qa12345!")
                .build();
    }

    public GenerateTokenResponseDTO generateToken() {
        return post(user(), config.generateToken()).spec(ok()).extract().as(GenerateTokenResponseDTO.class);
    }
}

//для пулреквеста закомітити
{


        }
