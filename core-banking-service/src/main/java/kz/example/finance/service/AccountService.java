package kz.example.finance.service;

import kz.example.finance.model.dto.BankAccount;
import kz.example.finance.model.dto.UtilityAccount;
import kz.example.finance.model.entity.BankAccountEntity;
import kz.example.finance.model.entity.UtilityAccountEntity;
import kz.example.finance.model.mapper.BankAccountMapper;
import kz.example.finance.model.mapper.UtilityAccountMapper;
import kz.example.finance.repository.BankAccountRepository;
import kz.example.finance.repository.UtilityAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final BankAccountMapper bankAccountMapper = new BankAccountMapper();
    private final UtilityAccountMapper utilityAccountMapper = new UtilityAccountMapper();

    private final BankAccountRepository bankAccountRepository;
    private final UtilityAccountRepository utilityAccountRepository;

    public BankAccount readBankAccount(String accountNumber) {
        BankAccountEntity entity = bankAccountRepository.findByNumber(accountNumber).get();
        return bankAccountMapper.convertToDto(entity);
    }

    public UtilityAccount readUtilityAccount(String provider) {
        UtilityAccountEntity utilityAccountEntity = utilityAccountRepository.findByProviderName(provider).get();
        return utilityAccountMapper.convertToDto(utilityAccountEntity);
    }

    public UtilityAccount readUtilityAccount(Long id) {
        return utilityAccountMapper.convertToDto(utilityAccountRepository.findById(id).get());
    }

}