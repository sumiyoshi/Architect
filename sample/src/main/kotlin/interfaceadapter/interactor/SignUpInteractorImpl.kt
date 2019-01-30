package main.kotlin.interfaceadapter.interactor

import main.kotlin.domain.gateway.interactor.SignUpInteractor
import main.kotlin.domain.gateway.repository.UserRepository
import main.kotlin.domain.usecase.Errors
import main.kotlin.domain.usecase.signup.Input
import main.kotlin.domain.usecase.signup.Output
import main.kotlin.domain.usecase.signup.UserCase

class SignUpInteractorImpl(
        override val userCase: UserCase,
        override val repository: UserRepository
) : SignUpInteractor {

    override fun signUp(): Pair<Output?, Errors?> {

        //todo パラメータの検証
        val input = Input("id", "password", "name")

        return Pair(userCase(repository, input), null)
    }

}