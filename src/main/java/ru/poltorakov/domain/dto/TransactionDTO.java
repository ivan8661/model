    package ru.poltorakov.domain.dto;

    import com.fasterxml.jackson.annotation.JsonIgnore;
    import com.fasterxml.jackson.annotation.JsonProperty;

    import javax.validation.constraints.DecimalMin;
    import javax.validation.constraints.NotNull;
    import javax.validation.constraints.Size;
    import java.math.BigDecimal;
    import java.util.Objects;

    /**
     * The {@code TransactionDTO} class represents a Data Transfer Object for transaction-related information.
     * It is used for exchanging data between the client and server when performing transactions.
     * This class contains details about the transaction, including its ID, amount, recipient account login,
     * transaction time, type, and status.
     *
     * @author ivan@poltorakov.ru
     * @version 1.0.0
     */
    public class TransactionDTO {
        @NotNull
        @Size(min = 1, max = 255)
        private String id;
        @DecimalMin(value="0", inclusive = true, message = "amount must be non-negative")
        private BigDecimal amount;
        @JsonProperty("recipientLogin")
        private String recipientAccountLogin;
        private String transactionTime;
        @NotNull
        @JsonProperty("type")
        private String transactionType;
        private String transactionStatus;

        public TransactionDTO() {
        }

        public TransactionDTO(String id, BigDecimal amount, String recipientAccountLogin, String transactionTime, String transactionType, String transactionStatus) {
            this.id = id;
            this.amount = amount;
            this.recipientAccountLogin = recipientAccountLogin;
            this.transactionTime = transactionTime;
            this.transactionType = transactionType;
            this.transactionStatus = transactionStatus;
        }

        public TransactionDTO(String id, BigDecimal amount, String transactionType, String transactionStatus) {
            this.id = id;
            this.amount = amount;
            this.transactionType = transactionType;
            this.transactionStatus = transactionStatus;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }

        public String getRecipientAccountLogin() {
            return recipientAccountLogin;
        }

        public void setRecipientAccountLogin(String recipientAccountLogin) {
            this.recipientAccountLogin = recipientAccountLogin;
        }

        public String getTransactionTime() {
            return transactionTime;
        }

        @JsonIgnore
        public void setTransactionTime(String transactionTime) {
            this.transactionTime = transactionTime;
        }

        public String getTransactionType() {
            return transactionType;
        }

        public void setTransactionType(String transactionType) {
            this.transactionType = transactionType;
        }

        public String getTransactionStatus() {
            return transactionStatus;
        }

        @JsonIgnore
        public void setTransactionStatus(String transactionStatus) {
            this.transactionStatus = transactionStatus;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TransactionDTO that = (TransactionDTO) o;

            return Objects.equals(id, that.id);
        }

        @Override
        public int hashCode() {
            return id != null ? id.hashCode() : 0;
        }
    }
