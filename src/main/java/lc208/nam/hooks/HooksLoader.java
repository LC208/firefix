package lc208.nam.hooks;

import lc208.nam.hooklib.minecraft.HookLoader;
import lc208.nam.hooklib.minecraft.PrimaryClassTransformer;

public class HooksLoader extends HookLoader {

    public HooksLoader(){}

    @Override
    public String[] getASMTransformerClass() {
        return new String[]{PrimaryClassTransformer.class.getName()};
    }

    @Override
    public void registerHooks() {
        registerHookContainer("lc208.nam.hooks.Hooks");
    }
}