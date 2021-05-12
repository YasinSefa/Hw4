package gameManager.entities.concretes;

import gameManager.entities.abstracts.Entity;

public class Order implements Entity{
	private int id;
	private int customerId;
	private int productId;
	private int campaignId;
	private int count;
	private int totalAmount;
	private int discountAmount;
	private int amountOfPayment;
	
	public Order(int id, int customerId, int productId, int campaignId, int count) {
        super();
        this.setId(id);
        this.setCustomerId(customerId);
        this.setProductId(productId);
        this.setCampaignId(campaignId);
        this.setCount(count);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotalAmount(Product product) {
		return count * product.getUnitPrice();
	}

    public int getDiscountAmount(Product product, Campaign campaign) {
        return (product.getUnitPrice()) * (campaign.getDiscountRate()) / 100;
    }

	public int getAmountOfPayment(Product product, Campaign campaign) {
		return getTotalAmount(product) - getDiscountAmount(product, campaign);
	}
	
}
