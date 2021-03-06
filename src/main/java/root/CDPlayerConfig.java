package root;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"root.soundsystem","root.video"})
//default - it looks for components in the same package and drill down
public class CDPlayerConfig {
}
