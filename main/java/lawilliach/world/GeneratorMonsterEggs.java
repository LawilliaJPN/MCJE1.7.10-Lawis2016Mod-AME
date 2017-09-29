package lawilliach.world;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import lawilliach.api.AmeBlocks;
import lawilliach.config.AmeConfigCore;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderSurface;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class GeneratorMonsterEggs implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider instanceof WorldProviderSurface) {
			generateOre(world, random, chunkX << 4, chunkZ << 4);
		}
	}

	private void generateOre(World world, Random random, int x, int z) {
		int c2 = AmeConfigCore.configWeight *2;
		int c5 = AmeConfigCore.configWeight *5;
		int c10 = AmeConfigCore.configWeight *10;

		/* モンスターエッグの生成 */
		// クリーパー：Y=01～30 鉄ピッケル
		for(int i = 0; i < 10 +c10; i++) {
			int genX = x + random.nextInt(16);
			int genY = 1 + random.nextInt(30);
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockMonsterEggC, 0, 4 +c2, Blocks.stone).generate(world, random, genX, genY, genZ);
		}

		// 弓スケルトン：Y=01～30 鉄ピッケル
		for(int i = 0; i < 15 +c5; i++) {
			int genX = x + random.nextInt(16);
			int genY = 1 + random.nextInt(30);
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockMonsterEggSk, 0, 4 +c2, Blocks.stone).generate(world, random, genX, genY, genZ);
		}

		// 剣スケルトン：Y=31～70 石ピッケル
		for(int i = 0; i < 20 +c10; i++) {
			int genX = x + random.nextInt(16);
			int genY = 31 + random.nextInt(40);
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockMonsterEggSkS, 0, 4 +c2, Blocks.stone).generate(world, random, genX, genY, genZ);
		}

		// スライム：Y=31～70 石ピッケル
		for(int i = 0; i < 10 +c5; i++) {
			int genX = x + random.nextInt(16);
			int genY = 31 + random.nextInt(40);
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockMonsterEggSl, 0, 4 +c2, Blocks.stone).generate(world, random, genX, genY, genZ);
		}

		// クモ：Y=51～90 木ピッケル
		for(int i = 0; i < 25 +c5; i++) {
			int genX = x + random.nextInt(16);
			int genY = 51 + random.nextInt(40);
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockMonsterEggSp, 0, 4 +c2, Blocks.stone).generate(world, random, genX, genY, genZ);
		}

		// 洞窟蜘蛛：Y=11～50 石ピッケル
		for(int i = 0; i < 25 +c5; i++) {
			int genX = x + random.nextInt(16);
			int genY = 11 + random.nextInt(40);
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockMonsterEggSpC, 0, 6 +c2, Blocks.stone).generate(world, random, genX, genY, genZ);
		}

		// ウィッチ：Y=71～100 石ピッケル
		for(int i = 0; i < 5 +c5; i++) {
			int genX = x + random.nextInt(16);
			int genY = 71 + random.nextInt(30);
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockMonsterEggW, 0, 4 +c2, Blocks.stone).generate(world, random, genX, genY, genZ);
		}

		// ゾンビ：Y=51～90 木ピッケル
		for(int i = 0; i < 20 +c10; i++) {
			int genX = x + random.nextInt(16);
			int genY = 51 + random.nextInt(40);
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockMonsterEggZ, 0, 4 +c2, Blocks.stone).generate(world, random, genX, genY, genZ);
		}

		// 子ゾンビ：Y=11～50 石ピッケル
		for(int i = 0; i < 25 +c5; i++) {
			int genX = x + random.nextInt(16);
			int genY = 11 + random.nextInt(40);
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockMonsterEggZC, 0, 6 +c2, Blocks.stone).generate(world, random, genX, genY, genZ);
		}

		/* モンスターエッグ以外の生成 */
		if (AmeConfigCore.isConfigSpecial) {
			// 黒曜石：Y=01～40
			for(int i = 0; i < 10 +c5; i++) {
				int genX = x + random.nextInt(16);
				int genY = 1 + random.nextInt(40);
				int genZ = z + random.nextInt(16);
				new WorldGenMinable(Blocks.obsidian, 0, 10 +c2, Blocks.stone).generate(world, random, genX, genY, genZ);
			}

			// 落とし穴ブロック：Y=21～60
			for(int i = 0; i < 20 +c5; i++) {
				int genX = x + random.nextInt(16);
				int genY = 21 + random.nextInt(40);
				int genZ = z + random.nextInt(16);
				new WorldGenMinable(AmeBlocks.blockPitfallBlock, 0, 6 +c2, Blocks.stone).generate(world, random, genX, genY, genZ);
			}

			// 溶岩ブロック：Y=06～35
			for(int i = 0; i < 15 +c5; i++) {
				int genX = x + random.nextInt(16);
				int genY = 6 + random.nextInt(30);
				int genZ = z + random.nextInt(16);
				new WorldGenMinable(AmeBlocks.blockLavaBlock, 0, 4 +c2, Blocks.stone).generate(world, random, genX, genY, genZ);
			}

			// TNTブロック：Y=11～50
			for(int i = 0; i < 20 + c5; i++) {
				int genX = x + random.nextInt(16);
				int genY = 11 + random.nextInt(40);
				int genZ = z + random.nextInt(16);
				new WorldGenMinable(AmeBlocks.blockTNTBlock, 0, 4 +c2, Blocks.stone).generate(world, random, genX, genY, genZ);
			}
		}
	}
}
