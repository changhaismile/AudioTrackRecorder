package com.audiotrackrecorder;

import android.media.AudioFormat;

/**
 * @author changhaismile
 * @name Consts
 * @comment //TODO
 * @date 2018/7/8
 */
public class Consts {

    /**
     * 采样率 现在能够保证所有的设备上实用的采样率是 44100hz 但是其他的采样率(22050, 16000, 11025）在一些设备上也可以使用
     */
    public static final int SAMPLE_RATE_INHZ = 44100;

    /***
     * 声道数  CHANNEL_IN_MONO and CHANNEL_IN_STEREO  其中 CHANNEL_IN_MONO 是可以保证在所有设备能够使用
     */
    public static final int CHANNEL_CONFIG = AudioFormat.CHANNEL_IN_MONO;

    /***
     * 返回的音频数据的格式， ENCODING_PCM_8BIT ENCODING_PCM_16BIT and ENCODING_PCM_FLOAT
     */
    public static final int AUDIO_FORMAT = AudioFormat.ENCODING_PCM_16BIT;
}
