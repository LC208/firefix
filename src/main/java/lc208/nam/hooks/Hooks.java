package lc208.nam.hooks;

import alcoholmod.Mathioks.block.BlockModFire;
import alcoholmod.Mathioks.block.BlueFire;
import lc208.nam.hooklib.asm.Hook;
import lc208.nam.hooklib.asm.ReturnCondition;
import net.minecraft.block.BlockFire;
import net.minecraft.world.World;

import java.util.Random;






public class Hooks {

    public static int ticksExisted = 0;
    @Hook(returnCondition = ReturnCondition.ALWAYS)
    public static void updateTick(BlockFire block, World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
            ticksExisted++;
            if(ticksExisted >= 1){
                p_149674_1_.setBlockToAir(p_149674_2_, p_149674_3_, p_149674_4_);
                ticksExisted = 0;
            }
    }

    public static int ticksExistedMod = 0;
    @Hook(returnCondition = ReturnCondition.ALWAYS)
    public static void updateTick(BlockModFire block, World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
            ticksExistedMod++;
            if(ticksExistedMod >= 1){
                p_149674_1_.setBlockToAir(p_149674_2_, p_149674_3_, p_149674_4_);
                ticksExistedMod = 0;
            }
    }

    public static int ticksExistedBlue = 0;
    @Hook(returnCondition = ReturnCondition.ALWAYS)
    public static void updateTick(BlueFire block, World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
            ticksExistedBlue++;
            if(ticksExistedBlue >= 1){
                p_149674_1_.setBlockToAir(p_149674_2_, p_149674_3_, p_149674_4_);
                ticksExistedBlue = 0;
            }
    }

}
