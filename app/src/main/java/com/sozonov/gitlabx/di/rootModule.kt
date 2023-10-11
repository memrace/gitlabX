package com.sozonov.gitlabx.di

import org.koin.dsl.module

val rootModule = module {
    includes(appModule, authModule, internalAuthModule, httpClient, userModule, databaseModule)
}

