package lawilliach.config;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import lawilliach.AdditionalMonsterEggs;
import net.minecraftforge.common.config.Configuration;

/*
 * コンフィグ設定の中心となるクラス。
 */
public class AmeConfigCore {
	public static Configuration cfg;

	/* GENERAL Mod全般の設定 */
	public static final String GENERAL = "General";

	// SPECIAL 特殊ブロック
	private static final String SPECIAL = GENERAL + ".Special";
	public static boolean isConfigSpecial = true;

	// WEIGHT 生成量
	private static final String WEIGHT = GENERAL + ".Weight";
	public static int configWeight = 1;

	/*
	 * preInitにて呼び出すメソッド。
	 * コンフィグの読み込み
	 */
	public static void loadConfig(FMLPreInitializationEvent event) {
		// Configurationのインスタンス化
		cfg = new Configuration(event.getSuggestedConfigurationFile(), AdditionalMonsterEggs.MOD_VERSION, true);

		// コンフィグの初期化・同期
		initConfig();
		syncConfig();
	}

	/*
	 * コンフィグの初期化
	 */
	private static void initConfig() {
		/* GENERAL Mod全般の設定 */
		cfg.addCustomCategoryComment(GENERAL, "The general settings of  " + AdditionalMonsterEggs.MOD_NAME + ".");
		cfg.setCategoryLanguageKey(GENERAL, "config.ame.category.general");

		// SPECIAL 特殊ブロック
		cfg.addCustomCategoryComment(SPECIAL, "The setting of Special Block Generation");
		cfg.setCategoryLanguageKey(SPECIAL, "config.ame.category.special");

		// WEIGHT 生成量
		cfg.addCustomCategoryComment(WEIGHT, "The setting of The Quantity of Generation.");
		cfg.setCategoryLanguageKey(WEIGHT, "config.ame.category.weight");
	}

	/*
	 * コンフィグの同期
	 */
	public static void syncConfig() {
		/* 変数への反映 */
		// SPECIAL 特殊ブロック
		isConfigSpecial = cfg.getBoolean("Special Block", SPECIAL, isConfigSpecial, "Special Block Generation", "config.ame.category.special");
		// WEIGHT 生成量
		configWeight = cfg.getInt("Generation Weight", WEIGHT, configWeight, 0, 4, "0=VeryEasy, 1=Easy, 2=Normal, 3=Hard, 4=VeryHard", "config.ame.category.weight");

		/* コンフィグファイルの保存 */
		cfg.save();
	}
}