package lawilliach.block.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class PitfallBlock extends Block {
	public PitfallBlock() {
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

	// ブロックを壊したときに下のブロックを破壊
	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
       if (!world.isRemote) {
			int r = new java.util.Random().nextInt(4);
    	    // 同じ高さ
    	    world.setBlockToAir(x + 1, y, z);
    	    world.setBlockToAir(x, y, z + 1);
    	    world.setBlockToAir(x - 1, y, z);
    	    world.setBlockToAir(x, y, z - 1);
    	    world.setBlockToAir(x + 1, y, z -1);
    	    world.setBlockToAir(x + 1, y, z + 1);
    	    world.setBlockToAir(x - 1, y, z + 1);
    	    world.setBlockToAir(x - 1, y, z - 1);
    	    // 1マス下の高さ
    	    world.setBlockToAir(x, y - 1, z);
    	    world.setBlockToAir(x + 1, y - 1, z);
    	    world.setBlockToAir(x, y - 1, z + 1);
    	    world.setBlockToAir(x - 1, y - 1, z);
    	    world.setBlockToAir(x, y - 1, z - 1);
    	    world.setBlockToAir(x + 1, y - 1, z -1);
    	    world.setBlockToAir(x + 1, y - 1, z + 1);
    	    world.setBlockToAir(x - 1, y - 1, z + 1);
    	    world.setBlockToAir(x - 1, y - 1, z - 1);
    	    // 2マス下の高さ(十字)
    	    world.setBlockToAir(x, y - 2, z);
    	    world.setBlockToAir(x + 1, y - 2, z);
    	    world.setBlockToAir(x, y - 2, z + 1);
    	    world.setBlockToAir(x - 1, y - 2, z);
    	    world.setBlockToAir(x, y - 2, z - 1);
    	    if(r >= 1) {
    	    	// 2マス下の高さ(斜め)
	    	    world.setBlockToAir(x + 1, y - 2, z -1);
	    	    world.setBlockToAir(x + 1, y - 2, z + 1);
	    	    world.setBlockToAir(x - 1, y - 2, z + 1);
	    	    world.setBlockToAir(x - 1, y - 2, z - 1);
	    	    // 3マス下の高さ(十字)
	    	    world.setBlockToAir(x, y - 3, z);
	    	    world.setBlockToAir(x + 1, y - 3, z);
	    	    world.setBlockToAir(x, y - 3, z + 1);
	    	    world.setBlockToAir(x - 1, y - 3, z);
	    	    world.setBlockToAir(x, y - 3, z - 1);
	    	    if(r >= 2) {
	    	    	// 3マス下の高さ(斜め)
		    	    world.setBlockToAir(x + 1, y - 3, z -1);
		    	    world.setBlockToAir(x + 1, y - 3, z + 1);
		    	    world.setBlockToAir(x - 1, y - 3, z + 1);
		    	    world.setBlockToAir(x - 1, y - 3, z - 1);
		    	    // 4マス下の高さ(十字)
		    	    world.setBlockToAir(x, y - 4, z);
		    	    world.setBlockToAir(x + 1, y - 4, z);
		    	    world.setBlockToAir(x, y - 4, z + 1);
		    	    world.setBlockToAir(x - 1, y - 4, z);
		    	    world.setBlockToAir(x, y - 4, z - 1);
		    	    if(r >=3) {
		    	    	// 4マス下の高さ(斜め)
			    	    world.setBlockToAir(x + 1, y - 4, z -1);
			    	    world.setBlockToAir(x + 1, y - 4, z + 1);
			    	    world.setBlockToAir(x - 1, y - 4, z + 1);
			    	    world.setBlockToAir(x - 1, y - 4, z - 1);
			    	    // 5マス下の高さ(十字)
			    	    world.setBlockToAir(x, y - 5, z);
			    	    world.setBlockToAir(x + 1, y - 5, z);
			    	    world.setBlockToAir(x, y - 5, z + 1);
			    	    world.setBlockToAir(x - 1, y - 5, z);
			    	    world.setBlockToAir(x, y - 5, z - 1);
		    	    }
	    	    }
    	    }
        }
        super.onBlockDestroyedByPlayer(world, x, y, z, meta);
	}

	// ブロックが爆発されたときの処理
	@Override
    public void onBlockDestroyedByExplosion(World world, int x, int y, int z, Explosion explosion) {
		if (!world.isRemote) {
			int re = new java.util.Random().nextInt(4);
			if(re == 0) {
				world.setBlockToAir(x, y - 1, z + 1);
				world.setBlockToAir(x - 1, y - 2, z - 1);
				world.setBlockToAir(x + 1, y - 3, z);
				world.setBlockToAir(x, y - 1, z - 1);
				world.setBlockToAir(x - 1, y - 2, z + 1);
				world.setBlockToAir(x - 1, y - 3, z + 1);
			} else if(re == 1) {
				world.setBlockToAir(x + 1, y - 1, z);
	    		world.setBlockToAir(x + 1, y - 1, z + 1);
	    		world.setBlockToAir(x + 1, y - 2, z - 1);
	    		world.setBlockToAir(x - 1, y - 2, z);
	    		world.setBlockToAir(x + 1, y - 3, z + 1);
	    		world.setBlockToAir(x - 1, y - 3, z - 1);
			} else if(re == 2) {
				world.setBlockToAir(x + 1, y - 1, z - 1);
	    		world.setBlockToAir(x - 1, y - 1, z);
	    		world.setBlockToAir(x + 1, y - 2, z);
	    		world.setBlockToAir(x + 1, y - 2, z + 1);
	    		world.setBlockToAir(x, y - 3, z + 1);
	    		world.setBlockToAir(x + 1, y - 3, z - 1);
			} else if(re == 3) {
				world.setBlockToAir(x - 1, y - 1, z + 1);
	    		world.setBlockToAir(x - 1, y - 1, z - 1);
	    		world.setBlockToAir(x, y - 2, z + 1);
	    		world.setBlockToAir(x, y - 2, z - 1);
	    		world.setBlockToAir(x, y - 3, z - 1);
	    		world.setBlockToAir(x - 1, y - 3, z);
			}
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
