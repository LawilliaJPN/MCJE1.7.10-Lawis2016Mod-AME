package lawilliach.config;

import cpw.mods.fml.common.ModMetadata;
import lawilliach.AdditionalMonsterEggs;

/*
 * mcmod.infoと同様の内容。
 * modの情報を登録するためのクラス。
 *
 * preInitで最初に呼び出す。
 */
public class AmeInfoCore {
	public static void registerInfo(ModMetadata meta) {
		meta.modId = AdditionalMonsterEggs.MOD_ID;
		meta.name = AdditionalMonsterEggs.MOD_NAME;
		meta.description = AdditionalMonsterEggs.MOD_DESCRIPTION;
		meta.version = AdditionalMonsterEggs.MOD_VERSION;
		meta.url = "http://lawiss.com/minecraft-modding/";
		meta.authorList.add("Lawillia");
		meta.credits = "";
		meta.logoFile = "";
		meta.autogenerated = false;
	}
}