/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 * 
 */
public class Movie extends GenericJson {

	public EmbedClientItem about;
	public List actor;
	public AggregateRating aggregateRating;
	public String buttonStyle;
	public String description;
	public List director;
	public String imageUrl;
	public String logoHrefUrl;
	public String logoImageUrl;
	public String name;
	public List offers;
	public List producer;
	public String thumbnailUrl;
	public String titleIconUrl;
	public String url;

	public EmbedClientItem getAbout() {
		return about;
	}

	public void setAbout(EmbedClientItem about) {
		this.about = about;
	}

	public List getActor() {
		return actor;
	}

	public void setActor(List actor) {
		this.actor = actor;
	}

	public AggregateRating getAggregateRating() {
		return aggregateRating;
	}

	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

	public String getButtonStyle() {
		return buttonStyle;
	}

	public void setButtonStyle(String buttonStyle) {
		this.buttonStyle = buttonStyle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List getDirector() {
		return director;
	}

	public void setDirector(List director) {
		this.director = director;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getLogoHrefUrl() {
		return logoHrefUrl;
	}

	public void setLogoHrefUrl(String logoHrefUrl) {
		this.logoHrefUrl = logoHrefUrl;
	}

	public String getLogoImageUrl() {
		return logoImageUrl;
	}

	public void setLogoImageUrl(String logoImageUrl) {
		this.logoImageUrl = logoImageUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List getOffers() {
		return offers;
	}

	public void setOffers(List offers) {
		this.offers = offers;
	}

	public List getProducer() {
		return producer;
	}

	public void setProducer(List producer) {
		this.producer = producer;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getTitleIconUrl() {
		return titleIconUrl;
	}

	public void setTitleIconUrl(String titleIconUrl) {
		this.titleIconUrl = titleIconUrl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
