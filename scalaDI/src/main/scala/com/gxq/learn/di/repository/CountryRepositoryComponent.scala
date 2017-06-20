package com.gxq.learn.di.repository

import com.gxq.learn.di.model.Country

trait CountryRepositoryComponent {
   def countryRepository: CountryRepository // Way to obtain the dependency

  trait CountryRepository { // Interface exposed to the user
    def findByEmail(username: String): Country
  }
}