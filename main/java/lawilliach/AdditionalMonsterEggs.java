package lawilliach;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = AdditionalMonsterEggs.MODID, version = AdditionalMonsterEggs.VERSION)

public class AdditionalMonsterEggs {

    public static final String MODID = "additionalmonstereggs";
    public static final String VERSION = "1.0";

    //モンスターエッグの追加
    public static Block blockMonsterEggC;   //クリーパー
    public static Block blockMonsterEggSk;  //弓スケルトン
    public static Block blockMonsterEggSkS; //剣スケルトン
    public static Block blockMonsterEggSl;  //スライム
    public static Block blockMonsterEggSp;  //蜘蛛
    public static Block blockMonsterEggSpC; //洞窟蜘蛛
    public static Block blockMonsterEggW;   //ウィッチ
    public static Block blockMonsterEggX;   //???
    public static Block blockMonsterEggZ;   //ゾンビ
    public static Block blockMonsterEggZC;  //子どもゾンビ
    //Hard版限定
    public static Block blockPitfallBlock; //落とし穴ブロック
    public static Block blockLavaBlock; //溶岩ブロック
    public static Block blockTNTBlock; //TNTブロック

	@EventHandler
	public void perInit(FMLPreInitializationEvent event) {
		//モンスターエッグ
		//クリーパー（spawn_egg：50）
		blockMonsterEggC = new MonsterEggC()
		.setCreativeTab(CreativeTabs.tabDecorations)
		.setBlockName("blockMonsterEggC")
		.setBlockTextureName("stone");
		GameRegistry.registerBlock(blockMonsterEggC, "blockMonsterEggC");
		//弓スケルトン（spawn_egg：51）
		blockMonsterEggSk = new MonsterEggSk()
		.setCreativeTab(CreativeTabs.tabDecorations)
		.setBlockName("blockMonsterEggSk")
		.setBlockTextureName("stone");
		GameRegistry.registerBlock(blockMonsterEggSk, "blockMonsterEggSk");
		//剣スケルトン（spawn_egg：51）
		blockMonsterEggSkS = new MonsterEggSkS()
		.setCreativeTab(CreativeTabs.tabDecorations)
		.setBlockName("blockMonsterEggSkS")
		.setBlockTextureName("stone");
		GameRegistry.registerBlock(blockMonsterEggSkS, "blockMonsterEggSkS");
		//スライム（spawn_egg：55）
		blockMonsterEggSl = new MonsterEggSl()
		.setCreativeTab(CreativeTabs.tabDecorations)
		.setBlockName("blockMonsterEggSl")
		.setBlockTextureName("stone");
		GameRegistry.registerBlock(blockMonsterEggSl, "blockMonsterEggSl");
		//クモ（spawn_egg：52）
		blockMonsterEggSp = new MonsterEggSp()
		.setCreativeTab(CreativeTabs.tabDecorations)
		.setBlockName("blockMonsterEggSp")
		.setBlockTextureName("stone");
		GameRegistry.registerBlock(blockMonsterEggSp, "blockMonsterEggSp");
		//洞窟グモ（spawn_egg：59）
		blockMonsterEggSpC = new MonsterEggSpC()
		.setCreativeTab(CreativeTabs.tabDecorations)
		.setBlockName("blockMonsterEggSpC")
		.setBlockTextureName("stone");
		GameRegistry.registerBlock(blockMonsterEggSpC, "blockMonsterEggSpC");
		//ウィッチ（spawn_egg：66）
		blockMonsterEggW = new MonsterEggW()
		.setCreativeTab(CreativeTabs.tabDecorations)
		.setBlockName("blockMonsterEggW")
		.setBlockTextureName("stone");
		GameRegistry.registerBlock(blockMonsterEggW, "blockMonsterEggW");
		//???
		blockMonsterEggX = new MonsterEggX()
		.setCreativeTab(CreativeTabs.tabDecorations)
		.setBlockName("blockMonsterEggX")
		.setBlockTextureName("stone");
		GameRegistry.registerBlock(blockMonsterEggX, "blockMonsterEggX");
		//ゾンビ（spawn_egg：54）
		blockMonsterEggZ = new MonsterEggZ()
		.setCreativeTab(CreativeTabs.tabDecorations)
		.setBlockName("blockMonsterEggZ")
		.setBlockTextureName("stone");
		GameRegistry.registerBlock(blockMonsterEggZ, "blockMonsterEggZ");
		//子どもゾンビ（spawn_egg：54）
		blockMonsterEggZC = new MonsterEggZC()
		.setCreativeTab(CreativeTabs.tabDecorations)
		.setBlockName("blockMonsterEggZC")
		.setBlockTextureName("stone");
		GameRegistry.registerBlock(blockMonsterEggZC, "blockMonsterEggZC");

		//Hard版限定
		//落とし穴ブロック
		blockPitfallBlock = new PitfallBlock()
		.setCreativeTab(CreativeTabs.tabDecorations)
		.setBlockName("blockPitfallBlock")
		.setBlockTextureName("stone");
		GameRegistry.registerBlock(blockPitfallBlock, "blockPitfallBlock");
		//溶岩ブロック
		blockLavaBlock = new LavaBlock()
		.setCreativeTab(CreativeTabs.tabDecorations)
		.setBlockName("blockLavaBlock")
		.setBlockTextureName("stone");
		GameRegistry.registerBlock(blockLavaBlock, "blockLavaBlock");
		//TNTブロック
		blockTNTBlock = new TNTBlock()
		.setCreativeTab(CreativeTabs.tabDecorations)
		.setBlockName("blockTNTBlock")
		.setBlockTextureName("stone");
		GameRegistry.registerBlock(blockTNTBlock, "blockTNTBlock");
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		//モンスターエッグのワールド生成
		GameRegistry.registerWorldGenerator(new GeneratorMonsterEggs(), 0);
		//モンスターエッグ、スポーンエッグを使って作れるレシピの追加
		new RecipesSpawnEggs();
	}
}

