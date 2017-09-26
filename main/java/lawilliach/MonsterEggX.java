package lawilliach;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class MonsterEggX extends Block {

	protected MonsterEggX() {
        super(Material.rock);
	    //ブロックの特性の設定
	    //ブロックの硬さ (黒曜石50.0F、鉱石3.0F、石1.5F、土0.5F)
	    setHardness(0.75F); //バニラのモンスターエッグと同等
	    //爆発耐性（黒曜石2000.0F、石30.0F、鉱石15.0F、土2.5F）
	    setResistance(3.75F); //バニラのモンスターエッグと同等
	    //ブロックの上を歩いた音
	    setStepSound(Block.soundTypeStone);
		//適正ツールの設定(0:木、1:石、2:鉄、3:ダイヤ)
		this.setHarvestLevel("pickaxe", 2);
	    //ブロックの明るさ(×15した値が光源レベル)
	    setLightLevel(0.0F);
	}

	//BlockSilverfish.classを参考に、ブロックを壊したときに？？？を召喚
	public void onBlockDestroyedByPlayer(World p_149664_1_, int p_149664_2_, int p_149664_3_, int p_149664_4_, int p_149664_5_)
	{
	       if (!p_149664_1_.isRemote){
	    	   int r = new java.util.Random().nextInt(10);

	    	   if(r == 0){
		    	   EntityBat entitybat = new EntityBat(p_149664_1_);
		           entitybat.setLocationAndAngles((double)p_149664_2_ + 0.5D, (double)p_149664_3_, (double)p_149664_4_ + 0.5D, 0.0F, 0.0F);
		           entitybat.onSpawnWithEgg((IEntityLivingData)null);
		           p_149664_1_.spawnEntityInWorld(entitybat);
		           entitybat.spawnExplosionParticle();
	    	   } else if(r == 1){
		    	   EntityChicken entitychicken = new EntityChicken(p_149664_1_);
		           entitychicken.setLocationAndAngles((double)p_149664_2_ + 0.5D, (double)p_149664_3_, (double)p_149664_4_ + 0.5D, 0.0F, 0.0F);
		           entitychicken.onSpawnWithEgg((IEntityLivingData)null);
		           p_149664_1_.spawnEntityInWorld(entitychicken);
		           entitychicken.spawnExplosionParticle();
	    	   } else if(r == 2){
		    	   EntityCow entitycow = new EntityCow(p_149664_1_);
		           entitycow.setLocationAndAngles((double)p_149664_2_ + 0.5D, (double)p_149664_3_, (double)p_149664_4_ + 0.5D, 0.0F, 0.0F);
		           entitycow.onSpawnWithEgg((IEntityLivingData)null);
		           p_149664_1_.spawnEntityInWorld(entitycow);
		           entitycow.spawnExplosionParticle();
	    	   } else if(r == 3){
		    	   EntityHorse entityhorse = new EntityHorse(p_149664_1_);
		           entityhorse.setLocationAndAngles((double)p_149664_2_ + 0.5D, (double)p_149664_3_, (double)p_149664_4_ + 0.5D, 0.0F, 0.0F);
		           entityhorse.onSpawnWithEgg((IEntityLivingData)null);
		           p_149664_1_.spawnEntityInWorld(entityhorse);
		           entityhorse.spawnExplosionParticle();
	    	   } else if(r == 4){
		    	   EntityMooshroom entitymooshroom = new EntityMooshroom(p_149664_1_);
		           entitymooshroom.setLocationAndAngles((double)p_149664_2_ + 0.5D, (double)p_149664_3_, (double)p_149664_4_ + 0.5D, 0.0F, 0.0F);
		           entitymooshroom.onSpawnWithEgg((IEntityLivingData)null);
		           p_149664_1_.spawnEntityInWorld(entitymooshroom);
		           entitymooshroom.spawnExplosionParticle();
	    	   } else if(r == 5){
		    	   EntityOcelot entityocelot = new EntityOcelot(p_149664_1_);
		           entityocelot.setLocationAndAngles((double)p_149664_2_ + 0.5D, (double)p_149664_3_, (double)p_149664_4_ + 0.5D, 0.0F, 0.0F);
		           entityocelot.onSpawnWithEgg((IEntityLivingData)null);
		           p_149664_1_.spawnEntityInWorld(entityocelot);
		           entityocelot.spawnExplosionParticle();
	    	   } else if(r == 6){
		    	   EntityPig entitypig = new EntityPig(p_149664_1_);
		           entitypig.setLocationAndAngles((double)p_149664_2_ + 0.5D, (double)p_149664_3_, (double)p_149664_4_ + 0.5D, 0.0F, 0.0F);
		           entitypig.onSpawnWithEgg((IEntityLivingData)null);
		           p_149664_1_.spawnEntityInWorld(entitypig);
		           entitypig.spawnExplosionParticle();
	    	   } else if(r == 7){
		    	   EntitySheep entitysheep = new EntitySheep(p_149664_1_);
		           entitysheep.setLocationAndAngles((double)p_149664_2_ + 0.5D, (double)p_149664_3_, (double)p_149664_4_ + 0.5D, 0.0F, 0.0F);
		           entitysheep.onSpawnWithEgg((IEntityLivingData)null);
		           p_149664_1_.spawnEntityInWorld(entitysheep);
		           entitysheep.spawnExplosionParticle();
	    	   } else if(r == 8){
		    	   EntityVillager entityvillager = new EntityVillager(p_149664_1_);
		           entityvillager.setLocationAndAngles((double)p_149664_2_ + 0.5D, (double)p_149664_3_, (double)p_149664_4_ + 0.5D, 0.0F, 0.0F);
		           entityvillager.onSpawnWithEgg((IEntityLivingData)null);
		           p_149664_1_.spawnEntityInWorld(entityvillager);
		           entityvillager.spawnExplosionParticle();
	    	   } else if(r == 9){
		    	   EntityWolf entitywolf = new EntityWolf(p_149664_1_);
		           entitywolf.setLocationAndAngles((double)p_149664_2_ + 0.5D, (double)p_149664_3_, (double)p_149664_4_ + 0.5D, 0.0F, 0.0F);
		           entitywolf.onSpawnWithEgg((IEntityLivingData)null);
		           p_149664_1_.spawnEntityInWorld(entitywolf);
		           entitywolf.spawnExplosionParticle();
	    	   }
	    	   /*
	    	   Entity entity = new Entity(p_149664_1_);
	           entity.setLocationAndAngles((double)p_149664_2_ + 0.5D, (double)p_149664_3_, (double)p_149664_4_ + 0.5D, 0.0F, 0.0F);
	           entity.onSpawnWithEgg((IEntityLivingData)null);
	           p_149664_1_.spawnEntityInWorld(entity);
	           entity.spawnExplosionParticle();
	           */
	       }
	       super.onBlockDestroyedByPlayer(p_149664_1_, p_149664_2_, p_149664_3_, p_149664_4_, p_149664_5_);
	}

	//破壊時のドロップアイテムなし
    public int quantityDropped(Random p_149745_1_)
    {
        return 0;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return null;
    }

    //シルクタッチ無効
    protected boolean canSilkHarvest(){
        return false;
    }
}