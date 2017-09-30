package lawilliach.achievement;

import lawilliach.AdditionalMonsterEggs;
import lawilliach.api.AmeBlocks;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

/*
 * 実績の追加を行うクラス
 */
public class AmeAchievementCore {
	/* 実装の宣言 */
    public static Achievement meCaveSpider;
    public static Achievement meCreeper;
    public static Achievement meSkeleton;
    public static Achievement meSkeletonSword;
    public static Achievement meSlime;
    public static Achievement meSpider;
    public static Achievement meWitch;
    public static Achievement meX;
    public static Achievement meZombie;
    public static Achievement meZombieChild;

    /*
     * 実装の登録
     */
	public static void initAchievements() {
		/* 実績の追加 */
		meX = new Achievement("meX", "meX", 0, 2, AmeBlocks.blockMonsterEggX, null).registerStat();
		meWitch = new Achievement("meWitch", "meWitch", 2, 0, AmeBlocks.blockMonsterEggW, null).registerStat();
		meZombie = new Achievement("meZombie", "meZombie", 2, 1, AmeBlocks.blockMonsterEggZ, null).registerStat();
		meSpider = new Achievement("meSpider", "meSpider", 3, 1, AmeBlocks.blockMonsterEggSp, null).registerStat();
		meSkeletonSword = new Achievement("meSkeletonSword", "meSkeletonSword", 2, 2, AmeBlocks.blockMonsterEggSkS, null).registerStat();
		meSlime = new Achievement("meSlime", "meSlime", 3, 2, AmeBlocks.blockMonsterEggSl, null).registerStat();
		meZombieChild = new Achievement("meZombieChild", "meZombieChild", 2, 3, AmeBlocks.blockMonsterEggZC, null).registerStat();
		meCaveSpider = new Achievement("meCaveSpider", "meCaveSpider", 3, 3, AmeBlocks.blockMonsterEggSp, null).registerStat();
		meCreeper = new Achievement("meCreeper", "meCreeper", 2, 4, AmeBlocks.blockMonsterEggC, null).registerStat();
		meSkeleton = new Achievement("meSkeleton", "meSkeleton", 3, 4, AmeBlocks.blockMonsterEggSk, null).registerStat();

		/* 実績ページの追加 */
		AchievementPage.registerAchievementPage(new AchievementPage(AdditionalMonsterEggs.MOD_NAME, new Achievement[]{
			meX, meWitch, meZombie, meSpider, meSkeletonSword, meSlime,
			meZombieChild, meCaveSpider, meCreeper, meSkeleton
		}));
	}
}
