package lawilliach;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import lawilliach.achievement.AmeAchievementCore;
import lawilliach.achievement.AmeAchievementHandler;
import lawilliach.block.AmeBlockRegistry;
import lawilliach.block.AmeRecipes;
import lawilliach.config.AmeConfigCore;
import lawilliach.config.AmeConfigEventHandler;
import lawilliach.config.AmeInfoCore;
import lawilliach.world.GeneratorMonsterEggs;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = AdditionalMonsterEggs.MOD_ID, name = AdditionalMonsterEggs.MOD_NAME, version = AdditionalMonsterEggs.MOD_VERSION, guiFactory = "lawilliach.config.AmeGuiFactory")

public class AdditionalMonsterEggs {
	public static final String MOD_DESCRIPTION  = "Mining Hazards!!";
	public static final String MOD_ID = "additionalmonstereggs";
	public static final String MOD_NAME = "Additional Monster Eggs";
	public static final String MOD_VERSION = "2.0";

	@Metadata(MOD_ID)
	private static ModMetadata meta;

	@EventHandler
	public void perInit(FMLPreInitializationEvent event) {
		// MODの情報の登録
		AmeInfoCore.registerInfo(meta);
		// コンフィグの登録
		AmeConfigCore.loadConfig(event);
		// 追加したブロックの登録
		AmeBlockRegistry.initBlocks();
		// 実績の登録
		AmeAchievementCore.initAchievements();
		// 実績の取得イベント
		MinecraftForge.EVENT_BUS.register(new AmeAchievementHandler());
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// コンフィグ変更の反映イベント
		FMLCommonHandler.instance().bus().register(new AmeConfigEventHandler());
		// 追加ブロックのワールド生成
		GameRegistry.registerWorldGenerator(new GeneratorMonsterEggs(), 0);
		// 追加ブロックに関連したレシピの登録
		AmeRecipes.initRecipes();
	}
}

