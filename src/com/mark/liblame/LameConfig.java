package com.mark.liblame;

/**
 * Lame Configuration class.
 * 
 * @author Mark Chen<jian.chen@helloklick.com>
 * 
 */
public class LameConfig {

	/**
	 * Input sample rate in Hz.
	 */
	private int inSampleRate;

	/**
	 * Number of channels in input stream.
	 */
	private int inChannel;

	/**
	 * Brate compression ratio in KHz.
	 */
	private int inBitRate;

	/**
	 * mode.
	 */
	private int mode = 1;

	/**
	 * Encode quality.
	 */
	private int quality = 7;

	public LameConfig(int inSamplerate, int inChannel, int inBitRate, int mode,
			int quality) {
		this.inSampleRate = inSamplerate;
		this.inChannel = inChannel;
		this.inBitRate = inBitRate;
		this.mode = mode;
		this.quality = quality;
	}

	/**
	 * Create {@link Encoder} instance.
	 * 
	 * @return {@link Encoder} instance.
	 */
	public LameEncoder create() {
		return new LameEncoder(this);
	}

	public int getInSampleRate() {
		return inSampleRate;
	}

	public void setInSampleRate(int inSampleRate) {
		this.inSampleRate = inSampleRate;
	}

	public int getInChannel() {
		return inChannel;
	}

	public void setInChannel(int inChannel) {
		this.inChannel = inChannel;
	}

	public int getInBitRate() {
		return inBitRate;
	}

	public void setInBitRate(int inBitRate) {
		this.inBitRate = inBitRate;
	}

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public int getQuality() {
		return quality;
	}

	/**
	 * Encode quality.
	 * 
	 * @param quality
	 *            quality=0..9. 0=best (very slow). 9=worst.<br />
	 *            recommended:<br />
	 *            2 near-best quality, not too slow<br />
	 *            5 good quality, fast<br />
	 *            7 ok quality, really fast
	 * @return LameConfig
	 */
	public void setQuality(int quality) {
		this.quality = quality;
	}
}
