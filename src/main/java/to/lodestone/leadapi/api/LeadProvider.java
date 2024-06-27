package to.lodestone.leadapi.api;

import org.bukkit.plugin.java.JavaPlugin;
import to.lodestone.bookshelfapi.api.internal.ServiceProvider;
import to.lodestone.leadapi.ILeadAPI;

public class LeadProvider extends ServiceProvider<ILeadAPI> {

    public LeadProvider(JavaPlugin plugin) {
        super(plugin, ILeadAPI.class, "LeadAPI");
    }

}
