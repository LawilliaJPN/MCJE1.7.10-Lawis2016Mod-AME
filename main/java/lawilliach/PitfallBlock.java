package lawilliach;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class PitfallBlock extends Block {

	protected PitfallBlock() {
        super(Material.rock);
	    //ブロックの特性の設定
	    //ブロックの硬さ (黒曜石50.0F、鉱石3.0F、石1.5F、土0.5F)
	    setHardness(0.5F); //バニラの土と同等
	    //爆発耐性（黒曜石2000.0F、石30.0F、鉱石15.0F、土2.5F）
	    setResistance(2.5F); //バニラの土と同等
	    //ブロックの上を歩いた音
	    setStepSound(Block.soundTypeStone);
		//適正ツールの設定(0:木、1:石、2:鉄、3:ダイヤ)
		this.setHarvestLevel("pickaxe", 1);
	    //ブロックの明るさ(×15した値が光源レベル)
	    setLightLevel(0.0F);
	}

	//ブロックを壊したときに下のブロックを破壊
	public void onBlockDestroyedByPlayer(World p_149664_1_, int p_149664_2_, int p_149664_3_, int p_149664_4_, int p_149664_5_)
	{
	       if (!p_149664_1_.isRemote){
				int r = new java.util.Random().nextInt(4);
	    	    //同じ高さ
	    	    p_149664_1_.setBlockToAir(p_149664_2_ + 1, p_149664_3_, p_149664_4_);
	    	    p_149664_1_.setBlockToAir(p_149664_2_, p_149664_3_, p_149664_4_ + 1);
	    	    p_149664_1_.setBlockToAir(p_149664_2_ - 1, p_149664_3_, p_149664_4_);
	    	    p_149664_1_.setBlockToAir(p_149664_2_, p_149664_3_, p_149664_4_ - 1);
	    	    p_149664_1_.setBlockToAir(p_149664_2_ + 1, p_149664_3_, p_149664_4_ -1);
	    	    p_149664_1_.setBlockToAir(p_149664_2_ + 1, p_149664_3_, p_149664_4_ + 1);
	    	    p_149664_1_.setBlockToAir(p_149664_2_ - 1, p_149664_3_, p_149664_4_ + 1);
	    	    p_149664_1_.setBlockToAir(p_149664_2_ - 1, p_149664_3_, p_149664_4_ - 1);
	    	    //1マス下の高さ
	    	    p_149664_1_.setBlockToAir(p_149664_2_, p_149664_3_ - 1, p_149664_4_);
	    	    p_149664_1_.setBlockToAir(p_149664_2_ + 1, p_149664_3_ - 1, p_149664_4_);
	    	    p_149664_1_.setBlockToAir(p_149664_2_, p_149664_3_ - 1, p_149664_4_ + 1);
	    	    p_149664_1_.setBlockToAir(p_149664_2_ - 1, p_149664_3_ - 1, p_149664_4_);
	    	    p_149664_1_.setBlockToAir(p_149664_2_, p_149664_3_ - 1, p_149664_4_ - 1);
	    	    p_149664_1_.setBlockToAir(p_149664_2_ + 1, p_149664_3_ - 1, p_149664_4_ -1);
	    	    p_149664_1_.setBlockToAir(p_149664_2_ + 1, p_149664_3_ - 1, p_149664_4_ + 1);
	    	    p_149664_1_.setBlockToAir(p_149664_2_ - 1, p_149664_3_ - 1, p_149664_4_ + 1);
	    	    p_149664_1_.setBlockToAir(p_149664_2_ - 1, p_149664_3_ - 1, p_149664_4_ - 1);
	    	    //2マス下の高さ(十字)
	    	    p_149664_1_.setBlockToAir(p_149664_2_, p_149664_3_ - 2, p_149664_4_);
	    	    p_149664_1_.setBlockToAir(p_149664_2_ + 1, p_149664_3_ - 2, p_149664_4_);
	    	    p_149664_1_.setBlockToAir(p_149664_2_, p_149664_3_ - 2, p_149664_4_ + 1);
	    	    p_149664_1_.setBlockToAir(p_149664_2_ - 1, p_149664_3_ - 2, p_149664_4_);
	    	    p_149664_1_.setBlockToAir(p_149664_2_, p_149664_3_ - 2, p_149664_4_ - 1);
	    	    if(r >= 1){
	    	    	//2マス下の高さ(斜め)
		    	    p_149664_1_.setBlockToAir(p_149664_2_ + 1, p_149664_3_ - 2, p_149664_4_ -1);
		    	    p_149664_1_.setBlockToAir(p_149664_2_ + 1, p_149664_3_ - 2, p_149664_4_ + 1);
		    	    p_149664_1_.setBlockToAir(p_149664_2_ - 1, p_149664_3_ - 2, p_149664_4_ + 1);
		    	    p_149664_1_.setBlockToAir(p_149664_2_ - 1, p_149664_3_ - 2, p_149664_4_ - 1);
		    	    //3マス下の高さ(十字)
		    	    p_149664_1_.setBlockToAir(p_149664_2_, p_149664_3_ - 3, p_149664_4_);
		    	    p_149664_1_.setBlockToAir(p_149664_2_ + 1, p_149664_3_ - 3, p_149664_4_);
		    	    p_149664_1_.setBlockToAir(p_149664_2_, p_149664_3_ - 3, p_149664_4_ + 1);
		    	    p_149664_1_.setBlockToAir(p_149664_2_ - 1, p_149664_3_ - 3, p_149664_4_);
		    	    p_149664_1_.setBlockToAir(p_149664_2_, p_149664_3_ - 3, p_149664_4_ - 1);
		    	    if(r >= 2){
		    	    	//3マス下の高さ(斜め)
			    	    p_149664_1_.setBlockToAir(p_149664_2_ + 1, p_149664_3_ - 3, p_149664_4_ -1);
			    	    p_149664_1_.setBlockToAir(p_149664_2_ + 1, p_149664_3_ - 3, p_149664_4_ + 1);
			    	    p_149664_1_.setBlockToAir(p_149664_2_ - 1, p_149664_3_ - 3, p_149664_4_ + 1);
			    	    p_149664_1_.setBlockToAir(p_149664_2_ - 1, p_149664_3_ - 3, p_149664_4_ - 1);
			    	    //4マス下の高さ(十字)
			    	    p_149664_1_.setBlockToAir(p_149664_2_, p_149664_3_ - 4, p_149664_4_);
			    	    p_149664_1_.setBlockToAir(p_149664_2_ + 1, p_149664_3_ - 4, p_149664_4_);
			    	    p_149664_1_.setBlockToAir(p_149664_2_, p_149664_3_ - 4, p_149664_4_ + 1);
			    	    p_149664_1_.setBlockToAir(p_149664_2_ - 1, p_149664_3_ - 4, p_149664_4_);
			    	    p_149664_1_.setBlockToAir(p_149664_2_, p_149664_3_ - 4, p_149664_4_ - 1);
			    	    if(r >=3){
			    	    	//4マス下の高さ(斜め)
				    	    p_149664_1_.setBlockToAir(p_149664_2_ + 1, p_149664_3_ - 4, p_149664_4_ -1);
				    	    p_149664_1_.setBlockToAir(p_149664_2_ + 1, p_149664_3_ - 4, p_149664_4_ + 1);
				    	    p_149664_1_.setBlockToAir(p_149664_2_ - 1, p_149664_3_ - 4, p_149664_4_ + 1);
				    	    p_149664_1_.setBlockToAir(p_149664_2_ - 1, p_149664_3_ - 4, p_149664_4_ - 1);
				    	    //5マス下の高さ(十字)
				    	    p_149664_1_.setBlockToAir(p_149664_2_, p_149664_3_ - 5, p_149664_4_);
				    	    p_149664_1_.setBlockToAir(p_149664_2_ + 1, p_149664_3_ - 5, p_149664_4_);
				    	    p_149664_1_.setBlockToAir(p_149664_2_, p_149664_3_ - 5, p_149664_4_ + 1);
				    	    p_149664_1_.setBlockToAir(p_149664_2_ - 1, p_149664_3_ - 5, p_149664_4_);
				    	    p_149664_1_.setBlockToAir(p_149664_2_, p_149664_3_ - 5, p_149664_4_ - 1);
			    	    }
		    	    }
	    	    }
	        }
	        super.onBlockDestroyedByPlayer(p_149664_1_, p_149664_2_, p_149664_3_, p_149664_4_, p_149664_5_);
	}

	//ブロックが爆発されたときの処理
    public void onBlockDestroyedByExplosion(World world, int x, int y, int z, Explosion explosion)
    {
    		if (!world.isRemote){
    			int re = new java.util.Random().nextInt(4);
    			if(re == 0){
    				world.setBlockToAir(x, y - 1, z + 1);
    				world.setBlockToAir(x - 1, y - 2, z - 1);
    				world.setBlockToAir(x + 1, y - 3, z);
    				world.setBlockToAir(x, y - 1, z - 1);
    				world.setBlockToAir(x - 1, y - 2, z + 1);
    				world.setBlockToAir(x - 1, y - 3, z + 1);
    			} else if(re == 1){
    				world.setBlockToAir(x + 1, y - 1, z);
    	    		world.setBlockToAir(x + 1, y - 1, z + 1);
    	    		world.setBlockToAir(x + 1, y - 2, z - 1);
    	    		world.setBlockToAir(x - 1, y - 2, z);
    	    		world.setBlockToAir(x + 1, y - 3, z + 1);
    	    		world.setBlockToAir(x - 1, y - 3, z - 1);
    			} else if(re == 2){
    				world.setBlockToAir(x + 1, y - 1, z - 1);
    	    		world.setBlockToAir(x - 1, y - 1, z);
    	    		world.setBlockToAir(x + 1, y - 2, z);
    	    		world.setBlockToAir(x + 1, y - 2, z + 1);
    	    		world.setBlockToAir(x, y - 3, z + 1);
    	    		world.setBlockToAir(x + 1, y - 3, z - 1);
    			} else if(re == 3){
    				world.setBlockToAir(x - 1, y - 1, z + 1);
    	    		world.setBlockToAir(x - 1, y - 1, z - 1);
    	    		world.setBlockToAir(x, y - 2, z + 1);
    	    		world.setBlockToAir(x, y - 2, z - 1);
    	    		world.setBlockToAir(x, y - 3, z - 1);
    	    		world.setBlockToAir(x - 1, y - 3, z);
    			}
    		}
    }

	//破壊時のドロップアイテムを丸石に
	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
				return Item.getItemFromBlock(Blocks.cobblestone);
	}

    //シルクタッチ無効
    protected boolean canSilkHarvest(){
        return false;
    }
}
