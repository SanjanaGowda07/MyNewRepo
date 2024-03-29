
package com.maersk.containerManagement.common.customerRequest.api;

import java.math.BigInteger;
import java.time.Instant;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Customer Request Data
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "containerType",
    "containerSize",
    "origin",
    "destination",
    "quantity",
    "timestamp"
})
@Generated("jsonschema2pojo")
public class CustomerRequestData {

    /**
     * Container Type
     * 
     */
    @JsonProperty("containerType")
    @JsonPropertyDescription("Container Type")
    private String containerType;
    /**
     * Container Size
     * 
     */
    @JsonProperty("containerSize")
    @JsonPropertyDescription("Container Size")
    private BigInteger containerSize;
    /**
     * Origin
     * 
     */
    @JsonProperty("origin")
    @JsonPropertyDescription("Origin")
    private String origin;
    /**
     * destination
     * 
     */
    @JsonProperty("destination")
    @JsonPropertyDescription("destination")
    private String destination;
    /**
     * Quantity
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("Quantity")
    private BigInteger quantity;
    /**
     * Timestamp
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp")
    private Instant timestamp;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CustomerRequestData() {
    }

    /**
     * 
     * @param quantity
     * @param containerType
     * @param origin
     * @param destination
     * @param containerSize
     * @param timestamp
     */
    public CustomerRequestData(String containerType, BigInteger containerSize, String origin, String destination, BigInteger quantity, Instant timestamp) {
        super();
        this.containerType = containerType;
        this.containerSize = containerSize;
        this.origin = origin;
        this.destination = destination;
        this.quantity = quantity;
        this.timestamp = timestamp;
    }

    /**
     * Container Type
     * 
     */
    @JsonProperty("containerType")
    public String getContainerType() {
        return containerType;
    }

    /**
     * Container Type
     * 
     */
    @JsonProperty("containerType")
    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    /**
     * Container Size
     * 
     */
    @JsonProperty("containerSize")
    public BigInteger getContainerSize() {
        return containerSize;
    }

    /**
     * Container Size
     * 
     */
    @JsonProperty("containerSize")
    public void setContainerSize(BigInteger containerSize) {
        this.containerSize = containerSize;
    }

    /**
     * Origin
     * 
     */
    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    /**
     * Origin
     * 
     */
    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * destination
     * 
     */
    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    /**
     * destination
     * 
     */
    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Quantity
     * 
     */
    @JsonProperty("quantity")
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Quantity
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(BigInteger quantity) {
        this.quantity = quantity;
    }

    /**
     * Timestamp
     * 
     */
    @JsonProperty("timestamp")
    public Instant getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomerRequestData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("containerType");
        sb.append('=');
        sb.append(((this.containerType == null)?"<null>":this.containerType));
        sb.append(',');
        sb.append("containerSize");
        sb.append('=');
        sb.append(((this.containerSize == null)?"<null>":this.containerSize));
        sb.append(',');
        sb.append("origin");
        sb.append('=');
        sb.append(((this.origin == null)?"<null>":this.origin));
        sb.append(',');
        sb.append("destination");
        sb.append('=');
        sb.append(((this.destination == null)?"<null>":this.destination));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
