package com.lenis0012.bukkit.marriage2;

import me.totalfreedom.totalfreedommod.TotalFreedomMod;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class TFM {

    private TotalFreedomMod totalFreedomMod = null;

    public TotalFreedomMod getTFM()
    {
        if (totalFreedomMod != null)
        {
            return totalFreedomMod;
        }
        Plugin plugin = Bukkit.getPluginManager().getPlugin("TotalFreedomMod");
        if (plugin != null && plugin.isEnabled())
        {
            TotalFreedomMod tfm = (TotalFreedomMod)plugin;
            totalFreedomMod = tfm;
            return totalFreedomMod;
        }

        return null;
    }

    public boolean isAdmin(Player player)
    {
        return getTFM().al.isAdmin(player);
    }

}
