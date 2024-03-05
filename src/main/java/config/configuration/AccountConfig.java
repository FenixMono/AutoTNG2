package config.configuration;

import org.aeonbits.owner.Config.Sources;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config;

@LoadPolicy(Config.LoadType.MERGE)
@Sources({"classpath:account.properties"})
public interface AccountConfig extends BaseConfig {
    String generateToken();
    String userId();
}
