package pt.coderedsoftware.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import pt.coderedsoftware.tutorialmod.TutorialMod;

public class ModItems {
    //to create items first we need a place that allows us to register our items so we use a DefferedRegister
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TutorialMod.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        //after doing this method u have to call it on the initializingm function
    }


    // ||||||||||||||||||||||||||||||||||||
    // ||||||||||||||||||||||||||||||||||||
    // ||||||||||||||||||||||||||||||||||||
    // |||||||||||||   Items   ||||||||||||
    // ||||||||||||||||||||||||||||||||||||
    // ||||||||||||||||||||||||||||||||||||
    // ||||||||||||||||||||||||||||||||||||

    //almost all items are going to be static final
    // you should name the item will all lowercase carachters and no spaces
    // This item while created is not acessible and doesn't have a texture so you'll need to addItToCreative
    // so we had to add it in Tutorial Mod to the Ingredients Tab
    // but then we need to define a name and such for it
    //this is done in the resources tab
    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth", () -> new Item(new Item.Properties()));


    // ||||||||||||||||||||||||||||||||||||
    // ||||||||||||||||||||||||||||||||||||
    // ||||||||||||||||||||||||||||||||||||
    // |||||||||||||   Items   ||||||||||||
    // ||||||||||||||||||||||||||||||||||||
    // ||||||||||||||||||||||||||||||||||||
    // ||||||||||||||||||||||||||||||||||||

}
