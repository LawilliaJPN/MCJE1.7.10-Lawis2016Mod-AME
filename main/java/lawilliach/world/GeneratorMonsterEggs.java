package lawilliach.world;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import lawilliach.api.AmeBlocks;
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
		// モンスターエッグ生成（Hard版はi<Xに+5 or 10。すべてNumberofBlockの引数に+2）
		for(int i = 0; i < 30; i++) { // Normal版はi < 20
			int genX = x + random.nextInt(16);
			int genY = 1 + random.nextInt(30); // クリーパー：Y=01～30 鉄ピッケル
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockMonsterEggC, 0, 6, Blocks.stone).generate(world, random, genX, genY, genZ);
		}

		for(int i = 0; i < 25; i++) { // Normal版はi < 20
			int genX = x + random.nextInt(16);
			int genY = 1 + random.nextInt(30); // 弓スケルトン：Y=01～30 鉄ピッケル
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockMonsterEggSk, 0, 6, Blocks.stone).generate(world, random, genX, genY, genZ);
		}

		for(int i = 0; i < 40; i++) { // Normal版はi < 30
			int genX = x + random.nextInt(16);
			int genY = 31 + random.nextInt(40); // 剣スケルトン：Y=31～70 石ピッケル
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockMonsterEggSkS, 0, 6, Blocks.stone).generate(world, random, genX, genY, genZ);
		}

		for(int i = 0; i < 20; i++) { // スライムとウィッチは半分 Normal版はi < 15
			int genX = x + random.nextInt(16);
			int genY = 31 + random.nextInt(40); // スライム：Y=31～70 石ピッケル
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockMonsterEggSl, 0, 6, Blocks.stone).generate(world, random, genX, genY, genZ);
		}

		for(int i = 0; i < 35; i++) { // Normal版はi < 30
			int genX = x + random.nextInt(16);
			int genY = 51 + random.nextInt(40); // クモ：Y=51～90 木ピッケル
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockMonsterEggSp, 0, 6, Blocks.stone).generate(world, random, genX, genY, genZ);
		}

		for(int i = 0; i < 35; i++) { // Normal版はi < 30
			int genX = x + random.nextInt(16);
			int genY = 11 + random.nextInt(40); // 洞窟蜘蛛：Y=11～50 石ピッケル
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockMonsterEggSpC, 0, 10, Blocks.stone).generate(world, random, genX, genY, genZ);
		}

		for(int i = 0; i < 15; i++) { // スライムとウィッチは半分 Normal版はi < 10
			int genX = x + random.nextInt(16);
			int genY = 71 + random.nextInt(30); // ウィッチ：Y=71～100 石ピッケル
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockMonsterEggW, 0, 6, Blocks.stone).generate(world, random, genX, genY, genZ);
		}

		for(int i = 0; i < 40; i++) { // Normal版はi < 30
			int genX = x + random.nextInt(16);
			int genY = 51 + random.nextInt(40); // ゾンビ：Y=51～90 木ピッケル
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockMonsterEggZ, 0, 6, Blocks.stone).generate(world, random, genX, genY, genZ);
		}

		for(int i = 0; i < 35; i++) { // Normal版はi < 30
			int genX = x + random.nextInt(16);
			int genY = 11 + random.nextInt(40); // 子ゾンビ：Y=11～50 石ピッケル
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockMonsterEggZC, 0, 10, Blocks.stone).generate(world, random, genX, genY, genZ);
		}

		// 以下Hard版のみ
		for(int i = 0; i < 20; i++) {
			int genX = x + random.nextInt(16);
			int genY = 1 + random.nextInt(40); // 黒曜石：Y=01～40
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(Blocks.obsidian, 0, 16, Blocks.stone).generate(world, random, genX, genY, genZ);
		}
		
		for(int i = 0; i < 30; i++) {
			int genX = x + random.nextInt(16);
			int genY = 21 + random.nextInt(40); // 落とし穴ブロック：Y=21～60
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockPitfallBlock, 0, 12, Blocks.stone).generate(world, random, genX, genY, genZ);
		}
		
		for(int i = 0; i < 25; i++) {
			int genX = x + random.nextInt(16);
			int genY = 6 + random.nextInt(30); // 溶岩ブロック：Y=06～35
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockLavaBlock, 0, 8, Blocks.stone).generate(world, random, genX, genY, genZ);
		}
		
		for(int i = 0; i < 30; i++) {
			int genX = x + random.nextInt(16);
			int genY = 11 + random.nextInt(40); // TNTブロック：Y=11～50
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(AmeBlocks.blockTNTBlock, 0, 4, Blocks.stone).generate(world, random, genX, genY, genZ);
		}
	}
}
