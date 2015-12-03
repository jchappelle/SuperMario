package com.brentaureli.mariobros.Tools;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;

public class MarioAssetManager extends AssetManager {

    private static final String SOUNDS_FOLDER = "audio/sounds/";
    private static final String MUSIC_FOLDER = "audio/music/";
    public static final String MARIO_MUSIC = "mario_music.ogg";
    public static final String COIN_SOUND = "coin.wav";
    public static final String BUMP_SOUND = "bump.wav";
    public static final String BREAK_BLOCK_SOUND = "breakblock.wav";
    public static final String POWERUP_SPAWN_SOUND = "powerup_spawn.wav";
    public static final String POWERUP_SOUND = "powerup.wav";
    public static final String POWERDOWN_SOUND = "powerdown.wav";
    public static final String STOMP_SOUND = "stomp.wav";
    public static final String MARIO_DIE_SOUND = "mariodie.wav";
    public static final String MARIO_JUMP_SMALL_SOUND = "jump-small.wav";
    public static final String MARIO_JUMP_SUPER_SOUND = "jump-super.wav";
    public static final String TURTLE_KICK_SOUND = "turtle_kick.wav";
    public static final String WARNING_SOUND = "warning.wav";
    public static final String STAGE_CLEAR = "stage_clear.wav";


    public MarioAssetManager(){
        super();
        loadMusic(MARIO_MUSIC);
        loadSound(COIN_SOUND);
        loadSound(BUMP_SOUND);
        loadSound(BREAK_BLOCK_SOUND);
        loadSound(POWERUP_SPAWN_SOUND);
        loadSound(POWERUP_SOUND);
        loadSound(POWERDOWN_SOUND);
        loadSound(STOMP_SOUND);
        loadSound(MARIO_DIE_SOUND);
        loadSound(MARIO_JUMP_SMALL_SOUND);
        loadSound(MARIO_JUMP_SUPER_SOUND);
        loadSound(TURTLE_KICK_SOUND);
        loadSound(WARNING_SOUND);
        loadSound(STAGE_CLEAR);
        finishLoading();
    }

    public void playSound(String fileName){
        get(SOUNDS_FOLDER + fileName, Sound.class).play();
    }

    public void playMusic(String fileName){
        Music music = get(MUSIC_FOLDER + fileName, Music.class);
        music.setLooping(true);
        music.setVolume(0.3f);
        music.play();
    }

    public void stopMusic(String fileName){
        get(MUSIC_FOLDER + MARIO_MUSIC, Music.class).stop();
    }

    private void loadMusic(String fileName){
        load(MUSIC_FOLDER + fileName, Music.class);
    }

    private void loadSound(String fileName){
        load(SOUNDS_FOLDER + fileName, Sound.class);
    }
}
