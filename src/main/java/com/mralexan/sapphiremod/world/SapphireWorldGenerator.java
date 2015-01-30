package com.mralexan.sapphiremod.world;

import java.util.Random;

import com.mralexan.sapphiremod.initializers.SapphireBlocks;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class SapphireWorldGenerator implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId){
        case -1:
            generateNether(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 0:
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 1:
            generateEnd(world, random, chunkX * 16, chunkZ * 16);
            break;
        }
	}

	private void generateEnd(World world, Random rand, int chunkX, int chunkZ) {}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ)
	{
        for(int k = 0; k < 10; k++)
        {
        	int sapphireOreXCoord = chunkX + rand.nextInt(16);
        	int sapphireOreYCoord = rand.nextInt(30);
        	int sapphireOreZCoord = chunkZ + rand.nextInt(16);
        	
        	int nbOfBlocks = 1 + rand.nextInt(8 - 1);
        	(new WorldGenMinable(SapphireBlocks.sapphireOre, nbOfBlocks)).generate(world, rand, sapphireOreXCoord, sapphireOreYCoord, sapphireOreZCoord);
        }
	}

	private void generateNether(World world, Random rand, int chunkX, int chunkZ) {}
}
