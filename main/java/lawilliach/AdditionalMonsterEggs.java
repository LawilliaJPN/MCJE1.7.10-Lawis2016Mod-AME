package lawilliach;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import lawilliach.block.AmeBlockRegistry;
import lawilliach.block.AmeRecipes;
import lawilliach.config.AmeInfoCore;
import lawilliach.world.GeneratorMonsterEggs;

@Mod(modid = AdditionalMonsterEggs.MOD_ID, name = AdditionalMonsterEggs.MOD_NAME, version = AdditionalMonsterEggs.MOD_VERSION, guiFactory = "lawilliach.config.AmeGuiFactory")

public class AdditionalMonsterEggs {
	public static final String MOD_DESCRIPTION  = "Mining Hazards!!";
	public static final String MOD_ID = "additionalmonstereggs";
	public static final String MOD_NAME = "Additional Monster Eggs";
	public static final String MOD_VERSION = "1.0";

	@Metadata(MOD_ID)
	private static ModMetadata meta;

	@EventHandler
	public void perInit(FMLPreInitializationEvent event) {
		// MODの情報の登録
		AmeInfoCore.registerInfo(meta);
		// 追加したブロックの登録
		AmeBlockRegistry.initBlocks();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// モンスターエッグのワールド生成
		GameRegistry.registerWorldGenerator(new GeneratorMonsterEggs(), 0);
		// モンスターエッグ、スポーンエッグを使って作れるレシピの追加
		new AmeRecipes();
	}
}

