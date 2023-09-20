package at.gmandev.aurasmpseason2.util;

import at.gmandev.aurasmpseason2.AuraSmpSeason2;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ArmorMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.trim.ArmorTrim;
import org.bukkit.inventory.meta.trim.TrimMaterial;
import org.bukkit.inventory.meta.trim.TrimPattern;

import java.util.List;

public class TheAuraRecipe {

    public static void register() {
        ItemStack theAura = new ItemStack(Material.NETHERITE_CHESTPLATE);
        ItemMeta itemMeta = theAura.getItemMeta();

        if (itemMeta == null) {
            return;
        }

        itemMeta.setDisplayName(ChatColor.RED + "The Aura");
        itemMeta.setLore(List.of(ChatColor.DARK_GRAY + "Unleash the power of the dragon."));
        itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, false);
        itemMeta.setUnbreakable(true);
        itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itemMeta.addItemFlags(ItemFlag.HIDE_ARMOR_TRIM);

        ArmorMeta armorMeta = (ArmorMeta) itemMeta;
        armorMeta.setTrim(new ArmorTrim(TrimMaterial.AMETHYST, TrimPattern.SILENCE));

        theAura.setItemMeta(armorMeta);

        ShapelessRecipe recipe = new ShapelessRecipe(new NamespacedKey(AuraSmpSeason2.getInstance(), "TheAuraRecipe"), theAura);
        recipe.addIngredient(Material.DRAGON_EGG);
        Bukkit.addRecipe(recipe);
    }

}
