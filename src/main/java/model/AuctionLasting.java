package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AuctionLasting {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("itemName")
    @Expose
    private String itemName;
    @SerializedName("sellerId")
    @Expose
    private Integer sellerId;
    @SerializedName("sellerName")
    @Expose
    private String sellerName;
    @SerializedName("categoryId")
    @Expose
    private Integer categoryId;
    @SerializedName("categoryPath")
    @Expose
    private List<CategoryPath> categoryPath = null;
    @SerializedName("soldValue")
    @Expose
    private Double soldValue;
    @SerializedName("soldQuantity")
    @Expose
    private Integer soldQuantity;
    @SerializedName("startQuantity")
    @Expose
    private Integer startQuantity;
    @SerializedName("soldQuantity30Days")
    @Expose
    private Integer soldQuantity30Days;
    @SerializedName("soldValue30Days")
    @Expose
    private Double soldValue30Days;
    @SerializedName("bids")
    @Expose
    private Integer bids;
    @SerializedName("buyNowPrice")
    @Expose
    private Double buyNowPrice;
    @SerializedName("costPublish30Days")
    @Expose
    private Double costPublish30Days;
    @SerializedName("costPublishSingle")
    @Expose
    private Double costPublishSingle;
    @SerializedName("costSale")
    @Expose
    private Double costSale;
    @SerializedName("costSalePerItem")
    @Expose
    private Double costSalePerItem;
    @SerializedName("endDate")
    @Expose
    private Object endDate;
    @SerializedName("startDate")
    @Expose
    private long startDate;
    @SerializedName("lastTxDate")
    @Expose
    private long lastTxDate;
    @SerializedName("durationDays")
    @Expose
    private Integer durationDays;
    @SerializedName("hitCount")
    @Expose
    private Integer hitCount;
    @SerializedName("options")
    @Expose
    private Integer options;
    @SerializedName("itemStateNew")
    @Expose
    private Boolean itemStateNew;
    @SerializedName("auction")
    @Expose
    private Boolean auction;
    @SerializedName("itemDwz")
    @Expose
    private Boolean itemDwz;
    @SerializedName("shipLetterEco")
    @Expose
    private Object shipLetterEco;
    @SerializedName("shipLetterFast")
    @Expose
    private Object shipLetterFast;
    @SerializedName("shipPackEco")
    @Expose
    private Object shipPackEco;
    @SerializedName("shipPackFast")
    @Expose
    private Object shipPackFast;
    @SerializedName("shipPackPostpay")
    @Expose
    private Object shipPackPostpay;
    @SerializedName("shipPackPostpayFast")
    @Expose
    private Object shipPackPostpayFast;
    @SerializedName("shipCourier")
    @Expose
    private Double shipCourier;
    @SerializedName("shipCourierPostpay")
    @Expose
    private Double shipCourierPostpay;
    @SerializedName("shipInpost")
    @Expose
    private Object shipInpost;
    @SerializedName("shipInpostPostpay")
    @Expose
    private Object shipInpostPostpay;
    @SerializedName("shipInpostAllegro")
    @Expose
    private Object shipInpostAllegro;
    @SerializedName("shipInpostAllegroPostpay")
    @Expose
    private Object shipInpostAllegroPostpay;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public List<CategoryPath> getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(List<CategoryPath> categoryPath) {
        this.categoryPath = categoryPath;
    }

    public Double getSoldValue() {
        return soldValue;
    }

    public void setSoldValue(Double soldValue) {
        this.soldValue = soldValue;
    }

    public Integer getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(Integer soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public Integer getStartQuantity() {
        return startQuantity;
    }

    public void setStartQuantity(Integer startQuantity) {
        this.startQuantity = startQuantity;
    }

    public Integer getSoldQuantity30Days() {
        return soldQuantity30Days;
    }

    public void setSoldQuantity30Days(Integer soldQuantity30Days) {
        this.soldQuantity30Days = soldQuantity30Days;
    }

    public Double getSoldValue30Days() {
        return soldValue30Days;
    }

    public void setSoldValue30Days(Double soldValue30Days) {
        this.soldValue30Days = soldValue30Days;
    }

    public Integer getBids() {
        return bids;
    }

    public void setBids(Integer bids) {
        this.bids = bids;
    }

    public Double getBuyNowPrice() {
        return buyNowPrice;
    }

    public void setBuyNowPrice(Double buyNowPrice) {
        this.buyNowPrice = buyNowPrice;
    }

    public Double getCostPublish30Days() {
        return costPublish30Days;
    }

    public void setCostPublish30Days(Double costPublish30Days) {
        this.costPublish30Days = costPublish30Days;
    }

    public Double getCostPublishSingle() {
        return costPublishSingle;
    }

    public void setCostPublishSingle(Double costPublishSingle) {
        this.costPublishSingle = costPublishSingle;
    }

    public Double getCostSale() {
        return costSale;
    }

    public void setCostSale(Double costSale) {
        this.costSale = costSale;
    }

    public Double getCostSalePerItem() {
        return costSalePerItem;
    }

    public void setCostSalePerItem(Double costSalePerItem) {
        this.costSalePerItem = costSalePerItem;
    }

    public Object getEndDate() {
        return endDate;
    }

    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public Long getLastTxDate() {
        return lastTxDate;
    }

    public void setLastTxDate(Integer lastTxDate) {
        this.lastTxDate = lastTxDate;
    }

    public Integer getDurationDays() {
        return durationDays;
    }

    public void setDurationDays(Integer durationDays) {
        this.durationDays = durationDays;
    }

    public Integer getHitCount() {
        return hitCount;
    }

    public void setHitCount(Integer hitCount) {
        this.hitCount = hitCount;
    }

    public Integer getOptions() {
        return options;
    }

    public void setOptions(Integer options) {
        this.options = options;
    }

    public Boolean getItemStateNew() {
        return itemStateNew;
    }

    public void setItemStateNew(Boolean itemStateNew) {
        this.itemStateNew = itemStateNew;
    }

    public Boolean getAuction() {
        return auction;
    }

    public void setAuction(Boolean auction) {
        this.auction = auction;
    }

    public Boolean getItemDwz() {
        return itemDwz;
    }

    public void setItemDwz(Boolean itemDwz) {
        this.itemDwz = itemDwz;
    }

    public Object getShipLetterEco() {
        return shipLetterEco;
    }

    public void setShipLetterEco(Object shipLetterEco) {
        this.shipLetterEco = shipLetterEco;
    }

    public Object getShipLetterFast() {
        return shipLetterFast;
    }

    public void setShipLetterFast(Object shipLetterFast) {
        this.shipLetterFast = shipLetterFast;
    }

    public Object getShipPackEco() {
        return shipPackEco;
    }

    public void setShipPackEco(Object shipPackEco) {
        this.shipPackEco = shipPackEco;
    }

    public Object getShipPackFast() {
        return shipPackFast;
    }

    public void setShipPackFast(Object shipPackFast) {
        this.shipPackFast = shipPackFast;
    }

    public Object getShipPackPostpay() {
        return shipPackPostpay;
    }

    public void setShipPackPostpay(Object shipPackPostpay) {
        this.shipPackPostpay = shipPackPostpay;
    }

    public Object getShipPackPostpayFast() {
        return shipPackPostpayFast;
    }

    public void setShipPackPostpayFast(Object shipPackPostpayFast) {
        this.shipPackPostpayFast = shipPackPostpayFast;
    }

    public Double getShipCourier() {
        return shipCourier;
    }

    public void setShipCourier(Double shipCourier) {
        this.shipCourier = shipCourier;
    }

    public Double getShipCourierPostpay() {
        return shipCourierPostpay;
    }

    public void setShipCourierPostpay(Double shipCourierPostpay) {
        this.shipCourierPostpay = shipCourierPostpay;
    }

    public Object getShipInpost() {
        return shipInpost;
    }

    public void setShipInpost(Object shipInpost) {
        this.shipInpost = shipInpost;
    }

    public Object getShipInpostPostpay() {
        return shipInpostPostpay;
    }

    public void setShipInpostPostpay(Object shipInpostPostpay) {
        this.shipInpostPostpay = shipInpostPostpay;
    }

    public Object getShipInpostAllegro() {
        return shipInpostAllegro;
    }

    public void setShipInpostAllegro(Object shipInpostAllegro) {
        this.shipInpostAllegro = shipInpostAllegro;
    }

    public Object getShipInpostAllegroPostpay() {
        return shipInpostAllegroPostpay;
    }

    public void setShipInpostAllegroPostpay(Object shipInpostAllegroPostpay) {
        this.shipInpostAllegroPostpay = shipInpostAllegroPostpay;
    }
}