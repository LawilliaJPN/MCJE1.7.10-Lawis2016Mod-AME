package lawilliach.block;

import cpw.mods.fml.common.registry.GameRegistry;
import lawilliach.api.AmeBlocks;
import lawilliach.block.blocks.LavaBlock;
import lawilliach.block.blocks.PitfallBlock;
import lawilliach.block.blocks.TNTBlock;
import lawilliach.block.blocks.monsteregg.MonsterEggC;
import lawilliach.block.blocks.monsteregg.MonsterEggSk;
import lawilliach.block.blocks.monsteregg.MonsterEggSkS;
import lawilliach.block.blocks.monsteregg.MonsterEggSl;
import lawilliach.block.blocks.monsteregg.MonsterEggSp;
import lawilliach.block.blocks.monsteregg.MonsterEggSpC;
import lawilliach.block.blocks.monsteregg.MonsterEggW;
import lawilliach.block.blocks.monsteregg.MonsterEggX;
import lawilliach.block.blocks.monsteregg.MonsterEggZ;
import lawilliach.block.blocks.monsteregg.MonsterEggZC;
import net.minecraft.creativetab.CreativeTabs;

public class AmeBlockRegistry {
	public static void initBlocks() {
		/* モンスターエッグ */
		// クリーパー（spawn_egg：50）
		AmeBlocks.blockMonsterEggC = new MonsterEggC()
			.setCreativeTab(CreativeTabs.tabDecorations)
			.setBlockName("blockMonsterEggC")
			.setBlockTextureName("stone");
		GameRegistry.registerBlock(AmeBlocks.blockMonsterEggC, "blockMonsterEggC");

		// 弓スケルトン（spawn_egg：51）
		AmeBlocks.blockMonsterEggSk = new MonsterEggSk()
			.setCreativeTab(CreativeTabs.tabDecorations)
			.setBlockName("blockMonsterEggSk")
			.setBlockTextureName("stone");
		GameRegistry.registerBlock(AmeBlocks.blockMonsterEggSk, "blockMonsterEggSk");

		// 剣スケルトン（spawn_egg：51）
		AmeBlocks.blockMonsterEggSkS = new MonsterEggSkS()
			.setCreativeTab(CreativeTabs.tabDecorations)
			.setBlockName("blockMonsterEggSkS")
			.setBlockTextureName("stone");
		GameRegistry.registerBlock(AmeBlocks.blockMonsterEggSkS, "blockMonsterEggSkS");

		// スライム（spawn_egg：55）
		AmeBlocks.blockMonsterEggSl = new MonsterEggSl()
			.setCreativeTab(CreativeTabs.tabDecorations)
			.setBlockName("blockMonsterEggSl")
			.setBlockTextureName("stone");
		GameRegistry.registerBlock(AmeBlocks.blockMonsterEggSl, "blockMonsterEggSl");

		// クモ（spawn_egg：52）
		AmeBlocks.blockMonsterEggSp = new MonsterEggSp()
			.setCreativeTab(CreativeTabs.tabDecorations)
			.setBlockName("blockMonsterEggSp")
			.setBlockTextureName("stone");
		GameRegistry.registerBlock(AmeBlocks.blockMonsterEggSp, "blockMonsterEggSp");

		// 洞窟グモ（spawn_egg：59）
		AmeBlocks.blockMonsterEggSpC = new MonsterEggSpC()
			.setCreativeTab(CreativeTabs.tabDecorations)
			.setBlockName("blockMonsterEggSpC")
			.setBlockTextureName("stone");
		GameRegistry.registerBlock(AmeBlocks.blockMonsterEggSpC, "blockMonsterEggSpC");

		// ウィッチ（spawn_egg：66）
		AmeBlocks.blockMonsterEggW = new MonsterEggW()
			.setCreativeTab(CreativeTabs.tabDecorations)
			.setBlockName("blockMonsterEggW")
			.setBlockTextureName("stone");
		GameRegistry.registerBlock(AmeBlocks.blockMonsterEggW, "blockMonsterEggW");

		// モンスターエッグX
		AmeBlocks.blockMonsterEggX = new MonsterEggX()
			.setCreativeTab(CreativeTabs.tabDecorations)
			.setBlockName("blockMonsterEggX")
			.setBlockTextureName("stone");
		GameRegistry.registerBlock(AmeBlocks.blockMonsterEggX, "blockMonsterEggX");

		// ゾンビ（spawn_egg：54）
		AmeBlocks.blockMonsterEggZ = new MonsterEggZ()
			.setCreativeTab(CreativeTabs.tabDecorations)
			.setBlockName("blockMonsterEggZ")
			.setBlockTextureName("stone");
		GameRegistry.registerBlock(AmeBlocks.blockMonsterEggZ, "blockMonsterEggZ");

		// 子どもゾンビ（spawn_egg：54）
		AmeBlocks.blockMonsterEggZC = new MonsterEggZC()
			.setCreativeTab(CreativeTabs.tabDecorations)
			.setBlockName("blockMonsterEggZC")
			.setBlockTextureName("stone");
		GameRegistry.registerBlock(AmeBlocks.blockMonsterEggZC, "blockMonsterEggZC");


		/* その他の追加ブロック */
		// 落とし穴ブロック
		AmeBlocks.blockPitfallBlock = new PitfallBlock()
			.setCreativeTab(CreativeTabs.tabDecorations)
			.setBlockName("blockPitfallBlock")
			.setBlockTextureName("stone");
		GameRegistry.registerBlock(AmeBlocks.blockPitfallBlock, "blockPitfallBlock");

		// 溶岩ブロック
		AmeBlocks.blockLavaBlock = new LavaBlock()
			.setCreativeTab(CreativeTabs.tabDecorations)
			.setBlockName("blockLavaBlock")
			.setBlockTextureName("stone");
		GameRegistry.registerBlock(AmeBlocks.blockLavaBlock, "blockLavaBlock");

		// TNTブロック
		AmeBlocks.blockTNTBlock = new TNTBlock()
			.setCreativeTab(CreativeTabs.tabDecorations)
			.setBlockName("blockTNTBlock")
			.setBlockTextureName("stone");
		GameRegistry.registerBlock(AmeBlocks.blockTNTBlock, "blockTNTBlock");
	}
}
