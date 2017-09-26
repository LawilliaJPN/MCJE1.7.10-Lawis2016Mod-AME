package lawilliach.block.blocks;

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
	public MonsterEggX() {
        super(Material.rock);
	    // ブロックの特性の設定
	    // ブロックの硬さ (黒曜石50.0F、鉱石3.0F、石1.5F、土0.5F)
	    setHardness(0.75F); // バニラのモンスターエッグと同等
	    // 爆発耐性（黒曜石2000.0F、石30.0F、鉱石15.0F、土2.5F）
	    setResistance(3.75F); // バニラのモンスターエッグと同等
	    // ブロックの上を歩いた音
	    setStepSound(Block.soundTypeStone);
		// 適正ツールの設定(0:木、1:石、2:鉄、3:ダイヤ)
		this.setHarvestLevel("pickaxe", 2);
	    // ブロックの明るさ(×15した値が光源レベル)
	    setLightLevel(0.0F);
	}

	// BlockSilverfish.classを参考に、ブロックを壊したときに？？？を召喚
	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
       if (!world.isRemote) {
    	   int r = new java.util.Random().nextInt(10);

    	   if(r == 0) {
	    	   EntityBat entitybat = new EntityBat(world);
	           entitybat.setLocationAndAngles((double)x + 0.5D, (double)y, (double)z + 0.5D, 0.0F, 0.0F);
	           entitybat.onSpawnWithEgg((IEntityLivingData)null);
	           world.spawnEntityInWorld(entitybat);
	           entitybat.spawnExplosionParticle();
    	   } else if(r == 1) {
	    	   EntityChicken entitychicken = new EntityChicken(world);
	           entitychicken.setLocationAndAngles((double)x + 0.5D, (double)y, (double)z + 0.5D, 0.0F, 0.0F);
	           entitychicken.onSpawnWithEgg((IEntityLivingData)null);
	           world.spawnEntityInWorld(entitychicken);
	           entitychicken.spawnExplosionParticle();
    	   } else if(r == 2) {
	    	   EntityCow entitycow = new EntityCow(world);
	           entitycow.setLocationAndAngles((double)x + 0.5D, (double)y, (double)z + 0.5D, 0.0F, 0.0F);
	           entitycow.onSpawnWithEgg((IEntityLivingData)null);
	           world.spawnEntityInWorld(entitycow);
	           entitycow.spawnExplosionParticle();
    	   } else if(r == 3) {
	    	   EntityHorse entityhorse = new EntityHorse(world);
	           entityhorse.setLocationAndAngles((double)x + 0.5D, (double)y, (double)z + 0.5D, 0.0F, 0.0F);
	           entityhorse.onSpawnWithEgg((IEntityLivingData)null);
	           world.spawnEntityInWorld(entityhorse);
	           entityhorse.spawnExplosionParticle();
    	   } else if(r == 4) {
	    	   EntityMooshroom entitymooshroom = new EntityMooshroom(world);
	           entitymooshroom.setLocationAndAngles((double)x + 0.5D, (double)y, (double)z + 0.5D, 0.0F, 0.0F);
	           entitymooshroom.onSpawnWithEgg((IEntityLivingData)null);
	           world.spawnEntityInWorld(entitymooshroom);
	           entitymooshroom.spawnExplosionParticle();
    	   } else if(r == 5) {
	    	   EntityOcelot entityocelot = new EntityOcelot(world);
	           entityocelot.setLocationAndAngles((double)x + 0.5D, (double)y, (double)z + 0.5D, 0.0F, 0.0F);
	           entityocelot.onSpawnWithEgg((IEntityLivingData)null);
	           world.spawnEntityInWorld(entityocelot);
	           entityocelot.spawnExplosionParticle();
    	   } else if(r == 6) {
	    	   EntityPig entitypig = new EntityPig(world);
	           entitypig.setLocationAndAngles((double)x + 0.5D, (double)y, (double)z + 0.5D, 0.0F, 0.0F);
	           entitypig.onSpawnWithEgg((IEntityLivingData)null);
	           world.spawnEntityInWorld(entitypig);
	           entitypig.spawnExplosionParticle();
    	   } else if(r == 7) {
	    	   EntitySheep entitysheep = new EntitySheep(world);
	           entitysheep.setLocationAndAngles((double)x + 0.5D, (double)y, (double)z + 0.5D, 0.0F, 0.0F);
	           entitysheep.onSpawnWithEgg((IEntityLivingData)null);
	           world.spawnEntityInWorld(entitysheep);
	           entitysheep.spawnExplosionParticle();
    	   } else if(r == 8) {
	    	   EntityVillager entityvillager = new EntityVillager(world);
	           entityvillager.setLocationAndAngles((double)x + 0.5D, (double)y, (double)z + 0.5D, 0.0F, 0.0F);
	           entityvillager.onSpawnWithEgg((IEntityLivingData)null);
	           world.spawnEntityInWorld(entityvillager);
	           entityvillager.spawnExplosionParticle();
    	   } else if(r == 9) {
	    	   EntityWolf entitywolf = new EntityWolf(world);
	           entitywolf.setLocationAndAngles((double)x + 0.5D, (double)y, (double)z + 0.5D, 0.0F, 0.0F);
	           entitywolf.onSpawnWithEgg((IEntityLivingData)null);
	           world.spawnEntityInWorld(entitywolf);
	           entitywolf.spawnExplosionParticle();
    	   }
    	   /*
    	   Entity entity = new Entity(world);
           entity.setLocationAndAngles((double)x + 0.5D, (double)y, (double)z + 0.5D, 0.0F, 0.0F);
           entity.onSpawnWithEgg((IEntityLivingData)null);
           world.spawnEntityInWorld(entity);
           entity.spawnExplosionParticle();
           */
       }
       super.onBlockDestroyedByPlayer(world, x, y, z, meta);
	}

	// 破壊時のドロップアイテムなし
	@Override
    public int quantityDropped(Random p_149745_1_) {
        return 0;
    }

	@Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return null;
    }

    // シルクタッチ無効
	@Override
    public boolean canSilkHarvest() {
        return false;
    }
}