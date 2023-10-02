/*
 * Transfers API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfers;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.transfers.Amount;
import com.adyen.model.transfers.CounterpartyV3;
import com.adyen.model.transfers.PaymentInstrument;
import com.adyen.model.transfers.ResourceReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * Transfer
 */
@JsonPropertyOrder({
  Transfer.JSON_PROPERTY_ACCOUNT_HOLDER,
  Transfer.JSON_PROPERTY_AMOUNT,
  Transfer.JSON_PROPERTY_BALANCE_ACCOUNT,
  Transfer.JSON_PROPERTY_BALANCE_ACCOUNT_ID,
  Transfer.JSON_PROPERTY_CATEGORY,
  Transfer.JSON_PROPERTY_COUNTERPARTY,
  Transfer.JSON_PROPERTY_CREATION_DATE,
  Transfer.JSON_PROPERTY_DESCRIPTION,
  Transfer.JSON_PROPERTY_DIRECTION,
  Transfer.JSON_PROPERTY_ID,
  Transfer.JSON_PROPERTY_PAYMENT_INSTRUMENT,
  Transfer.JSON_PROPERTY_PAYMENT_INSTRUMENT_ID,
  Transfer.JSON_PROPERTY_PRIORITY,
  Transfer.JSON_PROPERTY_REASON,
  Transfer.JSON_PROPERTY_REFERENCE,
  Transfer.JSON_PROPERTY_REFERENCE_FOR_BENEFICIARY,
  Transfer.JSON_PROPERTY_STATUS
})

public class Transfer {
  public static final String JSON_PROPERTY_ACCOUNT_HOLDER = "accountHolder";
  private ResourceReference accountHolder;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  public static final String JSON_PROPERTY_BALANCE_ACCOUNT = "balanceAccount";
  private ResourceReference balanceAccount;

  public static final String JSON_PROPERTY_BALANCE_ACCOUNT_ID = "balanceAccountId";
  private String balanceAccountId;

  /**
   * The category of transfer.  Possible values:   - **bank**: Transfer to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id) or a bank account.  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  - **issuedCard**: Transfer initiated by a Adyen-issued card.  - **platformPayment**: Fund movements related to payments that are acquired for your users.
   */
  public enum CategoryEnum {
    BANK("bank"),
    
    INTERNAL("internal"),
    
    ISSUEDCARD("issuedCard"),
    
    PLATFORMPAYMENT("platformPayment");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private CategoryEnum category;

  public static final String JSON_PROPERTY_COUNTERPARTY = "counterparty";
  private CounterpartyV3 counterparty;

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  private OffsetDateTime creationDate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  /**
   * The direction of the transfer.  Possible values: **incoming**, **outgoing**.
   */
  public enum DirectionEnum {
    INCOMING("incoming"),
    
    OUTGOING("outgoing");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private DirectionEnum direction;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PAYMENT_INSTRUMENT = "paymentInstrument";
  private PaymentInstrument paymentInstrument;

  public static final String JSON_PROPERTY_PAYMENT_INSTRUMENT_ID = "paymentInstrumentId";
  private String paymentInstrumentId;

  /**
   * The priority for the bank transfer. This sets the speed at which the transfer is sent and the fees that you have to pay. Required for transfers with &#x60;category&#x60; **bank**.  Possible values:  * **regular**: For normal, low-value transactions.  * **fast**: Faster way to transfer funds but has higher fees. Recommended for high-priority, low-value transactions.  * **wire**: Fastest way to transfer funds but has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: Instant way to transfer funds in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: High-value transfer to a recipient in a different country.  * **internal**: Transfer to an Adyen-issued business bank account (by bank account number/IBAN). This will be removed in v4 and replaced with a new field.
   */
  public enum PriorityEnum {
    CROSSBORDER("crossBorder"),
    
    DIRECTDEBIT("directDebit"),
    
    FAST("fast"),
    
    INSTANT("instant"),
    
    INTERNAL("internal"),
    
    REGULAR("regular"),
    
