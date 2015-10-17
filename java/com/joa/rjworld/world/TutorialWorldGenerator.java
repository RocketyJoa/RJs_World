package main.java.com.joa.rjworld.world;

import main.java.com.joa.rjworld.blocks.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class TutorialWorldGenerator implements IWorldGenerator {
	//@formatter:off

	private WorldGenerator gen_cyanite_ore; 	
	private WorldGenerator gen_zestoren_ore;
	//@formatter:on

	public TutorialWorldGenerator() {

		this.gen_cyanite_ore = new WorldGenSingleMinable((IBlockState) ModBlocks.cyanite_ore);
		this.gen_zestoren_ore = new WorldGenMinable(ModBlocks.zestoren_ore.getDefaultState(), 5, BlockHelper.forBlock(Blocks.netherrack));
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		case 0: // Overworld
			this.runGenerator(this.gen_cyanite_ore, world, random, chunkX, chunkZ, 20, 100, 256);
			break;
		case -1: // Nether
			this.runGenerator(this.gen_zestoren_ore, world, random, chunkX, chunkZ, 10, 0, 256);
			break;
		case 1: // End
			
			break;
		}
	}
}
