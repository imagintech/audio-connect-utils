package server;

import java.io.Serializable;

public class ServerInfo implements Serializable {

    private String id;
    private Integer port;

    /* audio format details */
    private Float sampleRate;
    private Integer sampleSize;
    private Integer channels;
    private Integer frameSize;
    private Boolean bigEndian;

    public ServerInfo(String id){
        this.id = id;
    }

    /* getters and setters */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Float getSampleRate() {
        return sampleRate;
    }

    public void setSampleRate(Float sampleRate) {
        this.sampleRate = sampleRate;
    }

    public Integer getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(Integer sampleSize) {
        this.sampleSize = sampleSize;
    }

    public Integer getChannels() {
        return channels;
    }

    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    public Integer getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(Integer frameSize) {
        this.frameSize = frameSize;
    }

    public Boolean getBigEndian() {
        return bigEndian;
    }

    public void setBigEndian(Boolean bigEndian) {
        this.bigEndian = bigEndian;
    }
}
