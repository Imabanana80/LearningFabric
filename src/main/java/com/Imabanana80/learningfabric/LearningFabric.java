package com.Imabanana80.learningfabric;

import com.Imabanana80.learningfabric.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearningFabric implements ModInitializer {
	public static final String MOD_ID = "learningfabric";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		LOGGER.debug("Hello World");
	}
}
