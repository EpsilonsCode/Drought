package com.epsilon.drought.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.profiler.IProfiler;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.tags.ITagCollectionSupplier;
import net.minecraft.util.Direction;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.registry.DynamicRegistries;
import net.minecraft.world.DimensionType;
import net.minecraft.world.ITickList;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.AbstractChunkProvider;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkSection;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.storage.ISpawnWorldInfo;
import net.minecraft.world.storage.MapData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;

@Mixin(ServerWorld.class)
public class MixinServerWorld //extends World
{
    /*
    protected MixinServerWorld(ISpawnWorldInfo p_i241925_1_, RegistryKey<World> p_i241925_2_, DimensionType p_i241925_3_, Supplier<IProfiler> p_i241925_4_, boolean p_i241925_5_, boolean p_i241925_6_, long p_i241925_7_) {
        super(p_i241925_1_, p_i241925_2_, p_i241925_3_, p_i241925_4_, p_i241925_5_, p_i241925_6_, p_i241925_7_);
    }


     */
    @Inject(at = @At("HEAD"), method = "tickChunk(Lnet/minecraft/world/chunk/Chunk;I)V", cancellable = true)
    private void tickChunk(Chunk p_217441_1_, int p_217441_2_, CallbackInfo info) {
        System.out.println("test");

        /*
        ChunkPos chunkpos = p_217441_1_.getPos();
        int i = chunkpos.getMinBlockX();
        int j = chunkpos.getMinBlockZ();
        IProfiler iprofiler = this.getProfiler();
        iprofiler.push("thunder");


        iprofiler.popPush("tickBlocks");
        if (p_217441_2_ > 0) {
            for(ChunkSection chunksection : p_217441_1_.getSections()) {
                if (chunksection != Chunk.EMPTY_SECTION && chunksection.isRandomlyTicking()) {
                    int k = chunksection.bottomBlockY();

                    for(int l = 0; l < p_217441_2_; ++l) {
                        BlockPos blockpos1 = this.getBlockRandomPos(i, k, j, 15);
                        iprofiler.push("randomTick");
                        BlockState blockstate = chunksection.getBlockState(blockpos1.getX() - i, blockpos1.getY() - k, blockpos1.getZ() - j);
                        //if (blockstate.isRandomlyTicking()) {
                            System.out.println(blockstate + " " + new BlockPos(blockpos1.getX() - i, blockpos1.getY() - k, blockpos1.getZ() - j));
                            //this.canSeeSky(new BlockPos(blockpos1.getX() - i, blockpos1.getY() - k, blockpos1.getZ() - j));
                            //this.canSeeSkyFromBelowWater()
                            //blockstate.randomTick((ServerWorld)(Object)this, blockpos1, this.random);
                        //}

                        FluidState fluidstate = blockstate.getFluidState();
                        if (fluidstate.isRandomlyTicking()) {

                            //fluidstate.randomTick((ServerWorld)(Object)this, blockpos1, this.random);
                        }

                        iprofiler.pop();
                    }
                }
            }
        }

        iprofiler.pop();

         */
    }
    /*
    @Override
    public void sendBlockUpdated(BlockPos p_184138_1_, BlockState p_184138_2_, BlockState p_184138_3_, int p_184138_4_) {

    }

    @Override
    public void playSound(@Nullable PlayerEntity p_184148_1_, double p_184148_2_, double p_184148_4_, double p_184148_6_, SoundEvent p_184148_8_, SoundCategory p_184148_9_, float p_184148_10_, float p_184148_11_) {

    }

    @Override
    public void playSound(@Nullable PlayerEntity p_217384_1_, Entity p_217384_2_, SoundEvent p_217384_3_, SoundCategory p_217384_4_, float p_217384_5_, float p_217384_6_) {

    }

    @Nullable
    @Override
    public Entity getEntity(int p_73045_1_) {
        return null;
    }

    @Nullable
    @Override
    public MapData getMapData(String p_217406_1_) {
        return null;
    }

    @Override
    public void setMapData(MapData p_217399_1_) {

    }

    @Override
    public int getFreeMapId() {
        return 0;
    }

    @Override
    public void destroyBlockProgress(int p_175715_1_, BlockPos p_175715_2_, int p_175715_3_) {

    }

    @Override
    public Scoreboard getScoreboard() {
        return null;
    }

    @Override
    public RecipeManager getRecipeManager() {
        return null;
    }

    @Override
    public ITagCollectionSupplier getTagManager() {
        return null;
    }

    @Override
    public ITickList<Block> getBlockTicks() {
        return null;
    }

    @Override
    public ITickList<Fluid> getLiquidTicks() {
        return null;
    }

    @Override
    public AbstractChunkProvider getChunkSource() {
        return null;
    }

    @Override
    public void levelEvent(@Nullable PlayerEntity p_217378_1_, int p_217378_2_, BlockPos p_217378_3_, int p_217378_4_) {

    }

    @Override
    public DynamicRegistries registryAccess() {
        return null;
    }

    @Override
    public float getShade(Direction p_230487_1_, boolean p_230487_2_) {
        return 0;
    }

    @Override
    public List<? extends PlayerEntity> players() {
        return null;
    }

    @Override
    public Biome getUncachedNoiseBiome(int p_225604_1_, int p_225604_2_, int p_225604_3_) {
        return null;
    }

     */
}
