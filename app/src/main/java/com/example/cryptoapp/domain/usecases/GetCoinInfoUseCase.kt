package com.example.cryptoapp.domain.usecases

import com.example.cryptoapp.domain.repositories.CoinRepository

class GetCoinInfoUseCase(
    private val repository: CoinRepository
) {

    operator fun invoke(fromSymbol: String) = repository.getCoinInfo(fromSymbol)
}