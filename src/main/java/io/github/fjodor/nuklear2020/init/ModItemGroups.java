package io.github.fjodor.nuklear2020.init;

import io.github.fjodor.nuklear2020.Nuklear;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.function.Supplier;

public class ModItemGroups
{
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(Nuklear.MODID,
            ()->new ItemStack(ModItems.AMETHYST_INGOT)   ) ;

    //inner class
    public static class ModItemGroup extends ItemGroup
    {
        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier)
        {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @SuppressWarnings("NullableProblems")
        @Override
        public ItemStack createIcon()
        {
            return iconSupplier.get();
           // return null;
        }
    }

}
