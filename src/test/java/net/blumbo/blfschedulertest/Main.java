package net.blumbo.blfschedulertest;

import net.blumbo.blfscheduler.BlfRunnable;
import net.blumbo.blfscheduler.BlfScheduler;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ModInitializer {

    public static Logger logger = LogManager.getLogger();
    @Override
    public void onInitialize() {
        BlfScheduler.delay(100, new BlfRunnable() {
            @Override
            public void run() {
                logger.info("This message was delayed 100 ticks! (5 seconds)");
            }
        });

        BlfScheduler.repeat(5, 20, new BlfRunnable() {
            @Override
            public void run() {
                logger.info("This message was delayed 5 ticks and is repeating every 20 ticks! (1 second)");
            }
        });
    }
}
