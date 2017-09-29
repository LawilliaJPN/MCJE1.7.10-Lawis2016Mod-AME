package lawilliach.config;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import lawilliach.AdditionalMonsterEggs;

/*
 * コンフィグ変更を反映させるイベント。
 */
public class AmeConfigEventHandler {
	/*
	 * コンフィグが変更されたときに呼び出されるメソッド
	 */
	@SubscribeEvent
	public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		// 変更されたコンフィグがこのmodのものであるとき
		if (event.modID.equals(AdditionalMonsterEggs.MOD_ID)) {
			syncConfigAndResetCount();
		}
	}

	/*
	 * 上記メソッドで呼び出されるメソッド。
	 * コンフィグ同期と関連変数のリセット。
	 */
	public static void syncConfigAndResetCount() {
		// コンフィグの同期を行う
		AmeConfigCore.syncConfig();
	}
}