package com.iagomoreira.urbanflow.dto.vote;

import java.io.Serializable;

public class RequestPriorityDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer lowVotes;
	private Integer mediumVotes;
	private Integer highVotes;
	private Integer totalVotes;
	private Double lowPercentage;
	private Double mediumPercentage;
	private Double highPercentage;

	public RequestPriorityDTO() {
	}

	public Integer getLowVotes() {
		return lowVotes;
	}

	public void setLowVotes(Integer lowVotes) {
		this.lowVotes = lowVotes;
	}

	public Integer getMediumVotes() {
		return mediumVotes;
	}

	public void setMediumVotes(Integer mediumVotes) {
		this.mediumVotes = mediumVotes;
	}

	public Integer getHighVotes() {
		return highVotes;
	}

	public void setHighVotes(Integer highVotes) {
		this.highVotes = highVotes;
	}

	public Integer getTotalVotes() {
		return totalVotes;
	}

	public void setTotalVotes(Integer totalVotes) {
		this.totalVotes = totalVotes;
	}

	public Double getLowPercentage() {
		return lowPercentage;
	}

	public void setLowPercentage(Double lowPercentage) {
		this.lowPercentage = lowPercentage;
	}

	public Double getMediumPercentage() {
		return mediumPercentage;
	}

	public void setMediumPercentage(Double mediumPercentage) {
		this.mediumPercentage = mediumPercentage;
	}

	public Double getHighPercentage() {
		return highPercentage;
	}

	public void setHighPercentage(Double highPercentage) {
		this.highPercentage = highPercentage;
	}
}
