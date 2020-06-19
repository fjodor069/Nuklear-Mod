package io.github.fjodor.nuklear2020;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Nuklear.MODID)
public final class Nuklear
{
    public static final String MODID = "nuklear2020";

    private static final Logger LOGGER = LogManager.getLogger(MODID);

    public Nuklear()
    {
        LOGGER.debug("Hello from Nuklear Mod !@");

    }

}
