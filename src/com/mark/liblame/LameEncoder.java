/**
 * 
 */
package com.mark.liblame;

/**
 * JNI class which calls Lame C library.
 * 
 * @author Mark Chen<jian.chen@helloklick.com>
 * 
 */
public class LameEncoder {

	private int instanceIndex = 0;

	public LameEncoder() {
		// Set the default constructor.
	}

	public LameEncoder(LameConfig config) {
		instanceIndex = lameInit(config.getInSampleRate(),
				config.getInChannel(), config.getInBitRate(), config.getMode(),
				config.getQuality());
	}

	/********************************************************************/
	/*********************** JAVA PUBLIC METHOD. ************************/
	/********************************************************************/

	public int encode(String sourceFilePath, String targetFilePath) {
		return lameEncode(sourceFilePath, targetFilePath);
	}

	/**
	 * Close LAME.
	 */
	public void Close() {
		lameClose();
	}

	/********************************************************************/
	/************************** Native Methods. *************************/
	/********************************************************************/
	private native int lameInit(int inSampleRate, int inChannel, int bitRate,
			int mode, int quality);

	private native int lameEncode(String sourceFilePath, String targetPath);

	private native void lameClose();

}
