package com.iagomoreira.urbanflow.dto.feedback;

import java.io.Serializable;

public class FeedbackStatisticsDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Double averageRating;
	private Integer totalFeedbacks;
	private Integer fiveStars;
	private Integer fourStars;
	private Integer threeStars;
	private Integer twoStars;
	private Integer oneStar;

	private Double satisfactionPercentage;

	public FeedbackStatisticsDTO() {
	}

	public Double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}

	public Integer getTotalFeedbacks() {
		return totalFeedbacks;
	}

	public void setTotalFeedbacks(Integer totalFeedbacks) {
		this.totalFeedbacks = totalFeedbacks;
	}

	public Integer getFiveStars() {
		return fiveStars;
	}

	public void setFiveStars(Integer fiveStars) {
		this.fiveStars = fiveStars;
	}

	public Integer getFourStars() {
		return fourStars;
	}

	public void setFourStars(Integer fourStars) {
		this.fourStars = fourStars;
	}

	public Integer getThreeStars() {
		return threeStars;
	}

	public void setThreeStars(Integer threeStars) {
		this.threeStars = threeStars;
	}

	public Integer getTwoStars() {
		return twoStars;
	}

	public void setTwoStars(Integer twoStars) {
		this.twoStars = twoStars;
	}

	public Integer getOneStar() {
		return oneStar;
	}

	public void setOneStar(Integer oneStar) {
		this.oneStar = oneStar;
	}

	public Double getSatisfactionPercentage() {
		return satisfactionPercentage;
	}

	public void setSatisfactionPercentage(Double satisfactionPercentage) {
		this.satisfactionPercentage = satisfactionPercentage;
	}
}
