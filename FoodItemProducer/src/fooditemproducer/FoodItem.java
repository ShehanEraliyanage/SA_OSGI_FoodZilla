package fooditemproducer;

public class FoodItem {
	
	private Integer foodId;
	private String foodName;
	private String foodType;
	private Double foodPrice;
	
	public FoodItem() {
		super();
	}

	public FoodItem(Integer foodId, String foodName, String foodType, Double foodPrice) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodType = foodType;
		this.foodPrice = foodPrice;
	}

	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public Double getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(Double foodPrice) {
		this.foodPrice = foodPrice;
	}
	

}
