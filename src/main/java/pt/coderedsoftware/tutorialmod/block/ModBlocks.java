package pt.coderedsoftware.tutorialmod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import pt.coderedsoftware.tutorialmod.TutorialMod;
import pt.coderedsoftware.tutorialmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TutorialMod.MODID);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    //to register the item associated with the block
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    // ||||||||||||||||||||||||||||||||||||
    // ||||||||||||||||||||||||||||||||||||
    // ||||||||||||||||||||||||||||||||||||
    // ||||||||||||   Blocks   ||||||||||||
    // ||||||||||||||||||||||||||||||||||||
    // ||||||||||||||||||||||||||||||||||||
    // ||||||||||||||||||||||||||||||||||||

    public static final DeferredBlock<Block> BISMUTH_BLOCK = registerBlock("bismuth_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> BISMUTH_ORE = registerBlock("bismuth_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));


    // ||||||||||||||||||||||||||||||||||||
    // ||||||||||||||||||||||||||||||||||||
    // ||||||||||||||||||||||||||||||||||||
    // ||||||||||||   Blocks   ||||||||||||
    // ||||||||||||||||||||||||||||||||||||
    // ||||||||||||||||||||||||||||||||||||
    // ||||||||||||||||||||||||||||||||||||
}
