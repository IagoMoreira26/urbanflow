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

	public RequestPriorityDTO(Integer lowVotes, Integer mediumVotes, Integer highVotes, Integer totalVotes,
			Double lowPercentage, Double mediumPercentage, Double highPercentage) {
		super();
		this.lowVotes = lowVotes;
		this.mediumVotes = mediumVotes;
		this.highVotes = highVotes;
		this.totalVotes = totalVotes;
		this.lowPercentage = lowPercentage;
		this.mediumPercentage = mediumPercentage;
		this.highPercentage = highPercentage;
	}

	public Integer getLowVotes() {
		return lowVotes;
	}

	public Integer getMediumVotes() {
		return mediumVotes;
	}

	public Integer getHighVotes() {
		return highVotes;
	}

	public Integer getTotalVotes() {
		return totalVotes;
	}

	public Double getLowPercentage() {
		return lowPercentage;
	}

	public Double getMediumPercentage() {
		return mediumPercentage;
	}

	public Double getHighPercentage() {
		return highPercentage;
	}

	public void setLowVotes(Integer lowVotes) {
		this.lowVotes = lowVotes;
	}

	public void setMediumVotes(Integer mediumVotes) {
		this.mediumVotes = mediumVotes;
	}

	public void setHighVotes(Integer highVotes) {
		this.highVotes = highVotes;
	}

	public void setTotalVotes(Integer totalVotes) {
		this.totalVotes = totalVotes;
	}

	public void setLowPercentage(Double lowPercentage) {
		this.lowPercentage = lowPercentage;
	}

	public void setMediumPercentage(Double mediumPercentage) {
		this.mediumPercentage = mediumPercentage;
	}

	public void setHighPercentage(Double highPercentage) {
		this.highPercentage = highPercentage;
	}
}
