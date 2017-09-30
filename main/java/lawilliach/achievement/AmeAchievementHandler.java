package lawilliach.achievement;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import lawilliach.api.AmeBlocks;
import lawilliach.block.blocks.monstereggs.AmeMEBase;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

public class AmeAchievementHandler {
	/*
	 * ブロックが破壊された時に呼び出される処理
	 * MinecraftForge.EVENT_BUS.registerで呼び出されるので、staticを付けずに@SubscribeEventを付ける
	 */
	@SubscribeEvent
	public void BreakBlockEvent(BreakEvent event) {
		Block block = event.block;

		if (block instanceof AmeMEBase) {
			EntityPlayer player = event.getPlayer();

			if (block == AmeBlocks.blockMonsterEggX) {
				player.triggerAchievement(AmeAchievementCore.meX);
			} else if (block == AmeBlocks.blockMonsterEggW) {
				player.triggerAchievement(AmeAchievementCore.meWitch);
			} else if (block == AmeBlocks.blockMonsterEggZ) {
				player.triggerAchievement(AmeAchievementCore.meZombie);
			} else if (block == AmeBlocks.blockMonsterEggSp) {
				player.triggerAchievement(AmeAchievementCore.meSpider);
			} else if (block == AmeBlocks.blockMonsterEggSkS) {
				player.triggerAchievement(AmeAchievementCore.meSkeletonSword);
			} else if (block == AmeBlocks.blockMonsterEggSl) {
				player.triggerAchievement(AmeAchievementCore.meSlime);
			} else if (block == AmeBlocks.blockMonsterEggZC) {
				player.triggerAchievement(AmeAchievementCore.meZombieChild);
			} else if (block == AmeBlocks.blockMonsterEggSpC) {
				player.triggerAchievement(AmeAchievementCore.meCaveSpider);
			} else if (block == AmeBlocks.blockMonsterEggC) {
				player.triggerAchievement(AmeAchievementCore.meCreeper);
			} else if (block == AmeBlocks.blockMonsterEggSk) {
				player.triggerAchievement(AmeAchievementCore.meSkeleton);
			}
		}
	}
}
