package com.iagomoreira.urbanflow.dto.feedback;

import java.io.Serializable;

public class FeedbackStatisticsDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Double averageRating;

	private Integer totalFeedbacks;

	private Long fiveStars;
	private Long fourStars;
	private Long threeStars;
	private Long twoStars;
	private Long oneStar;

	private Double satisfactionPercentage;

	public FeedbackStatisticsDTO() {
	}

	public FeedbackStatisticsDTO(Double averageRating, Integer totalFeedbacks, Integer fiveStars, Integer fourStars,
			Integer threeStars, Integer twoStars, Integer oneStar, Double satisfactionPercentage) {

		this.averageRating = averageRating;
		this.totalFeedbacks = totalFeedbacks;
		this.fiveStars = fiveStars;
		this.fourStars = fourStars;
		this.threeStars = threeStars;
		this.twoStars = twoStars;
		this.oneStar = oneStar;
		this.satisfactionPercentage = satisfactionPercentage;
	}

	public Double getAverageRating() {
		return averageRating;
	}

	public Integer getTotalFeedbacks() {
		return totalFeedbacks;
	}

	public Integer getFiveStars() {
		return fiveStars;
	}

	public Integer getFourStars() {
		return fourStars;
	}

	public Integer getThreeStars() {
		return threeStars;
	}

	public Integer getTwoStars() {
		return twoStars;
	}

	public Integer getOneStar() {
		return oneStar;
	}

	public Double getSatisfactionPercentage() {
		return satisfactionPercentage;
	}
}
