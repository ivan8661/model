package ru.poltorakov.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ValueMapping;
import ru.poltorakov.domain.dto.TransactionDTO;
import ru.poltorakov.domain.model.transaction.Transaction;
import ru.poltorakov.domain.model.transaction.TransactionType;

import java.util.List;

/**
 * The {@code TransactionMapper} interface is used to map between {@link Transaction} and {@link TransactionDTO} objects.
 * It provides methods for converting transaction-related data between different representations.
 * @version 1.0.0
 * @author ivan@poltorakov.ru
 */
@Mapper(componentModel = "spring")
public interface TransactionMapper {

    @Mapping(target = "recipientAccountLogin", source = "recipientAccount.login")
    TransactionDTO toTransactionDTO(Transaction transaction);

    List<TransactionDTO> toTransactionDTOList(List<Transaction> transactions);

    List<Transaction> toTransactionList(List<TransactionDTO> transactions);

    Transaction toTransaction(TransactionDTO transactionDTO);
    
    @ValueMapping(source = "credit", target = "CREDIT")
    @ValueMapping(source = "debit", target = "DEBIT")
    TransactionType mapStringToTransactionType(String transactionType);

}