    WIRE("wire");

    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PriorityEnum fromValue(String value) {
      for (PriorityEnum b : PriorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private PriorityEnum priority;

  /**
   * Additional information about the status of the transfer.
   */
  public enum ReasonEnum {
    AMOUNTLIMITEXCEEDED("amountLimitExceeded"),
    
    APPROVED("approved"),
    
    BALANCEACCOUNTTEMPORARILYBLOCKEDBYTRANSACTIONRULE("balanceAccountTemporarilyBlockedByTransactionRule"),
    
    COUNTERPARTYACCOUNTBLOCKED("counterpartyAccountBlocked"),
    
    COUNTERPARTYACCOUNTCLOSED("counterpartyAccountClosed"),
    
    COUNTERPARTYACCOUNTNOTFOUND("counterpartyAccountNotFound"),
    
    COUNTERPARTYADDRESSREQUIRED("counterpartyAddressRequired"),
    
    COUNTERPARTYBANKTIMEDOUT("counterpartyBankTimedOut"),
    
    COUNTERPARTYBANKUNAVAILABLE("counterpartyBankUnavailable"),
    
    DECLINEDBYTRANSACTIONRULE("declinedByTransactionRule"),
    
    ERROR("error"),
    
    NOTENOUGHBALANCE("notEnoughBalance"),
    
    REFUSEDBYCOUNTERPARTYBANK("refusedByCounterpartyBank"),
    
    ROUTENOTFOUND("routeNotFound"),
    
    SCAFAILED("scaFailed"),
    
    UNKNOWN("unknown");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REASON = "reason";
  private ReasonEnum reason;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_REFERENCE_FOR_BENEFICIARY = "referenceForBeneficiary";
  private String referenceForBeneficiary;

  /**
   * The result of the transfer.   For example, **authorised**, **refused**, or **error**.
   */
  public enum StatusEnum {
    APPROVALPENDING("approvalPending"),
    
    ATMWITHDRAWAL("atmWithdrawal"),
    
    ATMWITHDRAWALREVERSALPENDING("atmWithdrawalReversalPending"),
    
    ATMWITHDRAWALREVERSED("atmWithdrawalReversed"),
    
    AUTHADJUSTMENTAUTHORISED("authAdjustmentAuthorised"),
    
    AUTHADJUSTMENTERROR("authAdjustmentError"),
    
    AUTHADJUSTMENTREFUSED("authAdjustmentRefused"),
    
    AUTHORISED("authorised"),
    
    BANKTRANSFER("bankTransfer"),
    
    BANKTRANSFERPENDING("bankTransferPending"),
    
    BOOKED("booked"),
    
    BOOKINGPENDING("bookingPending"),
    
    CANCELLED("cancelled"),
    
    CAPTUREPENDING("capturePending"),
    
    CAPTUREREVERSALPENDING("captureReversalPending"),
    
    CAPTUREREVERSED("captureReversed"),
    
    CAPTURED("captured"),
    
    CAPTUREDEXTERNALLY("capturedExternally"),
    
    CHARGEBACK("chargeback"),
    
    CHARGEBACKEXTERNALLY("chargebackExternally"),
    
    CHARGEBACKPENDING("chargebackPending"),
    
    CHARGEBACKREVERSALPENDING("chargebackReversalPending"),
    
    CHARGEBACKREVERSED("chargebackReversed"),
    
    CREDITED("credited"),
    
    DEPOSITCORRECTION("depositCorrection"),
    
    DEPOSITCORRECTIONPENDING("depositCorrectionPending"),
    
    DISPUTE("dispute"),
    
    DISPUTECLOSED("disputeClosed"),
    
    DISPUTEEXPIRED("disputeExpired"),
    
    DISPUTENEEDSREVIEW("disputeNeedsReview"),
    
    ERROR("error"),
    
    EXPIRED("expired"),
    
    FAILED("failed"),
    
    FEE("fee"),
    
    FEEPENDING("feePending"),
    
    INTERNALTRANSFER("internalTransfer"),
    
    INTERNALTRANSFERPENDING("internalTransferPending"),
    
    INVOICEDEDUCTION("invoiceDeduction"),
    
    INVOICEDEDUCTIONPENDING("invoiceDeductionPending"),
    
    MANUALCORRECTIONPENDING("manualCorrectionPending"),
    
    MANUALLYCORRECTED("manuallyCorrected"),
    
    MATCHEDSTATEMENT("matchedStatement"),
    
    MATCHEDSTATEMENTPENDING("matchedStatementPending"),
    
    MERCHANTPAYIN("merchantPayin"),
    
    MERCHANTPAYINPENDING("merchantPayinPending"),
    
    MERCHANTPAYINREVERSED("merchantPayinReversed"),
    
    MERCHANTPAYINREVERSEDPENDING("merchantPayinReversedPending"),
    
    MISCCOST("miscCost"),
    
    MISCCOSTPENDING("miscCostPending"),
    
    PAYMENTCOST("paymentCost"),
    
    PAYMENTCOSTPENDING("paymentCostPending"),
    
    RECEIVED("received"),
    
    REFUNDPENDING("refundPending"),
    
    REFUNDREVERSALPENDING("refundReversalPending"),
    
    REFUNDREVERSED("refundReversed"),
    
    REFUNDED("refunded"),
    
    REFUNDEDEXTERNALLY("refundedExternally"),
    
    REFUSED("refused"),
    
    RESERVEADJUSTMENT("reserveAdjustment"),
    
    RESERVEADJUSTMENTPENDING("reserveAdjustmentPending"),
    
    RETURNED("returned"),
    
    SECONDCHARGEBACK("secondChargeback"),
    
    SECONDCHARGEBACKPENDING("secondChargebackPending"),
    
    UNDEFINED("undefined");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public Transfer() { 
  }

  public Transfer accountHolder(ResourceReference accountHolder) {
    this.accountHolder = accountHolder;
    return this;
  }

   /**
   * Get accountHolder
   * @return accountHolder
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResourceReference getAccountHolder() {
    return accountHolder;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolder(ResourceReference accountHolder) {
    this.accountHolder = accountHolder;
  }


  public Transfer amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public Transfer balanceAccount(ResourceReference balanceAccount) {
    this.balanceAccount = balanceAccount;
    return this;
  }

   /**
   * Get balanceAccount
   * @return balanceAccount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResourceReference getBalanceAccount() {
    return balanceAccount;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceAccount(ResourceReference balanceAccount) {
    this.balanceAccount = balanceAccount;
  }


  public Transfer balanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
    return this;
  }

   /**
   * The unique identifier of the source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).
   * @return balanceAccountId
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "The unique identifier of the source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).")
  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceAccountId() {
    return balanceAccountId;
  }


  @Deprecated
  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
  }


  public Transfer category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * The category of transfer.  Possible values:   - **bank**: Transfer to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id) or a bank account.  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  - **issuedCard**: Transfer initiated by a Adyen-issued card.  - **platformPayment**: Fund movements related to payments that are acquired for your users.
   * @return category
  **/
  @ApiModelProperty(required = true, value = "The category of transfer.  Possible values:   - **bank**: Transfer to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id) or a bank account.  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  - **issuedCard**: Transfer initiated by a Adyen-issued card.  - **platformPayment**: Fund movements related to payments that are acquired for your users.")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CategoryEnum getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  public Transfer counterparty(CounterpartyV3 counterparty) {
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CounterpartyV3 getCounterparty() {
    return counterparty;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounterparty(CounterpartyV3 counterparty) {
    this.counterparty = counterparty;
  }


  public Transfer creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**.
   * @return creationDate
  **/
  @ApiModelProperty(value = "The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**.")
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public Transfer description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Your description for the transfer. It is used by most banks as the transfer description. We recommend sending a maximum of 140 characters, otherwise the description may be truncated.  Supported characters: **[a-z] [A-Z] [0-9] / - ?** **: ( ) . , &#39; + Space**  Supported characters for **regular** and **fast** transfers to a US counterparty: **[a-z] [A-Z] [0-9] &amp; $ % # @** **~ &#x3D; + - _ &#39; \&quot; ! ?**
   * @return description
  **/
  @ApiModelProperty(value = "Your description for the transfer. It is used by most banks as the transfer description. We recommend sending a maximum of 140 characters, otherwise the description may be truncated.  Supported characters: **[a-z] [A-Z] [0-9] / - ?** **: ( ) . , ' + Space**  Supported characters for **regular** and **fast** transfers to a US counterparty: **[a-z] [A-Z] [0-9] & $ % # @** **~ = + - _ ' \" ! ?**")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public Transfer direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * The direction of the transfer.  Possible values: **incoming**, **outgoing**.
   * @return direction
  **/
  @ApiModelProperty(value = "The direction of the transfer.  Possible values: **incoming**, **outgoing**.")
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DirectionEnum getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  public Transfer id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the resource.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Transfer paymentInstrument(PaymentInstrument paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
    return this;
  }

   /**
   * Get paymentInstrument
   * @return paymentInstrument
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentInstrument getPaymentInstrument() {
    return paymentInstrument;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentInstrument(PaymentInstrument paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }


  public Transfer paymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

   /**
   * The unique identifier of the [payment instrument](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) used in the transfer.
   * @return paymentInstrumentId
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "The unique identifier of the [payment instrument](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) used in the transfer.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }


  @Deprecated
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }


  public Transfer priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The priority for the bank transfer. This sets the speed at which the transfer is sent and the fees that you have to pay. Required for transfers with &#x60;category&#x60; **bank**.  Possible values:  * **regular**: For normal, low-value transactions.  * **fast**: Faster way to transfer funds but has higher fees. Recommended for high-priority, low-value transactions.  * **wire**: Fastest way to transfer funds but has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: Instant way to transfer funds in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: High-value transfer to a recipient in a different country.  * **internal**: Transfer to an Adyen-issued business bank account (by bank account number/IBAN). This will be removed in v4 and replaced with a new field.
   * @return priority
  **/
  @ApiModelProperty(value = "The priority for the bank transfer. This sets the speed at which the transfer is sent and the fees that you have to pay. Required for transfers with `category` **bank**.  Possible values:  * **regular**: For normal, low-value transactions.  * **fast**: Faster way to transfer funds but has higher fees. Recommended for high-priority, low-value transactions.  * **wire**: Fastest way to transfer funds but has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: Instant way to transfer funds in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: High-value transfer to a recipient in a different country.  * **internal**: Transfer to an Adyen-issued business bank account (by bank account number/IBAN). This will be removed in v4 and replaced with a new field.")
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PriorityEnum getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }


  public Transfer reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Additional information about the status of the transfer.
   * @return reason
  **/
  @ApiModelProperty(value = "Additional information about the status of the transfer.")
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReasonEnum getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  public Transfer reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the transfer, used internally within your platform. If you don&#39;t provide this in the request, Adyen generates a unique reference.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the transfer, used internally within your platform. If you don't provide this in the request, Adyen generates a unique reference.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public Transfer referenceForBeneficiary(String referenceForBeneficiary) {
    this.referenceForBeneficiary = referenceForBeneficiary;
    return this;
  }

   /**
   *  A reference that is sent to the recipient. This reference is also sent in all webhooks related to the transfer, so you can use it to track statuses for both the source and recipient of funds.   Supported characters: **a-z**, **A-Z**, **0-9**. The maximum length depends on the &#x60;category&#x60;.  - **internal**: 80 characters  - **bank**: 35 characters when transferring to an IBAN, 15 characters for others.
   * @return referenceForBeneficiary
  **/
  @ApiModelProperty(value = " A reference that is sent to the recipient. This reference is also sent in all webhooks related to the transfer, so you can use it to track statuses for both the source and recipient of funds.   Supported characters: **a-z**, **A-Z**, **0-9**. The maximum length depends on the `category`.  - **internal**: 80 characters  - **bank**: 35 characters when transferring to an IBAN, 15 characters for others.")
  @JsonProperty(JSON_PROPERTY_REFERENCE_FOR_BENEFICIARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferenceForBeneficiary() {
    return referenceForBeneficiary;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_FOR_BENEFICIARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceForBeneficiary(String referenceForBeneficiary) {
    this.referenceForBeneficiary = referenceForBeneficiary;
  }


  public Transfer status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The result of the transfer.   For example, **authorised**, **refused**, or **error**.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The result of the transfer.   For example, **authorised**, **refused**, or **error**.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Return true if this Transfer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transfer transfer = (Transfer) o;
    return Objects.equals(this.accountHolder, transfer.accountHolder) &&
        Objects.equals(this.amount, transfer.amount) &&
        Objects.equals(this.balanceAccount, transfer.balanceAccount) &&
        Objects.equals(this.balanceAccountId, transfer.balanceAccountId) &&
        Objects.equals(this.category, transfer.category) &&
        Objects.equals(this.counterparty, transfer.counterparty) &&
        Objects.equals(this.creationDate, transfer.creationDate) &&
        Objects.equals(this.description, transfer.description) &&
        Objects.equals(this.direction, transfer.direction) &&
        Objects.equals(this.id, transfer.id) &&
        Objects.equals(this.paymentInstrument, transfer.paymentInstrument) &&
        Objects.equals(this.paymentInstrumentId, transfer.paymentInstrumentId) &&
        Objects.equals(this.priority, transfer.priority) &&
        Objects.equals(this.reason, transfer.reason) &&
        Objects.equals(this.reference, transfer.reference) &&
        Objects.equals(this.referenceForBeneficiary, transfer.referenceForBeneficiary) &&
        Objects.equals(this.status, transfer.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolder, amount, balanceAccount, balanceAccountId, category, counterparty, creationDate, description, direction, id, paymentInstrument, paymentInstrumentId, priority, reason, reference, referenceForBeneficiary, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transfer {\n");
    sb.append("    accountHolder: ").append(toIndentedString(accountHolder)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balanceAccount: ").append(toIndentedString(balanceAccount)).append("\n");
    sb.append("    balanceAccountId: ").append(toIndentedString(balanceAccountId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    referenceForBeneficiary: ").append(toIndentedString(referenceForBeneficiary)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

/**
   * Create an instance of Transfer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Transfer
   * @throws JsonProcessingException if the JSON string is invalid with respect to Transfer
   */
  public static Transfer fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Transfer.class);
  }
/**
  * Convert an instance of Transfer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

