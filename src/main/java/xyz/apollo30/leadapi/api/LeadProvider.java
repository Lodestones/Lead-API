package xyz.apollo30.leadapi.api;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.apollo30.leadapi.ILeadAPI;
import xyz.apollo30.leadapi.internal.ServiceProvider;

public class LeadProvider extends ServiceProvider<ILeadAPI> {

    public LeadProvider(JavaPlugin plugin) {
        super(plugin, ILeadAPI.class, "ArcaneTeam");
        plugin.getLogger().info("Successfully hooked into Teams!");
    }

}
