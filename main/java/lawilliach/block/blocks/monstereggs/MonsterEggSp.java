package lawilliach.block.blocks.monstereggs;

import java.util.Random;

import lawilliach.api.AmeBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class MonsterEggSp extends AmeMEBase {
	public MonsterEggSp() {
        super(Material.rock);
	    // ブロックの特性の設定
	    // ブロックの硬さ (黒曜石50.0F、鉱石3.0F、石1.5F、土0.5F)
	    setHardness(0.75F); // バニラのモンスターエッグと同等
	    // 爆発耐性（黒曜石2000.0F、石30.0F、鉱石15.0F、土2.5F）
	    setResistance(3.75F); // バニラのモンスターエッグと同等
	    // ブロックの上を歩いた音
	    setStepSound(Block.soundTypeStone);
		// 適正ツールの設定(0:木、1:石、2:鉄、3:ダイヤ)
		this.setHarvestLevel("pickaxe", 0);
	    // ブロックの明るさ(×15した値が光源レベル)
	    setLightLevel(0.0F);
	}

	// BlockSilverfish.classを参考に、ブロックを壊したときに蜘蛛を召喚
	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
	       if (!world.isRemote) {
	    	    world.setBlockToAir(x + 1, y, z);
	    	    world.setBlockToAir(x, y, z + 1);
	    	    world.setBlockToAir(x - 1, y, z);
	    	    world.setBlockToAir(x, y, z - 1);
	    	    world.setBlockToAir(x + 1, y, z -1);
	    	    world.setBlockToAir(x + 1, y, z + 1);
	    	    world.setBlockToAir(x - 1, y, z + 1);
	    	    world.setBlockToAir(x - 1, y, z - 1);

	            EntitySpider entityspider = new EntitySpider(world);
	            entityspider.setLocationAndAngles((double)x + 0.5D, (double)y, (double)z + 0.5D, 0.0F, 0.0F);
	            world.spawnEntityInWorld(entityspider);
	            entityspider.spawnExplosionParticle();
	        }
	        super.onBlockDestroyedByPlayer(world, x, y, z, meta);
	}

	// ブロックが爆発されたときの処理
	@Override
    public void onBlockDestroyedByExplosion(World world, int x, int y, int z, Explosion explosion) {
    		if (!world.isRemote) {
	    		world.setBlockToAir(x, y, z);
	    		world.setBlockToAir(x, y, z + 1);
	    		world.setBlockToAir(x, y, z - 1);
	    		world.setBlockToAir(x + 1, y, z);
	    		world.setBlockToAir(x + 1, y, z + 1);
	    		world.setBlockToAir(x + 1, y, z - 1);
	    		world.setBlockToAir(x - 1, y, z);
	    		world.setBlockToAir(x - 1, y, z + 1);
	    		world.setBlockToAir(x - 1, y, z - 1);

	    		EntitySpider entityspider = new EntitySpider(world);
	    		entityspider.setLocationAndAngles((double)x + 0.5D, (double)y, (double)z + 0.5D, 0.0F, 0.0F);
	    		world.spawnEntityInWorld(entityspider);
	    		entityspider.spawnExplosionParticle();
    		}
    }

	// 破壊時のドロップアイテムを丸石orモンスターエッグに
	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
			int r = new java.util.Random().nextInt(10);

			if(r >= 7) { // 30％の確率でモンスターエッグ自身をドロップ
				return Item.getItemFromBlock(AmeBlocks.blockMonsterEggSp);
			} else {	// 70％の確率で丸石をドロップ
				return Item.getItemFromBlock(Blocks.cobblestone);
			}
	}

}
