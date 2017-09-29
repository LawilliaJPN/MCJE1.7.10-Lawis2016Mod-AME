package lawilliach.block.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class TNTBlock extends AmeBlockBase {
	public TNTBlock() {
        super(Material.rock);
	    // ブロックの特性の設定
	    // ブロックの硬さ (黒曜石50.0F、鉱石3.0F、石1.5F、土0.5F)
	    setHardness(0.5F); // バニラの土と同等
	    // 爆発耐性（黒曜石2000.0F、石30.0F、鉱石15.0F、土2.5F）
	    setResistance(2000.0F); // 黒曜石と同等。
	    // ブロックの上を歩いた音
	    setStepSound(Block.soundTypeStone);
		// 適正ツールの設定(0:木、1:石、2:鉄、3:ダイヤ)
		this.setHarvestLevel("pickaxe", 1);
	    // ブロックの明るさ(×15した値が光源レベル)
	    setLightLevel(0.0F);
	}

	// BlockSilverfish.classを参考に、ブロックを壊したときに洞窟蜘蛛を召喚
	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
       if (!world.isRemote) {
    	    world.setBlockToAir(x, y + 1, z);

            EntityTNTPrimed entitytntprimed = new EntityTNTPrimed(world);
            entitytntprimed.setLocationAndAngles((double)x + 0.5D, (double)y + 1, (double)z + 0.5D, 0.0F, 0.0F);

    	    int r = new java.util.Random().nextInt(5);
            entitytntprimed.fuse = 40 + 10 * r  ; // 現れてから爆発するまでの時間

            world.spawnEntityInWorld(entitytntprimed);
        }
        super.onBlockDestroyedByPlayer(world, x, y, z, meta);
	}

	// ブロックが爆発されたときの処理
	@Override
    public void onBlockDestroyedByExplosion(World world, int x, int y, int z, Explosion explosion) {
		if (!world.isRemote) {
    		world.setBlockToAir(x, y, z);
    		world.setBlockToAir(x, y + 1, z);

    		EntityTNTPrimed entitytntprimed = new EntityTNTPrimed(world);
    		entitytntprimed.setLocationAndAngles((double)x + 0.5D, (double)y + 1, (double)z + 0.5D, 0.0F, 0.0F);

    	    int re = new java.util.Random().nextInt(4);
            entitytntprimed.fuse = 40 + 40 * re  ; // 現れてから爆発するまでの時間

    		world.spawnEntityInWorld(entitytntprimed);
		}
    }

	// 破壊時のドロップアイテムを丸石に
	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
		return Item.getItemFromBlock(Blocks.cobblestone);
	}

    // シルクタッチ無効
	@Override
    public boolean canSilkHarvest() {
        return false;
    }
}
