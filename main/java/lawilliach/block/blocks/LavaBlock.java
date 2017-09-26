package lawilliach.block.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class LavaBlock extends Block {
	public LavaBlock() {
        super(Material.rock);
	    // ブロックの特性の設定
	    // ブロックの硬さ (黒曜石50.0F、鉱石3.0F、石1.5F、土0.5F)
	    setHardness(0.5F); // バニラの土と同等
	    // 爆発耐性（黒曜石2000.0F、石30.0F、鉱石15.0F、土2.5F）
	    setResistance(2.5F); // バニラの土と同等
	    // ブロックの上を歩いた音
	    setStepSound(Block.soundTypeStone);
		// 適正ツールの設定(0:木、1:石、2:鉄、3:ダイヤ)
		this.setHarvestLevel("pickaxe", 1);
	    // ブロックの明るさ(×15した値が光源レベル)
	    setLightLevel(0.0F);
	}

	// ブロックを壊したときに溶岩が流れる
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

	    	    world.setBlock(x, y, z, Blocks.flowing_lava, 0, 2);
	        }
	        super.onBlockDestroyedByPlayer(world, x, y, z, meta);
	}

	// ブロックが爆発されたときの処理
	@Override
    public void onBlockDestroyedByExplosion(World world, int x, int y, int z, Explosion explosion) {
    		if (!world.isRemote) {
	    		world.setBlock(x, y, z, Blocks.flowing_lava, 0, 2);
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
