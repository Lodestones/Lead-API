package to.lodestone.leadapi;

import org.bukkit.plugin.java.JavaPlugin;
import to.lodestone.leadapi.api.LeadProvider;

/**
 * The main class to hook into the Lead API.
 * <p>
 * Example usage:
 * <pre>{@code
 * public class MainPlugin extends JavaPlugin {
 *      private LeadHook leadHook; // Declare Lead Hook Variable.
 *
 *      @Override
 *      public void onEnable() {
 *          leadHook = new LeadHook(this); // Hook into the Lead API.
 *      }
 *
 *      public ILeadAPI lead() {
 *          return leadHook.api(); // Retrieve the Lead API from the Hook.
 *      }
 * }
 * }</pre>
 * </p>
 * @author John Aquino
 */
public class LeadHook {
    private final ILeadAPI api;

    /**
     * Constructs a LeadHook instance and hooks into the Lead API using the provided plugin.
     *
     * @param plugin The JavaPlugin instance to initialize the Lead API.
     */
    public LeadHook(JavaPlugin plugin) {
        LeadProvider provider = new LeadProvider(plugin);
        this.api = provider.service();
    }

    /**
     * Retrieves the instance of the Lead API.
     *
     * @return The instance of the Lead API.
     */
    public ILeadAPI api() {
        return this.api;
    }
}