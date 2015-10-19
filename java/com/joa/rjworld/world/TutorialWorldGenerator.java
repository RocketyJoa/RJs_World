package main.java.com.joa.rjworld.world;

import main.java.com.joa.rjworld.blocks.ModBlocks;
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
    private WorldGenerator gen_plasma_cluster;
	//@formatter:on

	public TutorialWorldGenerator() {

		this.gen_cyanite_ore = new WorldGenMinable(ModBlocks.cyanite_ore.getDefaultState(), 7, BlockHelper.forBlock(Blocks.stone));
        this.gen_plasma_cluster = new WorldGenMinable(ModBlocks.plasma_cluster.getDefaultState(), 3, BlockHelper.forBlock(Blocks.end_stone));
        this.gen_zestoren_ore = new WorldGenMinable(ModBlocks.zestoren_ore.getDefaultState(), 5, BlockHelper.forBlock(Blocks.netherrack));

	}

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.getDimensionId())
        {
            case 0: //Overworld
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;
            case -1: //Nether
                generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 1: //End
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
        }
    }

    private void generateSurface(World world, Random random, int x, int z)
    {
        addOreSpawn(this.gen_cyanite_ore, world, random, x, z, 16, 16, 3 + random.nextInt(4), 9, 16, 54);
    }

    private void generateNether(World world, Random random, int x, int z)
    {
        addOreSpawn(this.gen_zestoren_ore, world, random, x, z, 16, 16, 3 + random.nextInt(8), 9, 0, 256);
    }

    private void generateEnd(World world, Random random, int x, int z)
    {
        addOreSpawn(this.gen_plasma_cluster, world, random, x, z, 16, 16, 3 + random.nextInt(7), 9, 0, 256);
    }

    private void addOreSpawn(WorldGenerator generator, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY)
    {
        if (minY < 0 || maxY > 256 || minY > maxY)
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

        for (int i = 0; i < chanceToSpawn; i++)
        {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = blockZPos + random.nextInt(maxZ);
            generator.generate(world, random, new BlockPos(posX, posY, posZ));
        }
    }

}