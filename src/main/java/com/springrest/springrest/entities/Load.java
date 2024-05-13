package com.springrest.springrest.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Load {
	@Id
	private String loadinPoint;
	private String unloadinPoint;
	private String productType;
	private String truckType;
	private long noOfTrucks;
	private long weight;
	private String Comment;
	private long shipperId;
	private Date date;
	public Load(String loadinPoint, String unloadinPoint, String productType, String truckType, long noOfTrucks,
			long weight, String comment, long shipperId, Date date) {
		super();
		this.loadinPoint = loadinPoint;
		this.unloadinPoint = unloadinPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		Comment = comment;
		this.shipperId = shipperId;
		this.date = date;
	}
	public Load() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLoadinPoint() {
		return loadinPoint;
	}
	public void setLoadinPoint(String loadinPoint) {
		this.loadinPoint = loadinPoint;
	}
	public String getUnloadinPoint() {
		return unloadinPoint;
	}
	public void setUnloadinPoint(String unloadinPoint) {
		this.unloadinPoint = unloadinPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public long getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(long noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public long getShipperId() {
		return shipperId;
	}
	public void setShipperId(long shipperId) {
		this.shipperId = shipperId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Load [loadinPoint=" + loadinPoint + ", unloadinPoint=" + unloadinPoint + ", productType=" + productType
				+ ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks + ", weight=" + weight + ", Comment="
				+ Comment + ", shipperId=" + shipperId + ", date=" + date + "]";
	}
	
		
}
