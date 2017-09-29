package lawilliach.config;

import java.util.Set;

import cpw.mods.fml.client.IModGuiFactory;
import cpw.mods.fml.client.config.GuiConfig;
import lawilliach.AdditionalMonsterEggs;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;

/*
 * ゲーム内でコンフィグを変更するためのGUI
 */
public class AmeGuiFactory implements IModGuiFactory {
	@Override
	public void initialize(Minecraft minecraftInstance) {
	}

	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass() {
		return AmeConfigGui.class;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
		return null;
	}

	@Override
	public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
		return null;
	}

	public static class AmeConfigGui extends GuiConfig {
		public AmeConfigGui(GuiScreen parent) {
			super(parent, (new ConfigElement<Object>(AmeConfigCore.cfg.getCategory(AmeConfigCore.GENERAL))).getChildElements(), AdditionalMonsterEggs.MOD_ID, false, false, AdditionalMonsterEggs.MOD_NAME);
		}
	}
}