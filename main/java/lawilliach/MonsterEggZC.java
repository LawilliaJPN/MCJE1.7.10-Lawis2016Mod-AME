package lawilliach;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class MonsterEggZC extends Block {

	protected MonsterEggZC() {
        super(Material.rock);
	    //ブロックの特性の設定
	    //ブロックの硬さ (黒曜石50.0F、鉱石3.0F、石1.5F、土0.5F)
	    setHardness(0.75F); //バニラのモンスターエッグと同等
	    //爆発耐性（黒曜石2000.0F、石30.0F、鉱石15.0F、土2.5F）
	    setResistance(3.75F); //バニラのモンスターエッグと同等
	    //ブロックの上を歩いた音
	    setStepSound(Block.soundTypeStone);
		//適正ツールの設定(0:木、1:石、2:鉄、3:ダイヤ)
		this.setHarvestLevel("pickaxe", 1);
	    //ブロックの明るさ(×15した値が光源レベル)
	    setLightLevel(0.0F);
	}

	//BlockSilverfish.classを参考に子どもゾンビを召喚
	public void onBlockDestroyedByPlayer(World p_149664_1_, int p_149664_2_, int p_149664_3_, int p_149664_4_, int p_149664_5_)
	{
			if (!p_149664_1_.isRemote){
	    	    p_149664_1_.setBlockToAir(p_149664_2_, p_149664_3_ + 1, p_149664_4_);

	    	    EntityZombie entityzombie = new EntityZombie(p_149664_1_);
	    	    entityzombie.setChild(true);
	            entityzombie.setLocationAndAngles((double)p_149664_2_ + 0.5D, (double)p_149664_3_, (double)p_149664_4_ + 0.5D, 0.0F, 0.0F);
	            p_149664_1_.spawnEntityInWorld(entityzombie);
	            entityzombie.spawnExplosionParticle();
			}
			super.onBlockDestroyedByPlayer(p_149664_1_, p_149664_2_, p_149664_3_, p_149664_4_, p_149664_5_);
	}

	//ブロックが爆発されたときの処理
    public void onBlockDestroyedByExplosion(World world, int x, int y, int z, Explosion explosion)
    {
    		if (!world.isRemote){
	    		world.setBlockToAir(x, y, z);
	    		world.setBlockToAir(x, y + 1, z);

	    		EntityZombie entityzombie = new EntityZombie(world);
	    	    entityzombie.setChild(true);
	    		entityzombie.setLocationAndAngles((double)x + 0.5D, (double)y, (double)z + 0.5D, 0.0F, 0.0F);
	    		world.spawnEntityInWorld(entityzombie);
	    		entityzombie.spawnExplosionParticle();
    		}
    }


	//破壊時のドロップアイテムを丸石orモンスターエッグに
	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
			int r = new java.util.Random().nextInt(10);

			if(r >= 7){ //30％の確率でモンスターエッグ自身をドロップ
				return Item.getItemFromBlock(AdditionalMonsterEggs.blockMonsterEggZC);
			} else {	//70％の確率で丸石をドロップ
				return Item.getItemFromBlock(Blocks.cobblestone);
			}
	}

}
