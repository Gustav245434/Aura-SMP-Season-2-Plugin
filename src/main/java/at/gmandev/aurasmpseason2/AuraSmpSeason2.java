package at.gmandev.aurasmpseason2;

import at.gmandev.aurasmpseason2.util.TheAuraRecipe;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class AuraSmpSeason2 extends JavaPlugin {

    private static Plugin plugin;

    @Override
    public void onEnable() {

        plugin = this;

        TheAuraRecipe.register();

        // Plugin startup logic

    }

    @Override
    public void onDisable() {

        // Plugin shutdown logic

    }

    public static Plugin getInstance() {
        return plugin;
    }
}
