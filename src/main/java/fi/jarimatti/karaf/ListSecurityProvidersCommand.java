package fi.jarimatti.karaf;

import org.apache.karaf.shell.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;

import java.security.Provider;
import java.security.Security;

/**
 * Karaf command to print available Java security providers.
 *
 * Created by jarimatti on 8.2.2015.
 */
@Command(scope = "securityproviders", name = "list", description = "List security prividers")
public class ListSecurityProvidersCommand extends OsgiCommandSupport {


    @Override
    protected Object doExecute() throws Exception {

        for (Provider provider : Security.getProviders()) {
            printProvider(provider);
        }

        return null;
    }

    /**
     * Print provider information to stdout.
     * <p/>
     * Prints using format:
     * <pre>
     * Provider toString()
     *   Provider getInfo()
     * </pre>
     *
     * @param provider Provider to print.
     */
    private void printProvider(final Provider provider) {
        System.out.println(provider.toString());
        System.out.println("  " + provider.getInfo());
    }
}
