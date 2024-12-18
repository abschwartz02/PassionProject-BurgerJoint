package passion.project.BurgerJoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entrypoint to the BurgerJoint Application. Allows running as Java
 * application.
 *
 * @author Andrew Schwartz
 *
 */
@SpringBootApplication ( scanBasePackages = { "passion.project.BurgerJoint" } )
public class BurgerJointApplication {

    /**
     * Main method
     *
     * @param args
     *            Command-line args
     */
    public static void main ( final String[] args ) {
        SpringApplication.run( BurgerJointApplication.class, args );
    }

}
