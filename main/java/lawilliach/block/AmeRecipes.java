package lawilliach.block;

import cpw.mods.fml.common.registry.GameRegistry;
import lawilliach.api.AmeBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class AmeRecipes {
	public static void initRecipes() {
		// モンスターエッグXのレシピ。（生成される9つのモンスターエッグを1つずつ、不定形レシピ。）
		GameRegistry.addShapelessRecipe(new ItemStack(AmeBlocks.blockMonsterEggX),
			       AmeBlocks.blockMonsterEggC,
			       AmeBlocks.blockMonsterEggSk,
			       AmeBlocks.blockMonsterEggSkS,
			       AmeBlocks.blockMonsterEggSl,
			       AmeBlocks.blockMonsterEggSp,
			       AmeBlocks.blockMonsterEggSpC,
			       AmeBlocks.blockMonsterEggW,
			       AmeBlocks.blockMonsterEggZ,
			       AmeBlocks.blockMonsterEggZC
		);

		// モンスターエッグを精錬して、それぞれに対応したスポーンエッグに。(精錬経験値はサボテン、ラピスラズリ相当。)
		GameRegistry.addSmelting(AmeBlocks.blockMonsterEggC,new ItemStack(Items.spawn_egg,1,50),0.2f); // クリーパー
		GameRegistry.addSmelting(AmeBlocks.blockMonsterEggSk,new ItemStack(Items.spawn_egg,1,51),0.2f); // スケルトン
		GameRegistry.addSmelting(AmeBlocks.blockMonsterEggSkS,new ItemStack(Items.spawn_egg,1,51),0.2f); // スケルトン
		GameRegistry.addSmelting(AmeBlocks.blockMonsterEggSl,new ItemStack(Items.spawn_egg,1,55),0.2f); // スライム
		GameRegistry.addSmelting(AmeBlocks.blockMonsterEggSp,new ItemStack(Items.spawn_egg,1,52),0.2f); // クモ
		GameRegistry.addSmelting(AmeBlocks.blockMonsterEggSpC,new ItemStack(Items.spawn_egg,1,59),0.2f); // 洞窟グモ
		GameRegistry.addSmelting(AmeBlocks.blockMonsterEggW,new ItemStack(Items.spawn_egg,1,66),0.2f); // ウィッチ
		GameRegistry.addSmelting(AmeBlocks.blockMonsterEggX,new ItemStack(Items.spawn_egg,1,58),0.2f); // エンダーマン
		GameRegistry.addSmelting(AmeBlocks.blockMonsterEggZ,new ItemStack(Items.spawn_egg,1,54),0.2f); // ゾンビ
		GameRegistry.addSmelting(AmeBlocks.blockMonsterEggZC,new ItemStack(Items.spawn_egg,1,54),0.2f); // ゾンビ

		/* スポーンエッグを利用した追加レシピ */
		// クリーパーのSE：砂とクラフトして、TNT
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.tnt),
					Blocks.sand,
					new ItemStack(Items.spawn_egg,1,50)
		);

		// クリーパーのSE：石とクラフトしてTNTブロック(Hard版only)
		GameRegistry.addShapelessRecipe(new ItemStack(AmeBlocks.blockTNTBlock),
				Blocks.stone,
				new ItemStack(Items.spawn_egg,1,50)
		);

		// TNTブロックを精錬して、火薬2つ
		GameRegistry.addSmelting(AmeBlocks.blockTNTBlock,new ItemStack(Items.gunpowder,2,0),0.1f);

		// スケルトンのSE：骨粉4つ
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,4,15),
				new ItemStack(Items.spawn_egg,1,51)
		);

		// クリーパー×スケルトンのSE：キチレコ
		GameRegistry.addShapelessRecipe(new ItemStack(Items.record_13),
					new ItemStack(Items.spawn_egg,1,50),
					new ItemStack(Items.spawn_egg,1,51)
		);

		// スライムのSE：粘着ピストンの作成
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sticky_piston),
					Blocks.cobblestone,
					Items.redstone,
					new ItemStack(Items.spawn_egg,1,55)
		);

		// スケルトン×クモor洞窟グモのSE：弓
		GameRegistry.addShapelessRecipe(new ItemStack(Items.bow),
					new ItemStack(Items.spawn_egg,1,51),
					new ItemStack(Items.spawn_egg,1,52)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.bow),
					new ItemStack(Items.spawn_egg,1,51),
					new ItemStack(Items.spawn_egg,1,59)
		);

		// クモor洞窟グモのSE：糸2つ
		GameRegistry.addShapelessRecipe(new ItemStack(Items.string,2,0),
					new ItemStack(Items.spawn_egg,1,52)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.string,2,0),
					new ItemStack(Items.spawn_egg,1,59)
		);

		// クモのSE：「腐った肉」や「青くなったジャガイモ」とクラフトして「発酵したクモの目」
		GameRegistry.addShapelessRecipe(new ItemStack(Items.fermented_spider_eye),
					new ItemStack(Items.spawn_egg,1,52),
					Items.rotten_flesh
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.fermented_spider_eye),
					new ItemStack(Items.spawn_egg,1,52),
					Items.poisonous_potato
		);

		// 洞窟グモのSE：精錬すると、発酵したクモの目
		GameRegistry.addSmelting(new ItemStack(Items.spawn_egg,1,59),new ItemStack(Items.fermented_spider_eye),0.1f);

		// ウィッチのSE：精錬すると、グロウストーンダスト
		GameRegistry.addSmelting(new ItemStack(Items.spawn_egg,1,66),new ItemStack(Items.glowstone_dust),0.1f);

		// ウィッチのSE：クラフトでレアドロップのポーション。
		GameRegistry.addShapelessRecipe(new ItemStack(Items.potionitem,1,8197), // 治癒
					new ItemStack(Items.spawn_egg,1,66),
					Items.gold_ingot
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.potionitem,1,8194), // 俊敏
					new ItemStack(Items.spawn_egg,1,66),
					Items.sugar
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.potionitem,1,8195), // 耐火
					new ItemStack(Items.spawn_egg,1,66),
					new ItemStack(Items.spawn_egg,1,55) // スライムのSE
		);

		// クリーパー×ウィッチのSE：スプラッシュポーション。
		GameRegistry.addShapelessRecipe(new ItemStack(Items.potionitem,1,16389), // 治癒
					new ItemStack(Items.spawn_egg,1,66),
					new ItemStack(Items.spawn_egg,1,50),
					Items.gold_ingot
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.potionitem,1,16386), // 俊敏
					new ItemStack(Items.spawn_egg,1,66),
					new ItemStack(Items.spawn_egg,1,50),
					Items.sugar
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.potionitem,1,16387), // 耐火
					new ItemStack(Items.spawn_egg,1,66),
					new ItemStack(Items.spawn_egg,1,50),
					new ItemStack(Items.spawn_egg,1,55) // スライムのSE
		);

		// エンダーマンのSE：エンダーチェストのレシピのエンダーパールの代わりに
		GameRegistry.addRecipe(new ItemStack(Blocks.ender_chest),
					"OOO",
					"OEO",
					"OOO",
					'O',Blocks.obsidian,
					'E',new ItemStack(Items.spawn_egg,1,58)
        );

		// ゾンビのSE：精錬すると、革
		GameRegistry.addSmelting(new ItemStack(Items.spawn_egg,1,54),new ItemStack(Items.leather),0.1f);

		// ゾンビのSE：エメラルドとクラフトで、ジャガイモとニンジン。
		GameRegistry.addShapelessRecipe(new ItemStack(Items.potato),
					new ItemStack(Items.spawn_egg,1,54),
					Blocks.emerald_block
		);
		GameRegistry.addRecipe(new ItemStack(Items.carrot),
					"OOO",
					"OEO",
					"OOO",
					'O',Items.emerald,
					'E',new ItemStack(Items.spawn_egg,1,54)
		);
	}
}
