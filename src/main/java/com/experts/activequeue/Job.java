package com.experts.activequeue;

public class Job {
	
	private String header;
	private String payload;
	
	public Job() {
    }

    public Job(String header, String payload) {
        this.header = header;
        this.payload = payload;
    }
	
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getPayload() {
        return payload;
    }

    public void setTo(String payload) {
        this.payload = payload;
    }
    
    @Override
    public String toString() {
        return String.format("Job{header=%s, payload=%s}", getHeader(), getPayload());
    }    
}
