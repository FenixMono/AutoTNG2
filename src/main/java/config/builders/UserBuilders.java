package config.builders;

import dto.request.GenerateTokenRequestDTO;

public class UserBuilders {
    public GenerateTokenRequestDTO user() {
        return GenerateTokenRequestDTO.builder
                .userName("usertest94")
                .password("Qa12345!")
                .build();
    }
}
